package BehavioralPatterns.Command.Example3;

public class Application3 {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CommandManager manager = new CommandManager();

        Command addHello = new AddTextCommand(editor, "Hello");
        Command addWorld = new AddTextCommand(editor, " World!");

        manager.executeCommand(addHello);
        System.out.println(editor.getText()); // Output: Hello

        manager.executeCommand(addWorld);
        System.out.println(editor.getText()); // Output: Hello World!

        manager.undo();
        System.out.println(editor.getText()); // Output: Hello

        manager.redo();
        System.out.println(editor.getText()); // Output: Hello World!
    }
}