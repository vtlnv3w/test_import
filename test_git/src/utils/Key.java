package utils;

public class Key {

	public String setKey(String key){

		if(key.equals("q")||key.equals("Q")){
			key = "q";
		}

		if(key.equals("w")||key.endsWith("W")){
			key = "w";
		}

		if(key.equals("e")||key.equals("E")){
			key = "e";
		}

		if(key.equals("r")||key.equals("R")){
			key = "r";
		}

		return key;
	}
}
