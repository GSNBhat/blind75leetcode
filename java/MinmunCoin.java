class MinmunCoin {
    

    
    public int coinChange(int[] coins, int amount) {
        
        if(amount == 0){
            return 0;
        }
        
       return findTheSolution(coins, amount,coins.length);
        
    }
    
    
    private int findTheSolution(int[] coins, int amount, int lengthOfArray){
        
        int[] amountHolder = new int[amount+1];
        
        amountHolder[0]=0;
        
        for(int i=1; i <= amount; i++){
            amountHolder[i] = Integer.MAX_VALUE;
        }
        
        
        
        for(int i=1; i<= amount; i++){
            
            for(int j=0; j<lengthOfArray;j++){
                
                if(coins[j] <= i){
                    
                     int current_min = amountHolder[i-coins[j]];
                     if(current_min != Integer.MAX_VALUE &&  (current_min +1) < amountHolder[i]){
                          amountHolder[i]=current_min+1;
                     }
                }
            }
            
            
        }
        
        
        
        if(amountHolder[amount] == Integer.MAX_VALUE ){
            return -1;
        }else{
             return amountHolder[amount];
        }
        
        
    }
}