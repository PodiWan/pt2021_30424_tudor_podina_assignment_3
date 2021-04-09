package org.utcn.View;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UserInterfaceController {

    @FXML
    Button btnClose;

    @FXML protected void btnClose_Click(ActionEvent event) throws IOException{
        event.consume();
        Stage parentStage = (Stage)btnClose.getScene().getWindow();
        parentStage.close();
    }
}
