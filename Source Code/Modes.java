import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class M extends JFrame implements MouseListener , ActionListener
{  
   
   JButton b1;
   JButton b2;
   JButton b3;
  JButton b4;
  JButton close;

    int height;
   int width;

    M()
  {  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
     width=screenSize.width; 
     height=screenSize.height;
    
	setUndecorated(true);
	setContentPane(new JLabel(new ImageIcon("MUnit\\G-rex\\rem\\textures\\bgloop.gif")));
	setLayout(null); 
        setSize(width,height);  
        setVisible(true); 
   	setBackground(Color.BLACK); 
		
		
	

 		 b1=new JButton("Armory Record");
 		 b1.addMouseListener(this);
		b1.addActionListener(this);

 		 b2=new JButton("SafeGuard");
 		 b2.addMouseListener(this);
		b2.addActionListener(this);

 		 b3=new JButton("Artillary Weapons");
 		 b3.addMouseListener(this);
		b3.addActionListener(this);		

 		 b4=new JButton("Miscellaneous");
 		 b4.addMouseListener(this);
		b4.addActionListener(this);
		button();
 
   		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
   }  

 public void actionPerformed(ActionEvent ae)
  {          
	 if(ae.getActionCommand().equals("Close"))
	{ 		System.exit(0);
		
	}
 if(ae.getActionCommand().equals("Armory Record"))
	{
		try{
		 new Rename(1);
		new Rename(0);
                  
                                 }
		catch(Exception e){}


	}
 if(ae.getActionCommand().equals("SafeGuard"))
	{		new pass();
		
		this.dispose();
		
			
	}
 if(ae.getActionCommand().equals("Artillary Weapons"))
	{
		new fetch("MUnit\\Files\\ecript.xlsx");
		       
	}
 if(ae.getActionCommand().equals("Miscellaneous"))
	{
		  new view();
	
	}

		setLayout(null); 	        	 
		button();
 			setSize(width-1,height);
			setSize(width,height);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

 }

		public void button()
		{	

close=new JButton("Close");
close.setForeground(Color.WHITE);
close.setBackground(new Color(0,0,0,0));
close.setBounds(width-80,5,80,20); 
close.setBorder(null);    
add(close);
close.addActionListener(this);

			b1.setBounds((width/3)-290,(height/3)-60,120,50);
			setLayout(null); 
			b1.setBackground(new Color(84,142,52,50)); 
			b1.setForeground(Color.WHITE);
			this.add(b1);
			b1.setBorder(null);

			b2.setBounds((width/3)-290,(height/3)+30,120,50);
			setLayout(null); 
			b2.setBackground(new Color(84,142,52,50)); 
			b2.setForeground(Color.WHITE);
			this.add(b2);
			b2.setBorder(null);

			b3.setBounds((width/3)-290,(height/3)+120,120,50);
			setLayout(null);  
			b3.setBackground(new Color(84,142,52,50));
			b3.setForeground(Color.WHITE);
			this.add(b3);
			b3.setBorder(null);

			b4.setBounds((width/3)-290,(height/3)+200,120,50);
			setLayout(null);  
			b4.setBackground(new Color(84,142,52,50));
			b4.setForeground(Color.WHITE);
			b4.setBorder(null);
			this.add(b4);



	
	}



public void button2()
		{	
   
close=new JButton("Close");
close.setForeground(Color.WHITE);
close.setBackground(new Color(0,0,0,0));
close.setBounds(width-80,5,80,20); 
close.setBorder(null);    
add(close);


			b1.setBounds((width/3)-290,(height/3)-60,120,50);
			setLayout(null); 
			b1.setBackground(new Color(184,105,52)); 
			b1.setForeground(Color.WHITE);
			this.add(b1);
			b1.setBorder(null);
				

			b2.setBounds((width/3)-290,(height/3)+30,120,50);
			setLayout(null); 
			b2.setBackground(new Color(184,105,52)); 
			b2.setForeground(Color.WHITE);
			this.add(b2);
			b2.setBorder(null);	

			b3.setBounds((width/3)-290,(height/3)+120,120,50);
			setLayout(null);  
			b3.setBackground(new Color(184,105,52));
			b3.setForeground(Color.WHITE);
			this.add(b3);
			b3.setBorder(null);	

			b4.setBounds((width/3)-290,(height/3)+200,120,50);
			setLayout(null);  
			b4.setBackground(new Color(184,105,52));
			b4.setForeground(Color.WHITE);
			b4.setBorder(null);	
			this.add(b4);

     try{for(int i=0;i<200;i+=4)
		  {setBackground(new Color(100+(i/2),100,10,i));//200,50,0
b4.setBackground(new Color(184,105-(i/2),52-(i/5)));
b3.setBackground(new Color(184,105-(i/2),52-(i/5)));
b2.setBackground(new Color(184,105+(i/5),52-(i/5))); 
b1.setBackground(new Color(184,105-(i/2),52-(i/5))); 
		   Thread.sleep(1);

                               } }catch(Exception e){}


	}



public void button3()
		{	
   
close=new JButton("Close");
close.setForeground(Color.WHITE);
close.setBackground(new Color(0,0,0,0));
close.setBounds(width-80,5,80,20); 
close.setBorder(null);    
add(close);


			b1.setBounds((width/3)-290,(height/3)-60,120,50);
			setLayout(null); 
			b1.setBackground(new Color(184,105,52)); 
			b1.setForeground(Color.WHITE);
			this.add(b1);
			b1.setBorder(null);
				

			b2.setBounds((width/3)-290,(height/3)+30,120,50);
			setLayout(null); 
			b2.setBackground(new Color(184,105,52)); 
			b2.setForeground(Color.WHITE);
			this.add(b2);
			b2.setBorder(null);	

			b3.setBounds((width/3)-290,(height/3)+120,120,50);
			setLayout(null);  
			b3.setBackground(new Color(184,105,52));
			b3.setForeground(Color.WHITE);
			this.add(b3);
			b3.setBorder(null);	

			b4.setBounds((width/3)-290,(height/3)+200,120,50);
			setLayout(null);  
			b4.setBackground(new Color(184,105,52));
			b4.setForeground(Color.WHITE);
			b4.setBorder(null);	
			this.add(b4);

     try{for(int i=0;i<200;i+=4)
		  {setBackground(new Color(100+(i/5),100+(i/3),10+(i+8),i));//200,50,0
b4.setBackground(new Color(184-(i/2),105,52-(i/5)));
b3.setBackground(new Color(184+(i/6),105,52-(i/5)));
b2.setBackground(new Color(184-(i/2),105,52-(i/5))); 
b1.setBackground(new Color(184-(i/2),105,52-(i/5))); 
		   Thread.sleep(1);

                               } }catch(Exception e){}


	}

    public void mouseClicked(MouseEvent e) 
	{  
		setSize(width-1,height);
		setSize(width,height);
           
}

    public void mouseEntered(MouseEvent event)
 { Object x=event.getSource();
	JButton b=null;
	String g="xc";

	if(x instanceof JButton)
	{ b=(JButton)x;
	}	
	if(b!=null)
	{ g= b.getActionCommand();
	}
		if(g.equals("Artillary Weapons"))
		{setContentPane(new JLabel(new ImageIcon("MUnit\\G-rex\\rem\\textures\\battle_net.png"))); setBackground(new Color(100,150,100,50));
			setLayout(null);  
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			button3();

	}

	 if(g.equals("SafeGuard"))
	{

	setContentPane(new JLabel(new ImageIcon("MUnit\\G-rex\\rem\\textures\\rhino.png")));
	setBackground(new Color(0,0,0,0));
		setLayout(null);  
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	new Rename(1);
                  button2();
                                  
              }
 if(g.equals("Armory Record"))
	{      setContentPane(new JLabel(new ImageIcon("MUnit\\G-rex\\rem\\textures\\Loading-Full.gif")));
		setLayout(null);  
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		new Rename(1);
		button();

	}
 if(g.equals("Miscellaneous"))
	{
new Rename(1);

	}
setSize(width,height);
setSize(width+1,height+1);
setSize(width,height);
setSize(width+1,height+1); 		
setSize(width,height); 
}  
    public void mouseExited(MouseEvent e) 
   { 
	setBackground(Color.BLACK);
	setContentPane(new JLabel(new ImageIcon("MUnit\\G-rex\\rem\\textures\\bgloop.gif")));
	setLayout(new FlowLayout()); 
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	button();
	
setSize(width,height);
setSize(width+1,height+1); 
setSize(width,height);
setSize(width+1,height+1); 
setSize(width,height);
}  
    public void mousePressed(MouseEvent e) 
     {  
     }  
    public void mouseReleased(MouseEvent e) 
    {  
    }  
 
}  


class Modes
{
Modes()
  { 
      M Frame= new M();
  }
}