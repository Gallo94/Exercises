/**
 * Scrivere un programma che concateni ad una stringa i primi
 * cinque caratteri di una seconda stringa immessa dall'utente
 * Exercise N°4, pag. 262
 */

import java.util.Scanner;
public class ConcatString {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Insert first string: ");
		String string1 = in.nextLine();
		System.out.println("Insert second string: ");
		String string2 = in.nextLine();
		System.out.println("Concat string: " + string1.concat(string2.substring(0, 5)));
	}
}
