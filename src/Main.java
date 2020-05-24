/**
 * summer projects for practice
 * Question: find the max consecutive 1s in an array
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explaination: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 * @author Nathaniel Monte de Ramos
 */
public class Main
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = { 1,1,0,1,1,1,0,1,1,1,1,1,1,1,1,1,0 };
		System.out.println(findMaxConsecutiveOnes(arr));
		
		int[] arr1 = { 1,0,1,0,0,0,1,1,1,1,1,1,1,1,0,0,1};
		System.out.println(findMaxConsecutiveOnes(arr1));
		

	}
	
    public static int findMaxConsecutiveOnes(int[] nums) 
    {
    	int count = 0;
    	int maxNum = 0;
    	
    	for(int i = 0; i < nums.length; i++) 
    	{
    		//base case if nums[i] == 1 then count is 1
    		if(nums[i] == 1) 
    		{
    			count++;
    		}
    		else
            {
                if(count > maxNum)
                {
                    maxNum = count;
                }
                if(maxNum >= nums.length / 2)
                {
                    return maxNum;
                }
                count = 0;
            }
    	}
    	
    	if(count < maxNum) 
    	{
    		return maxNum;
    	}
    	else 
    	{
    		return count;
    	}
    }
}
