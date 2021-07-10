/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Rafael Nieves
 *
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainMenuController {

    @FXML
    public void createList(ActionEvent actionEvent) {
        //Prompt the user to type list name
        //Create the list with desired name
    }

    @FXML
    public void deleteList(ActionEvent actionEvent) {
        //Select list to delete
        //Delete list from program
    }

    @FXML
    public void editName(ActionEvent actionEvent) {
        //Select list to edit
        //Prompt the user to type list name
        //Update the name of the selected list
    }

    @FXML
    public void saveOneList(ActionEvent actionEvent) {
        //Select list to save
        //Create separate file
        //Save list to new created file
    }

    @FXML
    public void saveAllList(ActionEvent actionEvent) {
        //Create separate file
        //Add a list separator
        //Save all lists to new created file
    }

    @FXML
    public void loadOneList(ActionEvent actionEvent) {
        //Select file to load
        //Read the given file
        //Extract list from file
        //Add list to program
    }

    @FXML
    public void loadAllList(ActionEvent actionEvent) {
        //Select file to load
        //Read the given file
        //Separate lists from each other
        //Extract lists from file
        //Add list to program
    }
}
