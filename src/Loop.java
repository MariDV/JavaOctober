import java.math.BigDecimal;

public class Loop {

    static void loops() {
        //counter loop
        for (int i = 0; i < 10; i++) {
            System.out.println("do this 10 times");
        }

        //condition loop
        int j = 0;
        while (j < 10) {
            System.out.println("Continue as long as j is less than 10 (while loop)");
            j += 1;
        }

        //condition loop with continue
        int a = 0;
        while (a < 10) {
            if (a == 5) {
                a += 1;
                continue;
            }
            System.out.println("i value " + a);
            a += 1;
        }

        //do while
        do {
            System.out.println("Continue as long as j is less than 10 (do while loop)");
            j += 1;
        } while (j < 10);


        //for each
        String array[] = {"Jose", "Renata", "Rodrigo", "Ike"};

        //enhanced for loop
        for (String x : array) {
            System.out.println(x);
        }
        //for loop for same function
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
    }
}
