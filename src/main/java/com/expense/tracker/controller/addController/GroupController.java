package com.expense.tracker.controller.addController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expense.tracker.domain.group.Group;

@RestController
@RequestMapping("/group")
public class GroupController {

    @GetMapping("")
    public String status() {
        return "Add endpoint is ready for use";
    }

    @PostMapping
    public Group Create(@RequestBody(required = true) Group group) {
        return null;
    }

}
