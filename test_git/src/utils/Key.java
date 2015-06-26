package utils;

public class Key {

	public String setKey(String key) {

		if (key.equals("q") || key.equals("Q")) {
			key = "q";
		}

		if (key.equals("w") || key.endsWith("W")) {
			key = "w";
		}

		if (key.equals("e") || key.equals("E")) {
			key = "e";
		}

		if (key.equals("r") || key.equals("R")) {
			key = "r";
		}

		if (key.equals("d") || key.equals("D")) {
			key = "d";
		}

		if (key.equals("f") || key.equals("F")) {
			key = "f";
		}

		if (key.equals("df") || key.equals("DF")) {
			key = "df";
		}
		if (key.equals("fd") || key.equals("FD")) {
			key = "fd";
		}
		return key;
	}
}
