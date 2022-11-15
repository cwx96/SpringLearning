package cn.cwx.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * @author chenw
 * @date 2022/11/15 15:11
 **/
public class BeanFactory {
    private Map<String, BeanDefinition>  beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    /**
     * 获取bean
     * @param name
     * @return
     */
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    /**
     * 注册BeanDefinition信息
     * @author chenw
     * @date 2022/11/15 15:14
     * @param name bean唯一标识名字
     * @param beanDefinition bean定义
     * @return void
     */
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}

