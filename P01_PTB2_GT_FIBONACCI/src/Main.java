import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) { 
		int n, key;
		
		do {
			System.out.println("\n====CAC BAI TOAN====\n"
					+ "[1] Phuong trinh bac 2\n"
					+ "[2] Giai Thua\n"
					+ "[3] So Fibonacci\n"
					+ "[4] UCLN, BCNN\n"
					+ "[5] Liet Ke Cac So Nguyen To Nho Hon N\n"
					+ "[6] Liet Ke N So Nguyen To Dau Tien\n"
					+ "[7] Liet Ke Tat Ca Cac So Nguyen To Co 5 Chu So\n"
					+ "[8] Tinh Tong Cac Chu So Cua Mot So Nguyen N\n"
					+ "[9] So Thuan Nghich\n"
					+ "[10]Liet Ke So Fibonacci\n"
					+"");
			System.out.println("Chon chuong trinh: ");
			key = sc.nextInt();
			switch(key) {
				case 1:
					float a = 1, b = 2, c = 1;
					System.out.printf("a = %.2f, b = %.2f, c = %.2f\n", a, b, c);
					Basic.PTB2(a, b, c);
					break;
					
				case 2:
					n = 5;
					System.out.println(n+"! = " + Basic.GT(n));
					break;

				case 3:
					n = 10;
					System.out.println("F(" + n+ ") = " + Basic.Fi(n));
					break;

				case 4:
					long x = 3;
					long y = 4;
					System.out.println("UCLN(" + x + ", " + y+ ") = " + Basic.UCLN(x,y) );
					System.out.println("BCNN(" + x + ", " + y+ ") = " + Basic.BCNN(x,y) );
					break;

				case 5:
					n = 30;
					System.out.println("Liet ke so nguyen to nho hon " +n+": ");
					Basic.lietKeSNTBeHonN(n);
					break;

				case 6:
					n = 5;
					System.out.println("Liet ke "+n+" SNT dau tien: " );
					Basic.lietKeNSNTDauTien(n);
					break;

				case 7:
					System.out.println("Liet ke tat ca cac SNT co 5 chu so:");
					Basic.lietKeSNT5ChuSo();
					break;

				case 8:
					n = 12345;
					System.out.println("Tinh tong cac chu so cua so nguyen " + n + ": " + Basic.TONG(n));
					break;

				case 9:
					n = 111;
					System.out.println("Kiem tra tinh thuan nghich cua "+ n+" la: " + Basic.checkThuanNghich(n));
					break;

				case 10:
					n = 100;
					System.out.println("Liet ke so Fibonacci nho hon "+ n + " la SNT");
					Basic.lietKeSoFiNhoHonNLaSNT(n);
					break;
			}
		}
		
			while (true);
	
	}
}
