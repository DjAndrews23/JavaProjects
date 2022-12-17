import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //getEmail();
        getPassword("DonaldAndrewsYearUp@Gmail.com");

    }

    public static String getEmail() {

        System.out.println("Enter first name: ");
        Scanner Input1 = new Scanner(System.in);
        String firstName = Input1.nextLine();

        System.out.println("Enter last name: ");
        Scanner Input2 = new Scanner(System.in);
        String lastName = Input2.nextLine();

        System.out.println("Enter your department: ");
        Scanner Input3 = new Scanner(System.in);
        String department = Input2.nextLine();

        String email = firstName + lastName + department + "@Gmail.com";

        System.out.println("Your new email is " + email);

        return email;
    }

    public static String getPassword(String email) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String combination =letters+numbers;
        int len = 10;
        char[] tempPassword = new char[len];
        Random random = new Random();
        for(int i=0; i<len;i++){
            tempPassword[i]=combination.charAt(random.nextInt(combination.length()));
        }
        System.out.println("The generated password is " + new String(tempPassword));

        String password = String.valueOf(tempPassword);

        return password;
    }


    public static void changePassword(String email){




    }
}