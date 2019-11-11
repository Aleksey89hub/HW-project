package HW3;

public class Dog extends Animal {
    protected String eating = "Flesh-eater";
    protected String family;
    protected String breed = "Dog";
    protected String sound = "woof";

    public Dog(String family){
        super(family);
    }

    @Override
    public void moving() {
        System.out.println("The dog is moving");
    }

    @Override
    public void eating(String breed) {
        if(breed.equals("Cat")){
            System.out.println("The dog ate the cat");
        }if(breed.equals("Mouse")){
            System.out.println("The dog ate the mouse");
        }
    }
}


