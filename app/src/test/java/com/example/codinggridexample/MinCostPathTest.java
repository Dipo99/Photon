package com.example.codinggridexample;


import com.example.codinggridexample.shortestpath.MinCostPath;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinCostPathTest {

    @Test
    public void normalMatrixTest_sample13(){
        //Arrange
        int[][] matrix = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}
        };
        MinCostPath matrixClass = new MinCostPath();

        //Act
        matrixClass.normalMatrix(matrix);

        //Assert
        boolean expectedreachedTarget = true;
        int expectedTotalPath = 20;
        String expectedsmallestPath = "1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1";
        assertEquals(expectedreachedTarget, matrixClass.reachedTarget);
        assertEquals(expectedTotalPath, matrixClass.totalPath);
        assertEquals(expectedsmallestPath, matrixClass.smallestPath);
    }

    @Test
    public void normalMatrixTest_sample8(){
        //Arrange
        int[][] matrix = {
                {69, 10, 19, 10, 19},
                {51, 23, 20, 19, 12},
                {60, 12, 20 ,11, 10}
        };
        MinCostPath matrixClass = new MinCostPath();

        //Act
        matrixClass.normalMatrix(matrix);

        //Assert
        boolean expectedreachedTarget = false;
        int expectedTotalPath = 0;
        String expectedsmallestPath = "";
        assertEquals(expectedreachedTarget, matrixClass.reachedTarget);
        assertEquals(expectedTotalPath, matrixClass.totalPath);
        System.out.println(matrixClass.totalPath);
        assertEquals(expectedsmallestPath, matrixClass.smallestPath);
    }

    @Test
    public void normalMatrixTest_sample1(){
        //Arrange
        int[][] matrix = {
                {3, 4, 1, 2, 8, 6},
                {6, 1, 8, 2, 7, 4},
                {5, 9, 3, 9, 9, 5},
                {8, 4, 1, 3, 2, 6},
                {3, 7, 2, 8, 6, 4}
        };
        MinCostPath matrixClass = new MinCostPath();

        //Act
        matrixClass.normalMatrix(matrix);

        //Assert
        boolean expectedreachedTarget = true;
        int expectedTotalPath = 15;
        String expectedsmallestPath = "3 2 4 2 4 2";
        assertEquals(expectedreachedTarget, matrixClass.reachedTarget);
        assertEquals(expectedTotalPath, matrixClass.totalPath);
        System.out.println(matrixClass.totalPath);
        assertEquals(expectedsmallestPath, matrixClass.smallestPath);
    }

}
