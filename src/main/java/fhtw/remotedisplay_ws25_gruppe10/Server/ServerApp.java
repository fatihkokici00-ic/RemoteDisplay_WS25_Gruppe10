package fhtw.remotedisplay_ws25_gruppe10.Server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ServerApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/server_login.fxml"));
        Scene scene = new Scene(loader.load(), 480, 280);
        stage.setTitle("Server Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
