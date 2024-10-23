/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumoffirsttennaturalnumbers;

/**
 *
 * @author 123
 */
  import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // Define an array
        int[] array = {1, 2, 3, 4, 5};

        // Print original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Reverse the array
        reverseArray(array);

        // Print reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }
}

