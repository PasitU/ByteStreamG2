package bytestream;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB2 {
    public static void main(String[] args) {

            try {
                FileOutputStream output = new FileOutputStream("data.dat");
                String s = "Hello World! 12345!@#$%^&*()_+";
                byte[] sb = s.getBytes();
                output.write(sb);
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        try{
            FileInputStream input = new FileInputStream("data.dat");
            int ch;
            while((ch = input.read()) != -1){
                System.out.println((char)ch);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
                Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}