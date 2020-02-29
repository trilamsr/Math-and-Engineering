package app;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class App implements KeyListener {
    static boolean running = true;
    
    @Override public void keyTyped(KeyEvent e) {}

    @Override public void keyReleased(KeyEvent e) {}

    @Override public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        running = code == KeyEvent.VK_S ? false:true;
    }

    public static void main(String[] args) throws Exception {
        ApproximatingPi app = new ApproximatingPi();
        while (running) {
            app.update();
            if (app.isBestToDate()) {
                System.out.println(app.PI);
            }
        }
    }
}