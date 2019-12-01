package partidaTab;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;

public class PartidaController {

    @FXML
    private Tab partidaTab;

    @FXML
    private Button letraButton;

    @FXML
    private Button resolverButton;

    @FXML
    void onLetraAction(ActionEvent event) {

    }

    @FXML
    void onResolverAction(ActionEvent event) {

    }

    public PartidaController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view_partida.fxml"));
		loader.setController(this);
		loader.load();
	}

	public Tab getPartidaTab() {
		return partidaTab;
	}

	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
}