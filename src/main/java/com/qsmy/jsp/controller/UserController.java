package com.qsmy.jsp.controller;

import com.qsmy.jsp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qsmy
 * @date 2019-07-24
 */
@Controller
public class UserController {

    @RequestMapping("/showUser")
    public String showUser(Model model) {
        List<User> list = new ArrayList<>();
        list.add(new User("qsmy1", 1));
        list.add(new User("qsmy2", 2));
        list.add(new User("qsmy3", 3));
        model.addAttribute("list", list);
        return "userList";
    }
}
