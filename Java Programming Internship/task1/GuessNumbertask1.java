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
        System.out.println("A number is selected between 0 and 100.\nLets see if you can correctly guess the number.\nYou have got 5 tries to guess the number.\nLets begin.\n");

        while(t>0) {

            System.out.println("Enter your guess : ");
            int userinp = scan.nextInt();
            if (userinp == guessnum) {
                System.out.println("You guessed the number.\nYou WIN!");
                guessed=true;
                break;
            } else if (userinp > guessnum) {
                System.out.println("Your guess is too high.\nYou have " + (t - 1) + " tries left");
                t--;
            } else {
                System.out.println("Your guess is too low.\nYou have " + (t - 1) + " tries left");
                t--;
            }
        }
        if(guessed==false){
                System.out.println("You ran out of tries.\nYou LOSE!\n");
                System.out.println("Correct number was "+ guessnum + ".");
        }
    }
}
