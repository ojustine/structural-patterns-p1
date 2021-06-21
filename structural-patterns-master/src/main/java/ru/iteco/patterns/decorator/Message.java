package ru.iteco.patterns.decorator;

public class Message {
	private String author;
	private String recipient;
	private String text;

	public Message(String author, String recipient, String text) {
		this.author = author;
		this.recipient = recipient;
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "From: " +
				author +
				"; " +
				"To: " +
				recipient +
				"; " +
				"Text: " +
				text;
	}
}
