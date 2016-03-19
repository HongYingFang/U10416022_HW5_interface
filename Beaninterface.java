//U10416022

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;


public class Beaninterface  extends Application {
	@Override
	public void start(Stage primaryStage) {

    //new pane
		Pane beanpane = new Pane();
		
	
		//create lines
		Line line1 = new Line(280,65,280,40);
		line1.setStroke(Color.BLACK);

		Line line2 = new Line(230,65,230,40);
		line2.setStroke(Color.BLACK);

		Line line3 = new Line(280,65,455,280);
		line3.setStroke(Color.BLACK);

		Line line4 = new Line(455,365,55,365);
		line4.setStroke(Color.BLACK);

		Line line5 = new Line(230,65,55,280);
		line5.setStroke(Color.BLACK);

		Line line6 = new Line(455,280,455,365);
		line6.setStroke(Color.BLACK);

		Line line7 = new Line(55,280,55,365);
		line7.setStroke(Color.BLACK);		

		Line line8 = new Line(105,280,105,365);
		line8.setStroke(Color.BLACK);

		Line line9 = new Line(155,280,155,365);
		line9.setStroke(Color.BLACK);

		Line line10 = new Line(205,280,205,365);
		line10.setStroke(Color.BLACK);
	
		Line line11 = new Line(255,280,255,365);
		line11.setStroke(Color.BLACK);

		Line line12 = new Line(305,280,305,365);
		line12.setStroke(Color.BLACK);

		Line line13 = new Line(405,280,405,365);
		line13.setStroke(Color.BLACK);

		Line line14 = new Line(355,280,355,365);
		line14.setStroke(Color.BLACK);

		//get all lines on the pane
		beanpane.getChildren().addAll(line1,line2,line3,line4,line5,line6,line7,line8,line9,line10,line11,line12,line13,line14);

	  //create the scene
		Scene scene = new Scene(beanpane,550,430);
		primaryStage.setTitle("BeanMachine");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
