import java.util.Arrays;
import java.util.Scanner;

public class Zadachi2
{
    public static void SumOfElementsOfArray(int[]arr1)
    {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++)
        {
            sum += arr1[i];
        }
        System.out.println("The sum of el is: " + sum);
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
        System.out.println("The sum of el is: " + sum1);
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
        System.out.println("The sum of el is: " + sum3);
    }
    public static void ReverseArray(int[] arr4)
    {
        int len = arr4.length;
        int[] b = arr4.clone();
        for(int i = 0; i < len / 2; i++)
        {
            int a = b[i];
            b[i] = b[len - i - 1];
            b[len - i - 1] = a;
        }
        System.out.println("Reversed array is: " + (Arrays.toString(b)));
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
    public static void SumOfFirstRow(int[][] arr1, int num)
    {
        int row1 = 0;
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if (arr1[i][j] == arr1[1][0])
                {
                    break;
                }
                row1 += arr1[i][j];
            }
        }
        System.out.println("Sum of row1: " + row1);
    }
    public static void SumOfSecondRow(int[][] arr1, int num) {

        int row2 = 0;
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {

                if (arr1[i][j] == arr1[0][1] || arr1[i][j] == arr1[0][0])
                {
                    row2 -= arr1[i][j];
                }
                row2 += arr1[i][j];
            }
        }
        System.out.println("Sum of row2: " + row2);
    }
    public static void SumOfDiagonal(int[][] arr1, int num)
    {
        int firstd = 0;
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if (i == j)
                {
                    firstd += arr1[i][j];
                }
            }
        }
        System.out.println("Sum if first diagonal is : " + firstd);
    }
    public static void EvenOrOdd(int a)
    {
        if (a % 2 == 0)
        {
            System.out.println("Number " + a + " is even");
        }
        else if (a % 2 != 0)
        {
            System.out.println("Number " + a + " is odd");
        }

    }
    public static void NegativeOrPositive(int a)
    {
        if(a < 0)
        {
            System.out.println("Number " + a + " is negative");
        }
        else
        {
            System.out.println("Number " + a + " is positive");
        }
    }

    public static void BiggerThen10(int a)
    {
        if(a < 10)
        {
            System.out.println("Number " + a + " is smaller then 10");
        }
        else
        {
            System.out.println("Number " + a + " is bigger then 10");
        }
    }

    static void ЕqualOrNot(int a, int b)
    {
        if(a == b)
        {
            System.out.println("Numbers " + a + " and " + b + " are equal");
        }
        else
        {
            System.out.println("Numbers " + a + " and " + b + " arent equal");
        }
    }
    public static void TrueOrFalse(int a)
    {
        boolean bool = true;
        for(int i = 2; i <= a/2; i++)
        {
            if(a % i == 0)
            {
                bool = false;
                break;
            }
        }
        System.out.println(bool);
    }



    static void SquareDrawing(int a)
    {
        System.out.println("The square is: ");
        for(int i = 1; i <= a; i++)
        {
            for(int j = 1; j <= a; j++)
            {
                System.out.print("* ");
            }
                System.out.print("\n");
        }
    }

    static void TriangleDrawing(int a)
    {
        System.out.println("The triangle is: ");
        for (int i = a; i >= 1; --i)
        {
            for (int j = 1; j <= i; ++j)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args)
    {

        int n = 3;
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

        int n1 = 5;
        int[] arr1 = new int[n1];
        System.out.println("Enter el :");
        for (int i = 0; i < n1; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.print("[");
        for (int i = 0; i < n1; i++)
        {
            System.out.print(arr1[i]);
            System.out.print(", ");
        }
        System.out.println("]");

        int arr2dim = 2;

        System.out.println("Enter elements of the 2d array: ");
        int[][] arr2d = new int[arr2dim][arr2dim];
        for (int row = 0; row < arr2dim; row++)
        {
            for (int colm = 0; colm < arr2dim; colm++)
            {
                arr2d[row][colm] = sc.nextInt();
            }
        }
        System.out.print("[ [ ");
        for (int row = 0; row < arr2dim; row++)
        {
            for (int colm = 0; colm < arr2dim; colm++)
            {
                int f = arr2d[row][colm];
                System.out.print(arr2d[row][colm]);
                if (f != arr2d[1][1])
                {
                    System.out.print(", ");
                }
                if (f == arr2d[0][1])
                {
                    System.out.println("]");
                    System.out.print("[ ");
                }
                if (f == arr2d[1][1])
                {
                    System.out.println("]");
                    System.out.print("[ ");
                }
            }
            System.out.println();
        }
        System.out.println("Enter a number to check if its even or odd, bigger then ten and if its prime number or not: ");
        int a1;
        a1 = sc.nextInt();

        System.out.println("Enter a number to check if its negative or positive: ");
        int a2;
        a2 = sc.nextInt();

        System.out.println("Enter a number to draw a square or triangle:  ");
        int a3;
        a3 = sc.nextInt();

        System.out.println("Enter two numbers to check if they are equal or not:  ");
        int a4, b4;

        System.out.println("First number: ");
        a4 = sc.nextInt();
        System.out.println("Second number:");
        b4 = sc.nextInt();

        SumOfElementsOfArray(arr);
        SumOfEvenElementsOfArray(arr);
        SumOfOddElementsOfArray(arr);
        ReverseArray(arr1);
        MinAndMaxOfArray(arr1);
        SumOfFirstRow(arr2d, arr2dim);
        SumOfSecondRow(arr2d, arr2dim);
        SumOfDiagonal(arr2d, arr2dim);
        EvenOrOdd(a1);
        NegativeOrPositive(a2);
        BiggerThen10(a1);
        TrueOrFalse(a1);
        ЕqualOrNot(a4, b4);
        SquareDrawing(a3);
        TriangleDrawing(a3);
    }
}
