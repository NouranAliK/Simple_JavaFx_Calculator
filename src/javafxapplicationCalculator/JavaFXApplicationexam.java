/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationCalculater;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Nouran
 */
public class JavaFXapplicationCalculater extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         Label b1 =new Label("CALCULATER");
        Button ab=new Button("About");
        Button simp=new Button("Simple calculator");
        
          Alert a1=new Alert(Alert.AlertType.INFORMATION);
        a1.setTitle("about");
        a1.setHeaderText("Message");
        a1.setContentText("this is a massage");
        
        GridPane g =new GridPane();
        g.add(b1,0,0);
        g.add(simp,0,1);
        g.add(ab,1,1);
        g.setAlignment(Pos.CENTER);
        g.setVgap(10);
        g.setHgap(10);
        Scene s1 = new Scene(g, 400, 300);
         
         Label b2 =new Label("CALCULATER");
        Label n1 =new Label("First Number");
        Label n2 =new Label("Second Number");
        TextField nn1 =new TextField();
        TextField nn2 =new TextField();
        Label q1=new Label("?");
        Label q2=new Label("?");
        Label q3=new Label("?");
        Label q4=new Label("?");
        Button bt1 =new Button("Sum");
        Button bt2 =new Button("subtraction");
        Button bt3=new Button("multiplication");
        Button bt4=new Button("division");
        Button back =new Button("back");
        
        
        GridPane g2 =new GridPane();
        g2.add(b2,0,0);
        g2.add(n1,0,1);
        g2.add(n2,0,2);
         g2.add(nn1,1,1);
        g2.add(nn2,1,2);
        g2.add(q1,1,3);
        g2.add(q2,1,4);
        g2.add(q3,1,5);
        g2.add(q4,1,6); 
        g2.add(bt1,0,3);
        g2.add(bt2,0,4);
        g2.add(bt3,0,5);
        g2.add(bt4,0,6);
        g2.add(back,0,7);
        
        g2.setAlignment(Pos.CENTER);
        g2.setVgap(10);
        g2.setHgap(10);
        Scene s2 = new Scene(g2, 500, 500);
        
       ab.setOnAction((e)->{
            a1.show();
        }); 
        simp.setOnAction((e)->{
             primaryStage.setScene(s2);
        }); 
         back.setOnAction((e)->{
             primaryStage.setScene(s1);
        }); 
         bt1.setOnAction((ActionEvent event)->{
             double t1= Double.parseDouble(nn1.getText());
             double t2= Double.parseDouble(nn2.getText());
             double a=t1+t2;
              q1.setText(Double.toString(a));
              
        }); 
        
           bt2.setOnAction((ActionEvent event)->{
             double t1= Double.parseDouble(nn1.getText());
             double t2= Double.parseDouble(nn2.getText());
             double a=t1-t2;
              q2.setText(Double.toString(a));
              
        }); 
             bt3.setOnAction((ActionEvent event)->{
             double t1= Double.parseDouble(nn1.getText());
             double t2= Double.parseDouble(nn2.getText());
             double a=t1*t2;
              q3.setText(Double.toString(a));
              
        }); 
               bt4.setOnAction((ActionEvent event)->{
             double t1= Double.parseDouble(nn1.getText());
             double t2= Double.parseDouble(nn2.getText());
             double a=t1/t2;
              q4.setText(Double.toString(a));
              
        }); 
        
        
        
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(s1);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
