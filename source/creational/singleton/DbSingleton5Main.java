package creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class DbSingleton5Main {
	public static void main(String[] args) {
		try
        {
			DbSingleton5 instance1 = DbSingleton5.getInstance();
            ObjectOutput out
                = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();
     
            // deserialize from file to object
            ObjectInput in
                = new ObjectInputStream(new FileInputStream("file.text"));
             
            DbSingleton5 instance2 = (DbSingleton5)in.readObject();
            in.close();
     
            System.out.println("instance1 hashCode:- "
                                                 + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                                                 + instance2.hashCode());
        }
         
        catch (Exception e)
        {
            e.printStackTrace();
        }
	}
}
