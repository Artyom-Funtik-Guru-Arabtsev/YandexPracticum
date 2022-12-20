package pets;

public class Spider extends Pet{
    public Spider(){
        super(8);
    }
    @Override
    public void giveVoice(){
        System.out.println("Матери нужна еда!\nМоих паучков не трожь!");
    }
}
