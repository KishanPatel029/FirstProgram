package miit100programs;

public class Consonant 
{
public static void main(String[]args) {
	char ch = 'k';
	switch (ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println(ch + "is vowel");
		break;
		default:
			System.out.println(ch + "is consonant");
	}
}
}
