import java.awt.*;
import java.awt.event.*;
public class keyadapter extends KeyAdapter{
    Frame f;
    Label l;
    TextArea area;
    keyadapter(){
        f= new Frame("key adapter");
        l=new Label();
        l.setBounds(20,50,200,20);
        area = new TextArea();
        area.setBounds(20,80,300,300);
        area.addKeyListener(this);
        f.add(area);
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void keyReleased(KeyEvent e){
        String text = area.getText();
        String words[]=text.split("\\s");
        l.setText("word:"+ words.length+"character:"+ text.length());
    }
    public static void main(String args[]){
        new keyadapter();
    }
}