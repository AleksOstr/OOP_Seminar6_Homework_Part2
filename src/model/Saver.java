package model;

import java.io.FileWriter;
import java.io.IOException;

public class Saver {
    public void saveNote(Note note, String fileName) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(note.toString());
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
