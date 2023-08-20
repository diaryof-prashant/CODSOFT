import java.util.Random;
import java.util.Scanner;
public class GuessNumbertask1
{
    public static void main(String[] args)
    {
        boolean guessed=false;
        Random random=new Random();
        int guessnum = random.nextInt(101);
        int t=5;
        Scanner scan = new Scanner(System.in);
        System.out.println("I selected a number between 0 and 100.\n Lets see if you can correctly guess the number.\n You have got 5 tries to guess the number.\n Lets begin.\n");

        while(t>0) {

            System.out.println("Enter your guess : ");
            int userinp = scan.nextInt();
            if (userinp == guessnum) {
                System.out.println("You guessed the number.\n You WIN!");
                guessed=true;
                break;
            } else if (userinp > guessnum) {
                System.out.println("Your guess is too high.\n You have " + (t - 1) + " tries left");
                t--;
            } else {
                System.out.println("Your guess is too low.\n You have " + (t - 1) + " tries left");
                t--;
            }
        }
        if(guessed==false){
                System.out.println("You ran out of tries.\n You LOSE!\n");
                System.out.println("Correct number was "+ guessnum + ".");
        }
    }
}
