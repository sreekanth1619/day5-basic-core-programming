package day5;

public class VowelConsonent {
public static void main(String[] args) {
	
	char ch='z';
	
	switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
	
			System.out.println(ch+ "the given word is vowel");
	        break;
	        default:
		System.out.println(ch+ "the given word is consonent");
	}
}
	
}

