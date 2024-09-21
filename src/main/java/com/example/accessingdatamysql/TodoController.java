package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin                             // 前后端不在同一域名下 需要跨域访问
@Controller
@RequestMapping(path = "/todo")
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;

    // localhost:8080/todo/all
    @GetMapping("/all")
    public @ResponseBody Iterable<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    // localhost:8080/todo/add
    @PostMapping("/add")
    public @ResponseBody String addTodo(@RequestParam String name, @RequestParam boolean isCompleted) {
        Todo newTodo = new Todo();
        newTodo.setName(name);
        newTodo.setCompleted(isCompleted);
        todoRepository.save(newTodo);
        return "Saved";
    }

    @PostMapping("/update")
    public @ResponseBody String updateTodo(
            @RequestParam Integer id, @RequestParam String name
    )
    {
        Optional<Todo> oldTodo = todoRepository.findById(id);
        if (oldTodo.isPresent()) {
            Todo newTodo = new Todo();
            newTodo.setId(id);
            newTodo.setName(name);
            newTodo.setCompleted(oldTodo.get().isCompleted());
            todoRepository.save(newTodo);
        } else {
            return "id is not present";
        }
        return "Updated";
    }

    @PostMapping("/complete")
    public @ResponseBody String completeTodo(@RequestParam Integer id){
        if (todoRepository.findById(id).isPresent()) {
            Todo todo = todoRepository.findById(id).get();
            todo.setCompleted(!todo.isCompleted());
            todoRepository.save(todo);
        } else {
            return "id is not present";
        }
        return "Updated";
    }

    // localhost:8080/todo/delete
    @PostMapping("/delete")
    public @ResponseBody String deleteTodo(@RequestParam Integer id) {
        todoRepository.deleteById(id);
        return "Deleted";
    }
}
