import com.sun.source.util.SourcePositions;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Zadacha1
{

        public static void SumOfElementsOfArray(int[]arr1)
        {
            int sum = 0;
            for (int i = 0; i < arr1.length; i++)
            {
                sum += arr1[i];
            }
            System.out.println("The sum of elements is: " + sum);

        }
    public static void SumOfEvenElementsOfArray(int[] arr2)
    {
        int sum1 = 0;
        for (int i = 0; i < arr2.length; i++)
        {
            if(arr2[i] % 2 == 0)
            {
                sum1 += arr2[i];
            }
        }
        System.out.println("The sum of even elements is: " + sum1);
    }
    public static void SumOfOddElementsOfArray(int[] arr3)
    {
        int sum3 = 0;
        for (int i = 0; i < arr3.length; i++)
        {
            if(arr3[i] % 2 != 0)
            {
                sum3 += arr3[i];
            }
        }
        System.out.println("The sum of odd elements is: " + sum3);
    }
    // mislq da ne obqsnqvam vsichko, koeto sum pisal, a samo neshtata koito mislq,
    //che sa si za obqsnqvane
    public static void ReverseArray(int[] arr4)
    {
        int len = arr4.length;
        int[] b = arr4.clone();
        for(int i = 0; i < len / 2; i++) { //tuk vzimam samo polovinata duljina na
            int a = b[i];                  //masiva zashtoto samo tolkova ni trqbva, za da go oburnem
            b[i] = b[len - i - 1];//pri purvoto zavurtane tuk smenqm mestata na purvi i go slagam na posledno mqsto, a na vtoroto shte budat 2 i 4 element
            b[len - i - 1] = a;// a tuk slagam posledniq element na ourvo mqsto
            //sredniq element si sedi na mqstoto
        }
        System.out.println("The reversed array is: " + (Arrays.toString(b)));

    }

    public static void MinAndMaxOfArray(int[] arr5)
    {
        int min = arr5[0], max = 0;
        int[] arr4 = new int[2];
        for(int i = 0; i < arr5.length; i++)
        {
            if(arr5[i] > max)
            {
                max = arr5[i];
            }
        }
        arr4[0] = max;
        for(int i = 0; i < arr5.length; i++)
        {
            if(arr5[i] < min)
            {
                min = arr5[i];
            }

        }
        arr4[1] = min;
        System.out.print("Max is: " + arr4[0]);
        System.out.print(" / ");
        System.out.println("Min is: " + arr4[1]);
    }

    public static void TrueOrFalse(int a)
   {
       boolean bool = true;
       for(int i = 2; i <= a/2; i++){
           if(a % i == 0){
               bool = false;
               break;
           }
       }
       System.out.println(bool);
   }

    public static void PyramidDrawing(int a)
    {
        int b = 0;
        for (int i = 1; i <= a; ++i, b = 0) {
            for (int j = 1; j <= a - i; ++j) {
                System.out.print("  ");
            }

            while (b != 2 * i - 1) {
                System.out.print("* ");
                ++b;
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void SumOfDiagonals(int[][] arr2d1, int num)
    {
        int firstd = 0, secondd = 0;
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if (i == j) { // tova e glavni diagonal na matricata kato diagonalite sa [0][0], [1][1]... za tova tursq ravenstvo
                    firstd += arr2d1[i][j];
                }
                if ((i + j) == (num - 1)) { // obratniq diagolan e [0][2], [1][1]... i ako smetnem 0 + 2 == 3 - 1 poluchavame drugiq diagonal
                    secondd += arr2d1[i][j];
                }
            }
        }
        System.out.println("Sum of diagonals is: " + (firstd + secondd));//sbor
    }

        public static void SumOfDiagonals2(int[][] arr2d, int N)
        {
            int firstd1 = 0, secoundd1 = 0;
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                {                             //sushtoto samo kudeto vadq sredniq element ot smetkata za glavniq diagonal po malko murzeliv
                                             // nachin ama e 2 chasa preznoshtta i me murzi malko nqma da luja
                    if (i == j)
                    {
                        firstd1 += arr2d[i][j];
                        if(arr2d[i][j] == arr2d[1][1])
                        {
                            firstd1 -= arr2d[1][1];
                        }
                    }
                    if ((i + j) == (N - 1))
                    {
                        secoundd1 += arr2d[i][j];
                    }
                }
            }

            System.out.println("Sum of diagonals is: " + (firstd1 + secoundd1));
        }
        public static void main (String[]args)
        {
            int n = 5;
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[n];
            System.out.println("Enter el :");
            for (int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.print("[");
            for (int i = 0; i < n; i++)
            {
                System.out.print(arr[i]);
                System.out.print(", ");
            }
            System.out.println("]");
            System.out.println("Enter a number: ");
            int a1, arr2dim = 3;
            a1 = sc.nextInt();
            System.out.println("Enter el of the 2d array: ");
            int[][] arr2d = new int[arr2dim][arr2dim];
            for (int row = 0; row < arr2dim; row++)
            {
                for (int colm = 0; colm < arr2dim; colm++)
                {
                    arr2d[row][colm] = sc.nextInt();
                }
            }
            //tuk malko si igraq s printovete
            System.out.print("[ [ ");
            for (int row = 0; row < arr2dim; row++)
            {
                for (int colm = 0; colm < arr2dim; colm++)
                {
                    int f = arr2d[row][colm];
                    System.out.print(arr2d[row][colm]);
                    if (f != arr2d[2][2])
                    {
                        System.out.print(", ");
                    }
                    if (f == arr2d[0][2])
                    {
                        System.out.println("]");
                        System.out.print("[ ");
                    }
                    if (f == arr2d[1][2])
                    {
                        System.out.println("]");
                        System.out.print("[ ");
                    }
                    if (f == arr2d[2][2])
                    {
                        System.out.println(" ] ]");
                    }
                }
            }
            SumOfElementsOfArray(arr);
            SumOfEvenElementsOfArray(arr);
            SumOfOddElementsOfArray(arr);
            ReverseArray(arr);
            MinAndMaxOfArray(arr);
            TrueOrFalse(a1);
            PyramidDrawing(a1);
            SumOfDiagonals(arr2d, arr2dim);
            SumOfDiagonals2(arr2d, arr2dim);
        }

}

