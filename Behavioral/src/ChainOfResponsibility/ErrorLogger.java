package ChainOfResponsibility;

public class ErrorLogger extends Logger{

    public ErrorLogger(int level){
        this.level = level;
    }

 @Override
    public void write(String message){
     System.out.println("Error Logger: "+message);
 }
}
