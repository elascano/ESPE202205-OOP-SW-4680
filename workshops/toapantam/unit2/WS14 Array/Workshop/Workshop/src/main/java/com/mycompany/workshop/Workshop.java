package com.mycompany.workshop;

/**
 *
 * @author MARTIN
 */
public class Workshop {

    public static void main(String[] args) {
        int numbers[];
        numbers = new int[5];
        
        for(int i=0;i<5;i++)
        {
            numbers[i]=i;
        }
        for(int j=0;j<3;j++)
        {
            System.out.printIn(numbers[j]);
        }
    }
}