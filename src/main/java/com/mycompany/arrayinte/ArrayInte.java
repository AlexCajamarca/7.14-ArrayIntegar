/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayinte;

/**
 *
 * @author alexc
 */
import java.util.Arrays;
public class ArrayInte {
    public static void main(String[] args) {
       
        int[] counts = new int[10];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        int[] bonus = new int[15];
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] += 1;
        }

        int[] bestscores = {98, 76, 85, 91, 94, 67, 46, 34};
        System.out.println("Best Scores:");
        Arrays.sort(bestscores);
        for (int i = bestscores.length - 1; i >= bestscores.length - 5; i--) {
            System.out.printf("%d\n", bestscores[i]);
        }
    }
}
    

