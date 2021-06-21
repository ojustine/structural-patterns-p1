package ru.iteco.patterns.decorator;

public abstract class ClientDecoratorBase implements Client {
	protected Client client;

	public ClientDecoratorBase(Client client) {
		this.client = client;
	}

	@Override
	public void sendMessage(Message message) {
		client.sendMessage(message);
	}

	@Override
	public void receiveMessage(Message message) {
		client.receiveMessage(message);
	}
}
