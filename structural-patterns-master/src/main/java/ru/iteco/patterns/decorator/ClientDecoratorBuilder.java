package ru.iteco.patterns.decorator;

public class ClientDecoratorBuilder {
	private Client client;

	public ClientDecoratorBuilder(Client client) {
		this.client = client;
	}

	public ClientDecoratorBuilder hideAuthor() {
		client = new HideAuthorClientDecorator(client);
		return this;
	}

	public ClientDecoratorBuilder encryptText() {
		client = new EncryptTextClientDecorator(client);
		return this;
	}

	public Client build() {
		return client;
	}
}
