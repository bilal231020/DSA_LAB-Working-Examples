/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumoffirsttennaturalnumbers;

/**
 *
 * @author 123
 */
public class MatrixAddition {
    public static void main(String[] args) {
        // Define two matrices
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Resultant matrix
        int[][] sumMatrix = new int[matrixA.length][matrixA[0].length];

        // Adding the two matrices
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Displaying the sum matrix
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[0].length; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
