package com.example.user.rest_controllers;

import com.example.user.models.User;
import com.example.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Rest API 를 제공하는 Controller 로 설정
//@RequestMapping("users/insert") //이 클래스는 /api/v1로 들어오는 요청을 모두 처리함
public class RegisterApiController {

    /*Bean 객체를 주입받기 위해서 1.@Autowired 2.생성자 3.setter*/
    @Autowired
    UserService userService;


    @GetMapping("/users/get-all")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    /*RequestMapping(Method=RequestMethod.POST) 와 똑같은 역할할*/
    @PostMapping("/users/insert")
    public User save(@RequestBody User user) {

       return userService.save(user);

//        if (nickname.isEmpty() || email.isEmpty() || password.isEmpty()) {
//            return new ResponseEntity<>("Please Complete all Fields", HttpStatus.BAD_REQUEST);
//        }
//        // Encrypt / Hash Password:
//        String hashed_password = BCrypt.hashpw(password, BCrypt.gensalt());
//
//        //Register New User:
//        int result = userService.registerNewUserServiceMethod(nickname, email, hashed_password);
//
//
//        if (result != 1) {
//            return new ResponseEntity<>("Failed to Register User", HttpStatus.BAD_REQUEST);
//        }
//        return new ResponseEntity<>("User Register Successfully", HttpStatus.OK);
    }
}

