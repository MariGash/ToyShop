package view.commands;

import view.ConsoleUI;

public class GetInfo extends Command{
    public GetInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Просмотреть игрушки в файле";
    }

    public void execute(){
        consoleUI.getInfo();
    }

}
