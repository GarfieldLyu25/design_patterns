package pattern.singleton.demo7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {
    public static void main(String[] args) throws Exception {
        writeObject2File();
        readObjectfromFile();
        readObjectfromFile();
    }

    public static void readObjectfromFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));
        Singleton obj = (Singleton) ois.readObject();
        System.out.println(obj);
        ois.close();
    }
    public static void writeObject2File() throws Exception{
        Singleton singleton = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"));
        oos.writeObject(singleton);
        oos.close();
    }
}
