import java.util.Scanner;

public class NumberGame {
    public static void main(String[]args){
        // multiplied by 100 because math.random creates floating points.
        int ranNumber = (int)(Math.random()*100)+1;
        System.out.println(ranNumber);
        boolean winner=false;
        int n =5;  // number of chance that user will get
        System.out.println("i have choosen a random number from 1-100");
        System.out.println("Try to Guess it");
        Scanner scanner = new Scanner(System.in);//Scanner object created in order to take input from user.

        //for loop that will run and keep track of chances left
        for(int i=n;i>0;i--) {
            System.out.println("you have left with " + i + " chances Try Again ");//will print chances left
            int guessNo = scanner.nextInt();//will read the user input

            //if condition that will check if the number guessed is smaller or greater or equal to random number.
            if (ranNumber < guessNo) {
                System.out.println("Your guess " + guessNo + " is Smaller than the Number");
            } else if (ranNumber > guessNo) {
                System.out.println("Your guess " + guessNo + " is greater than the Number");
            } else if(ranNumber==guessNo){
                winner = true;
                break;

        }
        }
        //if condition to check whether the user has won or lost
        if(winner==true){
            System.out.println("your guess is right! you win congratulations");
            System.out.println("The random number was: "+ranNumber);
        }else {
            System.out.println("Game over you loose");
            System.out.println("The random number was: "+ranNumber);
        }
    }
}
