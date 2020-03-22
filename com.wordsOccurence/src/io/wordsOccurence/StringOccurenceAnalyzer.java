package io.wordsOccurence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringOccurenceAnalyzer {

	public List<StringOccurence> analyse(List<String> words) {
		HashMap<String, Integer> occurences = new HashMap<>();

		for (String word : words) {
			if (occurences.containsKey(word)) {
				int n = occurences.get(word);
				occurences.put(word, n + 1);
			} else {
				occurences.put(word, 1);
			}
		}

		ArrayList<StringOccurence> list = new ArrayList<>();
		for (Map.Entry<String, Integer> e : occurences.entrySet()) {
			StringOccurence item = new StringOccurence(e.getKey(), e.getValue());
			list.add(item);
		}

		list.sort((o1, o2) -> -Integer.compare(o1.getOccurence(), o2.getOccurence()));

		/*
		 * Collections.sort(list, new Comparator<StringOccurence>() {
		 * 
		 * @Override public int compare(StringOccurence o1, StringOccurence o2) { if
		 * (o1.getOccurence() < o2.getOccurence()) { return 1; } else if
		 * (o1.getOccurence() == o2.getOccurence()) { return 0; } else { return -1; } }
		 * });
		 */

		return list;
	}
}
