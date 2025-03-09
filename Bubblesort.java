public class Bubblesort {


    public static void PrintArr(int arr [])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] arr={12,3,5,6,11,34,2};
        //bubble sort 
        for(int  i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
             // Swapping

             if(arr[j]>arr[j+1])
             {
             int temp=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;

             }

            }
        }

        PrintArr(arr);

    }
}
