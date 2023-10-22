package com.withsport.userservice.domain.user.dto;

import com.withsport.userservice.domain.user.entity.AuthType;
import com.withsport.userservice.domain.user.entity.User;
import lombok.Builder;
import lombok.Getter;

@Getter
public class UserDto {

    private Long id;
    private String email;
    private String password;
    private String name;
    private String nickname;
    private String address;
    private String dtype;



    //생성 메소드
    public UserDto(User user){
        this.id = user.getId();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.name = user.getName();
        this.nickname = user.getNickname();
        this.address = user.getAddress();
    }

    @Builder
    public UserDto(Long id, String email, String password, String name, String nickname, String address, String dtype){
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
        this.address = address;
        this.dtype = dtype;
    }
}