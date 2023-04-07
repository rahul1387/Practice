public class PracticeSet6 {
    public static void main(String[] args) {

        //Question1
        /*float [] marks ={12.3f,96.3f,63.7f,59.9f,100.0f};
        float sum = 0;
        for (float element:marks)
        {
            sum = sum+element;
        }
        System.out.print("The sum of these values are: " +sum);
         */

        //Question2
        /*float [] marks ={12.3f,96.3f,63.7f,59.9f,100.0f};
        float num = 59.9f;
        boolean isInArray = false;

        for (float element:marks)
         {
            if (num==element)
            {
                isInArray=true;
                break;
            }
        }
        if (isInArray)
        {
            System.out.println("The number is present in the array");
        }
        else
        {
            System.out.println("The number is not present in the array");
        }
        */

        //Question3

       /* float [] marks ={12.3f,96.3f,63.7f,59.9f,100.0f};
        float sum = 0;

        for (float element:marks)
        {
            sum = sum+element;
        }
        System.out.print("The average of these values is: " +sum/marks.length);
        */

        //Question4

        /*
        int [][] mat1 = {{1,2,3},

                         {4,5,6}};
        int [][] mat2 = {{2,6,9},
                         {8,7,4}};
        int [][] result = {{0,0,0},
                         {0,0,0}};

        for (int i = 0; i<mat1.length; i++ )
        {
            for (int j = 0; j<mat1[i].length; j++)
            {
                System.out.format("Setting the value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j]+mat2[i][j];
            }
        }

        //Printing the elements of a 2-D Array
        for (int i = 0; i<mat1.length; i++) //row number of times
        {
            for (int j = 0; j<mat1[i].length; j++) //column number of times
            {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j]+mat2[i][j];
            }
            System.out.println("");
        }
         */

        //Question5

       /* int [] arr={1,2,3,4,5,6};
        int l = arr.length;
        int n =Math.floorDiv(arr.length,2);
        int temp;

        for (int i=0; i<n; i++)
        {
            //swap  a[i] and a[l-1-i]

            temp = arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element:arr)
        {
            System.out.print(element +", ");

        }
        */
        //Question6
        /*int [] arr = {1,2,3,4,5,655};
        int max = Integer.MAX_VALUE;

        for (int e:arr)
        {
            if (e>max)
            {
                max = e;
            }
        }
        System.out.println("The value of maximum element in the array is: "+max);
         */


        //Question7
        /*int [] arr = {-1,2,3,4,5,-655};
        int min = Integer.MIN_VALUE;

        for (int e:arr)
        {
            if (e<min)
            {
                min = e ;
            }
        }
        System.out.println("The value of minimum element in the array is: "+min);
         */

        //Question8

        boolean IsSorted = true;
        int []arr={1,2,3,4,5};
        for (int i=0; i<arr.length-1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                    IsSorted=false;
                    break;
            }
        }
        if (IsSorted)
        {
            System.out.println("The Array is Sorted");
        }
        else
        {
            System.out.println("The Array is not Sorted");
        }

    }
}
