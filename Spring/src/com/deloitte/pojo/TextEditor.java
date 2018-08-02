package com.deloitte.pojo;

import org.springframework.beans.factory.annotation.Required;

public class TextEditor {
	
	private SpellChecker spellChecker;
	private String name;
	
	public void getName() {
		System.out.println("Name: " + name);
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor");
		this.spellChecker = spellChecker;
	}
	
	public TextEditor() {
		System.out.println("Inside text editor's SDI CONSTRUCTOR");
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	

}
