package com.backend.mapper;

import com.backend.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User selectByName(@Param("username") String username);
}
