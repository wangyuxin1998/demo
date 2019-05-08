package com.example.demo.controller;

import com.example.demo.dao.RoleDao;
import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/userIndex")
    public String userIndex(Model model, HttpSession session) {
        User user1 = new User(1, "jim", true, new Date());
        User user2 = new User(2, "bob", true, new Date());
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        model.addAttribute("userList", userList);
//        session.setAttribute("user",user1);
//        model.addAttribute("msg","hello");
//        model.addAttribute("user",user);
        return "userIndex";
    }
}
