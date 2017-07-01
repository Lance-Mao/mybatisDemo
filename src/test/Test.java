package test;

import mapper.UserMapper;
import mapper.UserMapperU;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;


/**
 * Created by admin on 2017/7/1.
 */
public class Test {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws IOException {
        String path = "SqlMapConfig.xml";
        //将配置文件加载成流
        InputStream resourceAsStream = Resources.getResourceAsStream(path);

        //创建会话工厂，传入mybatis配置文件的信息
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }

    @org.junit.Test
    public void testLikeFindUserByName() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(mapper.likeFindUserByName("张"));
    }

    @org.junit.Test
    public void testFindUserByIdAndName() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(mapper.findUserByIdAndName(10,"张三"));
    }

    @org.junit.Test
    public void testFindUserByMap() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

//        Map<String, Object> map = new HashMap<>();
//        map.put("id", 10);
//        map.put("name", "张三");
        Map<String, Object> map = mapper.returnMap(10);
//        System.out.println(map);
        System.out.println(mapper.returnMap2("%张%"));
    }

    @org.junit.Test
    public void test03() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapperU mapper = sqlSession.getMapper(UserMapperU.class);

//        Map<String, Object> map = new HashMap<>();
//        map.put("id", 10);
//        map.put("name", "张三");
//        Map<String, Object> map = mapper.returnMap(10);
//        System.out.println(map);
//        System.out.println(mapper.returnMap2("%张%"));
        System.out.println(mapper.getUserAndItems(10));
    }
}
