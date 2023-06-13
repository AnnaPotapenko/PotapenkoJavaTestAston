package task3;

public class Task3 {

    int[] massiveOfNumbers = {1, 55, 33, 456, 9, 12, 36, -21};

    public int[] getMassiveOfNumbers() {
        return massiveOfNumbers;
    }

    public void checkNumbers(int[] massiveToCheck) {

        for (int i = 0; i < massiveToCheck.length; i++) {
            if (massiveToCheck[i] % 3 == 0) {
                System.out.println(massiveToCheck[i]);
            }
        }
    }
}


