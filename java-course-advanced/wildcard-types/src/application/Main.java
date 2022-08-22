package application;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> myStrg = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrg);
	}

	public static void printList(List<?> list) {
		// list.add(list); tipo curinga n�o funciona m�todos como add, compilador n�o
		// sabe o tipo

		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}