package shop.samdul.greeting.controller;

import java.util.Stack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GretingController {

    Stack<String> names = new Stack<>();

    @GetMapping("/greeting")
    public String greeting(
        @RequestParam(name="name",
                    required=false,     // name 필수냐? false
                    defaultValue="HI"   // name 안주면 HI 출력            
                    ) String name, Model model) {
                        
            names.push(name);

            //model.addAttribute("name", name);
            // 스택 전체를 모델에 추가하여 뷰에서 사용할 수 있도록
            model.addAttribute("names", names);

        return "greeting";
    }
}