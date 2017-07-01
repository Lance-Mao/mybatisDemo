package mapper;

import pojo.User;

import java.util.List;

/**
 * Created by admin on 2017/7/1.
 */
public interface UserMapperU {

    User getUserById(Integer id);

    List<User> getUserAndItems(Integer id);
}
