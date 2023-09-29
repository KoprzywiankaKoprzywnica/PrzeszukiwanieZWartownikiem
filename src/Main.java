import java.util.Scanner;

public class Main {
    public static final int ARR_SIZE = 50;

    public static void main(String[] args) {
        System.out.println("Przeszukiwanie z wartownikiem");
        System.out.print("Podaj szukaną liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int searchedNum = scanner.nextInt();

        int[] arr = createArray();
        printArray(arr);

        if (findNumber(arr, searchedNum) != null) {
            System.out.println("\nLiczba " + searchedNum + " znajduje się w tablicy pod indeksem " + findNumber(arr, searchedNum)+".");
        }else{
            System.out.println("\nSzukanej liczby nie ma w tablicy.");
        }
    }

    public static int[] createArray() {
        int[] arr = new int[ARR_SIZE];
        for (int i = 0; i < ARR_SIZE; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < ARR_SIZE; i++) {
            if (i % 10 == 0) System.out.println("");
            System.out.print(array[i] + ", ");
        }
    }

    public static Integer findNumber(int[] arr, int searchedNum) {
        int[] arr2 = new int[ARR_SIZE + 1];
        for (int i = 0; i < ARR_SIZE; i++) {
            arr2[i] = arr[i];
        }
        arr2[ARR_SIZE] = searchedNum; //dodanie wartownika

        Integer searchedIndex = null;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == searchedNum) {
                if (i < arr2.length - 1) {
                    searchedIndex = i;
                }
            }
        }
        return searchedIndex;
    }
}