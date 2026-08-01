public class Spiral_Matrix {
    static void spiral_matrix_traversal(int[][] arr)
    {
        int top=0;
        int right=arr[0].length-1;
        int bottom=arr.length-1;
        int left=0;

        for(int i=top;i<bottom;i++)
        {
            System.out.print(arr[top][i]+" ");
        }

       for(int i=left;i<=right;i++)
       {
           System.out.print(arr[i][right]+" ");
       }

       for(int i=bottom-1;i>=top;i--)
       {
           System.out.print(arr[bottom][i]+" ");
       }

       for(int i=top+1;i<bottom;i++)
       {
           System.out.print(arr[i][left]+" ");
       }


    }
    public static void main(String[] args) {
        int [][]arr={{1,2,3},
                {4,5,6},
                {7,8,9}};
        spiral_matrix_traversal(arr);
    }
}
