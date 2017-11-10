package net.ubilife.hellomiddleearth;

public class HelloMiddleEarth {
	public static void main(String[] args) {
		String[] names = {"Bilbo", "Frodo", "Aragorn", "Legolas", "Gandalf"};
		//Print Greeting
		for (String name : names) {
			System.out.format("Hello %s!\n", name);
		}
	}

}
