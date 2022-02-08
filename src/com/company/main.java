package com.company;

public class main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1=animalFactory.getAnimal("Dog");

        System.out.println(a1.makeSound());
        Animal a2=animalFactory.getAnimal("Cat");
        System.out.println(a2.makeSound());
        Animal a3=animalFactory.getAnimal("Dog");
        System.out.println(a3.makeSound());
    }
}
