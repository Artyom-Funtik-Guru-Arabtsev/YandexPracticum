package Trash;

public class IncorrectInputException extends Throwable {
    public IncorrectInputException(){
        super();
    }
    public IncorrectInputException(String message){
        super(message);
    }
}
