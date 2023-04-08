import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.Application;


public class Controller {

    private double userWeight = 0;
    private double userCup = -1;

    public static double neededCupsPercentage;

    public static String messagetoUser;

    @FXML
    private TextField cupTyped;

    @FXML
    private TextField weightTyped;

    @FXML
    private ProgressBar moistMeter;

    @FXML
    private Text statusMeter;


    @FXML
    void comfirmClick(ActionEvent event) throws IOException {

        userWeight = Integer.parseInt(weightTyped.getText());
        userCup = Integer.parseInt(cupTyped.getText());
        neededCupsPercentage = (userCup * 8) / userWeight;

        if(userWeight < 25){
            messagetoUser = "You're too small to use this app. Drink water anyway!";
        } else if(neededCupsPercentage >= 0.90){
            messagetoUser = "You're good to go! Keep up the good work!";
        } else if (neededCupsPercentage >= 0.5) {
            messagetoUser = "Getting there. Drink some water!";
        } else if (neededCupsPercentage >= 0.25) {
            messagetoUser = "You're a little dehydrated. Drink some water!";
        } else {
            messagetoUser = "You will die. Drink water now!";
        }

        if (userWeight < 30) {
            moistMeter.setProgress(0);
            statusMeter.setText("You're too small to use this app. Drink water anyway!");

        } else if (userWeight != 0 && userCup != -1) {
            moistMeter.setProgress(neededCupsPercentage);
            statusMeter.setText(messagetoUser);

        } else {
            moistMeter.setProgress(0);
            statusMeter.setText("Please enter a valid number");
        }

    }

}
