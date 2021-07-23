package creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class DbSingleton6Main {
	public static void main(String[] args) {
		try
        {
			DbSingleton6 instance1 = DbSingleton6.getInstance();
			DbSingleton6 instance2 = (DbSingleton6)instance1.clone();
     
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
