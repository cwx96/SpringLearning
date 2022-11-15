package cn.cwx.springframework;

/**
 * 自定义BeanDefinition
 * @author chenw
 * @date 2022/11/15 14:57
 **/
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }


    public Object getBean() {
        return bean;
    }
}

