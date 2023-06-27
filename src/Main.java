import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args)throws Exception {
        Abolfazl abol = new Abolfazl();
        abol.setName("abolfazl");
        abol.setAge(25);

        FileOutputStream fileOutputStream = new FileOutputStream("E:\\abolfazl2.harchi");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(abol);

        fileOutputStream.close();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("E:\\abolfazl2.harchi");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Abolfazl abolfazl = (Abolfazl) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        System.out.println(abolfazl.getName());
        System.out.println(abolfazl.getAge());

        /*
        while (true) {
            try {
                Abolfazl a = (Abolfazl) objectInputStream.readObject();

                System.out.println(abolfazl.getName());
                System.out.println(abolfazl.getAge());

            }catch (Exception e){
                break;
            }
        }
        */


    }
}
