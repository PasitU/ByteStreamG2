package bytestream;

import java.io.FileNotFoundException;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB4 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            BufferedOutputStream output = new BufferedOutputStream(file);
            String a = "Hello World!";
            byte[] sb = a.getBytes();
            output.write(sb);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream file = new FileInputStream("data.dat");
            BufferedInputStream input = new BufferedInputStream(file);
            int ch;
            while ((ch = input.read()) != -1){
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
