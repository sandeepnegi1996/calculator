import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class calci implements ActionListener {
	JFrame f;
	TextField area;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bclear,badd,bmul,bdiv,bsub,bequal,bdec;
	
	static double a,b,result;
	static int operator=0;
	
	public calci() {
		
		f=new JFrame("Calculator App");

		//creating the text area
		area=new TextField();
		
		//creating all the button
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		bdec=new JButton(".");
		bclear=new JButton("clear");
		badd=new JButton("+");
		bmul=new JButton("*");
		bdiv=new JButton("/");
		bsub=new JButton("-");
		bequal=new JButton("=");
		
		//setting bounds for all the components
		f.setSize(600,600);
		area.setBounds(100, 100, 250, 50);
		
		b7.setBounds(50, 150, 50, 50);
		b8.setBounds(150, 150, 50, 50);
		b9.setBounds(250, 150, 50, 50);
		bdiv.setBounds(350, 150, 50, 50);
		
		
		
		b4.setBounds(50, 250, 50, 50);
		b5.setBounds(150, 250, 50, 50);
		b6.setBounds(250, 250, 50, 50);
		bmul.setBounds(350, 250, 50, 50);
		
		
		b1.setBounds(50, 350, 50, 50);
		b2.setBounds(150, 350, 50, 50);
		b3.setBounds(250, 350, 50, 50);
		bsub.setBounds(350, 350, 50, 50);
		
		
		bdec.setBounds(50, 450, 50, 50);
		b0.setBounds(150, 450, 50, 50);
		bequal.setBounds(250, 450, 50, 50);
		badd.setBounds(350, 450, 50, 50);
		
		
		
		
		
		
		//adding the components to the frame
		f.add(area);
		f.add(b1);f.add(b2);
		f.add(b3);f.add(b4);
		f.add(b5);f.add(b6);
		f.add(b7);f.add(b8);
		f.add(b9);f.add(b0);
		f.add(badd);f.add(bclear);
		f.add(bmul);f.add(bdiv);
		f.add(bsub);f.add(bequal);
		f.add(bdec);
		
		//calling actionListener on each button
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
		badd.addActionListener(this);
		bclear.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bsub.addActionListener(this);
		bequal.addActionListener(this);
		bdec.addActionListener(this);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
			area.setText(area.getText().concat("1"));
		}
		
		if(e.getSource()==b2)
		{
			area.setText(area.getText().concat("2"));
		}
		
		if(e.getSource()==b3)
		{
			area.setText(area.getText().concat("3"));
		}
		
		if(e.getSource()==b4)
		{
			area.setText(area.getText().concat("4"));
		}
		
		if(e.getSource()==b5)
		{
			area.setText(area.getText().concat("5"));
		}
		
		if(e.getSource()==b6)
		{
			area.setText(area.getText().concat("6"));
		}
		
		if(e.getSource()==b7)
		{
			area.setText(area.getText().concat("7"));
		}
		
		if(e.getSource()==b8)
		{
			area.setText(area.getText().concat("8"));
		}
		
		if(e.getSource()==b9)
		{
			area.setText(area.getText().concat("9"));
		}
		
		if(e.getSource()==b0)
		{
			area.setText(area.getText().concat("0"));
		}
		
		if(e.getSource()==bdec)
		{
			area.setText(area.getText().concat("."));
		}
		if(e.getSource()==badd)
		{
			a=Double.parseDouble(area.getText());
			area.setText("");
			operator=1;  //one is set for adding 
						//later we will use the switch cases to do the following work
		}
		
		if(e.getSource()==bsub)
		{
			a=Double.parseDouble(area.getText());
			area.setText("");
			operator=2;  //one is set for adding 
						//later we will use the switch cases to do the following work
		}
		if(e.getSource()==bmul)
		{
			a=Double.parseDouble(area.getText());
			area.setText("");
			operator=3;  //one is set for adding 
						//later we will use the switch cases to do the following work
		}
		if(e.getSource()==bdiv)
		{
			a=Double.parseDouble(area.getText());
			area.setText("");
			operator=4;  //one is set for adding 
						//later we will use the switch cases to do the following work
		}
		
		if(e.getSource()==bequal)
		{
			b=Double.parseDouble(area.getText());
			switch(operator)
			{
			case 1:result=a+b;
				break;
			case 2:result=a-b;
				break;
			case 3:result=a*b;
				break;
			case 4:result=a/b;
				break;
				
				
			}
			area.setText(" "+result);
		}
		
	}
	public static void main(String[] args) {
		
		new calci();
	}

	

}
