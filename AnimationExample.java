import java.awt.*;  
import java.applet.*;  

public class AnimationExample extends Applet {  
   
	// The init() method is like the constructor of the Applet.
	// It initializes most of the variables needed before the
	// applet window actually pops up. We don't need much, so our
	// method will be very short.
	
	public void init() {    
		setSize(720, 480);
		// Sets dimension of the window before it starts
	}  
   
  public void paint(Graphics page) {
	  
	  page.setColor(Color.BLACK);
	  page.drawString("Green Bar Example Animation", 50, 90);
	  
	  for(int i=50; i<500; i++){
		  // Beginning of the for loop.
		  
		  page.setColor(Color.GREEN);
		  page.drawRect(i, 100, 25, 25);
		  page.fillRect(i, 100, 25, 25);
		  
		  
		  // This will draw a 25px square on the coordinate (50, 100)
		  // and then on the coordinate (51, 100), and so on.
		  
		  // Normally, a for loop will execute all the draw commands instantly
		  // since modern computers are so fast. What we need is a way to delay 
		  // the program so that we can see the line being drawn. This is where
		  // Thread.sleep() and the try/catch blocks come in.
		  
		  try{
			  Thread.sleep(15);
			  // This command interrupts the thread (the flow of commands/calculations
			  // from the Java Virtual Machine to the CPU) for 15 milliseconds.
			  // It's useful for animating things, but because it has to completely
			  // interrupt the program, it will throw out an exception as though it had
			  // crashed or faced an error. Try putting "Thread.sleep(15);" outside of
			  // try{}catch(){} loop, it will be highlighted red and trying to run it 
			  // will cause a exception in compile time.
			  
			  // This also means you can't really interact with the program with
			  // user inputs until the thread can resume freely
			  // (i.e. after the for loop is finished.)
		  }
		  catch(Exception e){
			  // This part of the code should be empty in this case since we
			  // just want the animation to continue after the thread is stopped,
			  // but it is useful for debugging if you're designing a complex
			  // program that could be prone to error.
		  }
		  
		  
		  // A better way to format this command so it is more space-friendly is like so:
		  
		  		//	try{Thread.sleep(15);} catch(Exception e){}
		  
		  // It may look clunky because we normally have spaces/indents, but it
		  // is legal code because Java doesn't care about the spaces between commands.
		
		  
		  // End of the for loop. After the 15ms delay, the program will
		  // pick up and draw the next portion of the green rectangle.
	  }

	  page.setColor(Color.BLACK);
	  page.drawString("Finished!", 525, 300);
	  
  	}  
}  
