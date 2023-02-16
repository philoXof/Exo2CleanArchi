package org.example;

import java.util.Scanner;

public class Game {
    int userGuess = 0;
    int attempts = 0;
    int maxAttempts = 10;
    boolean continuePlaying = true;
    ExpectedNumber expectedNumber = new ExpectedNumber();
    Parser parser = new Parser();
    public void play() {
        Scanner scanner = new Scanner(System.in);

        GamePrint.start();

        while(continuePlaying) {
            GamePrint.instructions();
            expectedNumber.newNumber();
            System.out.println("debug : the expected number is " + expectedNumber.number);

            while (expectedNumber.isNumberFound(userGuess, attempts, maxAttempts)) {
                attempts++;
                userGuess = parser.answer(maxAttempts, attempts);
                guess();
            }
            loose();
            keepPlaying();
            reset();
        }
        GamePrint.end();
        scanner.close();
    }

    void keepPlaying(){
        continuePlaying = parser.retry();
    }
    void guess(){
        if (userGuess == expectedNumber.number) {
            GamePrint.found(attempts);
        } else {
            String divergence = userGuess < expectedNumber.number ? "smaller" : "greater";
            GamePrint.wrong(divergence, maxAttempts, attempts);
        }
    }

    void loose(){
        if (expectedNumber.number != userGuess) {
            GamePrint.loose(maxAttempts, expectedNumber.number);
        }
    }

    void reset(){
        if (continuePlaying) {
            userGuess = 0;
            attempts = 0;
        }
    }
}
