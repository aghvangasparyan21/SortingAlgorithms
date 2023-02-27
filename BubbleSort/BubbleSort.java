package Package;

import java.util.Scanner;

public class BubbleSort {
    private Scanner sc = new Scanner(System.in);

    public BubbleSort(char operation, int[] arr) {
        bubbleSort(operation, arr);
    }

    private void bubbleSort(char operation, int[] arr) {
        switch (operation) {
            case '>': {
                ascendingOrder(arr);
                break;
            }
            case '<': {
                descendingOrder(arr);
                break;
            }
            default: {
                System.out.println("Unknown operation!");
                break;
            }
        }
    }

    private void ascendingOrder(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
                j = -1;
            }
        }
        System.out.println("Sorted array\n");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    private void descendingOrder(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
                j = -1;
            }
        }
        System.out.println("Sorted array\n");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
