package character.select;

import java.util.Scanner;

import character.ashe.Lulu;
import charater.janna.Janna;

public class SelectCharacter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String selectingCharacters = sc.nextLine();

		switch (selectingCharacters) {
		case "janna":
			new Janna().main(args);
			break;

		case "lulu":
			new Lulu().main(args);
			break;
		}
	}
}
