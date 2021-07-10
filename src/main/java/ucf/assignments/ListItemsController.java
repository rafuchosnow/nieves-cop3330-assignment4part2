/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Rafael Nieves
 *
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ListItemsController {

    @FXML
    public void addItem(ActionEvent actionEvent) {
        //Promp the user type in list item
        //Add item to the list
    }

    @FXML
    public void removeItem(ActionEvent actionEvent) {
        //Select item from the list
        //Remove item from the list
    }

    @FXML
    public void editItem(ActionEvent actionEvent) {
        //Select item from the list
        //Prompt the user for new item description
        //Replace item to list
    }

    @FXML
    public void markComplete(ActionEvent actionEvent) {
        //Select item from list
        //Mark item as completed
    }

    @FXML
    public void sortAll(ActionEvent actionEvent) {
        //Show both complete and incomplete items
    }

    @FXML
    public void sortIncomplete(ActionEvent actionEvent) {
        //Use function (maybe .matches) to hide complete items
        //Show incomplete items only
    }

    @FXML
    public void sortComplete(ActionEvent actionEvent) {
        //Use functions to hide incomplete items
        //Show complete items only
    }




}
