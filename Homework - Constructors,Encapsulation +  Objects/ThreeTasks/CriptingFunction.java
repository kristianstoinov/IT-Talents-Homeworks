import java.util.Arrays;
import java.util.Scanner;

public class CriptingFunction {
	static final char[][] key = { { 'g', 'e', 'f', 'v', 'j' }, { 'm', 'i', 'n', 'b', 's' }, { 'c', 't', 'a', 'l', 'r' },
			{ 'd', 'h', 'y', 'u', 'o' }, { 'k', 'w', 'q', 'x', 'p' } };

	private static String crypt(String str) {

		if (str.charAt(0) == str.charAt(1)) {
			return str;
		}
		int index1 = -1, index2 = -1, index3 = -1, index4 = -1;
		for (int i = 0; i < key.length; i++) {
			for (int j = 0; j < key.length; j++) {
				if (str.charAt(0) == key[i][j]) {
					index1 = i;
					index2 = j;
				}
				if (str.charAt(1) == key[i][j]) {
					index3 = i;
					index4 = j;
				}
			}
		}
		if (index1 < 0 || index2 < 0 || index3 < 0 || index4 < 0) {
			return str;
		}
		if (index1 == index3) {
			index2++;
			index4++;
			if (index2 > 4) {
				index2 = -5 + index2;
			}
			if (index4 > 4) {
				index4 = -5 + index4;
			}
		}

		else if (index2 == index4) {
			index1++;
			index3++;
			if (index1 > 4) {
				index1 = -5 + index1;
			}
			if (index3 > 4) {
				index3 = -5 + index3;
			}
		} else {
			char[] ch = new char[2];
			ch[0] = key[index1][index4];
			ch[1] = key[index3][index2];
			String crypted = new String(ch);
			return crypted;

		}

		char[] ch = new char[2];
		ch[0] = key[index1][index2];
		ch[1] = key[index3][index4];
		String crypted = new String(ch);
		return crypted;
	}

	private static String decrypt(String str) {

		if (str.charAt(0) == str.charAt(1)) {
			return str;
		}
		int index1 = -1, index2 = -1, index3 = -1, index4 = -1;
		for (int i = 0; i < key.length; i++) {
			for (int j = 0; j < key.length; j++) {
				if (str.charAt(0) == key[i][j]) {
					index1 = i;
					index2 = j;
				}
				if (str.charAt(1) == key[i][j]) {
					index3 = i;
					index4 = j;
				}
			}
		}

		if (index1 < 0 || index2 < 0 || index3 < 0 || index4 < 0) {
			return str;
		}
		if (index1 == index3) {
			index2--;
			index4--;
			if (index2 < 0) {
				index2 = 5 + index2;
			}
			if (index4 < 0) {
				index4 = 5 + index4;
			}

		} else if (index2 == index4) {
			index1--;
			index3--;
			if (index1 < 0) {
				index1 = 5 + index1;
			}
			if (index3 < 0) {
				index3 = 5 + index3;
			}
		} else {
			char[] ch = new char[2];
			ch[0] = key[index1][index4];
			ch[1] = key[index3][index2];
			String decrypted = new String(ch);
			return decrypted;
		}

		char[] ch = new char[2];
		ch[0] = key[index1][index2];
		ch[1] = key[index3][index4];
		String decrypted = new String(ch);
		return decrypted;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] str = new String[input.length() / 2];
		if (input.length() % 2 == 1) {
			str = new String[input.length() / 2 + 1];
		}
		for (int i = 1, j = 0; i < input.length(); i += 2, j++) {
			str[j] = input.substring(i - 1, i + 1);// ako mahna intervalite
													// nemoga da si gi vurna
													// posle
		}
		if (input.length() % 2 == 1) {
			str[str.length - 1] = input.substring(input.length() - 1).concat("p");
		}
		String output = "";
		for (int i = 0; i < str.length; i++) {
			str[i] = crypt(str[i]);
			output = output.concat(str[i]);
		}

		System.out.println(Arrays.toString(str));
		System.out.println(output);
		output = "";
		for (int i = 0; i < str.length; i++) {
			str[i] = decrypt(str[i]);
			output = output.concat(str[i]);
		}
		System.out.println(Arrays.toString(str));
		System.out.println(output);
	}

}
