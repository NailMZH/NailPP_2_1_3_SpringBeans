package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("animalBean")
public class AnimalsCage {

    private Timer timer;
    private Animal animal;

    @Autowired
    public AnimalsCage(Timer timer, @Qualifier("dogBean") Animal animal) {
        this.timer = timer;
        this.animal = animal;
    }

    @Autowired
    public Timer getTimer(){
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
