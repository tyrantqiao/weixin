package com.qiao.weixin.repository;

import com.qiao.weixin.data.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import javax.persistence.Id;

/**
 * Created by GeoLin on 2017/5/21.
 */
//extends CrudRepository<User,Long>
public interface UserRepository extends Repository<User,Long>{
    User findUserByUsername(String username);

    User save(User user);
}
