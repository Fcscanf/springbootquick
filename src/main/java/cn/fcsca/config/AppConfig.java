package cn.fcsca.config;

import cn.fcsca.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 下午 17:06 2018-08-10
 */
@Configuration
public class AppConfig {

    /**
     * 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
     *
     * @param
     * @return
     * @author Fcscanf@樊乘乘
     * @date 下午 17:13 2018-08-10
     */
    @Bean
    public HelloService helloService() {
        System.out.println("配置类@Bean给容器添加组件了");
        return new HelloService();
    }
}
