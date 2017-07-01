package mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.User;

import java.io.IOException;
import java.io.InputStream;


/**
 * Created by admin on 2017/6/26.
 */
public class MybatisFirst {
    @Test
    public void findUserByIdTest() {
        //读取配置文件
        String resource = "config/SqlMapConfig.xml";
        try {
            //全局配置文件路径
            InputStream inputStream = Resources.getResourceAsStream(resource);

            //创建SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            //创建SqlSession
            SqlSession sqlSession = sqlSessionFactory.openSession();

            //调用SqlSession的增删改查方法
            //第一个参数表示statement的唯一标识
            User user = sqlSession.selectOne("test.findUserByIdTest", 1);
            System.out.println(user);

            //关闭资源
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
