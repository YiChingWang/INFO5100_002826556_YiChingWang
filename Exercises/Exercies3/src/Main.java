import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage PrimaryStage) throws Exception {
        PrimaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/view.fxml"))));
        PrimaryStage.centerOnScreen();
        PrimaryStage.setTitle("Calculator");
        PrimaryStage.setResizable(false);
        PrimaryStage.show();
    }
}