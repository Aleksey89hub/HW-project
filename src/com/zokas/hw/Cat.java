package HW3;

public class Cat extends Animal {

    protected String eating = "All food eater";
    protected String family;
    protected String breed = "Cat";
    protected String sound = "Meow";

    public Cat(String family){
        super(family);
    }

    @Override
    public void moving() {
        System.out.println("The cat is moving");
    }

    @Override
    public void eating(String breed) {
        if(breed.equals("Mouse")){
            System.out.println("The mouse was eaten by the cat");
        }if(breed.equals("Dog")){
            System.out.println("the cat is eaten by the dog");
        }
    }
}
