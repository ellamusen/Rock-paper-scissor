package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    private List<String> options = Arrays.asList("Rock", "Paper", "Scissor");

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
    }

    @FXML
    void hitPaper(ActionEvent event) {
        System.out.println("You chose paper!");
        userPick.setText(options.get(1));

    }

    @FXML
    void hitScissor(ActionEvent event) {
        userPick.setText(options.get(2));

    }

}