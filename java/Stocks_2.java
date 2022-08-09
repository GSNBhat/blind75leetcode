package java;

import java.util.Random;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class Stocks_2 {

    public static void print(int[] array){
        for(int i=0; i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static int maxProfit(int[] prices){
        int profit=0;

        for(int i=1;i<prices.length;i++){
            
            if(prices[i]-prices[i-1]>0){
				System.out.println("buying the stock at day "+ (i+1) );
                profit=profit+(prices[i]-prices[i-1]);
            }
        }

        return profit;
    }
	public static void main(String[] args ){

        Random rand = new Random();
        int[] prices = new int[10];

        for(int i=0; i< prices.length; i++){
            prices[i]=rand.nextInt(10);
        }

        print(prices);

        //Find max Profit
        int profit = maxProfit(prices);

		System.out.println("final profit you made is " + profit);


    }
}

