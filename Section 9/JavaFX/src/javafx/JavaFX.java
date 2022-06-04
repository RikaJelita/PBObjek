
package testfx;



import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import javafx.stage.Stage;


public class TestFx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Button tombol = new Button();
        tombol.setText("Selamat Malam");
        
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
     // StackPane root = new StackPane();
        // AnchorPane root = new AnchorPane();  
        //VBox root =  new VBox();
        // HBox root = new HBox(); 
        //GridPane root = new GridPane root();
        Group root =new Group();
        
         tombol.setLayoutY(100);
         tombol.setLayoutY(200);
         Color cc = Color.rgb(255, 0, 0);
                 
                 
         Scene scene = new Scene (root, 700, 450, Color.BLUE );
         
//        root.getChildren().add(btn);
//        root.getChildren().add(tombol);
        root.getChildren().addAll(btn,tombol);
        
        
        //Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        
    }
    
}
