import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Two extends JFrame {
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15; 
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	int i,k,c;
	String a,b;
	eHandler handler = new eHandler();
	
	
	public Two(String s){
		super(s);
		setLayout(new FlowLayout());
		 b1=new JButton("Очистить");
		 b2=new JButton("Посчитать");
		 b3=new JButton("+");
		 b4=new JButton("-");
		 b5=new JButton("/");
		 b6=new JButton("*");
		 b7=new JButton("1");
		 b8=new JButton("2");
		 b9=new JButton("3");
		 b10=new JButton("4");
		 b11=new JButton("5");
		 b12=new JButton("6");
		 b13=new JButton("7");
		 b14=new JButton("8");
		 b15=new JButton("9");
		 l1=new JLabel("Введите первое число");
		 l2=new JLabel("Введите второе число");
		 l3=new JLabel("");
		 l4=new JLabel("");
		 t1=new JTextField(10);
		 t2=new JTextField(10);
		 add(b1);
		 add(b2);
		 add(b3);
		 add(b4);
		 add(b5);
		 add(b6);
		 add(b7);
		 add(b8);
		 add(b9);
		 add(b10);
		 add(b11);
		 add(b12);
		 add(b13);
		 add(b14);
		 add(b15);
		 
		 b2.addActionListener(handler);
		 b1.addActionListener(handler);
		 b3.addActionListener(handler);
		 b4.addActionListener(handler);
		 b5.addActionListener(handler);
		 b6.addActionListener(handler);
		 b7.addActionListener(handler);
		 b8.addActionListener(handler);
		 b9.addActionListener(handler);
		 b10.addActionListener(handler);
		 b11.addActionListener(handler);
		 b12.addActionListener(handler);
		 b13.addActionListener(handler);
		 b14.addActionListener(handler);
		 b15.addActionListener(handler);
	}
	
	public class eHandler implements ActionListener{
      public void actionPerformed(ActionEvent e) {
    	  try{
        if(e.getSource()==b2){
        	 i=Integer.parseInt(t1.getText());
        	 k=Integer.parseInt(t2.getText());
        	 i++;
        	 k++;
        	 a="Ваше первое число теперь равно="+i;
        	 b="Ваше второе число теперь равно="+k;
        	 l3.setText(a);
        	 l4.setText(b);
        }
        if(e.getSource()==b4){
       	 i=Integer.parseInt(t1.getText());
       	 k=Integer.parseInt(t2.getText());
       	 c=i-k;
       	 a="Ответ="+c;
       	 l3.setText(a);
       	 l4.setText(b);
       }
        
        if(e.getSource()==b3){
          	 i=Integer.parseInt(t1.getText());
          	 k=Integer.parseInt(t2.getText());
          	 c=i+k;
          	 a="Ответ="+c;
          	 l3.setText(a);
          	 l4.setText(b);
          }
        if(e.getSource()==b5){
          	 i=Integer.parseInt(t1.getText());
          	 k=Integer.parseInt(t2.getText());
          	 c=i/k;
          	 a="Ответ="+c;
          	 l3.setText(a);
          	 l4.setText(b);
          }
        if(e.getSource()==b6){
          	 i=Integer.parseInt(t1.getText());
          	 k=Integer.parseInt(t2.getText());
          	 c=i*k;
          	 a="Ответ="+c;
          	 l3.setText(a);
          	 l4.setText(b);
          }
        
			if(e.getSource()==b1){
				t1.setText(null); 
				t2.setText(null); 
				l3.setText("");
				l4.setText("");
			}
    	  }catch (Exception ex){JOptionPane.showMessageDialog(null,"Принимаются только цифры");}
		}
		
	}
}
