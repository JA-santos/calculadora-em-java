
package Calculadora;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_v1 extends JFrame {
    
    private JButton b0;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton bdot;
    private JButton bigual;
    private JButton badic;
    private JButton bmult;
    private JButton bsubt;
    private JButton bdiv;
    
    private double x;
    private JTextField display;
    private JFrame frmCalculadoraSimples;
    
    public Calculadora_v1(){
        
        b0=new JButton("0");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        badic=new JButton("+");
        bsubt=new JButton("-");
        bmult=new JButton("*");
        bdiv=new JButton("/");
        bdot=new JButton(".");
        bigual=new JButton("=");
        
        display=new JTextField();
        
        Container c=getContentPane();
        c.setLayout(new GridLayout(2,1));
        
        Container c2=new JPanel();
        c2.setLayout(new GridLayout(4,4));
        
        c2.add(b7);
        c2.add(b8);
        c2.add(b9);
        c2.add(bdiv);
        c2.add(b4);
        c2.add(b5);
        c2.add(b6);
        c2.add(bmult);
        c2.add(b1);
        c2.add(b2);
        c2.add(b3);
        c2.add(bsubt);
        c2.add(b0);
        c2.add(bdot);
        c2.add(bigual);
        c2.add(badic);
        
        setSize(400,400);  
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frmCalculadoraSimples.setBounds(100, 100, 213, 300);
        c.add(display);
        c.add(c2);
        
        ButtonHandler handler=new ButtonHandler();
        b0.addActionListener(handler);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);
        bdot.addActionListener(handler);
        bdiv.addActionListener(handler);
        bmult.addActionListener(handler);
        bsubt.addActionListener(handler);
        badic.addActionListener(handler);
        bigual.addActionListener(handler);
    }  
    
    
    public static void main(String[]args){
        new Calculadora_v1();
        		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_v1 window = new Calculadora_v1();
					window.frmCalculadoraSimples.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
    
    public class ButtonHandler implements ActionListener{
        
        double v1, v2;
        
        @Override
        public void actionPerformed(ActionEvent event){
            display.setText(event.getActionCommand());
         
            
           
            
            
        }
        
    }
     
   
    
    
}
