package view.commands;


import view.ConsoleUI;


public class DeleteToy extends Command {
    public DeleteToy(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Удалить игрушку";
    }

    public void execute() {
        consoleUI.deleteToy();
    }
}
