
//https://leetcode.com/problems/container-with-most-water
class ContainerWithMostWater {

    public int maxArea(int[] height) {
        
        int i=0;
        
        int j=height.length-1;
        int max_area=0;
        
        
        while(i < j){
            int h = Math.min(height[i],height[j]);
            int width = j-i;
             max_area= Math.max(max_area,width*h);
             if(height[i]>=height[j]){
                 j--;
             }else{
                 i++;
             }
        }
       
        return max_area;
       
    }
}