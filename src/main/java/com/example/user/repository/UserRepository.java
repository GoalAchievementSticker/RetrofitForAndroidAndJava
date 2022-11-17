package com.example.user.repository;

import com.example.user.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/* @Entity 를 통해 데이터 테이블이 생성되면,
* @Repository 는 받아온 정보를 데이터베이스(MySQL) 에 저장하고 조회하는 기능 수행*/
//jpa 인터페이스 메소드를 활요해 CRUD 가능
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
//
//    @Transactional
//    @Modifying
//    @Query(value = "INSERT INTO USERS(nickname,email,password) VALUES(:nickname, :email, :password)",nativeQuery = true)
//    //입력란 parameter 입력받는 api를 만들 때 @Param
//    int registerNewUser(@Param("nickname") String nickname, @Param("email") String email, @Param("password") String password);
}
