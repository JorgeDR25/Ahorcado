package puntuacionesTab;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;

public class PuntuacionesController {

	    @FXML
	    private Tab puntuacionesTab;

	    @FXML
	    private ListView<String> puntuacionView;


    public PuntuacionesController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view_puntuaciones.fxml"));
		loader.setController(this);
		loader.load();
	}

	public Tab getPuntuacionesTab() {
		return puntuacionesTab;
	}
    
}