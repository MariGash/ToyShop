package view.commands;


import view.ConsoleUI;


public class AddToy extends Command {
    public AddToy(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить игрушку";
    }

    public void execute() {
        consoleUI.addToy();
    }
}