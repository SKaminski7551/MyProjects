import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import static java.lang.Math.*;

public class Kalkulator implements MouseMotionListener, ActionListener, MouseListener, ChangeListener {

    public static void main(String[] args)
    {
        Kalkulator c = new Kalkulator();
    }

    //private static final DecimalFormat df = new DecimalFormat("0.0000");

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Bdif){
            Differentials Differentials = new Differentials();
        }
        if(e.getSource()==B0){
            s3 = poletekst.getText();
            s4 = "0";
            s5 = s3 + s4;
            poletekst.setText(s5);
        }
        if(e.getSource()==B1){
            s3 = poletekst.getText();
            s4 = "1";
            s5 = s3 + s4;
            poletekst.setText(s5);
        }
        if(e.getSource()==B2){
            s3 = poletekst.getText();
            s4 = "2";
            s5 = s3 + s4;
            poletekst.setText(s5);
        }
        if(e.getSource()==B3){
            s3 = poletekst.getText();
            s4 = "3";
            s5 = s3 + s4;
            poletekst.setText(s5);
        }
        if(e.getSource()==B4){
            s3 = poletekst.getText();
            s4 = "4";
            s5 = s3 + s4;
            poletekst.setText(s5);
        }
        if(e.getSource()==B5){
            s3 = poletekst.getText();
            s4 = "5";
            s5 = s3 + s4;
            poletekst.setText(s5);
        }
        if(e.getSource()==B6){
            s3 = poletekst.getText();
            s4 = "6";
            s5 = s3 + s4;
            poletekst.setText(s5);
        }
        if(e.getSource()==B7){
            s3 = poletekst.getText();
            s4 = "7";
            s5 = s3 + s4;
            poletekst.setText(s5);
        }
        if(e.getSource()==B8){
            s3 = poletekst.getText();
            s4 = "8";
            s5 = s3 + s4;
            poletekst.setText(s5);
        }
        if(e.getSource()==B9){
            s3 = poletekst.getText();
            s4 = "9";
            s5 = s3 + s4;
            poletekst.setText(s5);
        }
        if(e.getSource()==Bdot){
            s3 = poletekst.getText();
            s4 = ".";
            s5 = s3 + s4;
            poletekst.setText(s5);
        }
        if(e.getSource()==Bsuma){
            s1 = poletekst.getText();
            poletekst.setText("");
            c = 1;
        }
        if(e.getSource()==Broznica){
            s1 = poletekst.getText();
            poletekst.setText("");
            c = 2;
        }
        if(e.getSource()==Biloczyn){
            s1 = poletekst.getText();
            poletekst.setText("");
            c = 3;
        }
        if(e.getSource()==Biloraz){
            s1 = poletekst.getText();
            poletekst.setText("");
            c = 4;
        }
        if(e.getSource()==Bwyk){
            s1 = poletekst.getText();
            poletekst.setText("");
            c = 5;
        }
        if(e.getSource()==Blog){
            s1 = poletekst.getText();
            poletekst.setText("");
            c = 6;
        }
        if(e.getSource()==Bsin){
            poletekst.setText("");
            c = 7;
        }
        if(e.getSource()==Bcos){
            poletekst.setText("");
            c = 8;
        }
        if(e.getSource()==Btan){
            poletekst.setText("");
            c = 9;
        }
        if(e.getSource()==Bsqt){
            poletekst.setText("");
            c = 10;
        }
        if(e.getSource()==Bsqrt){
            poletekst.setText("");
            c = 11;
        }
        if(e.getSource()==Brow){
            s2 = poletekst.getText();
            if (c == 1){
                n=Float.parseFloat(s1) + Float.parseFloat(s2);
                poletekst.setText(String.valueOf(n));
            }
            if (c == 2){
                n=Float.parseFloat(s1) - Float.parseFloat(s2);
                poletekst.setText(String.valueOf(n));
            }
            if (c == 3){
                n=Float.parseFloat(s1) * Float.parseFloat(s2);
                poletekst.setText(String.valueOf(n));
            }
            if (c == 4){
                n=Float.parseFloat(s1) / Float.parseFloat(s2);
                poletekst.setText(String.valueOf(n));
            }
            if (c == 5){
                n=pow(Float.parseFloat(s1),Float.parseFloat(s2));
                poletekst.setText(String.valueOf(n));
            }
            if (c == 6){
                n=(Math.log10(Double.parseDouble(s1)/Math.log10(Double.parseDouble(s2))));
                poletekst.setText(String.valueOf(n));
            }
            if (c == 7){
                n=sin(Float.parseFloat(s2));
                poletekst.setText(String.valueOf(n));
            }
            if (c == 8){
                n=cos(Float.parseFloat(s2));
                poletekst.setText(String.valueOf(n));
            }
            if (c == 9){
                n=tan(Float.parseFloat(s2));
                poletekst.setText(String.valueOf(n));
            }
            if (c == 10){
                n=pow(Float.parseFloat(s2),2);
                poletekst.setText(String.valueOf(n));
            }
            if (c == 11){
                n=sqrt(Float.parseFloat(s2));
                poletekst.setText(String.valueOf(n));
            }
        }
        if(e.getSource()==Bclear){
            poletekst.setText("");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }

    double c,n;
    String s1,s2,s3,s4,s5;
    private Frame workspace;
    private Button B0,B1,B2,B3,B4,B5,B6,B7,B8,B9,Bsuma,Broznica,Biloczyn,Biloraz,Brow,Bclear,Bdot,Bwyk,Bsqt,Bsqrt,Blog,Bsin,Bcos,Btan,Bdif;
    private Panel menu,tekstspace;
    private TextField poletekst;
    private GridLayout grid;

    public Kalkulator(){
        menu = new Panel();
        tekstspace = new Panel();
        menu.setBackground(Color.LIGHT_GRAY);
        workspace = new Frame("Kalkulator");
        workspace.setLayout(new BorderLayout());
        poletekst = new TextField(10);
        workspace.add(poletekst, BorderLayout.NORTH);
        grid = new GridLayout(5,5);
        menu.setLayout(grid);
        workspace.add(menu, BorderLayout.CENTER);
        workspace.addMouseListener(this);
        workspace.addMouseMotionListener(this);
        workspace.setSize(400,500);
        workspace.setVisible(true);
        menu.setVisible(true);

        workspace.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        B0 = new Button("0");
        B0.addActionListener(this);
        B1 = new Button("1");
        B1.addActionListener(this);
        B2 = new Button("2");
        B2.addActionListener(this);
        B3 = new Button("3");
        B3.addActionListener(this);
        B4 = new Button("4");
        B4.addActionListener(this);
        B5 = new Button("5");
        B5.addActionListener(this);
        B6 = new Button("6");
        B6.addActionListener(this);
        B7 = new Button("7");
        B7.addActionListener(this);
        B8 = new Button("8");
        B8.addActionListener(this);
        B9 = new Button("9");
        B9.addActionListener(this);
        Bsuma = new Button("+");
        Bsuma.addActionListener(this);
        Bsuma.setBackground(Color.CYAN);
        Broznica = new Button("-");
        Broznica.addActionListener(this);
        Broznica.setBackground(Color.CYAN);
        Biloczyn = new Button("*");
        Biloczyn.addActionListener(this);
        Biloczyn.setBackground(Color.CYAN);
        Biloraz = new Button("/");
        Biloraz.addActionListener(this);
        Biloraz.setBackground(Color.CYAN);
        Brow = new Button("=");
        Brow.addActionListener(this);
        Brow.setBackground(Color.GRAY);
        Bclear = new Button("C");
        Bclear.addActionListener(this);
        Bclear.setBackground(Color.ORANGE);
        Bdot = new Button(".");
        Bdot.addActionListener(this);
        Bwyk = new Button("Y^X");
        Bwyk.addActionListener(this);
        Blog = new Button("logy(X)");
        Blog.addActionListener(this);
        Bsqt = new Button("X^2");
        Bsqt.addActionListener(this);
        Bsqrt = new Button("sqrt(X)");
        Bsqrt.addActionListener(this);
        Bsin = new Button("sin(X)");
        Bsin.addActionListener(this);
        Bcos = new Button("cos(X)");
        Bcos.addActionListener(this);
        Btan = new Button("tan(X)");
        Btan.addActionListener(this);
        Bdif = new Button("d/dx");
        Bdif.addActionListener(this);
        Bdif.setBackground(Color.RED);

        menu.add(Bclear);
        menu.add(B7);
        menu.add(B8);
        menu.add(B9);
        menu.add(Biloraz);
        menu.add(Bsin);
        menu.add(B4);
        menu.add(B5);
        menu.add(B6);
        menu.add(Biloczyn);
        menu.add(Bcos);
        menu.add(B1);
        menu.add(B2);
        menu.add(B3);
        menu.add(Broznica);
        menu.add(Btan);
        menu.add(Bdot);
        menu.add(B0);
        menu.add(Brow);
        menu.add(Bsuma);
        menu.add(Bsqt);
        menu.add(Bsqrt);
        menu.add(Bwyk);
        menu.add(Blog);
        menu.add(Bdif);
    }
}
