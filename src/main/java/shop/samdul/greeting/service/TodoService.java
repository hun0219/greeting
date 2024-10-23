package shop.samdul.greeting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.samdul.greeting.entity.TodoEntity;
import shop.samdul.greeting.mapper.TodoMapper;

import java.util.List;

@Service
public class TodoService {

	@Autowired
	TodoMapper todoMapper;

	public List<TodoEntity> getTodos() {
		System.out.println("[service] findAll");
		List<TodoEntity> todos = todoMapper.findAll();
		System.out.println("[todos]:" + todos.size());
		return todos;
	}

    public TodoEntity findById(Integer id) {
        return todoMapper.findById(id);
    }

    public void insert(TodoEntity todoEntity) {
        todoMapper.insert(todoEntity);
    }

    public void update(TodoEntity todoEntity) {
        todoMapper.update(todoEntity);
    }

    public void delete(Integer id) {
        todoMapper.delete(id);
    }
}