
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnoldkom
 */
public class Main extends Application {

    public double x;
    public double y;
    public static Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception {
     window = primaryStage;
     Parent root = FXMLLoader.load(getClass().getResource("/Vue/Accueil.fxml"));
     
     root.setOnMousePressed(new EventHandler<MouseEvent>(){
         @Override
         public void handle(MouseEvent event) {
         
             x = event.getSceneX();
             y= event.getSceneY();
         
         }
         
         
     });
     
     
     root.setOnMouseDragged(new EventHandler<MouseEvent>(){
         @Override
         public void handle(MouseEvent event) {
         window.setX(event.getScreenX() - x);
         window.setY(event.getScreenY() - y);
         
         }
         
     });
     
     
     Scene scene = new Scene(root);
     scene.setFill(Color.TRANSPARENT);
     window.setScene(scene);
     window.setTitle("Telecommande");
     window.initStyle(StageStyle.UNDECORATED);
     
     window.show();
    }
    
     public static void main(String[] args) {
        launch(args);
    }
    
    
    
}
