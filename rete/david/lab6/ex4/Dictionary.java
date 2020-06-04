package rete.david.lab6.ex4;
import java.util.*;

public class Dictionary {
	
	HashMap<Word,Definition> dictionary  = new HashMap<Word,Definition>();
	
	public Dictionary() {}
	public void addWord(Word w, Definition d)
	{
		dictionary.put(w, d);
	}
	public Definition getDefinition(Word w)
	{
		return (dictionary.get(w));
	}
	
	//get all words
	public void getAllWords()
	{
		for (Word key : dictionary.keySet()) {
			System.out.println(key.getWord());
		}
	}
	
	//get all definitions
	public void			getAllDefinitions() {
		for (Word key : dictionary.keySet()) {
			System.out.println(dictionary.get(key).getDescription());
		}
	}
	public void			printDictionary() {
		for (Word key : dictionary.keySet()) {
			System.out.println(key.getWord() + " - " + dictionary.get(key).getDescription());
		}
	}
	public HashMap<Word, Definition> getHashMap() {
		return (this.dictionary);
	}
}
