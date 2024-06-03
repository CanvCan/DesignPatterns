package BehavioralPatterns.Command.Example3;

public class AddTextCommand implements Command {
    private String text;
    private TextEditor editor;

    public AddTextCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    public void execute() {
        editor.addText(text);
    }

    public void undo() {
        editor.removeText(text);
    }
}

