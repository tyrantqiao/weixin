package com.qiao.weixin.controller;

import com.qiao.weixin.Exception.UserException;
import com.qiao.weixin.data.Result;
import com.qiao.weixin.data.ResultEnum;
import com.qiao.weixin.data.User;
import com.qiao.weixin.repository.UserRepository;
import com.qiao.weixin.utils.ResultUtil;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by GeoLin on 2017/5/22.
 */
@Controller
@RequestMapping("/user")
@ComponentScan(basePackages = {"data"})
public class UserController {
    private UserRepository userRepository;
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
//   Repository how to inject, make it not null...CrudRepository.interface seems well [finished]...

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage(Model model) {
        model.addAttribute(new User());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegister(@Valid User user, Errors errors) {
        if (errors.hasErrors()) {
            logger.error("got error:" + errors.getFieldError().getDefaultMessage());
            throw new UserException(ResultEnum.REGISTER_ERROR);
        }

        userRepository.save(user);
        return "redirect:/user/" + user.getUsername();
    }

    @RequestMapping("/{username}")
    public String showUserProfile(@PathVariable String username, Model model) {
        User user = userRepository.findUserByUsername(username);
        model.addAttribute(user);
        return "profile";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute(new User());
        return "/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String processLogin(@Valid User user, Errors errors) {
        if (errors.hasErrors()) {
            logger.error("input type's error:" + errors.getFieldError().getDefaultMessage());
            return "/login";
        }

        if (ResultUtil.confirm_login(user.getPassword(), userRepository.findUserByUsername(user.getUsername()).getPassword()))
            return "redirect:/user/" + user.getUsername();
        else
            logger.error(ResultEnum.LOGIN_ERROR.getMsg());
            throw new UserException(ResultEnum.LOGIN_ERROR);
    }
}
