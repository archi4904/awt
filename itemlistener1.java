import java.awt.*;
import java.awt.event.*;
public class itemlistener1 implements ItemListener{

    Checkbox ck1,ck2;
    Label l;
    itemlistener1(){
        Frame f= new Frame("checkbox example");
        l= new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        ck1 =new  Checkbox("c++");
        ck1.setBounds(100,100,50,50);
         
        ck2 = new Checkbox("java");
        ck2.setBounds(100,150,50,50);

        f.add(ck1);
        f.add(ck2);
        f.add(l);

        ck1.addItemListener(this);
        ck2.addItemListener(this);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void itemStateChanged(ItemEvent e){
        
            if(e.getSource()==ck1)
            l.setText("c++checkbox:"+(e.getStateChange()==1?"checked":"unchecked"));
            if(e.getSource()==ck2)
            l.setText("javacheckbox:"+(e.getStateChange()==1?"checked":"unchecked"));
    }
    public static void main(String args[]){
        new itemlistener1();
    }
}