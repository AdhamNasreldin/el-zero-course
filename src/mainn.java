import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 import javafx.event.ActionEvent;
 import javafx.event.EventHandler;
 
 
public class mainn extends Application {

	 
	 @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
	  // Create a pane and set its properties
		 
		 Pane Userdefi = new Pane() ; 
		 //Userdefi.setHgap(10) ;
		 //Userdefi.setVgap(10) ;
		 Userdefi.setPadding(new Insets(10));
		//Text text = new Text()	 ;
		 Scene SceneOne = new Scene(Userdefi,200,200);
		 Text question = new Text("Select user type") ; 
		// question.autosize();
		 Userdefi.getChildren().add(question) ; 
		 question.setLayoutX(20);
		 question.setLayoutY(50);
		 question.layoutXProperty().bind(SceneOne.widthProperty().divide(2).subtract(50)) ;
		 //question.fontProperty().bind(SceneOne.xProperty());
		 Button teacher = new Button("Teacher") ;
		 teacher.setLayoutX(115);
		 teacher.setLayoutY(125);
		 teacher.layoutXProperty().bind(SceneOne.widthProperty().divide(2));;
		 Button Student = new Button ("Student") ; 
		 StudHandlerClass han1 = new StudHandlerClass()	 ; 
		 Student.setOnAction(han1 ) ; 
		 Student.setLayoutX(25);
		 Student.setLayoutY(125); 
		 Student.layoutXProperty().bind(SceneOne.widthProperty().divide(2).subtract(70)) ;
		 Userdefi.getChildren().addAll(teacher, Student) ;
		// Scene SceneOne = new Scene(Userdefi,200,200);
		 primaryStage.setScene(SceneOne);
		 primaryStage.show();
		 Pane pane2 = new Pane() ; 
		 Scene scene2 = new Scene(pane2, 200 ,200 ) ; 
		 
		 
		
		 
		 
		 
		 
	//	primarystage.setscene(Userdef);  
		 FlowPane pane = new FlowPane();
	  	  pane.setOrientation(Orientation.VERTICAL);
	       pane.setPadding(new Insets(10,10,10,10));
	       pane.setHgap(5);
	       pane.setVgap(5);
	       pane.getChildren().addAll(new Label ("First Name:"),new TextField(),new Label("Middle name:"),new TextField () ) ;
	       Button btac = new Button("create") ; 
	       pane.getChildren().add(btac) ;
	      // Scene scene = new Scene(pane, 500 ,500) ; 
	 // Place the scene in the stage
	       primaryStage.setTitle("Coursaty"); ;
	      // primaryStage.setScene(scene);
	       primaryStage.show(); // Display the stage
	    } 
	   } 

	 class StudHandlerClass implements EventHandler<ActionEvent> {
	     @Override 
	 public void handle(ActionEvent e) {
	       System.out.println("user is student");
	     }
	   }
	 
	  class TeacherHandler implements EventHandler<ActionEvent> {
	     @Override
	 
	 public void handle(ActionEvent e) {
	       System.out.println("Cancel button clicked");
	     }
	 	
}