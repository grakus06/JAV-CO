package fr.poec.java.tp;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
     // TP: lire un fichier texte encodé en UTF8
	// Compter le nb  de mots
	// compter le nb de phrases
	// calculer le nb  de mots moyens par phrases
	// a chaque mot, compter le nombre d'apparition 
	
	static String readFile(String path, Charset encoding) 
		  throws IOException 
	{
	  byte[] encoded = Files.readAllBytes(Paths.get(path));
	  return new String(encoded, encoding);
	}

	public static void main(String[] args) throws IOException {
		
		String book = new String();
		Integer nbWords =0;
		HashMap dict = new HashMap();
		Integer nbEmptySentences =0;
		
		Path mypath = Paths.get("C:\\Users\\Administrateur\\workspace\\JAV-CO\\src\\fr\\poec\\java\\tp\\TDM80j.txt");
		// open the file and extract the content in the String livre
		book = readFile(mypath.toString(),StandardCharsets.UTF_8);
		// search all sentences delimiters (., ? , !)
		String s[] = book.split("[.?!]");
		List<String> allSentences = new ArrayList<String>();
		allSentences.addAll(Arrays.asList(s));
		// store the sentence in the sentence string
		// analyse the sentence: search word delimitors (space, ', :, ;)
		List<String> words = new ArrayList<String>();
		for (String sentence : allSentences) {
			String word[] = sentence.split("[',;: -]");
			if (!sentence.equals("")) {
			   words.addAll(Arrays.asList(word));  
			}
			else
			{
				nbEmptySentences++;
			}
			// counts the words
		}
		
		// compute average words / sentence
		nbWords =  words.size();
		Integer nbWordsBySentance = nbWords / (allSentences.size() - nbEmptySentences);
		System.out.println("Total number of words:" +nbWords);
		System.out.println("Total number of sentences:" +(allSentences.size() - nbEmptySentences));
		System.out.println("Average number of word per sentence:" + nbWordsBySentance);
		// store each word in the ArrayList words if not already present
		// increase occurrence of the word
		

	}

}
