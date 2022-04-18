package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SinhVien arr[] = new SinhVien[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new SinhVien(null, i, null, null, i);
			System.out.println(" Nhập Sinh Viên Thứ : " + (i+1));
			arr[i].name = sc.nextLine();
			arr[i].old = sc.nextInt();
			sc.nextLine();
			arr[i].adress =sc.nextLine();
			sc.nextLine();
			arr[i].sdt =sc.nextLine();
			sc.nextLine();
			arr[i].dtb=sc.nextFloat();
			sc.nextLine();
			}
			System.out.println("---------------------------");
			
			for (int i = 0; i < arr.length; i++) {
				SinhVien p = arr[i];
				
			}
			}
}