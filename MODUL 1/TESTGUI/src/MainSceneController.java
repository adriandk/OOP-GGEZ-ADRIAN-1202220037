import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainSceneController {

    @FXML
    private Button btnSubmit;

    @FXML
    private TextField txtFieldName;

    @FXML
    void submitOnClicked(ActionEvent event) {
        Stage mainWindow = (Stage) txtFieldName.getScene().getWindow();
        String title = txtFieldName.getText();
        mainWindow.setTitle(title);
    }

}
