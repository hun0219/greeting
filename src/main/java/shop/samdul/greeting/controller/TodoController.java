package shop.samdul.greeting.controller;

import shop.samdul.greeting.entity.TodoEntity;
import shop.samdul.greeting.service.TodoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    
    @Autowired
    TodoService todoService;

    @GetMapping("/list")
    public List<TodoEntity> list() {
            System.out.println("[Controller]");
            List<TodoEntity> r = todoService.getTodos();
            return r;
    }
}
