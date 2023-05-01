package labstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LabStream {

    public static void main(String[] args) {
        try {
            ObjectOutputStream outPut = new ObjectOutputStream(new FileOutputStream("data.dat"));
            Student s = new Student("17164","Pasit Udompanich");
            outPut.writeObject(s);
            outPut.flush();
            outPut.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LabStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LabStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ObjectInputStream inp = new ObjectInputStream(new FileInputStream("data.dat"));
            Student s = (Student) inp.readObject();
            System.out.println("student: " + s.id + " " + s.name);
            inp.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LabStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LabStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LabStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
