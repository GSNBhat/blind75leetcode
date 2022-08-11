class ContainsDuplicate {
    
    private long getbucketId(long val, long width){
        
         return val < 0 ? (val+1l)/width-1l : val/width;
    }
    
    
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        
        long width = t+1;
        
        if(nums.length <= 1){
            return false ;
        }
        
        if(t < 0){
             return false ;
        }
        
        
        Map<Long,Long> buckets = new HashMap<Long,Long>();
        
        for(int i =0 ; i<nums.length; i++ ){
            
            long bucketId = getbucketId((long) nums[i] ,  width);
            
            if(buckets.containsKey(bucketId)){
                return true;
            }
            
            if(buckets.containsKey(bucketId -1l) && Math.abs ( buckets.get(bucketId -1l) - nums[i] ) < width){
                return true;
            }
            
                   
            if(buckets.containsKey(bucketId + 1l) && Math.abs ( buckets.get(bucketId + 1l) - nums[i] ) < width)             {
                return true;
            }
            
            
            buckets.put(bucketId, (long) nums[i]);
            
            
           	if(i-k>=0){
                
                long oldBucketId = getbucketId((long) nums[i-k], width);
                buckets.remove(oldBucketId);
                
            }

        }
        
        
        
        return false;
    }

    
}