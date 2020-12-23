public class PigLatin {

	public static String pigLatinSimple(String s) {
		char p = s.charAt(0);
		if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u') {
			return (s+"hay");
		}
		return (s.substring(1, s.length())+s.substring(0,1)+"ay");
	}

	public static void main(String[] args) {
		System.out.println(pigLatinSimple("david"));
		System.out.println(pigLatinSimple("aaron"));
	}
}