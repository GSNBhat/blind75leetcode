class class class JumpJhonny {
    
    
    //https://leetcode.com/problems/jump-game/
    public boolean canJump(int[] nums) {
        
        
        if(nums[0] == 0){
            if(nums.length == 1){
                  return true;
            }
            return false;
        }
            
        int[] array = new int[nums.length];
        for(int i=0; i< nums.length;i++){
            array[i]=0;
        }
        
        array[0]=1; 

        for(int i=0; i< nums.length;i++){
            
            int jump = nums[i];
            if( array[i] == 0){
                    return false;
            }
            else if ((jump+i ) >= (nums.length -1)) {
                 return true;
            }
            
           int posible=0;
           while(jump > 0){
               posible++;
               array[i+posible]=1;
               jump--;
                   
           }
        }
        
        if(array[nums.length -1] == 0){
             return false;
        }else{
               return true;
        }
        
    }
} {
    
    
    
    public boolean canJump(int[] nums) {
        
        
        if(nums[0] == 0){
            if(nums.length == 1){
                  return true;
            }
            return false;
        }
            
        int[] array = new int[nums.length];
        for(int i=0; i< nums.length;i++){
            array[i]=0;
        }
        
        array[0]=1; 

        for(int i=0; i< nums.length;i++){
            
            int jump = nums[i];
            if( array[i] == 0){
                    return false;
            }
            else if ((jump+i ) >= (nums.length -1)) {
                 return true;
            }
            
           int posible=0;
           while(jump > 0){
               posible++;
               array[i+posible]=1;
               jump--;
                   
           }
        }
        
        if(array[nums.length -1] == 0){
             return false;
        }else{
               return true;
        }
        
    }
} {
    
    
    
    public boolean canJump(int[] nums) {
        
        
        if(nums[0] == 0){
            if(nums.length == 1){
                  return true;
            }
            return false;
        }
            
        int[] array = new int[nums.length];
        for(int i=0; i< nums.length;i++){
            array[i]=0;
        }
        
        array[0]=1; 

        for(int i=0; i< nums.length;i++){
            
            int jump = nums[i];
            if( array[i] == 0){
                    return false;
            }
            else if ((jump+i ) >= (nums.length -1)) {
                 return true;
            }
            
           int posible=0;
           while(jump > 0){
               posible++;
               array[i+posible]=1;
               jump--;
                   
           }
        }
        
        if(array[nums.length -1] == 0){
             return false;
        }else{
               return true;
        }
        
    }
}