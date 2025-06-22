package com.lsp.without;

public class Eagle extends Bird {

    @Override
    public void eat() {
        System.out.println("I eat to live!");
    }

    @Override
    public void swim() {
        System.out.println("I never tried it!");
    }

    @Override
    public void fly() {
        System.out.println("I can fly long in search of food.");
    }

}
