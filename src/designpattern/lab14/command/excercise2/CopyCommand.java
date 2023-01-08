package designpattern.lab14.command.excercise2;

public class CopyCommand extends Command{
    CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
