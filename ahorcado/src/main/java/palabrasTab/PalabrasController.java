package palabrasTab;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;

public class PalabrasController implements Initializable{

    @FXML
    private Tab palabrasTab;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;
	
	//model
    
    private ListProperty<String> palabras= new SimpleListProperty<String>(
    		FXCollections.observableArrayList(), null
    		);
	
    public PalabrasController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("palabras.fxml"));
		loader.setController(this);
		loader.load();
	}



	public Tab getPalabrasTab() {
		return palabrasTab;
	}



	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	

}
