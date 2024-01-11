

public class Main {
    public static void main(String[] args) {
        System.out.println("БАЛЫК----------------------------------------\n");
        Fish fish = new Fish();
        fish.setSpecies("форель");
        fish.setWeight(4);
        fish.setHeight(0.2);
        System.out.println("породасы "+fish.getSpecies());

        System.out.println("салмагы kg "+fish.getWeight());
        System.out.println("узуну "+fish.getHeight());
        Dog dog = new Dog();
         System.out.println("ИТ__________________________________________\n");
        dog.setSpecies("алабай");
        dog.setName("шенди");
        dog.setAge(2);
        dog.setColor("white");
        System.out.println("породасы "+dog.getSpecies());
        System.out.println("аты "+dog.getName());
        System.out.println("жашы "+dog.getAge());
        System.out.println("тусу "+dog.getColor());
        Cat cat=new Cat();
        System.out.println("МЫШЫК--------------------------------------\n");
        cat.setSpecies("рэгдолл");
        cat.setName("том");
        cat.setAge(2);
        cat.setColor("gray");
        System.out.println("породасы "+cat.getSpecies());
        System.out.println("аты "+cat.getName());
        System.out.println("жашы "+cat.getAge());
        System.out.println("тусу "+cat.getColor());
        Parrot parrot=new Parrot();
        System.out.println("ПОПУГАЙ------------------------------------\n");
        parrot.setSpecies("амазоны");
        parrot.setAge(38);
        parrot.setColor("chameleon");
        System.out.println("тукуму "+parrot.getSpecies());
        System.out.println("жашы "+parrot.getAge());
        System.out.println("тусу "+parrot.getColor());


    }
}