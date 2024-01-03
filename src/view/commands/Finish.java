package view.commands;


import view.ConsoleUI;

public class Finish extends Command {
    public Finish(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Выход";
    }

    public void execute() {
        consoleUI.finish();
    }
}
