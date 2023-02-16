package org.example;

import java.util.Scanner;

public class Parser {
    private final Scanner scanner = new Scanner(System.in);

    public int answer(int maxAttempts, int attempts) {
        String input = scanner.nextLine();
        int result = 0;
        try {
            result = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            GamePrint.notANumber(input, maxAttempts, attempts);
        }
        return result;
    }

    public boolean retry() {
        GamePrint.line();
        GamePrint.retry();
        String userResponse = scanner.nextLine().trim().toLowerCase();
        return userResponse.equals("yes");
    }
}
