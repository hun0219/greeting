package shop.samdul.greeting.controller;

import java.util.Stack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(
        @RequestParam(name="name",
                    required=false,     // name 필수냐? false
                    defaultValue="HI"   // name 안주면 HI 출력            
                    ) String name, Model model) {
                        
            Stack<String> names = new Stack<>();
            names.push(name);

            model.addAttribute("name", name);

        return "greeting";
    }
}