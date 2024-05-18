package ChainOfResponsibility;

public class InfoLogger extends Logger{

    public InfoLogger(int level){
        this.level = level;
    }

 @Override
    public void write(String message){
     System.out.println("Info Logger: "+message);
 }
}
