package com.ontariotechu.sofe3980U;

public class BinaryResult {
	private String name;
	private String suggestedEmail;

	public BinaryResult(String name, String suggestedEmail) {
		this.name = name;
		this.suggestedEmail = suggestedEmail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuggestedEmail() {
		return suggestedEmail;
	}

	public void setSuggestedEmail(String suggestedEmail) {
		this.suggestedEmail = suggestedEmail;
	}
}
