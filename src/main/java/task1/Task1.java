package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    private String taskString = "Введите число";
    private String notNumber = "Вы ввели не число";

    public String getTaskString() {
        return taskString;
    }

    public String getNotNumber() {
        return notNumber;
    }

    public void enterString() {
        boolean CorrectValue;
        do {
            try {
                CorrectValue = true;
                System.out.println(getTaskString());
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt();

                if (input <= 7) {
                    System.out.println("Число не больше 7.");
                    CorrectValue = false;
                } else {
                    System.out.println("Привет");
                    CorrectValue = true;
                }
            } catch (InputMismatchException e) {
                CorrectValue = false;
                System.out.println(getNotNumber());
            }
        } while (!CorrectValue);
    }
}



