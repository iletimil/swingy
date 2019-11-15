package swingy;

import java.io.IOException;
import java.sql.SQLException;
import swingy.controller.*;
public class App
{
    public static void main(String[] args) throws IOException, SQLException 
    {
        if (args.length >= 1) 
        {
            if (args[0].equalsIgnoreCase("console")) 
            {
                ConsoleController.gameLoop();
            }
        }
        else
        {
            ConsoleController.gameLoop();
        }
    }
}
