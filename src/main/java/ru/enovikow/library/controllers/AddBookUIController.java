package ru.enovikow.library.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class AddBookUIController implements Initializable {
    @FXML
    private JFXTextField bookTitle;
    @FXML
    private JFXTextField bookAuthor;
    @FXML
    private JFXTextField bookPublisher;
    @FXML
    private JFXTextField bookID;
    @FXML
    private JFXButton saveButton;
    @FXML
    private JFXButton cancelButton;


    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void addBook(ActionEvent event) {

    }
    @FXML
    private void cancel(ActionEvent event) {

    }

}
