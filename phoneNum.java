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
			System.out.println("입출력 오류");
		}
		
		System.out.println("총 " + phoneMap.size() + "개의 전화번호를 읽었습니다.");

		while(true) {
			System.out.print("이름>> ");
			String name = scanner.nextLine(); // 이름 입력
			if(name.equals("그만"))
				break;
			String tel = phoneMap.get(name);
			if(tel == null) {
				System.out.println("찾는 이름이 없습니다.");			
			}
			else{
				System.out.println(tel);
			}
		}
		
		scanner.close();
	}
}
