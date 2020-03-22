import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import io.wordsOccurence.StringOccurence;
import io.wordsOccurence.StringOccurenceAnalyzer;

public class mainOccurence {

	public static void main(String[] args) {
		String fileName = "/Users/denniskurschner/Java Udemy/com.wordsOccurence/src/faust.txt";
		ArrayList<String> words = new ArrayList<>();
		Scanner input;
		
		try {
			input = new Scanner(Paths.get(fileName));
		} catch (IOException e) {
			System.err.println("Es ist ein Fehler aufgetreten: Datei nicht lesbar");
			return;
		}
		
		while(input.hasNext()) {
			words.add(input.next());
		}
		
		StringOccurenceAnalyzer stringOccurenceAnalyzer = 
				new StringOccurenceAnalyzer();
		
		List<StringOccurence> occurences = stringOccurenceAnalyzer.analyse(words);
		
		int counter = 0;
		for(StringOccurence item : occurences) {
			counter++;
			if (counter == 25) {
				break;
			}
			System.out.println(item.getWord() + ": " + item.getOccurence());
		}
		
	}

}
