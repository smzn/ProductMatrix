package matrix;

import java.util.Arrays;

public class Matrix_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//２行２列同士
		//double a[][] = { { 1, 2 }, { -1, 1 } };
		//double b[][] = { { 3, -1 }, { 2, 1 } };
		
		//3行３列同士
		//double a[][] = { { -1, 0, 1 }, { -2, 1, 0 }, { 1, 0, -1 } };
		//double b[][] = { { 0, 2, -1 }, { 3, 1, 2 }, { 0, -1, 0 } };
		
		//２行３列・３行３列
		//double a[][] = { { 1, 3, 5 }, { 2, 4, 7 } };
		//double b[][] = { { -5, 8, 11 }, { 3, 9, 21 }, { 4, 0, 8 } };
		
		//３行２列・２行３列
		//double a[][] = { { 0, 1 }, { 2, 0 }, { 0, 3 } };
		//double b[][] = { { 1, -1, 2 }, { 3, 0, 4 } };
		
		//4行4列・4行4列
		double a[][] = { { 3, 1, 1, 2 }, { 5, 1, 3, 4 }, { 2, 0, 1, 0 }, { 1, 3, 2, 1} };
		double b[][] = { { 4, 0, 1, 8 }, { 1, 2, 0, 4 }, { 2, 1, 6, 0 }, { 0, 4, 1, 2} };
		
		//double a[][] = { { 1, -2, 1 }, { -1, 1, -1 }, { 2, -1, -2 } };
		//double b[][] = { { -4, 2, 2 } };
		
		Matrix_lib mlib = new Matrix_lib();
		System.out.println("Transpose = " + Arrays.deepToString(mlib.getTranspose(a)));
		System.out.println("Product = " + Arrays.deepToString(mlib.getProduct(a,b)));
		System.out.println("Cofactor = " + mlib.getCofactor(a));
		System.out.println("Inverse = 1 / "+mlib.getCofactor(a)+" "+ Arrays.deepToString(mlib.getInverse(a)));
	}

}
