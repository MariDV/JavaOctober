import java.util.Scanner;
public class Menu {
    public static void ex1(){
        //3. Write a Java method to display the middle character of a string. Go to the editor
//        Note: a) If the length of the string is odd there will be two middle characters.
//        b) If the length of the string is even there will be one middle character.
//        Test Data:
//        Input a string: 350
//        Expected Output:
//
//      Scanner sn = new Scanner(System.in);
//        The middle character in the string: 5

        Scanner sn = new Scanner(System.in);
        System.out.println("Give me a word and I will print middle character of it");
        String word=sn.next();
        int num =word.length();
        if (num%2==0){
            num =word.length()/2;
            System.out.print(word.charAt(num+1));
            System.out.println(word.charAt(num));
        }else {
            num =word.length()-1;
            System.out.println(word.charAt(num/2));
        }
    }

    public static void ex2(){
//        11. Write a Java method to check whether a string is a valid password. Go to the editor
//        Password rules:
//        A password must have at least ten characters.
//        A password consists of only letters and digits.
//        A password must contain at least two digits.
//        Expected Output:
//        1. A password must have at least eight characters.
//        2. A password consists of only letters and digits.
//        3. A password must contain at least two digits
//        Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
//        Password is valid: abcd1234
        Scanner bla= new Scanner(System.in);
        System.out.println("Please inform your password -Your password must have at least ten characters,consists of only letters and digits,must contain at least two digits.");
        String password=bla.next();
        int count=0;
        if(password.matches("[a-zA-Z0-9]*") && password.length()>=10){
            for (int i=0;i<password.length();i++){
                if (Character.isDigit(password.charAt(i))) {
                    count += 1;
                    if (count > 1) {
                        System.out.println("Your password is valid");
                        return;
                    } else {
                        System.out.println("Your password contains less then 2 digits");
                    }
                }
            }
        }else {
            System.out.println("Invalid Password");
        }
    }

    public static void ex3(){
        Scanner sn = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name= sn.next();
        System.out.println("Hello "+name+"! "+ "How many hours did you work this period?");
        double workinghours= sn.nextDouble();
        System.out.println("How much did you earn for the period? ");
        double salary= sn.nextDouble();
        System.out.format("You are making %.2f CAD/Hour ", salary/52/workinghours);
    }

    public static int ex4(int number){

        return (number<1)?-1 :  (number==1)?1 : number * ex4(number-1);
    }
    //menu

    static void menu() {
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("-----------------//-----------------");
            System.out.println("Select one option");
            System.out.println("1 - Method to display the middle character of a word.");
            System.out.println("2 - Method to check whether a password is valid or not.");
            System.out.println("3 - Method to calculate salary/hour.");
            System.out.println("4 - Method to calculate factorial");
            int choices = sn.nextInt();
            switch (choices) {
                case 1:
                    ex1();
                    break;
                case 2:
                    ex2();
                    break;
                case 3:
                    ex3();
                    break;
                case 4:
                    for (int i=1;i<10;i+=1) {
                        System.out.println("Factorial " + i + " = " + ex4(i));
                    }
                    break;
                default:
                    System.out.println("Bye");
                    exit = true;
                    break;
            }

        } while (!exit);
    }

    public static void main(String[] args) {

    }
}
