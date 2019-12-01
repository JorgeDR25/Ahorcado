package dad.ahorcado.ahorcado;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import palabrasTab.PalabrasController;
import partidaTab.PartidaController;
import puntuacionesTab.PuntuacionesController;

public class RootController implements Initializable{

	
	private TabPane rootView;
	private PalabrasController palabrasController;
	private PartidaController partidaController;
	private PuntuacionesController puntuacionesController;
	
	
	public RootController() throws IOException {
		rootView = new TabPane();
		palabrasController= new PalabrasController();
		partidaController= new PartidaController();
		puntuacionesController= new PuntuacionesController();
		rootView.getTabs().add(partidaController.getPartidaTab());
		rootView.getTabs().add(palabrasController.getPalabrasTab());
		rootView.getTabs().add(puntuacionesController.getPuntuacionesTab());
	}


	public void initialize(URL location, ResourceBundle resources) {
		
	}


	public TabPane getRootView() {
		return rootView;
	}
	
	
	
	
}
