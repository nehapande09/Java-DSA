public class MaxMinArr {
    public static void main(String[] args) {
        int arr[]={23,76,54,34,98,11,98};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++) 

        {
            if (min>arr[i])
            {
                min= arr[i];
            }
        }
        System.out.println("Minimum from above array is " +min);

        for(int i=0;i<arr.length;i++) 

        {
            if (max<arr[i])
            {
                max= arr[i];
            }
        }
        System.out.println("Maximum from above array is "+max);

    }
    
}
