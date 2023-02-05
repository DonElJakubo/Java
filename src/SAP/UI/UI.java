package SAP.UI;

        import javax.swing.*;
        import java.awt.*;


        import java.util.ArrayList;

public class UI {
    public static void main(String[] args) {
        // Tworzenie obiektu SAP
        SAP sap = new SAP();
        sap.addData("transakcja 1");
        sap.addData("transakcja 2");
        sap.addData("transakcja 3");
        sap.addData("transakcja 4");
        sap.addData("transakcja 5");

        // Tworzenie okna
        JFrame frame = new JFrame("Interfejs użytkownika SAP");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Tworzenie panelu głównego
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Tworzenie panelu wyszukiwania
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());

        // Dodawanie pól do panelu wyszukiwania
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("Szukaj w SAP");
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        // Dodawanie panelu wyszukiwania do panelu głównego
        mainPanel.add(searchPanel);

        // Tworzenie panelu filtrowania
        JPanel filterPanel = new JPanel();
        filterPanel.setLayout(new FlowLayout());

        // Dodawanie pól do panelu filtrowania
        JLabel filterLabel = new JLabel("Filtruj wyniki SAP:");
        JCheckBox filterCheckbox = new JCheckBox();
        filterPanel.add(filterLabel);
        filterPanel.add(filterCheckbox);

        // Dodawanie panelu filtrowania do panelu głównego
        mainPanel.add(filterPanel);

        // Dodanie przycisku do wykonania transakcji
        JButton transactionButton = new JButton("Wykonaj transakcję");
        mainPanel.add(transactionButton);

        // Dodanie panelu wyświetlającego transakcje
        JPanel transactionPanel = new JPanel();
        transactionPanel.setLayout(new FlowLayout());

        // Dodanie pola do panelu transakcji
        JTextArea transactionArea = new JTextArea(10, 20);
        transactionPanel.add(transactionArea);

        // Dodanie panelu transakcji do panelu głównego
        mainPanel.add(transactionPanel);

        // Dodawanie panelu głównego do okna
        frame.add(mainPanel);

        // Wyświetlanie okna
        frame.setVisible(true);

        // Dodanie akcji do przycisku wyszukiwania
        searchButton.addActionListener(e -> {
            String query = searchField.getText();
            ArrayList<String> results = sap.search(query);
            System.out.println("Wyniki wyszukiwania SAP dla '" + query + "':");
            for(String result : results) {
                System.out.println(result);
            }
        });

        // Dodanie akcji do przycisku filtrowania
        filterCheckbox.addActionListener(e -> {
            String query = searchField.getText();
            ArrayList<String> results = sap.filter(query);
            System.out.println("Wyniki filtrowania SAP dla '" + query + "':");
            for(String result : results) {
                System.out.println(result);
            }
        });

        // Dodanie akcji do przycisku transakcji
        transactionButton.addActionListener(e -> {
            System.out.println("Wykonano transakcję SAP");
            transactionArea.append("Wykonano transakcję SAP\n");
        });
    }
}