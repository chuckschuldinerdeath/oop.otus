package ru.otus.transport;

public class Main {
    public static void main(String[] args) {
        Transport horse1 = new Horse(100, "мурка");
        Transport car1 = new Car("мащига", 100);
        Transport bicycle1 = new Bicycle("велик");

        Man man1 = new Man( "муж");

        man1.setCurrentTransport(horse1);

        man1.setCurrentTransport(car1);
        man1.getCurrentTransport().move(Location.FIELD, 100);
        man1.getCurrentTransport().move(Location.FIELD, 1);

        man1.setCurrentTransport(bicycle1);
        man1.getCurrentTransport().move(Location.FOREST, 20);

        man1.move(Location.BOLOTO, 35);

    }
}