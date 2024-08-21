package main.java;

/*
Mostenirea = ne permite sa preluam informatii generale dintr-o clasa parinte si sa le transmitem mai departe in clasele copil
Scopul principal este acela de a creea un nivel de generalizare intre o serie de clase ce apartin aceluiasi context si de a le permite sa se diferentieze intre ele intr-un mod mult mai vizibil
 */
class Mammal{
    int age;
    String furColour;
    String species;
    Mammal(int age, String furColour, String species){
        this.age=age;
        this.furColour=furColour;
        this.species=species;
    }
    void display(){
        System.out.println(this.species+" "+this.furColour+" "+this.age+" ");
    }
    void sound(){
        System.out.println("Mammal makes sound!");
    }

}
/*
Child class=Derived class
 */
class Dog extends Mammal{
    String favoriteToy;
    Dog(int age, String furColour, String species, String favoriteToy){
        super(age, furColour, species);
        this.favoriteToy=favoriteToy;
    }
    @Override
    void display(){
        super.display(); //apelam metodele sau atributele din clasa parinte prin sintaxa lui super de obiect de tipul Mammal
    }
    @Override
    void sound(){
        super.sound();
    }

}
public class InheritancePrinciple {
    public static void main(String[] args) {

    }
}
