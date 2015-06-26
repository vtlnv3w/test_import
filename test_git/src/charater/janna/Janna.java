package charater.janna;

import java.util.Scanner;

import utils.Key;
import character.Character;

public class Janna implements Character {

	public static void main(String[] args) {
		JannaStatus status = new JannaStatus(MAX_MP);
		JannaSkills skills = new JannaSkills();
		Key setKey = new Key();

		Scanner sc = new Scanner(System.in);
		String key;
		int decreaseMana;

		System.out.println("現在のMP : "+status.getCurrentMP());

		while(status.isAvailableSkills()){
			decreaseMana = 0;
			key = sc.nextLine();
			key = setKey.setKey(key);

			switch(key) {
				case "q" : decreaseMana = skills.q(); break;
				case "w" : decreaseMana = skills.w(); break;
				case "e" : decreaseMana = skills.e(); break;
				case "r" : decreaseMana = skills.r(); break;
			}

			status.setCurrentMP(decreaseMana);

			System.out.println("現在のMP : "+status.getCurrentMP());
		}

		sc.close();
	}

}
