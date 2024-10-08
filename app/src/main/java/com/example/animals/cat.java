package com.example.animals;

public class cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("the cat meow");
    }
    @Override
    public void move(){
        System.out.println("the cat walk on 4 legs");
    }

    @Override
    public void eat(){
        System.out.println(" cat favourite food is milk");
    }
}
