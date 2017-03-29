import java.awt.*;  
import java.applet.*;  

public class AnimationExampleNoComments extends Applet {  
    
	public void init() {    
		setSize(720, 480); // Sets dimension of the window before it starts 
	}  
   
  public void paint(Graphics page) {
	  
	  page.setColor(Color.BLACK);
	  page.drawString("Green Bar Example Animation", 50, 90);
	  
	  for(int i=50; i<500; i++){
		  
		  page.setColor(Color.GREEN);
		  page.drawRect(i, 100, 25, 25);
		  page.fillRect(i, 100, 25, 25);
		  
		  try{Thread.sleep(15);} catch(Exception e){}
		  
	  }

	  page.setColor(Color.BLACK);
	  page.drawString("Finished!", 475, 145);
	  
  	}  
}  
