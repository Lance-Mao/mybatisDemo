package mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/7/1.
 */
public interface UserMapper {

    //模糊查找
    public List<User> likeFindUserByName(String name);

    //多个参数查询
    public List<User> findUserByIdAndName(@Param("id")Integer id, @Param("name") String name);

    //传入Map，进行查询
    public List<User> findUserByMap(Map<String, Object> map);

    //模糊查询
    public List<User> listLike(String name);

    //返回Map
    Map<String, Object> returnMap(Integer id);

    //Map<integer,User>
    //告诉mybatis封装这个map的时候使用哪个属性作为map的key
    @MapKey("id")
    Map<Integer,User> returnMap2(String name);

}
