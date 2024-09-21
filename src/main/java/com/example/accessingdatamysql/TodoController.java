package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    // localhost:8080/todo/delete
    @PostMapping("/delete")
    public @ResponseBody String deleteTodo(@RequestParam Integer id) {
        todoRepository.deleteById(id);
        return "Deleted";
    }
}
