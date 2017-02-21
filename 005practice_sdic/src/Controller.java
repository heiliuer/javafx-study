import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller {
    @FXML
    private WebView webview;


    public void loadUri() {
        WebEngine engine = webview.getEngine();
        engine.setJavaScriptEnabled(true);
//        engine.load(getClass().getResource("www/index.html").toExternalForm());
        engine.load("http://localhost:5369");
    }

}
