
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

    public class UniquePairs {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt(); // number of pairs
            scanner.nextLine(); // consume newline

            Set<String> uniquePairs = new HashSet<>();

            for (int i = 0; i < n; i++) {
                String first = scanner.next();
                String second = scanner.next();
                scanner.nextLine(); // consume newline

                // Concatenate the pair to form a unique identifier
                String pair = first + "_" + second;

                // Add to the set and get the current size
                uniquePairs.add(pair);
                System.out.println(uniquePairs.size());
            }

            scanner.close();
        }
    }

}
