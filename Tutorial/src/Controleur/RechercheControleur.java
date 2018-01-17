/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 *
 * @author Arnoldkom
 */
public class RechercheControleur {
    @FXML
    private JFXTextField television;

    @FXML
    private JFXButton btn_valider;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> col_id;

    @FXML
    private TableColumn<?, ?> col_carateristique;

    @FXML
    private TableColumn<?, ?> col_prix;

    @FXML
    private TableColumn<?, ?> col_quantite;

    @FXML
    private TableColumn<?, ?> col_notice;

    @FXML
    private JFXButton btn_close;

    @FXML
    private JFXButton btn_reduire;

    @FXML
   public void Close(ActionEvent event) {
AccueilControleur.themWindow.close();
    }

    @FXML
   public void Reduire(ActionEvent event) {

    }

    @FXML
   public void Valider(ActionEvent event) {

    }

}
