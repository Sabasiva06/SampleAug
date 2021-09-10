package org.sample;

import java.io.IOException;

public class StaticBlock {

	public static void main(String[] args) throws IOException, InterruptedException {

		String s = "Seleneium";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			int indexOf = s.indexOf(c);
			System.out.println("Character :" + c + " " + "Index Position :" + indexOf);

		}
	}
}
