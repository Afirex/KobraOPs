import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;  
class Login extends JFrame implements ActionListener
 {
  JButton SUBMIT;
  JPanel panel;
  JLabel label1,label2;
  final JTextField  text1,text2;
   Login()
   {
   label1 = new JLabel();
   label1.setText("Username:");
   text1 = new JTextField(15);
 
   label2 = new JLabel();
   label2.setText("Password:");
   text2 = new JPasswordField(15);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
   SUBMIT=new JButton("SUBMIT");
   
   panel=new JPanel(new GridLayout(3,1));
   panel.add(label1);
   panel.add(text1);
   panel.add(label2);
   panel.add(text2);
   panel.add(SUBMIT);
   add(panel,BorderLayout.CENTER);
   SUBMIT.addActionListener(this);
   setTitle("LOGIN FORM");
   }
  public void actionPerformed(ActionEvent ae)
   {
   String value1=text1.getText();
   String value2=text2.getText();
setDefaultCloseOperation(EXIT_ON_CLOSE);

int j;
j=value1.length(); 
int i=0;
 char letter[]=new char[j];

 try 
 	{

    
  FileWriter fileWriter = new FileWriter("sp.jpg",true);

     
PrintWriter p=new PrintWriter(fileWriter);


            while(i!=j) 
	{
                
               p.println();
 	i=i+1;	
                 
	}
sc.close(); 			
p.close();
            
}
		}

 		catch (IOException we)
 		{ we.printStackTrace();

		 } 

j=value2.length(); i=0;e=0;
 char letter2[]=new char[j+1]; 

try 	{
 FileWriter fw = new FileWriter("sp.jpg",true);
     BufferedWriter bufferedWriter =
                new BufferedWriter(fw);
           bufferedWriter.write("\r\n");
		for( i=0;i<j;i++) 
		{ letter2[i]=value2.charAt(i);
		 	for( e=0;e<=i;e++) 
			{letter2[i]++;} 
		 fw.write(letter2[i]); }
fw.close();
bufferedWriter.close();	
	 }

		 catch (IOException we) 
		{ we.printStackTrace(); }

setDefaultCloseOperation(EXIT_ON_CLOSE);

 }
 }
  class Login1
 {
   public static void main(String arg[])
   {
   try
   {
   Login frame=new Login();
   frame.setSize(300,100);
   frame.setVisible(true);
   }
   catch(Exception e)
   {JOptionPane.showMessageDialog(null, e.getMessage());}
   }
 }