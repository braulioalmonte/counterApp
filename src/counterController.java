import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class counterController {

    @FXML
    private Label resultLabel;
    Integer numero = 0;

    @FXML
    void ClickM(ActionEvent event) {
        numero -=1;
        resultLabel.setText(numero.toString());
    }

    @FXML
    void ClickP(ActionEvent event) {
        numero +=1;
        resultLabel.setText(numero.toString());
    }

}
