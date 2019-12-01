package dad.ahorcado.ahorcado;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application{
	private RootController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		controller = new RootController();
		
		Scene scene = new Scene(controller.getRootView(), 500, 400);
		
		primaryStage.setTitle("Ahorcado");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
