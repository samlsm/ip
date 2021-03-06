package duke.task;

import duke.DukeException;

/**
 * <code>Todo</code> class extends the <code>Task</code> class. Represents the most basic form of a <code>Task</code>,
 * consisting of only a description.
 */
public class Todo extends Task {
    Todo(String description) {
        super(description);
    }

    public Todo(String description, Boolean isDone) {
        super(description, isDone);
    }

    /**
     * Returns a <code>Todo</code> object if input format is correct. Specifically, the input format of
     * <code>Todo</code> object must be in the form of "todo description".
     *
     * @param message the command to create a <code>Todo</code> object
     * @return a <code>Todo</code> object
     * @throws DukeException if the input format is wrong or contains missing details
     */
    public static Todo createTask(String message) throws DukeException {
        String errMessage = " Oops!! You forgot to tell me what this task is about... *woof*\n";
        try {
            int indOfDescription = message.toLowerCase().indexOf("todo");
            String description = message.substring(indOfDescription + 4);

            if (description.isBlank()) {
                throw new DukeException(errMessage);
            } else {
                return new Todo(description);
            }

        } catch (DukeException e) {
            throw e;
        } catch (Exception e) {
            throw new DukeException(errMessage);
        }
    }

    /**
     * Returns a string representation of this <code>Task</code> object for saving.
     *
     * @return a string representation of this <code>Task</code> object for saving
     */
    public String toSaveFormat() {
        return "[T]" + super.toSaveFormat();
    }

    /**
     * Returns a string representation of this <code>Todo</code> object.
     *
     * @return a string representation of this <code>Todo</code> object
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
