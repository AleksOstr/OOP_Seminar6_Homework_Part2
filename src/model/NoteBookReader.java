package model;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NoteBookReader {
    public List<Character> readNoteBook(String fileName) {
        List<Character> lines = new ArrayList<>();
        try (FileReader fr = new FileReader(fileName)) {
            int symbol;
            while ((symbol = fr.read()) != -1) {
                lines.add((char) symbol);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return lines;
    }
}
