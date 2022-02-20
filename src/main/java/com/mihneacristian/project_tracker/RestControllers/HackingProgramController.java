package com.mihneacristian.project_tracker.RestControllers;

import com.mihneacristian.project_tracker.Services.ProjectService;
import com.mihneacristian.project_tracker.Services.StatusService;
import com.mihneacristian.project_tracker.Services.TeamMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HackingProgramController {

    @Autowired
    ProjectService projectService;

    @Autowired
    StatusService statusService;

    @Autowired
    TeamMembersService teamMembersService;

    @GetMapping("/hacking-program")
    public ModelAndView mainPage() {
        ModelAndView modelAndView = new ModelAndView("program/hacking-program");

        return modelAndView;
    }
}