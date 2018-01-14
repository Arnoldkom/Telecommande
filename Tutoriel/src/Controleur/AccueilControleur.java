/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import com.jfoenix.controls.JFXButton;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Arnoldkom
 */
public class AccueilControleur {

    public static Stage themeWindow2;
    public double x = 0;
    public double y = 0;
    public static String transfert = "";
    public static String transfert2 = "";
    @FXML
    private JFXButton btn_recherche;

    @FXML
    private JFXButton btn_mail;

    @FXML
    private JFXButton btn_save;

    @FXML
    private JFXButton btn_edition;

    @FXML
    private JFXButton btn_vente;

    @FXML
    private JFXButton btn_stock;

    @FXML
    private JFXButton btn_close;

    @FXML
    private JFXButton btn_reduire;

    @FXML
    public void Close(javafx.event.ActionEvent event) {
        System.exit(0);
    }

    @FXML
    public void Edition(javafx.event.ActionEvent event) {
        System.out.println("edition");
    }

    @FXML
    public void Mail(javafx.event.ActionEvent event) {
        System.out.println("Mail");
    }

    @FXML
    public void Recherche(javafx.event.ActionEvent event) {

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/Vue/recherche.fxml"));
            themeWindow2 = new Stage();
            themeWindow2.setScene(new Scene(root));
            //themeWindow.setFullScreen(true);

        } catch (IOException ex) {
            Logger.getLogger(AccueilControleur.class.getName()).log(Level.SEVERE, null, ex);
        }

        root.setOnMousePressed(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                x = event.getSceneX();
                y = event.getSceneY();
            }

        });

        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                themeWindow2.setX(event.getScreenX() - x);
                themeWindow2.setY(event.getScreenY() - y);
            }

        });
        themeWindow2.initStyle(StageStyle.UNDECORATED);
        themeWindow2.show();

    }

    @FXML
    public void Reduire(javafx.event.ActionEvent event) {
        System.out.println("reduire");
    }

    @FXML
    public void Save(javafx.event.ActionEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/Vue/save.fxml"));
            themeWindow2 = new Stage();
            themeWindow2.setScene(new Scene(root));
            //themeWindow.setFullScreen(true);

        } catch (IOException ex) {
            Logger.getLogger(AccueilControleur.class.getName()).log(Level.SEVERE, null, ex);
        }

        root.setOnMousePressed(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                x = event.getSceneX();
                y = event.getSceneY();
            }

        });

        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                themeWindow2.setX(event.getScreenX() - x);
                themeWindow2.setY(event.getScreenY() - y);
            }

        });
        themeWindow2.initStyle(StageStyle.UNDECORATED);
        themeWindow2.show();
    }

    @FXML
    public void Stock(javafx.event.ActionEvent event) {
        System.out.println("stock");
    }

    @FXML
    public void Vente(javafx.event.ActionEvent event) {
        System.out.println("Vente");
    }

}
