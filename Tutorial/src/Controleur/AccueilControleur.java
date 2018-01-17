/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
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

    public static Stage themWindow;
    public double x;
    public double y;

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
    public void Close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    public void Edition(ActionEvent event) {
        System.err.println("Edition");
    }

    @FXML
    public void Mail(ActionEvent event) {
        System.err.println("Mail");
    }

    @FXML
    public void Recherche(ActionEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/Vue/Recherche.fxml"));
            themWindow = new Stage();
            themWindow.setScene(new Scene(root));
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
                themWindow.setX(event.getScreenX() - x);
                themWindow.setY(event.getScreenY() - y);
            }

        });
        themWindow.initStyle(StageStyle.UNDECORATED);
        themWindow.show();
    }

    @FXML
    public void Reduire(ActionEvent event) {
        System.err.println("Reduire");
    }

    @FXML
    public void Save(ActionEvent event) {

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/Vue/Save.fxml"));
            themWindow = new Stage();
            themWindow.setScene(new Scene(root));
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
                themWindow.setX(event.getScreenX() - x);
                themWindow.setY(event.getScreenY() - y);
            }

        });
        themWindow.initStyle(StageStyle.UNDECORATED);
        themWindow.show();
    }

    @FXML
    public void Stock(ActionEvent event) {
        System.err.println("Stock");
    }

    @FXML
    public void Vente(ActionEvent event) {
        System.err.println("Vente");
    }

}
