package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle; 
import java.util.*;

public class PersonalProjectController implements Initializable {

	@FXML
	private Button Button1;
	
	@FXML
	private Label DateText;
	
	@FXML
	private Label XmasText;
	
	@FXML
	private ImageView XmasImage;
	
	@Override
    public void initialize(URL url, ResourceBundle rb) {
		
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December" };
		
		Date Day = new Date();
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        String DayOfTheWeek = simpleDateformat.format(Day); 
       
        Calendar now = Calendar.getInstance();
        int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
        String dayOfMonthStr = String.valueOf(dayOfMonth);
        String month = monthName[now.get(Calendar.MONTH)]; 
  
        DateText.setText(DayOfTheWeek + " " + month + " " + dayOfMonthStr); 
         
        Calendar xmas = Calendar.getInstance();
        
        xmas.set(Calendar.MONTH, Calendar.DECEMBER);
        xmas.set(Calendar.DAY_OF_MONTH, 25);
        
        long nowMilli = now.getTimeInMillis();
        long xmassMilli = xmas.getTimeInMillis();
        long delta = xmassMilli - nowMilli; 
        
        if(delta == 0){
        	XmasText.setText("It's Christmas!");
        }
        else{
        	XmasText.setText((delta / 24 / 60 / 60 / 1000) + " day's until Christmas!");
        }
        
	}
	
	public void Push(ActionEvent event) {
	       System.out.println("Button Clicked!");
	
	}
	
 
}
