package org.example;

public class GamePrint {
    static void start() {
        System.out.println("-===========================-");
        System.out.println("=== GUESS THE NUMBER GAME ===");
        System.out.println("-===========================-");
    }

    static void end() {
        System.out.println("== Thanks for playing! ==");
    }

    static void instructions() {
        System.out.println("Guess the number (between 1 and 100)!");
    }

    static void found(int attempts) {
        System.out.println("You found it after " + attempts + " tries!");
    }

    static void loose(int maxAttempts, int number) {
        System.out.println("You lose after " + maxAttempts + " tries, the expected number was " + number);
    }
    static void wrong(String divergence, int maxAttempts, int attempts) {
        System.out.println("Wrong! Your number is " + divergence + " than the correct one. " + (maxAttempts-attempts) + "/" + maxAttempts + " tries left");
    }
    static void notANumber(String input, int maxAttempts, int attempts) {
        System.out.println("Your input was '" + input + "', please enter a valid integer. " + (maxAttempts-attempts) + "/" + maxAttempts + " tries left");
    }
    static void line() {
        System.out.println("----------------------------------------------------");
    }

    static void retry() {
        System.out.println("Do you want to try again with a new number (yes/no)?");
    }
}
