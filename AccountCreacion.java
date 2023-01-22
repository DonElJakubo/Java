import java.sql.*;
import java.util.Scanner;

class AccountCreation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Account Creation and Login System!");
        System.out.println("Do you already have an account? (Y/N)");
        String answer = input.nextLine();
        if(answer.equals("Y")) {
            login();
        }
        else {
            createAccount();
        }
    }

    public static void createAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a username:");
        String username = input.nextLine();
        System.out.println("Enter a password:");
        String password = input.nextLine();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts", "root", "");
            Statement stmt = con.createStatement();
            String query = "INSERT INTO users (username, password) VALUES ('" + username + "', '" + password + "')";
            stmt.executeUpdate(query);
            System.out.println("Account created! You may now login.");
            con.close();
            login();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void login() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = input.nextLine();
        System.out.println("Enter your password:");
        String password = input.nextLine();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts", "root", "");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                System.out.println("You have successfully logged in!");
            }
            else {
                System.out.println("Incorrect username or password.");
            }
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}