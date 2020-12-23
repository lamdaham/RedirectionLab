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
		if (contains(s.substring(0,2), digraphs)){
			return s.substring(2, s.length())+s.substring(0,2)+"ay";
		} else {
			return pigLatinSimple(s);
		}
	}

	public static void main(String[] args) {
		System.out.println(PigLatin("check"));
		System.out.println(PigLatin("skee!"));
		System.out.println(PigLatin("emu"));
	}
}


