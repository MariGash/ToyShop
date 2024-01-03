package view.commands;


import view.ConsoleUI;


public class ChangeNumberOfToys extends Command {
    public ChangeNumberOfToys(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Изменить количество по Id";
    }

    public void execute() {
        consoleUI.changeNumberOfToys();
    }
}
