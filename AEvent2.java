import java.awt.*;
import java.awt.event.*;
class AEvent2 extends Frame{
    TextField tf;
     
    AEvent2(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click me");
        b.setBounds(100,120,80,30);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("hello");
            };
        });
        add(b);
        add(tf);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        new AEvent2();
    }
}