package org.example;

import java.util.ArrayList;
import java.util.List;

public class AnimalCollection<TAnimal extends Animal, TAnimal2 extends IMakeNoise> {

    TAnimal first;
    TAnimal last;
    List<TAnimal> animals = new ArrayList<>();

    public void add(TAnimal animal){
        animals.add(animal);
    }

    public TAnimal getByIndex(int index){
        return animals.get(index);
    }

    <TPrint extends IMakeNoise> void print(TPrint obj){
        obj.makeNoise();

    }

}
