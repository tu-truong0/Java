
public class Basic {
public static final String lietKeSNT5ChuSo = null;

	// Bai1
	static void PTB2(float a, float b, float c) {
		float delta = b*b - 4*a*c;
		if (delta < 0) {
			System.out.println("PT vo nghiem");
		}
		else if (delta == 0) {
			float x = -b/(2*a);
			System.out.println("PT co 1 nghiem kep la: x = " + x);
			}
		else {
			float x1 = (float)(-b-Math.sqrt(delta))/(2*a);
			float x2 = (float)(-b+Math.sqrt(delta))/(2*a);
			System.out.println("PT co 2 nghiem phan bien");
			// String.format 
			String s= String.format("Nghiem cua PT la: x1 = %f, x2 = %f", x1, x2);
			System.out.println(s);
		}
		}
	
// Bai2
	static long GT (int n) {
		if (n<=1)	{
			return 1;
		}
		else {
			return n * GT(n-1);
		}
	}
	
	static long DQ_GT (int n) {
		long gt = 1;
		for (int i = 1; i <= n; i++)
			gt *= i;
		return gt;
	}
	
// Bai3
	static long DQ_Fi(int n) {
		if (n==0 || n== 1) return 1;
		else {
			return DQ_Fi(n-1) + DQ_Fi(n-2);
		}
	}
	static long Fi(int n) {
		long F0 = 0, F1 = 1, F = 0; 
		for (int i = 2; i <= n; i++) {
			F = F0 + F1;
			F0 = F1;
			F1 = F;
		}
		return  F;
	}
// Bai4
	static long UCLN(long a, long b) {
		while (a!=b) {
			if (a>b)	a -= b;
			else 		b -=a;
		}
		return a;
	}
	static long DQ_UCLN(long a, long b) {
		if (a==b) 	
			return a;
		if (a>b)	
			return DQ_UCLN(a-b, b);
		else		
			return DQ_UCLN(a, b-a);
	}
// Bai5	
	static long BCNN(long a, long b) {
		return a*b/DQ_UCLN(a, b);
	}

// Bai6
	static boolean checkSNT(long x) {
		if (x <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(x); i++)
			if (x % i == 0)	
				return false;
		return true;
	}

	static void lietKeNSNTDauTien(int n) {
		String s = "";
		int d = 0; 
		long number = 2;
		while (d<n) {
			if (checkSNT(number)) {
				s = s + number +" ";
				d++;
			}
			number++;
		}
		System.out.println(s);
	}
	
// Bai7
	static void lietKeSNT5ChuSo(){
		String s = ""; int d = 0;
		for (long i = 10000; i<= 99999; i++)
			if (checkSNT(i))	{
				d++;
				s= s+ i+ " ";
				if (d%10==0)	s = s+"\n";
			}
		System.out.println(s);
	}
	
// Bai8	
	static long TONG(int n) {
		int S = 0;
		while (n != 0) {
			S = S + (n%10);
			n /= 10;
		}
		return S;
	}
	
// Bai9
	static long daoSo(int n) {
		long s = 1;
		while (n!=0) {
			s = s*10 + (n%10);
			n /= 10;
		}
		return s;
	}
	
	static boolean checkThuanNghich(int n) {
		return n == daoSo(n);
	}


// Bai10
	static void lietKeSoFiNhoHonNLaSNT(int n) {
		long F0 = 0, F1 = 1, F = 0;
		String s = "";
		for (int i = 2; i <= n && F<n; i++) {
			F = F0 + F1;
			F0 = F1;
			F1 = F;
			if (checkSNT(F)) s = s + F + " ";
		}
		System.out.println(s);
	}
}
