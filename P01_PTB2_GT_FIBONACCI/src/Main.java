import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		float a, b, c;
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------Chuong trinh giai PT bac 2--------");

		System.out.print("Nhap a = ");
		a = sc.nextFloat();
		
		System.out.print("Nhap b = ");
		b = sc.nextFloat();
		
		System.out.print("Nhap c = ");
		c = sc.nextFloat();

		
		Main.PTB2(a, b, c);
		
		Main m = new Main();
		System.out.print("Nhap n = ");
		n = sc.nextInt();
		sc.close();
		
		System.out.println("--------Chuong trinh tinh n!--------");
		System.out.println(n + "! = " + m.GT(n));
		
		System.out.println("--------Chuong trinh tinh FIBONACC so thu n--------");
		System.out.println("fibo(" +n+") = " + m.fibo(n));
		
	}
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
			// Dùng String.format 
			String s= String.format("Nghiem cua PT la: x1 = %f, x2 = %f", x1, x2);
			System.out.println(s);
		}
		}
	
	long GT (int n) {
		if (n<=1)	{
			return 1;
		}
		else {
			return n * GT(n-1);
		}
	}
	
	long fibo(int n) {
		if (n==0 || n== 1) return 1;
		else {
			return fibo(n-1) + fibo(n-2);
		}
	}
}