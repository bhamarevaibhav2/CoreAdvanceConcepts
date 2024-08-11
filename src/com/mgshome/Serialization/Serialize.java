package com.mgshome.Serialization;

import java.io.*;

public class Serialize {
    public static void main(String[] args) {

        try{
            Student st = new Student("Durgesh",21);
            FileOutputStream fis = new FileOutputStream("Abc.txt");
            ObjectOutputStream ois = new ObjectOutputStream(fis);

            ois.writeObject(st);
            ois.close();
            fis.close();
            System.out.println("File written successfully");
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
