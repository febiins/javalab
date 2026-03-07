package record;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

class KEvents extends Frame implements KeyListener {
	TextField t;
	public KEvents() {
		super("Keyboard Listener");
		t = new TextField(20);
		setLayout(new FlowLayout());
		add(t);
		t.addKeyListener(this);
		setSize(700,700);
		setVisible(true);

		addWindowListener(new WindowAdapter(){
            		public void windowClosing(WindowEvent we){
                		System.exit(0);
            		}
        	});
	}

	public void keyPressed(KeyEvent ke) {
		System.out.println("" + ke.getKeyChar());
	}
	public void keyReleased(KeyEvent ke) {
		System.out.println("" + ke.getKeyChar());
	}
	public void keyTyped(KeyEvent ke) {
		System.out.println("" + ke.getKeyChar());
	}

}
class MK {
	public static void main(String args[]) {
		KEvents obj = new KEvents();
 	}
}