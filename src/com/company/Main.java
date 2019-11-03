package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập vào số phần tử trong mảng: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kích thước mảng không được quá 20");
            }
        } while (size > 20);
        reverseArray(createArray(size));
    }

    public static int[] createArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.printf("Nhập số thứ %d: ", (i + 1));
            arr[i] = scanner.nextInt();
            i++;
        }
        return arr;
    }

    public static void reverseArray(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while(last > first) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for (int item : arr) {
            System.out.println(item);
        }
    }
}
