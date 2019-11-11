package HW3;

public class Mouse extends Animal {
    protected String eating = "Flesh-eater";
    protected String family;
    protected String breed = "Dog";
    protected String sound = "woof";

    public Mouse(String family){
        super(family);
    }

    @Override
    public void moving() {
        System.out.println("The mouse is moving");
    }

    @Override
    public void eating(String breed) {
        if(breed.equals("Cat")){
            System.out.println("The mouse was eaten by the cat");
        }if(breed.equals("Mouse")){
            System.out.println("The mouse was eaten by the dog");
        }
    }
}
