package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    private static List<String> options = Arrays.asList("Rock", "Paper", "Scissor");

    @FXML // Annotation that connects the button in the FXML file to this button in the code
    private Button rockBtn; // Redundant now, will be used in the future

    @FXML
    private Button paperBtn; // Redundant now, will be used in the future

    @FXML
    private Button scissorBtn; // Redundant now, will be used in the future

    @FXML
    private Text userPick;

    @FXML
    private Text computerPick;

    @FXML
    private Text result;

    @FXML
    void hitRock(ActionEvent event) { // Cannot remove event, because JavaFX sends an event when called
        userPick.setText(options.get(0));
        computerPick.setText(generateRandomPick());
        result.setText(getResult(userPick.getText(), computerPick.getText()));
    }

    @FXML
    void hitPaper(ActionEvent event) { // Cannot remove event, because JavaFX sends an event when called
        userPick.setText(options.get(1));
        computerPick.setText(generateRandomPick());
        result.setText(getResult(userPick.getText(), computerPick.getText()));

    }

    @FXML
    void hitScissor(ActionEvent event) { // Cannot remove event, because JavaFX sends an event when called
        userPick.setText(options.get(2));
        computerPick.setText(generateRandomPick());
        result.setText(getResult(userPick.getText(), computerPick.getText()));

    }
    // Method that generates a random pick for the computer
    public static String generateRandomPick(){
        int rnd = (int) (3.0  *  Math.random());
        return options.get(rnd);
    }

    /**
     *
     * @param userPick
     * @param computerPick
     * @return
     * -1 if user wins
     * 0 if it is a tie
     * 1 if computer wins
     * 2 if parameters are wrong
     */
    public static String getResult(String userPick, String computerPick){
        int result;
        if (userPick.equals(options.get(0)) && computerPick.equals(options.get(0))) result = 0;       //  Rock vs. Rock = 0
        else if (userPick.equals(options.get(0)) && computerPick.equals(options.get(1))) result = 1;  //  Rock vs. Paper = 1
        else if (userPick.equals(options.get(0)) && computerPick.equals(options.get(2))) result = -1; //  Rock vs. Scissor = -1
        else if (userPick.equals(options.get(1)) && computerPick.equals(options.get(0))) result = -1; //  Paper vs. Rock = -1
        else if (userPick.equals(options.get(1)) && computerPick.equals(options.get(1))) result = 0;  //  Paper vs. Paper = 0
        else if (userPick.equals(options.get(1)) && computerPick.equals(options.get(2))) result = 1;  //  Paper vs. Scissor = 1
        else if (userPick.equals(options.get(2)) && computerPick.equals(options.get(0))) result = 1;  // Scissor vs. Rock =  1
        else if (userPick.equals(options.get(2)) && computerPick.equals(options.get(1))) result = -1; // Scissor vs. Paper = -1
        else if (userPick.equals(options.get(2)) && computerPick.equals(options.get(2))) result = 0;  // Scissor vs. scissor = 0
        else result = 2;

        // Returns the result of the match
        if (result == -1) return "User won";
        else if (result == 0) return "It's a tie!";
        else if (result == 1) return "Computer won";
        else return "Could not determine";
    }
}