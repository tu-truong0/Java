package bai1;

import java.util.Scanner;

public class BTMang {

		/*
		 * Nhap mang
		 * @return Mang da nhap*/
	public static float[] NhapMang(){
		int n;
		float mang[];
		Scanner sc = new Scanner(System.in); 
		System.out.println("Nhap n = ");
		n = sc.nextInt();
		mang = new float[n];
		for (int i = 0; i < mang.length; i++) {
			System.out.printf("Mang[%d]= ",i);
			mang[i] = sc.nextFloat();
		}
		sc.close();
		return mang;
	}
	/*
	 * Xuất dữ liệu của mảng ra màn hình*/
	public static void XuatMang(float mang[]) {
		System.out.println("Mang: ");
		for (int i = 0; i < mang.length; i++) {
			System.out.printf("%.2f\t", mang[i]);
		}
	}
	/*
	 * Tổng các phần tử trong mảng
	 * @param mang Mảng cần tính tổng*/
	public static float TongMang(float mang[]) {
		float S = 0;
		for (int i = 0; i < mang.length; i++) {
			S+=mang[i];
		}
		return S;
	}
	public static float[] MinMaxAverage(float mang[]) {
		float arr[];
		arr = new float[3];  
		float min = mang[0], max = mang[0], s = mang[0], d = 1;
		for (int i = 1; i < mang.length; i++) {
			if (min>mang[i])	min=mang[i];
			if (max<mang[i])	max = mang[i];
			s+=mang[i];
			d ++;
		}
		arr[0] = min; arr[1] = max; arr[2] = s/d;
		return arr;
	}
	public static int[][] CongMaTran(int [][] mt1, int [][] mt2){
	
		int m,n;
		m = mt1.length; n = mt1[0].length;
		int SumMatrix[][] = new int [m][n];
		for (int i = 0; i < SumMatrix.length; i++) {
            for (int j = 0; j < SumMatrix[0].length; j++) {
            	SumMatrix[i][j] = mt1[i][j] + mt2[i][j]; 
            	}
            }
		return SumMatrix;
	}
	
	public static void main(String[] args) {
		float []mang = NhapMang();
		XuatMang(mang);
		System.out.println("Tong mang S = " + TongMang(mang));
		float []arr = MinMaxAverage(mang);
		System.out.println("Min: " + arr[0]);
		System.out.println("Max: " + arr[1]);
		System.out.println("Average: " + arr[2]);
		
		int[][] matrix1 = {
		         { 1, 2, 3 },
		         { 4, 5, 6 },
		         { 7, 8, 9 }
		      };
		int[][] matrix2 = {
		         { 1, 2, 3 },
		         { 4, 5, 6 },
		         { 7, 8, 9 }
		      };
		int [][] SMatrix;
		System.out.println("Tong 2 matran 1 va 2:");
		SMatrix = CongMaTran(matrix1, matrix2);
		 for (int i = 0; i < SMatrix.length; i++) {
             for (int j = 0; j < SMatrix[0].length; j++) {
                         System.out.print(SMatrix[i][j]+" ");
             }
             System.out.println();
	}
}
}
