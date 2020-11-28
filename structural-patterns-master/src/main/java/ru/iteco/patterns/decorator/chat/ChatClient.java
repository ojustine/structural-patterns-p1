package ru.iteco.patterns.decorator.chat;

public class ChatClient implements Client {
	@Override
	public void sendMessage(Message message) {
		System.out.println(message.toString());
	}

	@Override
	public void receiveMessage(Message message) {
		System.out.println(message.toString());
	}
}
