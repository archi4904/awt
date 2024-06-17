import java.awt.*;
public class all_component{
    all_component(){
         Frame f = new Frame();
         Label l = new Label("Employee id:");
         l.setBounds(30,70,150,30);
         f.add(l);

         Button b= new Button("Submit");
         b.setBounds(30,130,80,30);
         f.add(b);

         TextField t = new TextField();
         t.setBounds(30,180,100,100);
         f.add(t);

         Checkbox checkbox1 = new Checkbox("c++");
         checkbox1.setBounds(140,130,50,50);
         f.add(checkbox1);

         Checkbox checkbox2 = new Checkbox("Java",true);
         checkbox2.setBounds(190,130,50,50);
         f.add(checkbox2);

         Choice c= new Choice();
         c.setBounds(390,70,75,75);
         c.add("Iten 1");
         c.add("Iten 2");
         c.add("Iten 3");
         c.add("Iten 4");
         c.add("Iten 5");
         f.add(c);

         MenuBar mb= new MenuBar();
         Menu menu = new Menu("Menu");
         Menu submenu = new Menu("Sub menu");
         MenuItem i1 = new MenuItem("Item1");
         MenuItem i2 = new MenuItem("Item2");
         MenuItem i3 = new MenuItem("Item3");
         MenuItem i4 = new MenuItem("Item4");
         MenuItem i5 = new MenuItem("Item5");
         menu.add(i1);
         menu.add(i2);
         menu.add(i3);
         submenu.add(i4);
         submenu.add(i5);
         menu.add(submenu);
         mb.add(menu);
         f.setMenuBar(mb);

         Panel panel = new Panel();
         panel.setBounds(30,40,80,80);
         panel.setBackground(Color.gray);
         f.add(panel);
         f.setSize(500,500);
         f.setTitle("Employee info");
         f.setLayout(null);
         f.setVisible(true);
}
public static void main(String args[])
{
    all_component obj = new all_component();
}
}