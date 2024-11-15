import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the required length if the password: ");
        int length = scan.nextInt();
        if(length < 4){
            System.out.println("4 or more digit password can be generated!");
        }else {
            String password = generatePassword(length);
            System.out.printf("Generated Password: %s%n", password);
        }

    }


public static String generatePassword(int length) {
    String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowercase = "abcdefghijklmnopqrsuvwxyz";
    String numbers = "1234567890";
    String spetialchar = "~!@#$%^&*()_+?><:/";
    String allchar = uppercase + lowercase + numbers + spetialchar;

    Random random = new Random();
    StringBuilder password = new StringBuilder();

    password.append(uppercase.charAt(random.nextInt(uppercase.length())));
    password.append(lowercase.charAt(random.nextInt(lowercase.length())));
    password.append(numbers.charAt(random.nextInt(numbers.length())));
    password.append(spetialchar.charAt(random.nextInt(spetialchar.length())));

    for(int i = 0; i<length-4; i++){
        password.append(allchar.charAt(random.nextInt(allchar.length())));
    }

    char[] passwordArray = password.toString().toCharArray();
    for(int i=0; i<passwordArray.length; i++){
        int randomIndex = random.nextInt(passwordArray.length);
        char temp = passwordArray[i];
        passwordArray[i] = passwordArray[randomIndex];
        passwordArray[randomIndex] = temp;

    }


    return new String(password);
}
}




