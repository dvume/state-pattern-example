package ru.dvume.statepattern;

import ru.dvume.statepattern.task.Task;

public class App {
    public static void main(String[] args) {
        Task task1 = new Task();
        task1.start();
        task1.start();
        task1.complete();

        task1.start();

        task1.restart();
        task1.start();
        task1.fail();
    }
}
