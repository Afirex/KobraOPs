import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class fetch 
{

  fetch(String input)
     {
 try{       //text file, should be opening in default text editor
        File file = new File(input);
        
        //first check if Desktop is supported by Platform or not
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
     }
catch(IOException aer)
{}   
    
    }

}