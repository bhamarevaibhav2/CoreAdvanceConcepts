package com.mgshome.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;

public class Deserialize {
    public static void main(String[] args) {

        try{
            FileInputStream fis = new FileInputStream("Abc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student st = (Student) ois.readObject();
            System.out.println("Age : "+st.getAge()+" Name : "+st.getName());
            ois.close();
            fis.close();
        }
        catch(InvalidClassException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
