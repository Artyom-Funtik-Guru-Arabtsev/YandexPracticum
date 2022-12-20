package pets;

public class Fish extends Pet{
    public Fish() {
        super(0);
    }
    @Override
    public void giveVoice(){
        System.out.println("Буль-буль!");
    }
}
