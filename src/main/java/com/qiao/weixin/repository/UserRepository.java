package com.qiao.weixin.repository;

import com.qiao.weixin.data.User;

/**
 * Created by GeoLin on 2017/5/21.
 */
//extends CrudRepository<User,Long>
public interface UserRepository {
    User save(User user);

    User findByUsername(String username);
}
