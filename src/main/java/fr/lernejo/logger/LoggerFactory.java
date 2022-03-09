package fr.lernejo.logger;
import fr.lernejo.logger.Logger;

import java.util.List;


public class LoggerFactory{
    public static Logger getLogger (String name)
    {
        Logger commands = new ConsoleLogger();
        return commands;
    }
}
