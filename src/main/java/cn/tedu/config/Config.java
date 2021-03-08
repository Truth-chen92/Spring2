package cn.tedu.config;

import cn.tedu.bean.Saw;
import cn.tedu.bean.Worker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Saw saw() {
        return new Saw();
    }
    @Bean
    public Saw s() {
        return new Saw();
    }
    /**
     * spring容器会根据配置方法参数 在spring容器中寻找匹配类型相同的
     *java Bean 对象 如果匹配到相同类型就自己将java Bean对象注入到
     * 方法的参数中 这个现象称为"DI"  依赖注入
     * @param s
     * @return
     */
    @Bean
    public Worker worker(Saw s){
        Worker worker = new Worker();
        worker.setSaw(s);
        return worker;
    }
}
