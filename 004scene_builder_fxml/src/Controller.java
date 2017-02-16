import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private Label labelInfo;
    @FXML
    TextArea inputInfo;


    public Controller() {
    }

    @FXML
    public void onButtonClick(ActionEvent event) {
        labelInfo.setText(inputInfo.getText());
    }
}
