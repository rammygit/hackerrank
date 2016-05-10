package com.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tcnum = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<tcnum;i++){
            String query =  scanner.next();
            
            if(query.charAt(0) == '1'){
                stack.push(scanner.nextInt());
            }
            if(query.charAt(0) == '2'){
                //delete the entry at the top of the stack.
                stack.pop();
            }
            if(query.charAt(0) == '3'){
                //print max element 
                Object[] objArr = stack.toArray();
                Integer[] arr = Arrays.copyOf(objArr, objArr.length, Integer[].class);
                Arrays.sort(arr);
                System.out.println(arr[arr.length-1]);                
            }
        }
        scanner.close();
    }
    
    
}
