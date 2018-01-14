/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.awt.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

/**
 *
 * @author Arnoldkom
 */
public class SaveControleur {

    @FXML
    private JFXButton btn_close;

    @FXML
    private JFXButton btn_reduire;

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
    private JFXTextField caracteristique;

    @FXML
    private JFXTextField prix;

    @FXML
    private JFXTextField quantite;

    @FXML
    private JFXTextArea notice;

    @FXML
    private JFXButton btn_valider;

    @FXML
    private JFXButton btn_annuler;

    @FXML
    private JFXTextField recherche;

    @FXML
    private ImageView image;

    @FXML
    private JFXButton btn_image;

    @FXML
    void Annuler(javafx.event.ActionEvent event) {

    }

    @FXML
    void Close(javafx.event.ActionEvent event) {

    }

    @FXML
    void Image2(javafx.event.ActionEvent event) {

    }

    @FXML
    void Reduire(javafx.event.ActionEvent event) {

    }

    @FXML
    void Valider(javafx.event.ActionEvent event) {

    }

    @FXML
    void btn_close(javafx.event.ActionEvent event) {
        AccueilControleur.themeWindow2.close();
    }

    @FXML
    void btn_reduire(javafx.event.ActionEvent event) {
        AccueilControleur.themeWindow2.close();
    }
}
