import java.awt.*;
import java.awt.event.*;
public class mousemotionlistener extends Frame implements MouseMotionListener
{
    mousemotionlistener(){
    addMouseMotionListener(this);
    setSize(300,300);
    setLayout(null);
    setVisible(true);
    }
public void mouseDragged(MouseEvent e)
{
    Graphics g = getGraphics();
    g.setColor(Color.BLUE);
    g.fillOval(e.getX(),e.getY(),30,30);
}
public void mouseMoved(MouseEvent e){}

public static void main(String args[]){
    new mousemotionlistener();
}
}