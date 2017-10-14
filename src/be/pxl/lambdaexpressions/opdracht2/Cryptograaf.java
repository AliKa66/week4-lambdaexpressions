package be.pxl.lambdaexpressions.opdracht2;

public class Cryptograaf {

	public static String encryptFirst(String messageToEncrypt) {
		Bericht b = new Bericht(messageToEncrypt);
		String encryptedMessage = b.encrypt(s -> new StringBuilder(s).reverse().toString());
		return encryptedMessage;
	}

	public static String encryptSimple(String messageToEncrypt) {
		Bericht b = new Bericht(messageToEncrypt);
		String encryptedMessage = b.encrypt(new Encryptie() {

			@Override
			public String apply(String s) {
				char[] stringToChar = s.toUpperCase().toCharArray();
				String result = "";
				for (char c : stringToChar) {
					result += "-";
					if (Character.isLetter(c)) {
						result += Character.getNumericValue(c);
					} else {
						result += c;
					}
				}
				result = result.substring(1);
				return result;
			}
		});
		return encryptedMessage;
	}

	public static String encryptLambda(String messageToEncrypt) {
		Bericht b = new Bericht(messageToEncrypt);
		String encryptedMessage = b.encrypt(s -> {
			char[] stringToChar = s.toLowerCase().toCharArray();
			String result = "";
			for (char c : stringToChar) {
				if (Character.isLetter(c)) {
					int distance_C_To_Z = 'z' - c;
					if (distance_C_To_Z < s.length()) {
						c = 'a';
						c += (s.length() - distance_C_To_Z - 1);
					} else {
						c += s.length();
					}
				}
				result += c;
			}
			return result;
		});
		return encryptedMessage;
	}
}