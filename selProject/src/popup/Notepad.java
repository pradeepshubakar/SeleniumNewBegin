package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException, AWTException {
		
		Runtime rt = Runtime.getRuntime();
		rt.exec("notepad");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_K);
		r.keyPress(KeyEvent.VK_A);
	}
}
