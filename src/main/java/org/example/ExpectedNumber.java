package org.example;

import java.util.Random;
import java.util.Random;
public class ExpectedNumber {
    public int number;

    public void newNumber() {
        Random generator = new Random();
        number = generator.nextInt(100) + 1;
    }

    boolean isNumberFound(int userGuess, int attempts, int maxAttempts) {
        return number != userGuess && attempts < maxAttempts;
    }

}
