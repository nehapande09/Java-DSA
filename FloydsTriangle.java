public class FloydsTriangle {
    public static void main(String[] args) {
        int val=1;
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(val +" ");
                val++;
            }
            System.out.println();
        }
    }
    
}
