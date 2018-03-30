import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Toto {

	static List<Integer> calaPula = new ArrayList<>();

	static {
		for (int i = 1; i <= 49; ++i) {
			calaPula.add(i);
		}
	}

	public static List<Integer> szescZ49() {

		List<Integer> pula = new ArrayList(calaPula);
		Collections.shuffle(pula);
		return pula.subList(0, 6);

	}

	public static List<Integer> wczytaj6() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj 6 typowañ: ");
		String dataString[] = scanner.nextLine().split(" ");
		if (dataString.length != 6) {
			throw new IllegalStateException("B³êdna iloœæ danych.");
		}
		Integer dataInteger[] = new Integer[dataString.length];
		for (int i = 0; i < 6; ++i) {
			dataInteger[i] = Integer.valueOf(dataString[i]);
		}
		List<Integer> chosenNumbers = Arrays.asList(dataInteger);
		if (new HashSet<Integer>(chosenNumbers).size() != 6) {
			throw new IllegalStateException("Liczby siê powtarzaj¹.");
		}
		for (Integer n : chosenNumbers) {
			if (n < 1 || n > 49) {
				throw new IllegalStateException("Liczba " + n + " jest spoza zakresu.");
			}
		}
		return chosenNumbers;
	}

	public static void main(String[] args) {

		List<Integer> wybrane = wczytaj6();

		Map<Integer, Integer> obliczenia = new TreeMap<>();
		for (int i = 0; i <= 6; ++i) {
			obliczenia.put(i, 0);
		}

		final int ILE = 10000000;

		for (int i = 0; i < ILE; ++i) {
			List<Integer> wylosowane = szescZ49();
			int trafienia = wyliczTrafienia(wybrane, wylosowane);
			if (trafienia == 6) {
				System.out.println(wylosowane);
				System.out.format("6 wylosowana po %d.\n", (int) ((double) i) / (3 * 52));
			}
			obliczenia.put(trafienia, obliczenia.get(trafienia) + 1);
		}

		System.out.println(obliczenia);
		Map<Integer, Double> prawd = new TreeMap<>();
		for (int i = 0; i <= 6; ++i) {
			prawd.put(i, obliczenia.get(i) / (double) ILE);
		}
		System.out.println(prawd);

	}

	static int wyliczTrafienia(List<Integer> wybrane, List<Integer> wylosowane) {
		List<Integer> trafienia = new ArrayList<Integer>(wybrane);
		trafienia.retainAll(wylosowane);
		return trafienia.size();
	}

}
