public class SortedArray {
    public static void main(String[] args) {
        //int arr[]={23,54,33,21,4,76};
        int arr[]={1,2,34,65};
        if(arr[0]>arr[1])
        {
            System.out.println("Array is not sorted");
            return;
        }
        
        
        for(int i =1;i<arr.length;i++)
            {
                int curr=arr[i];
                int prev=arr[i-1];
                if(prev>curr)
                {
                    System.out.println("Array is not sorted");

                    return;
                }
                //System.out.println("Arrays is sorteed");
            
            }
            System.out.println("Arrays is sorteed");

        
    }
    
}
