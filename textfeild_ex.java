import java.awt.*;
import java.awt.event.*;
public class textfeild_ex implements ActionListener{
    TextField tf1,tf2,tf3;
    Label l1,l2,l3;
    Frame f;
    Button b1,b2;
    textfeild_ex(){
        l1= new Label("Numeral 1:");
        l1= new Label("Numeral 2:");
        l1= new Label("Result:");
       
        tf1 = new TextField();
        tf1.setBounds(50,50,150,20);
       
        tf2 = new TextField();
        tf2.setBounds(50,100,150,20);
       
        tf3 = new TextField();
        tf3.setBounds(50,150,150,20);
        tf3.setEditable(false);
      
        b1 = new Button("+");
        b1.setBounds(50,200,50,50);
       
        b2 = new Button("-");
        b2.setBounds(50,200,50,50);
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        f = new Frame();
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c=0;
        if(e.getSource()== b1){
            c=a+b;
        }
        else if(e.getSource()== b2)
        {
            c=a-b;
        }
        String result=String.valueOf(c);
        tf3.setText(result);
    }
    public static void main(String args[]){
        new textfeild_ex();
    }
}