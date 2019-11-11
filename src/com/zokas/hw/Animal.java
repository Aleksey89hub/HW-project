package HW3;

public abstract class Animal implements Action{
    protected String eating;
    protected String family;
    protected String breed ;
    protected String sound;

    public Animal(String family) {
        this.family = family;
    }

    @Override
    public void moving() {

    }

    @Override
    public void eating(String breed) {

    }

    public String getEating() {
        return eating;
    }

    public void setEating(String eating) {
        this.eating = eating;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Animal(String eating, String breed, String sound) {
        this.eating = eating;
        this.breed = breed;
        this.sound = sound;


    }
}