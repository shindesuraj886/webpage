package Array;

import java.util.*;

public class Revrsearay{
    public static void main(String[] args) {
    Integer[] arr = {10,20,30,40,50,60,70,80,90};
  
    
    
    for(int i=0; i<arr.length; i++) {
      //  System.out.println("Original Array:");

    	System.out.print(arr[i]+ " ");
    }
    
    for(int i=arr.length-1; i>=0; i--) {
    	System.out.print(arr[i]+ " ");
    }
    }
}