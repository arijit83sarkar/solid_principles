package com.lsp.without;

public class Penguin extends Bird {

    @Override
    public void eat() {
        System.out.println("I eat to live!");
    }

    @Override
    public void swim() {
        System.out.println("This is my favorite activity!");
    }

    @Override
    public void fly() {
        System.out.println("oh no! I am a penguin.");
        throw new UnsupportedOperationException("This action is not applicable to me!");
    }
}
