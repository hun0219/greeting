package shop.samdul.greeting.controller;

import shop.samdul.greeting.entity.TodoEntity;
import shop.samdul.greeting.service.TodoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    
    @Autowired
    TodoService todoService;

	@GetMapping("/todos")
	public List<TodoEntity> list() {
		System.out.println("[Controller]");
		java.util.List<TodoEntity> r = todoService.getTodos();
		return r;	
	}
	
	@GetMapping("/todos/{id}")
	public TodoEntity find(@PathVariable Integer id) {
		TodoEntity r = todoService.findById(id);
		return r;
	}

    @GetMapping("/todos/{completed}")
    public TodoEntity find(@PathVariable  private Boolean completed) {
        TodoEntity r = todoService.findByCompleted(completed);
        return r;
    }
	//C

	//U

	//D
}
