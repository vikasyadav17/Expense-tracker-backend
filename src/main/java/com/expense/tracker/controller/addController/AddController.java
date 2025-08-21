package com.expense.tracker.controller.addController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class AddController {

    @GetMapping("")
    public String status() {
        return "Add endpoint is ready for use";
    }

}
