package java20180518;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> arr = new ArrayList<>();
		boolean btn = true;
		
		System.out.print("<<Soja Club>>");
		
		while(btn) {
			System.out.print("[1]���� [2]���� [3]��� [4]���� >>");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("==ȸ������==");
				System.out.print("�̸� : ");
				String input_name = sc.next();
				System.out.print("�ַ� : ");
				int input_soju = sc.nextInt();
				System.out.println(input_name+"���� �߰��Ǿ����ϴ�.");
				System.out.println();
				
				Person pr = new Person(input_name, input_soju);
				arr.add(pr);
				break;
			case 2:
				
				break;
			case 3:
				break;
			case 4 :
				btn = false;
				break;

			default:
				break;
			}
		}
		


	}

}
