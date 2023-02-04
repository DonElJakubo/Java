package logarytmy;

import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class panel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Log Reader");
        frame.setSize(1200, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Panel do wyświetlania logów
        JPanel logPanel = new JPanel();
        logPanel.setLayout(new BorderLayout());
        frame.add(logPanel, BorderLayout.CENTER);

        // Przycisk do wybierania plików
        JButton fileButton = new JButton("Wybierz plik");
        logPanel.add(fileButton, BorderLayout.PAGE_START);

        // Panel do wyświetlania logów
        JTextArea logTextArea = new JTextArea();
        logTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(logTextArea);
        logPanel.add(scrollPane, BorderLayout.CENTER);

        // Akcja po kliknięciu przycisku
        fileButton.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(frame);
            File selectedFile = chooser.getSelectedFile();

            try {
                Scanner scanner = new Scanner(selectedFile);

                logTextArea.setText("");

                while (scanner.hasNextLine()) {
                    logTextArea.append(scanner.nextLine() + "\n");
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });
    }
}