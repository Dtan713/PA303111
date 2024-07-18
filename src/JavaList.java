import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner userInput = new Scanner(System. in);
        ArrayList<integer> numbers = new ArrayList<Integer>();

        while (SizeOfArray > numbers.size()) {
            int userNumber = userInput.nextInt();
              numbers.add(usersNumbers);
        }

        int numberOfQueries = userInput.nextInt();

        int numberOFQueries =0;
        while (numberOFQueries > completedQueries){
            String selectedQuery = userInput.nextLine();

            if (slectedQuery.equals("Insert")){

                int usersSelectedIndex = userInput.nextInt();
                int userNewValue = usersInput.nextInt();
                numbers.add(usersSelectedIndex, userNewValue);
                completeQueries++;
            }

            if (selectedQuery.equals("Delete")) {
                int userSelectedIndex = userInput.nextInt();
                numbers.remove(userSelectedIndex);
                compeletedQueries++;
            }

            }

        System.out.println(numbers);
