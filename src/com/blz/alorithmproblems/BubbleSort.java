package com.blz.alorithmproblems;

public class BubbleSort {

	public static void main(String[] args) {
        int[] arr = {5, 9, 2, 8, 1};
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
               if(arr[j]>arr[j+1]){
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
            }
        }
        System.out.println("Printing the Sorted Array");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}