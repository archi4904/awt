import java.awt.*;
public class frame_awt extends Frame{
    frame_awt(){
        Button b = new Button("Click me");
        b.setBounds(90,100,80,30);
        add(b);
        setSize(300,300);
        setTitle("this is our basic AWT example");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        frame_awt f = new frame_awt();
    }
}