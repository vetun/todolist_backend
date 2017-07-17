package ar.com.research.todolist.application;

import ar.com.research.todolist.domain.Todo;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by agust on 7/15/2017.
 * Application rest entry point
 */
public class TodoApplication {

    public List<Todo> all() {
        return new LinkedList<>();
    }
}
