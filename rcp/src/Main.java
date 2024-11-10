import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        char[] options = {'R', 'P', 'S'};
        char selection = options[random.nextInt(options.length)];
        System.out.println("Select: \n'R' for rock \n'P' for paper \n'S' for scissor");
        System.out.print("Enter your choice: ");


        Scanner scan = new Scanner(System.in);
        char user_selection = scan.next().charAt(0);
        System.out.println("my Choice: " + selection);
        System.out.println("your choice: " + user_selection);

        if(selection == 'R'){
            if(user_selection == 'R'){
               System.out.println("it's a tie player!");
            }else if(user_selection == 'P'){
               System.out.println("You won the match!");
            }else if(user_selection == 'S'){
                System.out.println("you lose the match!");
            }else{
                System.out.println("Invalid input!");
            }
        }else if(selection == 'P'){
            if(user_selection == 'R'){
                System.out.println("you lose the match!");
            }else if(user_selection == 'P'){
                System.out.println("It's a tie!");
            }else if(user_selection == 'S'){
                System.out.println("you won the match!");
            }else{
                System.out.println("Invalid input!");
            }
        }else{
            if(user_selection == 'R'){
                System.out.println("you won the match!");
            }else if(user_selection == 'P'){
                System.out.println("you lose the match!");
            }else if(user_selection == 'S'){
                System.out.println("it's a tie!");
            }else{
                System.out.println("Invalid input!");
            }
        }

        scan.close();


    }
}
