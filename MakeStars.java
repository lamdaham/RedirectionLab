import java.util.*;

public class MakeStars {
	public static String stars(String x) {
		String output = "";
		for(int i = 0; i<x.length(); i++) {
			output += "*";
		}
		return output;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			Scanner n = new Scanner(scanner.nextLine());
			while(n.hasNext()){
				String userInput = n.next();

				System.out.print(stars(userInput) +" ");
			}
			System.out.println();
		}
	}
}