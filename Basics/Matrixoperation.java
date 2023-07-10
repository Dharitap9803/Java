//14.Perform addition and multiplication of two matrix.
import java.util.Scanner;
import java.util.*;

class Matrixoperation
{
	public static int[][] addMatrices(int[][] matrix1, int[][] matrix2)
	{
		int rows = matrix1.length;
		int columns = matrix1[0].length;
		int[][] result = new int[rows][columns];


		for(int i =0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return result;
	}


	public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2)
	{
		int rows1 = matrix1.length;
		int columns1= matrix1[0].length;
		int columns2= matrix2[0].length;
		int[][] result = new int[rows1][columns2];


		for(int i =0;i<rows1; i++)
		{
			for(int j= 0;j<columns2; j++)
			{
				for(int k=0;k<columns1; k++)
				{
					result[i][j]  += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		return result;
	}

	public static void printMatrix(int[][] matrix)
	{
		int rows = matrix.length;
		int columns = matrix[0].length;

		for(int i=0;i<rows;i++)
		{
			for(int j=0; j<columns; j++)
			{
				System.out.print(matrix[i][j]+"");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		int[][] matrix1={{10,20,30},{50,60,70},{7,8,9}};
		int[][] matrix2={{4,5,6},{5,6,7},{11,33,44}};



		System.out.println("Matrix 1:");
		printMatrix(matrix1);

		System.out.println("Matrix 2:");
		printMatrix(matrix2);

		System.out.println("Matrix Addition:");
		int[][] additionResult = addMatrices(matrix1,matrix2);
		printMatrix(additionResult);

		System.out.println("Mtrix Multiplication:");
		int[][] multiplicationResult = multiplyMatrices(matrix1,matrix2);
		printMatrix(multiplicationResult);
	}

}
