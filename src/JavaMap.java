import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class PhoneBook {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read number of entries
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Create a phone book map
            Map<String, String> phoneBook = new HashMap<>();

            // Read entries
            for (int i = 0; i < n; i++) {
                String name = scanner.nextLine().trim();
                String phoneNumber = scanner.nextLine().trim();
                phoneBook.put(name, phoneNumber);
            }

            // Read queries until EOF
            while (scanner.hasNextLine()) {
                String query = scanner.nextLine().trim();
                if (phoneBook.containsKey(query)) {
                    System.out.println(query + "=" + phoneBook.get(query));
                } else {
                    System.out.println("Not found");
                }
            }

            scanner.close();
        }
    }

}
