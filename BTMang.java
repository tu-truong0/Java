package chap02_OOP;

import java.util.Scanner;

public class BTMang {
	static Scanner scanner = new Scanner(System.in);

	/*
	 * Nhap mang
	 * 
	 * @return Mang da nhap
	 */
	public static float[] NhapMang() {
		int n;
		float mang[];
//			Scanner sc = new Scanner(System.in); 
		System.out.println("Nhap n = ");
		n =  Integer.parseInt(scanner.nextLine());
		mang = new float[n];
		for (int i = 0; i < mang.length; i++) {
			System.out.printf("Mang[%d]= ", i);
			mang[i] = Float.parseFloat(scanner.nextLine());;
		}
		return mang;
	}

	/*
	 * Xuất dữ liệu của mảng ra màn hình
	 */
	public static void XuatMang(float mang[]) {
		System.out.println("Mang: ");
		for (int i = 0; i < mang.length; i++) {
			System.out.printf("%.2f\t", mang[i]);
		}
	}

	/*
	 * Tổng các phần tử trong mảng
	 * 
	 * @param mang Mảng cần tính tổng
	 */
	public static float TongMang(float mang[]) {
		float S = 0;
		for (int i = 0; i < mang.length; i++) {
			S += mang[i];
		}
		return S;
	}

	static float min(float mang[]) {
		float m = Float.MAX_VALUE;
		for (int i = 0; i < mang.length; i++)
			if (m > mang[i])
				m = mang[i];
		return m;
	}

	static float max(float mang[]) {
		float m = Float.MIN_VALUE;
		for (int i = 0; i < mang.length; i++)
			if (m < mang[i])
				m = mang[i];
		return m;
	}

	static float average(float mang[]) {
		return TongMang(mang) / mang.length;
	}

	public static float[] MinMaxAverage(float mang[]) {
		float arr[];
		arr = new float[3];
		arr[0] = min(mang);
		arr[1] = max(mang);
		arr[2] = average(mang);
		return arr;
	}

	public static int[][] NhapMaTran() {
		int soDong, soCot;

		System.out.println("Nhap vao so dong cua mang: ");
		soDong = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap vao so cot cua mang: ");
		soCot =  Integer.parseInt(scanner.nextLine());

		int[][] A = new int[soDong][soCot];

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("Nhap phan tu thu [" + i + ", " + j + "]: ");
				A[i][j] =  Integer.parseInt(scanner.nextLine());
			}
		}
		return A;
	}

	public static void XuatMaTran(int[][] mt) {
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[0].length; j++) {
				System.out.print(mt[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] CongMaTran(int[][] mt1, int[][] mt2) {

		int m, n;
		m = mt1.length;
		n = mt1[0].length;
		int SumMatrix[][] = new int[m][n];
		for (int i = 0; i < SumMatrix.length; i++) {
			for (int j = 0; j < SumMatrix[0].length; j++) {
				SumMatrix[i][j] = mt1[i][j] + mt2[i][j];
			}
		}
		return SumMatrix;
	}

	public static void main(String[] args) {
		
		float[] mang = NhapMang();
		XuatMang(mang);
		System.out.println("\nTong mang S = " + TongMang(mang));
		float[] arr = MinMaxAverage(mang);
		System.out.println("Min: " + arr[0]);
		System.out.println("Max: " + arr[1]);
		System.out.println("Average: " + arr[2]);

		int[][] matrix1 = NhapMaTran();
		int[][] matrix2 = NhapMaTran();
		int[][] SMatrix;
		System.out.println("Tong 2 matran 1 va 2:");
		SMatrix = CongMaTran(matrix1, matrix2);
		XuatMaTran(SMatrix);
	}

}
