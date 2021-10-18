package code;

import java.util.*;

class Game {
    int randomNumber, noOfGuesses = 0;
    Scanner sc = new Scanner(System.in);

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public Game() {
        int min = 0;
        int max = 100;
        randomNumber = (int) (Math.random() * (max + 1 - min) + min);

    }

    public void getUserInput() {
        System.out.print("Guess a number: ");
        int userGuess = sc.nextInt();
        noOfGuesses += 1;
        setNoOfGuesses(noOfGuesses);
        isCorrectNumber(userGuess);
    }

    public void isCorrectNumber(int userGuess) {
        if (userGuess == randomNumber) {
            System.out.println("Congratulations!! You guesses the number in " + getNoOfGuesses() + " attempts.");
            System.exit(0);
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess is too low...");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess is too high...");
        }
        getUserInput();
    }

}

public class GuessNumberGame {
    public static void main(String[] args) {
        Game gm = new Game();
        gm.getUserInput();
    }
}
