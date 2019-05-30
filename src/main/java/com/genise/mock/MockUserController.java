package com.genise.mock;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockUserController {
    @RequestMapping("/user")
    public String index() {
        return "Congratulations from UserController.java";
    }
}
