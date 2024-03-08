package controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import java.util.List;

public class controller {
    @FXML
    private Button button0;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button buttonPlus;

    @FXML
    private Button buttonMinus;

    @FXML
    private Button buttonMultiply;

    @FXML
    private Button buttonDivided;

    @FXML
    private Button buttonEqual;

    @FXML
    private Button buttonPoint;

    @FXML
    private Label labelAnswer;

    @FXML
    private Button buttonC;

    @FXML
    private Button buttonCE;

    @FXML
    private TextField showText;

    private List<Button> buttonList;
    private double answer;
    private String function;

    public void initialize(){
        buttonCE.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        buttonCE.setTextFill(Color.WHITE);
        buttonC.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        buttonC.setTextFill(Color.WHITE);

        answer=0;
        function="Empty";
        buttonList = FXCollections.observableArrayList(button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonPoint,buttonEqual,
                buttonPlus,buttonMinus,buttonMultiply,buttonDivided,buttonC,buttonCE);
        setAnswer();
        functions();
    }

    private void functions() {

        buttonC.setOnAction(event -> {
            showText.clear();
        });
        buttonCE.setOnAction(event -> {
            function = "Empty";
            answer = 0;
            labelAnswer.setText("0");
        });

        button0.setOnAction(event -> {
            showText.setText(showText.getText()!=null? showText.getText()+"0":"0");
        });
        button1.setOnAction(event -> {
            showText.setText(showText.getText()!=null? showText.getText()+"1":"1");
        });
        button2.setOnAction(event -> {
            showText.setText(showText.getText()!=null? showText.getText()+"2":"2");
        });
        button3.setOnAction(event -> {
            showText.setText(showText.getText()!=null? showText.getText()+"3":"3");
        });
        button4.setOnAction(event -> {
            showText.setText(showText.getText()!=null? showText.getText()+"4":"4");
        });
        button5.setOnAction(event -> {
            showText.setText(showText.getText()!=null? showText.getText()+"5":"5");
        });
        button6.setOnAction(event -> {
            showText.setText(showText.getText()!=null? showText.getText()+"6":"6");
        });
        button7.setOnAction(event -> {
            showText.setText(showText.getText()!=null? showText.getText()+"7":"7");
        });
        button8.setOnAction(event -> {
            showText.setText(showText.getText()!=null? showText.getText()+"8":"8");
        });
        button9.setOnAction(event -> {
            showText.setText(showText.getText()!=null? showText.getText()+"9":"9");
        });
        buttonPoint.setOnAction(event -> {
            showText.setText(showText.getText()!=null? showText.getText()+".":"0.");
        });
        buttonPlus.setOnAction(event -> {
            action();
            function = "Plus";
        });
        buttonMinus.setOnAction(event -> {
            action();
            function = "Minus";
        });
        buttonMultiply.setOnAction(event -> {
            action();
            function = "Multiply";
        });
        buttonDivided.setOnAction(event -> {
            action();
            function = "Divided";
        });
        buttonEqual.setOnAction(event -> {
            action();
            function = "Equal";
        });
    }

    private void setAnswer(){
        labelAnswer.setText(String.format("%.02f",answer));
        showText.clear();
    }

    private void action() {
            double inputNumber = Double.parseDouble(showText.getText());

            if ("Empty".equals(function)) {
                answer = inputNumber;
            } else if ("Plus".equals(function)) {
                answer += inputNumber;
            } else if ("Minus".equals(function)) {
                answer -= inputNumber;
            } else if ("Multiply".equals(function)) {
                answer *= inputNumber;
            } else if ("Divided".equals(function)) {
                if (inputNumber != 0) {
                    answer /= inputNumber;
                } else {
                    labelAnswer.setText("Error");
                    return;
                }
            } else if ("Equal".equals(function)) {
            }
            setAnswer();
    }
}
