package clients;

import java.time.LocalDate;

public class Dog  extends Animal{
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog(){
        super();
    }

}

