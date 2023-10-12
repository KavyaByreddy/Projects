package password;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PasswordManager {
    private Map<String, String> passwordDatabase;

    public PasswordManager() {
        passwordDatabase = new HashMap<>();
    }

    public void addPassword(String website, String password) {
        passwordDatabase.put(website, password);
        System.out.println("Password for " + website + " added.");
    }

    public String getPassword(String website) {
        if (passwordDatabase.containsKey(website)) {
            return passwordDatabase.get(website);
        } else {
            return "Password not found for " + website;
        }
    }

    public void listWebsites() {
        System.out.println("Websites with saved passwords:");
        for (String website : passwordDatabase.keySet()) {
            System.out.println(website);
        }
    }

    public static void main(String[] args) {
        PasswordManager passwordManager = new PasswordManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Password");
            System.out.println("2. Get Password");
            System.out.println("3. List Websites");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter website: ");
                    String website = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    passwordManager.addPassword(website, password);
                    break;
                case 2:
                    System.out.print("Enter website: ");
                    website = scanner.nextLine();
                    System.out.println("Password: " + passwordManager.getPassword(website));
                    break;
                case 3:
                    passwordManager.listWebsites();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
