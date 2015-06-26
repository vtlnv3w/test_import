package character.ashe;

import java.util.Scanner;

import utils.Key;
import character.Character;

public class Lulu implements Character {
	public static void main(String[] args) {

		Key setKey = new Key();
		LuluSkills skills = new LuluSkills();
		LuluStatus status = new LuluStatus(MAX_MP);

		Scanner sc = new Scanner(System.in);

		String key;
		int decreaseMP;

		System.out.println("現在のMP : " + status.getCurrentMP());
		while(status.isAvailableSkills()){
			decreaseMP = 0;
			key = setKey.setKey(sc.nextLine());

			switch (key) {
			case "q": decreaseMP = skills.q(); break;
			case "w": decreaseMP = skills.w(); break;
			case "e": decreaseMP = skills.e(); break;
			case "r": decreaseMP = skills.r(); break;
			case "d": skills.d(); break;
			case "f": skills.f(); break;
			case "df": skills.df(); break;
			case "fd": skills.fd(); break;
			}
			status.setCurrentMP(decreaseMP);

			System.out.println("現在のMP : " + status.getCurrentMP());
		}
	}
}
