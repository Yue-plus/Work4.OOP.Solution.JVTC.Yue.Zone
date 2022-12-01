package zone.yue.jvtc.solution.oop.work;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Yue_plus
 */
public class UserRegistrationApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader =
                new FXMLLoader(UserRegistrationApplication.class.getResource("user-registration.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 380, 360);
        stage.setTitle("用户注册");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}