package com.example.demo;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {GeneratorConfigurationApplication.class, GeneratorConfigurationApplicationTests.class})
public class GeneratorConfigurationApplicationTests {

    /**
     * 测试数据库逆向的 XML文件
     */
    @Test
    public void getareaInformation() {

        System.out.println("");
    }


}
