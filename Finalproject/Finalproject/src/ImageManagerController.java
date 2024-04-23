import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.embed.swing.SwingFXUtils;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class ImageManagerController {

    @FXML
    private ImageView ImgView;
    @FXML
    private Label ImgInfo;
    @FXML
    private ComboBox<String> formatComboBox;

    public void initialize() {
        formatComboBox.getSelectionModel().selectFirst();
    }

    @FXML
    private void loadAndDisplayImage() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Img File");
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            try {
                BufferedImage bufferedImage = ImageIO.read(file);
                javafx.scene.image.Image fxImage = SwingFXUtils.toFXImage(bufferedImage, null);
                ImgView.setImage(fxImage);
                ImgView.setFitWidth(100);
                ImgView.setFitHeight(100);

                String info = "Width: " + bufferedImage.getWidth() + "\nHeight: " + bufferedImage.getHeight();

                try (ImageInputStream iis = ImageIO.createImageInputStream(file)) {
                    Iterator<ImageReader> ImgReaders = ImageIO.getImageReaders(iis);
                    if (ImgReaders.hasNext()) {
                        ImageReader reader = ImgReaders.next();
                        info += "\nFormat: " + reader.getFormatName();
                    }
                }

                ImgInfo.setText(info);
            } catch (IOException ex) {
                ex.printStackTrace();
                ImgInfo.setText("Failed to load Img.");
            }
        }
    }
    @FXML
    private void saveImage() {
        if (formatComboBox.getValue() == null) {
            System.out.println("Please select a format before download.");
            return;
        }

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Img");
        String format = formatComboBox.getValue();
        String extension = format.toLowerCase();
        if ("jpeg".equals(extension)) {
            extension = "jpg";
        }
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter(format, "*." + extension));

        File file = fileChooser.showSaveDialog(null);
        if (file != null) {
            try {
                BufferedImage bufferedImg = SwingFXUtils.fromFXImage(ImgView.getImage(), null);
                if (bufferedImg.getColorModel().hasAlpha() && !"png".equals(extension)) {
                    BufferedImage rgbImage = new BufferedImage(bufferedImg.getWidth(), bufferedImg.getHeight(), BufferedImage.TYPE_INT_RGB);
                    rgbImage.getGraphics().drawImage(bufferedImg, 0, 0, null);
                    bufferedImg = rgbImage;
                }
                String fileName = file.getPath();
                if (!fileName.endsWith("." + extension)) {
                    file = new File(fileName + "." + extension);
                }
                ImageIO.write(bufferedImg, extension, file);
            } catch (IOException ex) {
                ex.printStackTrace();
                System.out.println("Failed to save Img: " + ex.getMessage());
            }
        }
    }
}