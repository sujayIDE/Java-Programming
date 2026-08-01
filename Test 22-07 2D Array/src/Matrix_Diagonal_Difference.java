public class Matrix_Diagonal_Difference {
    static void diagonal_difference(int arr[][]) {
        int sum1=0;
        //one diagonal
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i] == arr[j]) {
                    sum1+=arr[i][j];
                }

            }
        }

        int sum2=0;
        ///second diagonal
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i+j==arr.length-1)
                {
                    sum2+=arr[i][j];
                }
            }
        }
        int difference=-(sum1-sum2);
        System.out.println(difference);
    }


    public static void main(String[] args) {
        int[][]arr= {{11,2,4,},
                      {4,5,6},
                      {10,8,-12}};

        diagonal_difference(arr);
    }
}
