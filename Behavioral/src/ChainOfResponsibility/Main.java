package ChainOfResponsibility;

public class Main {

    public Logger getLoggerChain(){
    Logger infoLogger = new InfoLogger(Logger.INFO);
    Logger debugLogger = new DebugLogger(Logger.DEBUG);
    Logger errorLogger = new ErrorLogger(Logger.ERROR);

    infoLogger.setNextLogger(debugLogger);
    debugLogger.setNextLogger(errorLogger);
    return infoLogger;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Logger loggerChain = main.getLoggerChain();

        loggerChain.logMessage(Logger.INFO,"Message from logger class");
        loggerChain.logMessage(Logger.DEBUG,"Message from debug class");
        loggerChain.logMessage(Logger.ERROR,"Message from error class");
    }

}
