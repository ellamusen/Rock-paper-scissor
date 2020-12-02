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

    @FXML
    private Button rockBtn;

    @FXML
    private Button paperBtn;

    @FXML
    private Button scissorBtn;

    @FXML
    private Text userPick;

    @FXML
    private Text computerPick;

    @FXML
    void hitRock(ActionEvent event) {
        userPick.setText(options.get(0));
        computerPick.setText(generateRandomPick());
    }

    @FXML
    void hitPaper(ActionEvent event) {
        System.out.println("You chose paper!");
        userPick.setText(options.get(1));
        computerPick.setText(generateRandomPick());

    }

    @FXML
    void hitScissor(ActionEvent event) {
        userPick.setText(options.get(2));
        computerPick.setText(generateRandomPick());

    }

    public static String generateRandomPick(){
        int rnd = (int) (3.0  *  Math.random());
        return options.get(rnd);
    }

}