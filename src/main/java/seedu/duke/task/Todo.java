package seedu.duke.task;

public class Todo extends Task {

    public Todo(String description) {
        super(description);
    }

    @Override
    public String toSaveString() {
        return super.toSaveString() + System.lineSeparator();
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
