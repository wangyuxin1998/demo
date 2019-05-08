package com.example.demo.controller;

import com.example.demo.entity.Role;
import com.example.demo.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class RoleController {
    @Resource
    private RoleService roleService;

    @RequestMapping("/roleList")
    public String findAllRole(Model model) {
        List<Role> roleList = roleService.findAllRole();
        model.addAttribute("roleList", roleList);
        return "roleList";
    }

    @RequestMapping(value = "/updateRole",method = RequestMethod.GET)
    public String updateRole(@RequestParam int id,Model model){
        Role role = roleService.findRoleById(id);
        model.addAttribute("role",role);
        return "updateRole";
    }
//    @RequestMapping (value = "/updateRole",method = RequestMethod.POST)
//    public String doUpdateRole(Role role,Model model){
//        int rel = roleService.updateRole(role);
//        if (rel > 0){
//            return "redirect:/roleList";
//        }else {
//            model.addAttribute("err","failed");
//            return "updateRole";
//        }
//    }
}
