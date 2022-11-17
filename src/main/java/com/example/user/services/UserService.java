package com.example.user.services;


import com.example.user.models.User;
import com.example.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*spring beanFactory 에 담아두고 @Autowired 를 사용하는 곳에 해당 bean 을 찾아 주입*/
//repository 에서 얻어온 정보를 바탕으로 자바 문법을 이용해 가공 후 다시 controller 에게 정보를 다시 보내는 곳
//controller 쪽에서 바로 데베에 접근하여 정보를 얻고 가공해서 가져가는 건 정보 손상 우려가 커서
//정보 변동의 위험이 큰 로직은 데베에서 추출한 정보의 복사본인 DTO를 만들어서 로직을 조작...
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {
        List<User> user=new ArrayList<>();
        Streamable.of(userRepository.findAll())
                .forEach(user::add);
        return user;
    }

    public User save(User user) {
       return userRepository.save(user);
    }

//    public void update(User user) {
//        userRepository.(user);
//    }
//    public void delete(int user_id) {
//        userRepository.delete(user_id);
//    }


//    public int registerNewUserServiceMethod(String nickname,String email,String password){
//        return userRepository.registerNewUser(nickname,email,password);
//    }
}
