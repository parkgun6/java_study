package io5;

import java.io.Serializable;

public class Message implements Serializable{
	
	private String from, to, text;

	public Message(String from, String to, String text) {
		super();
		this.from = from;
		this.to = to;
		this.text = text;
	}

	@Override
	public String toString() {
		return "Message [from=" + from + ", to=" + to + ", text=" + text + "]";
	}
	
	
	
}
