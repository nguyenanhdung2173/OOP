package designpattern.lab14.command.excercise2;

public abstract class Command{
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
