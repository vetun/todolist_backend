package ar.com.research.todolist.domain;

/**
 * Created by agust on 7/15/2017.
 * A Todo abstraction
 */
public class Todo {
    private String description;
    private boolean isChecked;

    public Todo(String description, boolean isChecked) {
        this.description = description;
        this.isChecked = isChecked;
    }

    @Override
    public String toString() {
        return "TodoApplication{" +
                "description='" + description + '\'' +
                ", isChecked=" + isChecked +
                '}';
    }
}
