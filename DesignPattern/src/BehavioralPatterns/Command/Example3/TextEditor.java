package BehavioralPatterns.Command.Example3;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void addText(String newText) {
        text.append(newText);
    }

    public void removeText(String newText) {
        int start = text.length() - newText.length();
        if (start >= 0 && text.substring(start).equals(newText)) {
            text.delete(start, text.length());
        }
    }

    public String getText() {
        return text.toString();
    }
}

