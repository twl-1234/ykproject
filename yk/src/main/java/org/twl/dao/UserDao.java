package org.twl.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.twl.bean.User;

import java.util.List;
@Repository
public interface UserDao {

    User findUserByMobileNumber(String mobileNumber);

    List<User>findAllUserByPaging(@Param("position") String position,@Param("size") String size);
}
