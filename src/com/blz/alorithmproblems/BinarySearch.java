package com.blz.alorithmproblems;

public class BinarySearch {
    public static void main(String[] args) {
        String[] arr = {"Glory", "Jane", "Kat", "Mary"};
            BinarySearch bs = new BinarySearch();
            bs.search(arr);
    }

    public void search(String[] str){
        int leftIndex = 0;
        int rightIndex = str.length - 1;
        String searchStr = "Mary";
        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            int res = searchStr.compareTo(str[midIndex]); // -ve , 0 or +ve value
            if(res == 0){
                System.out.println(searchStr + " Found");
                break;
            }else if(res > 0){
                leftIndex = midIndex + 1;
            }else if(res < 0) {
                rightIndex = midIndex - 1;
            }
        }
    }
}