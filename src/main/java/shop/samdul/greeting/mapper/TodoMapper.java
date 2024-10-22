package shop.samdul.greeting.mapper;

import org.apache.ibatis.annotations.Mapper;
import shop.samdul.greeting.entity.TodoEntity;
import java.util.List;

@Mapper
public interface TodoMapper {
    List<TodoEntity> findAll();
    TodoEntity findById(Integer id); // id로 Todo를 찾는 메서드
}