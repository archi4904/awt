import java.awt.*;
import java.awt.event.*;

public class calculator extends WindowAdapter implements ActionListener
{
    Frame f;
    Label l1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button add,sub,mul,div,mod,ans,clr,dot,np,back;
    double result;
    double n1,n2 ,check;
    
    calculator(){
        //for grey screen to display on clac
        f = new Frame("MY CALCULATOR");
        Font f1 = new Font("SansSerif",Font.BOLD,28);
        f.setBackground(Color.GREEN);
        l1 = new Label();
        l1.setFont(f1);
        l1.setBackground(Color.BLACK);
        l1.setBounds(50,50,260,60);

        // for button
        b1= new Button("1");
        b1.setBounds(50,340,50,50);

        b2= new Button("2");
        b2.setBounds(120,340,50,50);

        b3= new Button("3");
        b3.setBounds(190,340,50,50);

        b4= new Button("4");
        b4.setBounds(50,270,50,50);

        b5= new Button("5");
        b5.setBounds(120,270,50,50);

        b6= new Button("6");
        b6.setBounds(190,270,50,50);

        b7= new Button("7");
        b7.setBounds(50,200,50,50);

        b8= new Button("8");
        b8.setBounds(120,200,50,50);

        b9= new Button("9");
        b9.setBounds(190,200,50,50);

        b0= new Button("0");
        b0.setBounds(120,410,50,50);

        // arithmatic button
        add = new Button("+");
        add.setBounds(260,340,50,50);

        sub = new Button("-");
        sub.setBounds(260,270,50,50);

        mul=new Button("*");
        mul.setBounds(260,200,50,50);

         div=new Button("/");
         div.setBounds(260,130,50,50);

         np=new Button("+/-");//n=negative,p=positive
         np.setBounds(50,410,50,50);

         dot=new Button(".");
         dot.setBounds(190,410,50,50);

         back=new Button("back");
         back.setBounds(120,130,50,50);
         
         mod=new Button("%");
         mod.setBounds(190,130,50,50);

         ans=new Button("=");
         ans.setBounds(260,410,50,50);

         clr=new Button("CE");
         clr.setBounds(50,130,65,50);

         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         b6.addActionListener(this);
         b7.addActionListener(this);
         b8.addActionListener(this);
         b9.addActionListener(this);
         b0.addActionListener(this);

         add.addActionListener(this);
         sub.addActionListener(this);
         mul.addActionListener(this);
         div.addActionListener(this);
         mod.addActionListener(this);
         np.addActionListener(this);
         back.addActionListener(this);
         dot.addActionListener(this);
         ans.addActionListener(this);
         clr.addActionListener(this);
         f.addWindowListener(this);
         f.add(l1);
         
         //adding button in the windowadaptor
         f.add(b1);  
         f.add(b2);  
         f.add(b3);  
         f.add(b4);  
         f.add(b5);  
         f.add(b6);  
         f.add(b7);  
         f.add(b8);  
         f.add(b9);  
         f.add(b0);  
         f.add(add);  
         f.add(sub);  
         f.add(mul);  
         f.add(div);  
         f.add(mod);  
         f.add(back);  
         f.add(np);  
         f.add(clr);  
         f.add(dot);  
         f.add(ans);
         
         //for screen size
         f.setSize(350,500);
         f.setLayout(null);
         f.setVisible(true);
    }
    public void windowClosing(WindowEvent e)
    {
        f.dispose();
    }
    public void actionPerformed(ActionEvent e)
    {
        String r,no;
        //get no form button
        if(e.getSource()== b1)
        {
            no=l1.getText();
            r=no+"1";
            l1.setText(r);
        }
        if(e.getSource()== b2)
        {
            no=l1.getText();
            r=no+"2";
            l1.setText(r);
        }
        if(e.getSource()== b3)
        {
            no=l1.getText();
            r=no+"3";
            l1.setText(r);
        }
        if(e.getSource()== b4)
        {
            no=l1.getText();
            r=no+"4";
            l1.setText(r);
        }
        if(e.getSource()== b5)
        {
            no=l1.getText();
            r=no+"5";
            l1.setText(r);
        }
        if(e.getSource()== b6)
        {
            no=l1.getText();
            r=no+"6";
            l1.setText(r);
        }
        if(e.getSource()== b7)
        {
            no=l1.getText();
            r=no+"7";
            l1.setText(r);
        }
        if(e.getSource()== b8)
        {
            no=l1.getText();
            r=no+"8";
            l1.setText(r);
        }
        if(e.getSource()== b9)
        {
            no=l1.getText();
            r=no+"9";
            l1.setText(r);
        }
        if(e.getSource()== b0)
        {
            no=l1.getText();
            r=no+"0";
            l1.setText(r);
        }
        if(e.getSource()== dot)
        {
            no=l1.getText();
            r=no+".";
            l1.setText(r);
        }
        if(e.getSource()== back)
        {
            no=l1.getText();
            try{
            r=no.substring(0,no.length()-1);
            }
            catch(StringIndexOutOfBoundsException f){
                return;
            }
            l1.setText(r);
        }
        if (e.getSource()==add) {
            try {
                n1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("invalid format");
                return;
            }
            r="";
            l1.setText(r);
            check=1;
        }
        if (e.getSource()==sub) {
            try {
                n1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("invalid format");
                return;
            }
            r="";
            l1.setText(r);
            check=2;
        }
        if (e.getSource()==mul) {
            try {
                n1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("invalid format");
                return;
            }
            r="";
            l1.setText(r);
            check=3;
        }
        if (e.getSource()==div) {
            try {
                n1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("invalid format");
                return;
            }
            r="";
            l1.setText(r);
            check=4;
        }
        if (e.getSource()==mod) {
            try {
                n1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("invalid format");
                return;
            }
            r="";
            l1.setText(r);
            check=5;
        }
        if (e.getSource()==np) {
            try {
                String key = l1.getText();
            } catch (NumberFormatException f) {
                l1.setText("invalid format");
                return;
            }
            r="-";
            l1.setText(r);
            check=6;
        }
        if (e.getSource()==ans) {
            try {
                n2 = Double.parseDouble(l1.getText());
            } catch (Exception f) {
                l1.setText("enter number first");
                return;
            }
            if(check==1)
            result=n1+n2;
            if (check==2) 
            result=n1-n2;
            if(check==3)
            result=n1*n2;
            if (check==4) 
            result=n1/n2;
            if(check==5)
            result=n1%n2;
            if (check==6) 
            result=-n1;
            l1.setText(String.valueOf(result));    
        }
        if (e.getSource() == clr)
        {
            n1=0;n2=0;check=0;result=0;
            r="";
            l1.setText(r);
        }
    }
    public static void main(String[] args) {
        new calculator();
    }
}