package presentacio;

import aplicacio.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class Clientes {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}