
package tetxtfx2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import sun.java2d.Disposer;


public class TetxtFx2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Group root = new Group();
        
        //Rectangle rect = new Rectangle(200, 100);
       // root.getChildren().add (rect);
       // rect.setLayoutX(20);
        
        //rect.setLayoutX(20);
//        rect.setLayoutY(200);
//        rect.setStroke(Color.BISQUE);
//        rect.setStrokeWidth(10);
        

//        Polygon pol = new Polygon(new double []);{
//        20.0, 10.0;
//        24.0, 50.0;
//        100.0, 70.0;
//    });
        
         
        
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        //StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
