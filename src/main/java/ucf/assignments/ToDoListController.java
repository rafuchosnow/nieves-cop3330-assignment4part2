/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Rafael Nieves
 *
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.List;

public class ToDoListController {

    @FXML
    Button addButton;
    @FXML
    TextField descriptionField;
    @FXML
    DatePicker datePicker;
    @FXML
    Button completeButton;
    @FXML
    ListView<String> itemList;

    ObservableList<String> arrayList = FXCollections.observableArrayList();
    ObservableList<String> arrayIncomplete = FXCollections.observableArrayList();
    ObservableList<String> arrayComplete = FXCollections.observableArrayList();

    public void initialize(){
        //Initialize datePicker to current date
        datePicker.setValue(LocalDate.now());
        itemList.setItems(arrayList);
    }

    @FXML
    public void addItem(ActionEvent actionEvent) {
        //Prompt the user type in list item
        //Current date provided as default
        //Mark item as incomplete by default

        String newItem = descriptionField.getText() + "  ||  " + datePicker.getValue()  + "  ||  Incomplete";

        arrayList.add(newItem);
        arrayIncomplete.add(newItem);

        //Add item to the list
        //Reset itemDescription

        descriptionField.setText("");
        datePicker.setValue(LocalDate.now());

        itemList.refresh();
    }

    @FXML
    public void removeItem(ActionEvent actionEvent) {
        //Select item from the list
        //Remove item from the list
        arrayList.remove(itemList.getSelectionModel().getSelectedItem());
        arrayComplete.remove(itemList.getSelectionModel().getSelectedItem());
        arrayIncomplete.remove(itemList.getSelectionModel().getSelectedItem());

        itemList.refresh();
    }

    @FXML
    public void clearList(ActionEvent actionEvent) {
        //Select item from the list
        //Remove all items from the list

        itemList.setItems(arrayList);
        arrayList.removeAll(itemList.getItems());

        itemList.setItems(arrayComplete);
        arrayComplete.removeAll(itemList.getItems());

        itemList.setItems(arrayIncomplete);
        arrayIncomplete.removeAll(itemList.getItems());

        itemList.setItems(arrayList);
    }

    @FXML
    public void editItem(ActionEvent actionEvent) {
        //Select item from the list
        String itemDescription = itemList.getSelectionModel().getSelectedItem();
        itemDescription = itemDescription.substring(0, itemDescription.length() - 32);

        descriptionField.setText(itemDescription);

        //Remove previous item from all lists
        arrayList.remove(itemList.getSelectionModel().getSelectedItem());
        arrayComplete.remove(itemList.getSelectionModel().getSelectedItem());
        arrayIncomplete.remove(itemList.getSelectionModel().getSelectedItem());

        itemList.refresh();
        //Prompt the user for new item description
        //Add item back to list
    }

    @FXML
    public void markComplete(ActionEvent actionEvent) {
        //Select item from list
        //Mark item as completed

        String itemDescription = itemList.getSelectionModel().getSelectedItem();
        itemDescription = itemDescription.replace("Incomplete","Complete");

        //Add updated item
        arrayList.add(itemDescription);
        arrayComplete.add(itemDescription);

        //Remove previous item from all lists
        arrayList.remove(itemList.getSelectionModel().getSelectedItem());
        arrayComplete.remove(itemList.getSelectionModel().getSelectedItem());
        arrayIncomplete.remove(itemList.getSelectionModel().getSelectedItem());

        itemList.refresh();
    }

    @FXML
    public void markIncomplete(ActionEvent actionEvent) {
        //Select item from list
        //Mark item as incomplete

        String itemDescription = itemList.getSelectionModel().getSelectedItem();
        itemDescription = itemDescription.replace("Complete","Incomplete");

        //Add updated item
        arrayList.add(itemDescription);
        arrayIncomplete.add(itemDescription);

        //Remove previous item from all lists
        arrayList.remove(itemList.getSelectionModel().getSelectedItem());
        arrayComplete.remove(itemList.getSelectionModel().getSelectedItem());
        arrayIncomplete.remove(itemList.getSelectionModel().getSelectedItem());


        itemList.refresh();
    }

    @FXML
    public void sortAll(ActionEvent actionEvent) {
        //Show both complete and incomplete items
        itemList.setItems(arrayList);
    }

    @FXML
    public void sortIncomplete(ActionEvent actionEvent) {
        //Show incomplete items only
        itemList.setItems(arrayIncomplete);
    }

    @FXML
    public void sortComplete(ActionEvent actionEvent) {
        //Show complete items only
        itemList.setItems(arrayComplete);
    }

    @FXML
    public void saveList(ActionEvent actionEvent) {
        //Save list to new created file
    }

    @FXML
    public void loadList(ActionEvent actionEvent) {
        //Select file to load
        //Read the given file
        //Add list to program
    }

}
