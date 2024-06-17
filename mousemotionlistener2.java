import java.awt.*;
import java.awt.event.*;
public class mousemotionlistener2 extends Frame implements MouseMotionListener{
    Label l;
    Color c= Color.BLUE;
    mousemotionlistener2(){
        l= new Label();
        l.setBounds(20,40,100,30);
        add(l);

        addMouseMotionListener(this);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }   
    public void mouseDragged(MouseEvent e)
    {
        l.setText("x="+e.getX()+"y="+e.getY());
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),30,30);
    }
    public void mouseMoved(MouseEvent e)
    {
        l.setText("x="+e.getX()+"y="+e.getY());
    }

public static void main(String args[]){
    new mousemotionlistener2();
}

}