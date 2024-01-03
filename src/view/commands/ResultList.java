package view.commands;

import view.ConsoleUI;

public class ResultList extends Command {
    public ResultList(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Сформировать список розыгрыша";
    }

    public void execute() {
        consoleUI.resultList();
    }
}
