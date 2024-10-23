package shop.samdul.greeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shop.samdul.greeting.service.TodoService;
import shop.samdul.greeting.entity.TodoEntity;

import java.util.List;

@RestController
@RequestMapping("/jpatodos")
public class TodoJpaController{
	
	//@Autowired 아래에 적으면.. 요새트렌드
	TodoService TodoJpaService todojpaService;
	
	@Autowired
	public TodoJpaController(TodoJpaService todojpaService) {
		this.TodoJpaService = todoJpaService;
	}

	//@GetMapping("/jpatodos") 안적으면 get으로 
	@GetMapping
	public List<TodoEntity> list() {
		return todoJpaService.getAllTodos();
	}
	
	@GetMapping("/{id}")
	public TodoEntity find(@PathVariable Integer id) {
		TodoEntity r = todoJpaService.getTotoById(id);
		return r;	
	}

	//C - INSERT
    //@PostMapping("/todos")
	@PostMapping
    public void createTodo(@RequestBody TodoEntity todoEntity) {
        return todoJpaService.createTodo(todoEntity);
    }
    
	//U - UPDATE
    @PutMapping("/{id}")
    public void updateTodo(@PathVariable Integer id, @RequestBody TodoEntity todoEntity) {
        todoJpaService.updateTodo(id, todoEntity);
    }

	//D - DELETE
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Integer id) {
        todoJpaService.deleteTodoById(id);
    }
}