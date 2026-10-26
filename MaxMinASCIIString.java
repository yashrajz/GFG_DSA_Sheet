import java.util.*;
public class MaxMinASCIIString {
    public static String[] filteStrings(String[] arr){

        String maxString = arr[0];
        String minString = arr[0];

        int maxSum = 0;
        int minSum = 0;

        //finding initial max/min ascii value to compare;
        for(int i = 0; i < arr[0].length(); i++){
            maxSum += arr[0].charAt(i);
            minSum += arr[0].charAt(i);
        }

        //compare the sum of ascii of other string;
        for(int i = 1; i < arr.length; i++){
            int sum = 0;
            
            for(int j = 0; j < arr[i].length(); j++){
                sum += arr[i].charAt(j);

            }
            if(sum > maxSum){
                    maxSum = sum;
                    maxString = arr[i];
            }
            else if(sum < minSum){
                    minSum = sum;
                    minString = arr[i];
            }

        }
        return new String[]{maxString, minString};


    } 

    public static void main(String[] args) {
        String[] str = {"ABCd", "YASH", "Raj", "Khushi"};

        System.out.println(Arrays.toString(filteStrings(str)));
    }
}
