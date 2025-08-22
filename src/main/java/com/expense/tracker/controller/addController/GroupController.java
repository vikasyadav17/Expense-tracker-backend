package com.expense.tracker.controller.addController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group")
public class GroupController {

    @GetMapping("")
    public String status() {
        return "Add endpoint is ready for use";
    }

    @PostMapping
    public Group Create(@RequestBody Group group) {
        return null;
    }

}
