package ru.iteco.patterns.decorator.chat;

public interface Client {

	void sendMessage(Message message);

	void receiveMessage(Message message);

}
