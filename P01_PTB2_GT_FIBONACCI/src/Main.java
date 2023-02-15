import java.util.Scanner;
public class Main {

	public static void main(String[] args) { 
		int n, key;
		Scanner sc = new Scanner(System.in);
		System.out.println("[1] Phuong trinh bac 2\n"
				+ "[2] Giai Thua\n"
				+ "[3] So Fibonacci\n"
				+ "[4] UCLN, BCNN\n"
				+ "[5] Liet Ke Cac So Nguyen To Nho Hon N\n"
				+ "[6] Liet Ke N So Nguyen To Dau Tien\n"
				+ "[7] Liet Ke Tat Ca Cac So Nguyen To Co 5 Chu So\n"
				+ "[8] Tinh Tong Cac Chu So Cua Mot So Nguyen N\n"
				+ "[9] So Thuan Nghich\n"
				+ "[10]Liet Ke So Fibonacci\n"
				+ "[0] Thoat\n"
				+"");
		
		do {
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
					break;

				case 5:
					break;

				case 6:
					break;

				case 7:
					break;

				case 8:
					break;

				case 9:
					break;

				case 10:
					break;
				
					
					
			}
		}
			while (key == 0);
	
	sc.close();
	}
}
	
	
