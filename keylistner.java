import java.awt.*;
import java.awt.event.*;
public  class keylistner extends Frame implements KeyListener{
    Label l;
    TextArea area;
    keylistner(){
        l=new Label();
        l.setBounds(20,50,100,20);
        area=new TextArea();
        area.setBounds(20,80,300,300);
        area.addKeyListener(this);
        add(l);
        add(area);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e)
    {
        l.setText("KEY PRESSED");
    }
    public void keyTyped(KeyEvent e)
    {
        l.setText("KEY Typed");
    }
    public void keyReleased(KeyEvent e)
    {
        l.setText("KEY RELEASED");
    }
   
    public static void main(String args[]){
        new keylistner();
    }
}