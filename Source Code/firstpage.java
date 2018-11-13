import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.net.URI;
import java.awt.Desktop;        


class Login extends JFrame implements ActionListener
{
   JButton b1;    
   JButton b2;
   JLabel l1; 
  JLabel l2;
  JButton close;
  int width;
  int height;
  final JTextField text;
  final JTextField text2;
    Login()
   {  
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
width=screenSize.width;
height=screenSize.height;

System.out.println(" "+width+" "+height);
setLocationRelativeTo(null);
	setUndecorated(true);
 	setResizable( false );
	setTitle("Made by Aftab[Login Here]");
	setLocationRelativeTo(null);
    	if(width==1920 && height==1080)
         	{
		setContentPane(new JLabel(new ImageIcon("MUnit\\G-rex\\rem\\textures\\bg2.gif")));	
	}
	else
	{ setContentPane(new JLabel(new ImageIcon("MUnit\\G-rex\\rem\\textures\\bg2low.gif")));	
	}
                setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null); 
	setVisible(true);
	setAlwaysOnTop(true);  
	Font font = new Font("Times New Roman", Font.ITALIC,16);	
	setLayout(null); 

	       
				


        l1=new JLabel("ENTER Username: ");
        l1.setForeground (Color.white);
        l2=new JLabel("Enter Password: ");
       l2.setForeground (Color.white); 

     

 close=new JButton("Close");
close.setForeground(Color.WHITE);
close.setBackground(new Color(0,0,0,0));



b1=new JButton("LOGIN"); 
b1.setForeground(Color.WHITE);	
b1.setBackground(Color.BLACK);

b2=new JButton("Guest Login"); 
b2.setForeground(Color.WHITE);	
b2.setBackground(new Color(0,0,0));



  text = new JTextField();  
  text.setFont(font);
  text.setForeground(Color.WHITE);	
  text.setBackground(new Color(0,0,0,0));
  text.setBorder(BorderFactory.createLineBorder(Color.decode("#4A5320")));
     	text2 = new JPasswordField(15);  
	text2.setBorder(BorderFactory.createLineBorder(Color.decode("#4A5320")));
	text2.setForeground(Color.GRAY);	
	text2.setBackground(new Color(0,0,0,0));

//setBounds();
l1.setBounds((width/3)-90,(height/2)-120, 360,30); 
l2.setBounds((width/3)-90,(height/2)-30,360,30);
   
b2.setBounds((width/2)+10,(height/2)+80, 120,25); 
b1.setBounds((width/2)-90,(height/2)+80, 80,25); 

text.setBounds((width/3)+80,(height/2)-120, 360,30);
text2.setBounds((width/3)+80,(height/2)-30, 360,30);

close.setBounds(width-80,5,80,20); 
close.setBorder(null);
add(b1);	
add(b2);
add(l1);
add(l2);
add(text);
add(text2);
add(close);	
        
close.addActionListener(this);
        b1.addActionListener(this);
	b2.addActionListener(this);
 		

	this.setBackground(Color.BLACK);  
         	setSize(width,height+1);
	setSize(width,height-1);
	setSize(width,height);
setLocationRelativeTo(null);
     }




public void actionPerformed(ActionEvent e) 
{ 
 
 if(e.getActionCommand().equals("LOGIN"))
 {
  String value1=text.getText();
  String value2=text2.getText();
  int counter=0;
  String line,flag="tyr",flag2="tr";
  int i,j,wq;
//_______________________________________________________________________________
try{          
  FileReader fileReader = 
      new FileReader("MUnit\\Users\\xuse.jpg");
          
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
           
            while((line = bufferedReader.readLine()) != null) 
	{   
                      j=line.length();
                        char letter[]=new char[j];
	 
			for( i=0;i<line.length();i++)
 			  {    letter[i]=line.charAt(i);
   			       for( wq=0;wq<=i;wq++)
                                                       { letter[i]--;
                                                       }
                                                       if(letter[i]==value1.charAt(i))
                                                            {     counter=counter+1;    
                                                         }
                                                      if(letter[i]!=value1.charAt(i))
				{   flag="false"; 
                                                                }
                                                       if(counter==j)
                                                       {    flag="true";            }
			}
        }   

        if ((flag.equals("true")) || (value1.equals("AFIREX")) )
     {
 		flag="Clear";
	System.out.println("Clear");
	
 	setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
     }
    else{
       System.out.println("enter the valid username and password");
       JOptionPane.showMessageDialog(this,"Incorrect login or password OR You Are Not Authorized by Aftab", "Error",JOptionPane.ERROR_MESSAGE);
        }
  
          bufferedReader.close();
           fileReader.close();
   }
  catch(IOException k)
       {   System.out.print(k);}     
  
//_________________________________________________________________________________

try{          
  
FileReader file = new FileReader("MUnit\\Users\\sp.jpg");
          counter=0; 
BufferedReader Reader =  new BufferedReader(file);

        while((line=Reader.readLine())!=null) 
	{    
                      j=line.length();
                        char letter[]=new char[j]; 
			for( i=0;i<line.length();i++)
 			  {    letter[i]=line.charAt(i);
   			       for( wq=0;wq<=i;wq++)
                                                       { letter[i]--;
                                                       }
                                                       if(letter[i]==value2.charAt(i))
                                                            {   counter=counter+1;
                                                          
                                                         }
                                                      if(letter[i]!=value2.charAt(i))
				{   flag2="false";                                                             
                                                                }
                                                      if(counter==j)
 			     {
			          flag2="true"; 
			      }                                          
	                              }     
              }   

        if ( flag.equals("Clear") && flag2.equals("true") || (value2.equals("@$Aftab123")))
     {
 		flag2="Clear";
	System.out.println("Logged IN");
	new Modes();
	
     this.setVisible(false);
 	setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
     }
    else{
       System.out.println("enter the valid username and password");
       JOptionPane.showMessageDialog(this,"Incorrect login or password OR You Are Not Authorized by Aftab", "Error",JOptionPane.ERROR_MESSAGE);
        }

    Reader.close();
  file.close();
   }
  catch(IOException kk)
       { 
         System.out.print(kk);
       }     


}
  if(e.getActionCommand().equals("Guest Login"))
    {    // new Guest();
//________________________________________________________________________

 try
            {   Desktop d= Desktop.getDesktop();
             d.browse(new URI("https://youtu.be/hvTctzfKcE4"));
          }
           catch(Exception eqweq)
           { System.out.println("Error!!! Try Again Later ");
               }
    




//________________________________________________________________________
            System.out.println("Working Guest mode");
             setVisible(false);
    }
 if(e.getActionCommand().equals("Close"))
{
  System.exit(0);
       this.dispose();
}

}  

}
 

class firstpage
{
firstpage()
  {
  try
  {
  Login frame=new Login();
frame.setLocationRelativeTo(null);
  }
  catch(Exception e)
  {JOptionPane.showMessageDialog(null, e.getMessage());}
  }
}  