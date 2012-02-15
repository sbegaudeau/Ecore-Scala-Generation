package org.obeonetwork.pim.ecore.gen.scala.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class EcoreGenScalaUtil {
	public static List<String> formatImport(List<String> importValues) {
		List<String> newValues = importValues;
		Collections.sort(newValues);
		return newValues;
	}
	
	public static List<String> formatCopyrightHeader(String string) {
		List<String> copyrightLines = new ArrayList<String>();
		
		final String DOS = "\r\n";
		final String MAC_OS = "\r";
		final String UNIX = "\n";
		
		if (string.contains(DOS)) {
			StringTokenizer tokenizer = new StringTokenizer(string, DOS);
			while (tokenizer.hasMoreTokens()) {
				String element = tokenizer.nextToken();
				copyrightLines.add(element);
			}
		} else if (string.contains(MAC_OS)) {
			StringTokenizer tokenizer = new StringTokenizer(string, MAC_OS);
			while (tokenizer.hasMoreTokens()) {
				String element = tokenizer.nextToken();
				copyrightLines.add(element);
			}
		} else if (string.contains(UNIX)) {
			StringTokenizer tokenizer = new StringTokenizer(string, UNIX);
			while (tokenizer.hasMoreTokens()) {
				String element = tokenizer.nextToken();
				copyrightLines.add(element);
			}
		} else {
			copyrightLines.add(string);
		}
		
		return copyrightLines;
	}
}
