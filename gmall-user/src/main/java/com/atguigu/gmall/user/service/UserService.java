package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.bean.User;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    void saveUser(User user);

    List<User> getUsers();


    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
