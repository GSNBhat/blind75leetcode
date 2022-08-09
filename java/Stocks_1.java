package java;

import java.util.Random;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Stocks_1 {

    public static void print(int[] array){
        for(int i=0; i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args){

        //Generate the input 
        Random rand = new Random();
        int[] prices = new int[10];

        for(int i=0; i< prices.length;i++){
            prices[i] = rand.nextInt(10);
        }

    
        int min=1000000;
        int profit=0;
        print(prices);

        for(int i=0; i< prices.length;i++){
            min = Math.min(min, prices[i] );
            profit = Math.max(profit, prices[i]-min);
        }
		
		System.out.println("Final Profit : "+ profit);

    }

} 