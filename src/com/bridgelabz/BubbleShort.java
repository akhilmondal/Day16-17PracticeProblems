package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleShort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Bubble Sort algorithm to sort the integers
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        ArrayList<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sortedList.add(arr[i]);
        }

        System.out.println("Sorted integers:");
        System.out.println(sortedList);
    }
}
