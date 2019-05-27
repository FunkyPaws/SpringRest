package main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @RequestMapping("/post")
    public String index() {
        return "Congratulations from PostController.java";
    }

}
