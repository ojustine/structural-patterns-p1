package ru.iteco.patterns.decorator;

public class Main {
	public static void main(String[] args) {
		Message toNeo = new Message("Mr. Smith", "Mr. Andersen", "Hello there, mr. Andersen");
		Message toSmith = new Message("Neo", "Agent Smith", "My name is Neo");

		Client neo = new ChatClient();
		Client smith = new ChatClient();
		smith = new ClientDecoratorBuilder(smith).hideAuthor().encryptText().build();

		smith.sendMessage(toNeo);
		neo.receiveMessage(toNeo);
		neo.sendMessage(toSmith);
		smith.receiveMessage(toSmith);
	}
}
