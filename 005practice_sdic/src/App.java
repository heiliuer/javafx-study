import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = fxmlLoader.load();
        primaryStage.setScene(new Scene(root, 360, 480));
        primaryStage.show();
        primaryStage.setTitle("hello");

        Controller controller = fxmlLoader.getController();
        controller.loadUri();

    }

    public static void main(String[] args) {
        launch(args);
    }
}