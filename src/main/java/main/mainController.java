package main;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
    @RequestMapping("/")
    public String index() {
        return "Congratulations from BlogController.java";
    }
}
