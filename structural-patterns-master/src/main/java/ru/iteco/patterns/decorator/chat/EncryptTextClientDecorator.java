package ru.iteco.patterns.decorator.chat;

public class EncryptTextClientDecorator extends ClientDecoratorBase {
	public EncryptTextClientDecorator(Client client) {
		super(client);
	}

	@Override
	public void sendMessage(Message message) {
		message.setText("*" + message.getText() + "*");
		super.sendMessage(message);
	}

	@Override
	public void receiveMessage(Message message) {
		message.setText(message.getText().replaceAll("\\*", ""));
		super.receiveMessage(message);
	}
}
