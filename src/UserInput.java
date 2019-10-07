import java.util.Scanner;

public class UserInput {
    static void inputs()

    {
        //scanner system (Ask for user information)
        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?");
        String name;
        name = input.next();

        System.out.println("How old are you?");
        int age;
        age = input.nextInt();

        System.out.println("Hello " + name + ". You are " + age + " years old");

        String password;
        System.out.println("What's your password");
        password = input.next();
        System.out.println("your password is : ");
        for (int i = 0; i < password.length(); i++) {
            System.out.print("*");
        }
        System.out.println("password encrypted");

        String email;
        System.out.println("What's your email address");
        email = input.next();
        System.out.println("your email is : ");
        //print reverse

        for (int i = email.length() - 1; i >= 0; i--) {

            System.out.print(email.charAt(i));
        }
    }
    public static void main(String[] args) {

    }
}
