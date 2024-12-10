package shop.samdul.greeting.controller;
import shop.samdul.greeting.controller.People;
import java.util.Stack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    Stack<People> peopleStack = new Stack<>();

    @GetMapping("/greeting")
    public String greeting(
        @RequestParam(name="name",
                    required=false,     // name 필수냐? false
                    defaultValue="HI"   // name 안주면 HI 출력            
                    ) String name, int num, Model model) {
            System.out.println(name);
            System.out.println(num);
                        
            // Stack 누적/ 전역 Stack 안으로 
            //Stack<People> peopleStack = new Stack<>();
            
            // 이름의 첫 글자를 대문자로 변환
            if (name != null && !name.isEmpty()) {
                name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
            }

            // 아래를 안쓰려면 People.java 7-9라인 , 변수에 대한 타입 선언해줘야함
            // People people1 = new People(num, name);
            People people1 = new People();

            // 상속 Woker 클래스
            //People people1 = new Woker();
            
            // People.java에 people이 public으로 선언되어있기 때문에 아래를 쓸 수 있음
            // 보통 변수는 public으로 잘안씀
            people1.num=num;
            people1.name=name;

            
            // 스택에 People 객체 추가
            peopleStack.push(people1);

            // 모델에 스택 전체 추가
            model.addAttribute("peopleStack", peopleStack);

        return "greeting";
    }
}