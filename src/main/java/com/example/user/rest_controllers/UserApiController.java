package com.example.user.rest_controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*REST API Controller 사용한다는 것을 프레임워크에 알려줌*/
@RestController
/*localhost:9080/api/v1 형태로 url 매핑됨*/
@RequestMapping("/api/v1")
public class UserApiController {

    /*RequestMapping(Method=Request.GET) 과 똑같은 역할*/
    //GET Method 통신
    //경로는 api/v1/test 와 매핑됨
    @GetMapping("/test")
    public String testEndPoint(){
        return "Test end point is working";
    }
}
