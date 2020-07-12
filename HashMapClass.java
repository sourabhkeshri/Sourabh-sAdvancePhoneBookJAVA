import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> phoneBook=new HashMap<>();
		phoneBook.put("sourabh","9304275915");
		phoneBook.put("gaurav", "9661638813");
		phoneBook.put("choti", "9852015181");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("\nHello tell me any name:");
			String name=sc.next();
			if(phoneBook.containsKey(name))	System.out.println("\nMob:"+phoneBook.get(name));
			else if(name.equalsIgnoreCase("all")||name.equalsIgnoreCase("ALL")) {
				for(Map.Entry<String, String> entry:phoneBook.entrySet()) {
					System.out.println(entry.getKey()+" "+entry.getValue());
				}
			}
			else {System.out.println("add this number to phoneBook");
			String number=sc.next();
			phoneBook.put(name, number);
			System.out.println("Added!");
			}
		}
		
	}

}
