import java.util.*;

public class PigLatin {

	public static boolean contains(String elem, String[] list){
		for (String x:list) {
			if (x.equals(elem)) {
				return true;
			}
		}
		return false;
	}

	public static String pigLatinSimple(String s) {
		char p = s.charAt(0);
		if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u') {
			return (s+"hay");
		}
		return (s.substring(1, s.length())+s.substring(0,1)+"ay");
	}


	public static String PigLatin(String s) {
		String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
		if (s.length()>=2 && contains(s.substring(0,2), digraphs)){
			return s.substring(2, s.length())+s.substring(0,2)+"ay";
		} else {
			return pigLatinSimple(s);
		}
	}


	public static String pigLatinBest(String s){
		String[] alphabet = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};		
		if (!contains(s.substring(0,1),alphabet)) {
			return s;
		}
		if (!contains(s.substring(s.length()-1),alphabet)) {
			return PigLatin(s.substring(0,s.length()-1)) + s.substring(s.length()-1);
		}
		return PigLatin(s);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			Scanner n = new Scanner(scanner.nextLine());
			while(n.hasNext()){
				String userInput = n.next();

				System.out.print(pigLatinBest(userInput.toLowerCase()) +" ");
			}
			System.out.println();
		}
	}
}


