package main;

import clients.*;

import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 05), new Illness("Лишай")); //Создаём экземпляр класса

        System.out.println(cat.getOwner());
        System.out.println(cat.getNickName());
        System.out.println("Болезнь:" + cat.getIllness());

        System.out.println(cat.getNickName());

        cat.setIllness(new Illness(null));

        System.out.println("Болезнь:" + cat.getIllness());


        Animal testAnimal = new Animal();
        System.out.println(testAnimal.getNickName());

        cat.lifeCycle();

        Animal catty = new Cat();
        Dog goodBoy = new Dog();

        Cat.meow();
        System.out.println(catty.getType());

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(catty);;
        animals.add(cat);
        animals.add(goodBoy);

        int i = 0;
        for (Animal animal : animals){
            System.out.println(i + " "+ animal);
            i++;
        }
        System.out.println("~~~~~~~~~~~~~~~~~~HW1~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Bird");
        Bird bird = new Bird();
        bird.fly();
        bird.toGo();
        bird.swim();
        System.out.println("Duck");
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
        duck.toGo();
        System.out.println("Cat");
        catty.fly();
        catty.toGo();
        catty.swim();
        System.out.println("Dog");
        goodBoy.fly();
        goodBoy.toGo();
        goodBoy.swim();



    }
}
