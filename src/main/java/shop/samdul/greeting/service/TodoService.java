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

    public List<TodoEntity> getTodos(){
            System.out.println("[service] findAll");
            List<TodoEntity> todos = todoMapper.findAll();
            System.out.println("[todos]:" + todos.size());
            return todos;
    }
    public TodoEntity findById(Integer id) {
        System.out.println("[Service] findById: " + id);
        TodoEntity byid = todoMapper.findById(id);
        if (byid != null) {
            System.out.println("[Service] Todo 찾음: " + byid.getId());
        } else {
            System.out.println("[Service] 해당 id로 Todo를 찾을 수 없음: " + id);
        }
        return byid;
    }

    // public List<TodoEntity> findById(){
    //         System.out.println("[service] findAll");
    //         List<TodoEntity> byid = todoMapper.findAll();
    //         System.out.println("[todos]:" + byid.size());
    //         return byid;
    // }
}
