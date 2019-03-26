package controller;

import java.io.File;
import javax.swing.JFileChooser;

public class AudioManager {

    public File openFile() {
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Select a cassette");
            chooser.showOpenDialog(null);
            File songFile;
            songFile = chooser.getSelectedFile();
            if (!songFile.getName().endsWith(".mp3")) {
                AlertBox.display("Error", "error", "Please select an mp3 file");
                openFile();
            }
            return songFile;
        } catch (Exception e) {
            System.out.println(e.getCause());
            return null;
        }
    }
}
