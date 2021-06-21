package ru.iteco.patterns.decorator;

public class HideAuthorClientDecorator extends ClientDecoratorBase {
	public HideAuthorClientDecorator(Client client) {
		super(client);
	}

	@Override
	public void sendMessage(Message message) {
		message.setAuthor("*hidden*");
		super.sendMessage(message);
	}
}
