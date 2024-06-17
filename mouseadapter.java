import java.awt.*;
import java.awt.event.*;

public class mouseadapter extends MouseAdapter{
    Frame f;
    mouseadapter(){
        f= new Frame("mouse adapter");
        f.addMouseListener(this);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),50,30);
    }
    public static void main(String args[]){
        new mouseadapter();
    }
}