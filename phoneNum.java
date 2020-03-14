import java.io.*;
import java.util.*;

public class phoneNum {
	public static void main(String[] args) {
		HashMap<String, String> phoneMap = new HashMap<String, String>();	
		Scanner scanner = new Scanner(System.in);

		try {
			Scanner fScanner = new Scanner(new FileReader("c:\\temp\\phone.txt"));
			while(fScanner.hasNext()) {
				String name = fScanner.next();
				String tel = fScanner.next();
				phoneMap.put(name, tel);
			}			
			fScanner.close();	
		} 
		catch (IOException e) {
			System.out.println("����� ����");
		}
		
		System.out.println("�� " + phoneMap.size() + "���� ��ȭ��ȣ�� �о����ϴ�.");

		while(true) {
			System.out.print("�̸�>> ");
			String name = scanner.nextLine(); // �̸� �Է�
			if(name.equals("�׸�"))
				break;
			String tel = phoneMap.get(name);
			if(tel == null) {
				System.out.println("ã�� �̸��� �����ϴ�.");			
			}
			else{
				System.out.println(tel);
			}
		}
		
		scanner.close();
	}
}
