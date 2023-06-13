package task2;

import java.util.Scanner;

public class Task2 {
    private String correctName = "Вячеслав";

    public String getCorrectName() {
        return correctName;
    }

    public void enterName() {

        System.out.println("Введите имя...");
        Scanner scanner = new Scanner(System.in);
        String inputtedName = scanner.nextLine();

        if (inputtedName.equals(correctName)) {
            System.out.println("Привет, " + getCorrectName());
        } else {
            System.out.println("Нет такого имени!");
        }
    }
}
