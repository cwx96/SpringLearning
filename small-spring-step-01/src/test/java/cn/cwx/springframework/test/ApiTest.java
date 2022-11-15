package cn.cwx.springframework.test;

import cn.cwx.springframework.BeanDefinition;
import cn.cwx.springframework.BeanFactory;
import cn.cwx.springframework.test.bean.UserService;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author chenw
 * @date 2022/11/15 15:18
 **/
public class ApiTest {
    @Test
    public void test_beanFactory() {
        // 1.初始化
        BeanFactory beanFactory = new BeanFactory();
        // 2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}

