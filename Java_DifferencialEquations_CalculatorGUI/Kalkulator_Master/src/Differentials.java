import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import static java.lang.Math.*;

public class Differentials implements MouseMotionListener, ActionListener, MouseListener, ChangeListener {
    double c,n;
    int N = 100,i=0,j=0,o=0,p=0;
    int xk;
    public double[] x = new double[N+1];
    public double[] y = new double[N+1];
    public double[] f = new double[N+1];
    char[] g;
    double dt,yk,k1,k2,k3,k4;
    String s1,s2,s3,s4,s5,s6;
    private Frame difworkspace;
    private Panel difmenu,diftekstspace;
    private TextField difpoletekst,difpoletekst2,difpoletekst3;
    private GridLayout difgrid;
    private Button B0,B1,B2,B3,B4,B5,B6,B7,B8,B9,Brow,Bclear,Bclearall,Bx0,By0,Bxk,Binput;
    private static final DecimalFormat df = new DecimalFormat("0.0000");

    public Differentials() {
        difmenu = new Panel();
        diftekstspace = new Panel();
        difmenu.setBackground(Color.LIGHT_GRAY);
        difworkspace = new Frame("Równania Różniczkowe");
        difworkspace.setLayout(new BorderLayout());
        difpoletekst3 = new TextField(10);
        difpoletekst2 = new TextField(10);
        difpoletekst2.setText("Postać równania: dy/dx=f(x,y)");
        difpoletekst = new TextField(4);
        difworkspace.add(difpoletekst3, BorderLayout.SOUTH);
        difworkspace.add(difpoletekst2, BorderLayout.NORTH);
        difworkspace.add(difpoletekst, BorderLayout.EAST);
        difgrid = new GridLayout(2, 14);
        difmenu.setLayout(difgrid);
        difworkspace.add(difmenu, BorderLayout.CENTER);
        difworkspace.addMouseListener(this);
        difworkspace.addMouseMotionListener(this);
        difworkspace.setSize(1200, 240);
        difworkspace.setVisible(true);
        difmenu.setVisible(true);

        difworkspace.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
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
        Brow = new Button("Calc");
        Brow.addActionListener(this);
        Brow.setBackground(Color.GRAY);
        Bclear = new Button("C");
        Bclear.addActionListener(this);
        Bclear.setBackground(Color.ORANGE);
        Bclearall = new Button("CA");
        Bclearall.addActionListener(this);
        Bclearall.setBackground(Color.ORANGE);
        Bx0 = new Button("Set x0");
        Bx0.addActionListener(this);
        By0 = new Button("Set y0");
        By0.addActionListener(this);
        Bxk = new Button("Set xk");
        Bxk.addActionListener(this);
        Binput = new Button("Input To Function");
        Binput.addActionListener(this);

        difmenu.add(B1);
        difmenu.add(B2);
        difmenu.add(B3);
        difmenu.add(B4);
        difmenu.add(B5);
        difmenu.add(B6);
        difmenu.add(B7);
        difmenu.add(B8);
        difmenu.add(B9);
        difmenu.add(B0);
        difmenu.add(Bclear);
        difmenu.add(Bclearall);
        difmenu.add(Brow);
        difmenu.add(Bx0);
        difmenu.add(Bxk);
        difmenu.add(By0);
        difmenu.add(Binput);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==B0){
                s2 = "0";
                difpoletekst.setText(s2);
            }
            if(e.getSource()==B1){
                s2 = "1";
                difpoletekst.setText(s2);
            }
            if(e.getSource()==B2){
                s2 = "2";
                difpoletekst.setText(s2);
            }
            if(e.getSource()==B3){
                s2 = "3";
                difpoletekst.setText(s2);
            }
            if(e.getSource()==B4){
                s2 = "4";
                difpoletekst.setText(s2);
            }
            if(e.getSource()==B5){
                s2 = "5";
                difpoletekst.setText(s2);
            }
            if(e.getSource()==B6){
                s2 = "6";
                difpoletekst.setText(s2);
            }
            if(e.getSource()==B7){
                s2 = "7";
                difpoletekst.setText(s2);
            }
            if(e.getSource()==B8){
                s2 = "8";
                difpoletekst.setText(s2);
            }
            if(e.getSource()==B9){
                s2 = "9";
                difpoletekst.setText(s2);
            }
            if (e.getSource() == Bx0) {
                s1 = difpoletekst.getText();
                x[0] = Float.parseFloat(s1);
            }
            if (e.getSource() == Bxk) {
                s1 = difpoletekst.getText();
                xk = Integer.parseInt(s1);
            }
            if (e.getSource() == By0) {
                s1 = difpoletekst.getText();
                y[0] = Float.parseFloat(s1);
            }
        if(e.getSource()==Bclear){
            difpoletekst.setText("");
        }
        if(e.getSource()==Bclearall){
            difpoletekst.setText("");
            difpoletekst3.setText("");
        }
        if(e.getSource()==Binput){
            s3 = difpoletekst.getText();
            difpoletekst.setText("");
            switch(s3){
                case "y":
                    s6 = difpoletekst3.getText();
                    s4=" ";
                    difpoletekst3.setText(s6+s4+s3);
                    dt=(xk-x[0])/N;
                    for (int i = 0; i < N; i++) {
                        f[i] = f[j]+f[o]+f[p]+y[i];
                        y[i+1]=y[i]+f[i]*dt;
                    }
                    break;
                case "x":
                    s6 = difpoletekst3.getText();
                    s4=" ";
                    difpoletekst3.setText(s6+s4+s3);
                    dt=(xk-x[0])/N;
                    for (int j = 0; j < N; j++) {
                        f[j] = f[i]+f[o]+f[p]+x[j];
                        y[j+1]=y[j]+f[j]*dt;
                    }
                    break;
                case "siny":
                    s6 = difpoletekst3.getText();
                    s4=" ";
                    difpoletekst3.setText(s6+s4+s3);
                    dt=(xk-x[0])/N;
                    for (int o = 0; o < N; o++) {
                        f[o] = f[i]+f[j]+f[p]+sin(y[o]);
                        y[o+1]=y[o]+f[o]*dt;
                    }
                    break;
                case "cosx":
                    s6 = difpoletekst3.getText();
                    s4=" ";
                    difpoletekst3.setText(s6+s4+s3);
                    dt=(xk-x[0])/N;
                    for (int p = 0; p < N; p++) {
                        f[p] = f[i]+f[j]+f[0]+cos(x[p]);
                        y[p+1]=y[p]+f[p]*dt;
                    }
                    break;

            }
        }
        if(e.getSource()==Brow){
            s5 = difpoletekst3.getText();
            //System.out.println(s5);
            g=s5.toCharArray();
            System.out.println(g);

            i=0;
            dt=(xk-x[0])/N;
            difpoletekst2.setText(String.valueOf(dt));
            for (int i = 0; i < N; i++)
            {
                y[i+1]=y[i]+f[i]*dt;
                //System.out.println(f[i]);
                yk=y[i+1];
            }
            difpoletekst3.setText(String.valueOf(df.format(yk)));
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
}

