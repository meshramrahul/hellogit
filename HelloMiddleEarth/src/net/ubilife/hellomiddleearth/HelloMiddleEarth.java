package net.ubilife.hellomiddleearth;

public class HelloMiddleEarth {
	public static void main(String[] args) {
		String[] names = {"Bilbo", "Frodo", "Aragorn", "Legolas", "Gandalf"};
		//Print Greeting
		for (int i=0; i<names.length;i++) {
			System.out.format("Hello %s!\n", names[i]);
		}
	}

}
