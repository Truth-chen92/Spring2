package cn.tedu;

import cn.tedu.bean.Worker;
import cn.tedu.config.Config;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCase {
    AnnotationConfigApplicationContext ctx;
    @Before
    public void init() {
        ctx = new AnnotationConfigApplicationContext(Config.class);
    }
    @After
    public void after() {
        ctx.close();
    }
    @Test
    public void testWorker(){
        /*
            测试以来注入功能 如果工人的saw属性不为空 则说明spring成功
            将“寒冰锯”注入给工人
         */
        Worker worker=ctx.getBean(Worker.class);
        worker.work();
    }
}
