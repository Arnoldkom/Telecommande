/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.imageio.ImageIO;

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
   public void Annuler(ActionEvent event) {
    }

    @FXML
   public void Close(ActionEvent event) {
AccueilControleur.themWindow.close();
    }

    @FXML
   public void Image2(ActionEvent event) {
    }

    @FXML
   public void Reduire(ActionEvent event) {
     
  
        
    }

    @FXML
   public void Valider(ActionEvent event) {

    }

    @FXML
   public void btn_close(ActionEvent event) {

    }

    @FXML
   public void btn_reduire(ActionEvent event) {

    }

}
