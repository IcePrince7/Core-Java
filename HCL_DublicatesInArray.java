import java.util.HashMap;
import java.util.Scanner;

public class HCL_DublicatesInArray {

	public static void main(String[] args) {

		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String TEMP = Ask.nextLine();
		// int Num =Integer.parseInt(TEMP);
		Ask.close();

		int count;
		HashMap<Character, Integer> dublicates = new HashMap<>();
		for (int i = 0; i < TEMP.length() - 1; i++) {
			for (int j = i + 1; j <= TEMP.length() - 1; j++) {
				if (TEMP.charAt(i) == TEMP.charAt(j) && TEMP.charAt(i) != ' ') {
					if (dublicates.containsKey(TEMP.charAt(i))) {
						count = dublicates.get(TEMP.charAt(i));
						dublicates.put(TEMP.charAt(i), count + 1);
					} else
						dublicates.put(TEMP.charAt(i), 1);
				}
			}

		}
		System.out.println("The dublicates : " + dublicates);
	}
}
