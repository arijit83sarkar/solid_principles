package com.lsp.without;

public class mainClass {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Bird peacock = new Peacock();
        peacock.fly();

        Bird eagle = new Eagle();
        eagle.eat();
        eagle.fly();

        Bird penguin = new Penguin();
        penguin.swim();
        penguin.fly();
    }
}
