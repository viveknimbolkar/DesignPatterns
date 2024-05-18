package ChainOfResponsibility;

public abstract class Logger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected Logger nextLogger;
    protected int level;

    public void setNextLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }
    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        // pass to the next logger
        if(nextLogger != null){
            nextLogger.logMessage(level,message);
        }
    }

    abstract protected void write(String message);

}
