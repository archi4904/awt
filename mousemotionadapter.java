import java.awt.*;
import java.awt.event.*;

public class mousemotionadapter extends MouseMotionAdapter{
    Frame f;
    mousemotionadapter(){
        f= new Frame("mouse motion adapter");
        f.addMouseMotionListener(this);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void mouseDragged(MouseEvent e){
        Graphics g = f.getGraphics();
        g.setColor(Color.CYAN);
        g.fillOval(e.getX(),e.getY(),50,30);
    }
    public static void main(String args[]){
        new mousemotionadapter();
    }
}