package gr.aueb.cf.ch17.clone;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Bill\\IdeaProjects\\GitProj5\\src\\gr\\aueb\\cf"))) {
            Trainee alice = new Trainee("Alice", new City("Athens"));
            oos.writeObject(alice);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
