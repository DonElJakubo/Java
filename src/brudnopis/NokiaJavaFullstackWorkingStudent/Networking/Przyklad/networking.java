package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.Networking.Przyklad;

import java.net.*;
import java.io.*;
public class networking {
    public static void main (String[] args) throws IOException {
        Socket socket = new Socket("mail.example.com", 25);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // wysyła komendę HELO
        out.println("HELO");
        String response = in.readLine();
        System.out.println(response);

        // wysyła komendę MAIL FROM
        out.println("MAIL FROM: <sender@example.com>");
        response = in.readLine();
        System.out.println(response);

        // wysyła komendę RCPT TO
        out.println("RCPT TO: <recipient@example.com>");
        response = in.readLine();
        System.out.println(response);

        // wysyła komendę DATA
        out.println("DATA");
        response = in.readLine();
        System.out.println(response);

        // wysyła nagłówek wiadomości
        out.println("From: sender@example.com");
        out.println("To: recipient@example.com");
        out.println("Subject: Test Email");
        out.println();

        // wysyła treść wiadomości
        out.println("This is a test email sent using Java socket programming.");

        // kończy wiadomość
        out.println(".");
        response = in.readLine();
        System.out.println(response);

        // wysyła komendę QUIT
        out.println("QUIT");
        response = in.readLine();
        System.out.println(response);
    }
}
