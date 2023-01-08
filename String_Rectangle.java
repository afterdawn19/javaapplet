import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class String_Rectangle extends Applet
{
    int siz = 15;
    Color defaultColor = Color.BLACK;
    public void init()
    {
        Button b1= new Button("+");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paint(getGraphics(), siz = siz + 3, defaultColor);
            }
        });
        add(b1);

        Button b2= new Button("-");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paint(getGraphics(), siz = siz - 3, defaultColor);
            }
        });
        add(b2);
        Button b3= new Button("red");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paint(getGraphics(), siz, defaultColor=Color.RED);
            }
        });
        add(b3);

        Button b4= new Button("blue");
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paint(getGraphics(), siz, defaultColor=Color.BLUE);
            }
        });
        add(b4);

        Button b5= new Button("green");
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paint(getGraphics(), siz, defaultColor=Color.GREEN);
            }
        });
        add(b5);
        setBackground(Color.white);

    }

    //default paint function
    public void paint(Graphics g) {
        paint(getGraphics(), siz, defaultColor);
    }

    //customized pain function
    public void paint(Graphics g, int size, Color color){
        try{
            g.setColor(Color.WHITE);
            g.fillRect(0,0, 1000, 1000);
            g.setColor(Color.red);
            Font myFont = new Font("TimesRoman",Font.BOLD,size);
            g.setFont(myFont);
            g.setColor(color);
            String s = "String inside Rectangle";
            g.drawString(s,150,250);

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}