/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcv;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author lamorenoca
 */
public class MCV extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Button btn2=new Button();
        btn.setText("Boton 1");
        btn2.setText("Boton 2");
        btn.setTranslateX(45);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Esto es lo que sucede cuando oprimes el boton");
            }
        });
        
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Esto es lo que sucede cuando oprimes el segundo boton");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Ejemplo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
