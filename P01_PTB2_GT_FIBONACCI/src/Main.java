public class Main {

	public static void main(String[] args) { 
		float a = 1, b = 2, c = 1;
		int n = 121;
		int x = 5, y = 15;

//		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Nhap a = ");
//		a = sc.nextFloat();
//		
//		System.out.print("Nhap b = ");
//		b = sc.nextFloat();
//		
//		System.out.print("Nhap c = ");
//		c = sc.nextFloat();
		System.out.printf("a = %.2f, b = %.2f, c = %.2f\nn = %d\nx = %d, y = %d\n", a, b, c, n, x, y);
		System.out.println("--------Chuong trinh giai PT bac 2--------");
		Basic.PTB2(a, b, c);
//		
//		System.out.print("Nhap n = ");
//		n = sc.nextInt();
//		sc.close();
		System.out.println("--------Chuong trinh tinh n!--------");
		System.out.println(n + "! = " + Basic.GT(n));
		
		System.out.println("--------Chuong trinh tinh FIBONACC so thu n--------");
		System.out.println("fibo(" +n+") = " + Basic.Fi(n));
		
		System.out.println("--------Uoc chung lon nhat cua x va y--------");
		System.out.printf("UCLN(%d, %d) = %d\n", x,y, Basic.DQ_UCLN(x, y));
		
		System.out.println("--------Boi chung nho nhat cua x va y--------");
		System.out.printf("BCNN(%d, %d) = %d\n", x,y, Basic.BCNN(x, y));
		
		System.out.println("--------In ra n so nguyen to dau tien--------");
		Basic.Cau6(n);
		
		System.out.println("--------Tinh tong cac chu so cua mot so nguyen n--------");
		System.out.printf("S = %d\n", Basic.Cau8(n));
		
		System.out.println("--------Kiem tra tinh chat thuan nghich cua n--------");
		System.out.println(" co phai la so thuan nghich ?" + Basic.checkThuanNghich(n));
		/*
		 * 10. Nhap so tu nhien n. Hay liet ke cac so Fibonacci nho hon n la so nguyen to.
		 * 11. VCT tong hop nham giai cac bai toan tren, bang cach xay dung giao dien chuong trinh nhu sau
		 * [1] Phuong trinh bac 2
		 * [2] Giai thua
		 * [10]...
		 * */
	}
	
	
	
}