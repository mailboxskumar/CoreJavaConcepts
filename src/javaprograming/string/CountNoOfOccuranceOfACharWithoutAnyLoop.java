package javaprograming.string;

public class CountNoOfOccuranceOfACharWithoutAnyLoop {
	
	static String s = "java is a java again java what is java";
	
	static char c = 'a';

	public static void main(String[] args) {
		
		int occurance = s.replaceAll("[//s+]", "").split("a").length;
		System.out.println(occurance);
		int occ = s.length() - s.replace("a", "").length();
		System.out.println(occ);

	}

}
