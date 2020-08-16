public class Todo extends Task{
    Todo(String description) {
        super(description);
    }

    public static Todo createTask(String message) throws DukeException{
        String lines = ".~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.~.\n";
        String errMessage = " Oops!! You forgot to tell me what this task is about... *woof*\n";
        try {
            String description = message.substring(5);
            if (description.isBlank()) {
                String exMessage = lines + errMessage + lines;
                throw new DukeException(exMessage);
            } else {
                return new Todo(description);
            }
        } catch (DukeException e) {
            throw e;
        } catch (Exception e) {
            String exMessage = lines + errMessage + lines;
            throw new DukeException(exMessage);
        }
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
