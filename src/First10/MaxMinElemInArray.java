package First10;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinElemInArray {
     static class Pair{ // it is to return the two value from getMinMax
         int min;
         int max;
     }
     static Pair getMinMax(int []arr, int n){
         Pair minMax = new Pair();
         int i;

         // if there will be only one element in the array then that will be the min and max element
         if(n==1){
             minMax.max = arr[0];
             minMax.min = arr[0];
         }
         // if there is two element then
         if(arr[0]<arr[1]){
             minMax.max = arr[1];
             minMax.min = arr[0];
         }else{
             minMax.max = arr[0];
             minMax.min = arr[1];
         }

         // if there are more than two elements in the array then
         for(i=2;i<n;i++){
             if(arr[i]>minMax.max){ // if, which one is greatest from before and if arr[i] becomes grater then it is big
                 minMax.max = arr[i];
             }else if(arr[i]<minMax.min){ //if, which one is small from before and if arr[i] becomes smaller then it is smallest
                 minMax.min = arr[i];
             }
         }
         return  minMax;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the array value");
        int [] arr = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }

        Pair minMax = getMinMax(arr, x);
        System.out.printf("\nMinimum element is %d", minMax.min);
        System.out.printf("\nMaximum element is %d", minMax.max);
    }
}
