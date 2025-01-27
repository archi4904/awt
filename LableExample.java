import java.awt.*;
import java.awt.event.*;
public class LableExample extends Frame implements ActionListener{
    TextField tf;
    Label l;
    Button b;
    LableExample(){
        tf = new TextField();
        tf.setBounds(50,50,150,20);
        l= new Label();
        l.setBounds(50,100,250,20);
        b= new Button("Find Ip"); b.setBounds(50,150,60,30);
        b.addActionListener(this);
        add(b);
        add(tf);
        add(l);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of "+host+" is: "+ip);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    public static void main(String args[]){
        new LableExample();
    }
}