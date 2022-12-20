package pets;

public abstract class Pet {
    private int pawsCount;

    public int getPawsCount() {
        return pawsCount;
    }

    public abstract void giveVoice();
    public Pet(int pawsCount){
        this.pawsCount = pawsCount;
    }
    public void sleep(){
        System.out.println("Сплю");
    }
    public void play(){
        System.out.println("Играю");
    }
}
