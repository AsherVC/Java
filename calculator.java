import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator implements ActionListener{
double a=0,b=0,result=0;
int operator=0;
JFrame f;
JTextField t;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bd,bm,bq,bdot,bequal,bdel;
	calculator(){
		f=new JFrame("Calculator");
			b0=new JButton("0");
			b0.addActionListener(this);
			 
            b1=new  JButton("1");
            b1.addActionListener(this);
              
            b2=new  JButton("2");
            b2.addActionListener(this);
            
            b3=new  JButton("3");
            b3.addActionListener(this);
            
            b4=new  JButton("4");
            b4.addActionListener(this);
            
            b5=new  JButton("5");
            b5.addActionListener(this);
            
            b6=new  JButton("6");
            b6.addActionListener(this);
            
            b7=new  JButton("7");
            b7.addActionListener(this);
                        
            b8=new  JButton("8");
            b8.addActionListener(this);
            
            b9=new  JButton("9");
            b9.addActionListener(this);
            
            bp=new  JButton("+");
            bp.addActionListener(this);
            
            bd=new  JButton("-");
            bd.addActionListener(this);
            
            bm=new  JButton("*");
            bm.addActionListener(this);
            
            bq=new  JButton("/");
            bq.addActionListener(this);
            
            bdot=new  JButton(".");
            bdot.addActionListener(this);

            bequal=new  JButton("=");
		bequal.addActionListener(this);   
		
			bdel=new JButton("<-");
			bdel.addActionListener(this);
			         
            t=new JTextField();
            b0.setBounds(200,350,100,50);
		b1.setBounds(100,200,100,50);
            b2.setBounds(200,200,100,50);
            b3.setBounds(300,200,100,50);
            b4.setBounds(100,250,100,50);
            b5.setBounds(200,250,100,50);
            b6.setBounds(300,250,100,50);
            b7.setBounds(100,300,100,50);
            b8.setBounds(200,300,100,50);
            b9.setBounds(300,300,100,50);
            bp.setBounds(400,200,100,50);
            bd.setBounds(400,250,100,50);
            bm.setBounds(400,300,100,50);
            bq.setBounds(400,350,100,50);
            bdot.setBounds(100,350,100,50);
            bequal.setBounds(300,350,100,50);
            bdel.setBounds(400,160,100,40);
            t.setBounds(100,160,300,40);
            		f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b0);
            		f.add(bp);f.add(bd);f.add(bm);f.add(bq);f.add(bdot);f.add(bequal);f.add(bdel);
            f.add(t);
           // f.setBackground(Color."Blue");
            f.setSize(600,600);
            f.setLayout(null);
            f.setVisible(true);

       	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
       	 public void actionPerformed(ActionEvent e){
             	if(e.getSource()==b1){
             		t.setText(t.getText().concat("1"));
                  }
                  if(e.getSource()==b2){
                 		t.setText(t.getText().concat("2"));
                  }
                       if(e.getSource()==b3){
                 		t.setText(t.getText().concat("3"));
                  }
                  if(e.getSource()==b4){
             		t.setText(t.getText().concat("4"));
                  }
                  if(e.getSource()==b5){
                 		t.setText(t.getText().concat("5"));
                  }
                       if(e.getSource()==b6){
                 		t.setText(t.getText().concat("6"));
                  }
                  if(e.getSource()==b7){
             		t.setText(t.getText().concat("7"));
                  }
                  if(e.getSource()==b8){
                 		t.setText(t.getText().concat("8"));
                  }
                       if(e.getSource()==b9){
                 		t.setText(t.getText().concat("9"));
                  }
                  if(e.getSource()==b0){
             		t.setText(t.getText().concat("0"));
                  }
                  if(e.getSource()==bdot){
                 		t.setText(t.getText().concat("."));
                }
                if(e.getSource()==bp){
                a=Double.parseDouble(t.getText());
                operator=1;
                t.setText("");
               }
                 if(e.getSource()==bd){
                a=Double.parseDouble(t.getText());
                operator=2;
                t.setText("");}
                if(e.getSource()==bm){
                a=Double.parseDouble(t.getText());
                operator=3;
                t.setText("");}
                 if(e.getSource()==bq){
                a=Double.parseDouble(t.getText());
                operator=4;
                t.setText("");}
                if(e.getSource()==bequal){
     		   b=Double.parseDouble(t.getText());
             switch(operator){
                case 1:result=a+b;
                break;
                case 2:result=a-b;
                break;
                case 3:result=a*b;
                break;
                case 4:result=a/b;
                break;
                default:result=0;
                }
                t.setText(""+result);
         }
         if(e.getSource()==bdel){
         	String s=t.getText();
         	t.setText("");
         	for(int i=0;i<s.length()-1;i++){
         	t.setText(t.getText()+s.charAt(i));}
         }
}
public static void main(String [] args){
					new calculator();
         }
 }

