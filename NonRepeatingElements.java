package com.bridgelabz;

import java.util.Scanner;

public class NonRepeatingElements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int num= in.nextInt();
        int[] array = new int[num];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<num;i++)
            array[i]=in.nextInt();
        int[] frequency = new int[num];
        int visited=-1;
        for(int i=0;i<num;i++){
            int count=1;
            if(frequency[i]!=visited) {
                for (int j = i + 1; j < num; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        frequency[j] = visited;
                    }
                }
                frequency[i]=count;
            }
        }
        System.out.println("The Non-repeating elements for the given array:");
        for(int i=0;i< frequency.length;i++)
            if(frequency[i]==1)
                System.out.print(array[i]+" ");
    }
}
