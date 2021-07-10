/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Rafael Nieves
 *
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListItemsControllerTest {

    @Test
    void addItem() {
        //Provide item description
        //Call addItem function
        //Assert the item is same as provided
    }

    @Test
    void removeItem() {
        //Provide item description
        //Call addItem function
        //Select the list item
        //Call removeItem function
        //Assert that the list is blank
    }

    @Test
    void editItem() {
        //Provide item description
        //Call addItem function
        //Provide new item description
        //Call editItem function
        //Assert that the item description has been updated
    }

    @Test
    void markComplete() {
        //Provide item description
        //Call addItem function
        //Select item
        //Call markComplete function
        //Assert item .matches with "completed" sign
    }

    @Test
    void sortAll() {
        //Provide item description
        //Call addItem function x3
        //Assert all items are same as provided
    }

    @Test
    void sortIncomplete() {
        //Provide item description
        //Call addItem function x2
        //Select item
        //Call markComplete function
        //Call sortIncomplete
        //Assert all items consist of only incomplete items
    }

    @Test
    void sortComplete() {
        //Provide item description
        //Call addItem function x2
        //Select item
        //Call markComplete function
        //Call sortComplete
        //Assert all items consist of only complete items
    }

}