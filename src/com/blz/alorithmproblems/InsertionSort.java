package com.blz.alorithmproblems;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Sorting the string.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int arraySize = scanner.nextInt();
        String[] stringArray = new String[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter the value: ");
            stringArray[i] = scanner.next();
        }
        sortArray(stringArray);
    }

    // Insertion sort
    public static void sortArray(String[] array) {
        String temp;
        int j;

        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j-1].compareTo(temp) > 0) {
                array[j] = array[j-1];
                j = j - 1;
            }
            array[j] = temp;
        }

        // printing the sorted array
        System.out.println("Sorted array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}