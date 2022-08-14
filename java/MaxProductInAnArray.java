import java.util.Random;


public class MaxProductInAnArray{


    public static void printArray(int[] nums){
       
        for(int i=0; i< nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args){

        Random rand = new Random();
        int[] nums = new int[10];

        for(int i=0;i<nums.length;i++){

            nums[i]=(rand.nextInt(65536)-32768);
        }

		printArray(nums);

        int min_ending_here = nums[0];

        int max_ending_here = nums[0];

        int max_so_far = nums[0];

		
        for(int i=1; i<nums.length;i++){

            // find the max number in between nums[i], nums[i]*max_ending_here, nums[i]*min_ending_here
            int temp = Math.max(Math.max(nums[i], nums[i]*max_ending_here), nums[i]*min_ending_here);

            //find the min number in between nums[i], nums[i]*max_ending_here, nums[i]*min_ending_here by handling zeros
            if(nums[i] == 0){
                max_ending_here=0;
            }else{
                min_ending_here = Math.min(Math.min(nums[i], nums[i]*max_ending_here), nums[i]*min_ending_here);
            }

            //replace max
            max_ending_here=temp;

            max_so_far = Math.max(max_so_far,max_ending_here);
        }

        System.out.println( max_so_far );
    }

}