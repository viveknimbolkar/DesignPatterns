package ChainOfResponsibility;

public class DebugLogger extends Logger{

    public DebugLogger(int level){
        this.level = level;
    }

 @Override
    public void write(String message){
     System.out.println("Debug Logger: "+message);
 }
}
