package com.example.demo;



import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author majinming@xiaomi.com
 * @description
 * @date 2021年 04月30日 11:11
 */

//com.xiaomi.newretail.bean
//<jdbcConnection driverClass="com.mysql.cj.jdbc.Driver"
//        connectionURL="jdbc:mysql://localhost:3306/bishe?useUnicode=true&amp;useSSL=false&amp;characterEncoding=utf-8&amp;serverTimezone=Asia/Shanghai"
//        userId="root"
//        password="123456">
//</jdbcConnection>

public class MBGTest {
    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException, SQLException {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;

//        src/main/java/com/xiaomi/newretail/bootframe/api/params/generatorConfiguration.xml
//        File configFile = new File("classpath:generatorConfiguration.xml");
        File configFile = ResourceUtils.getFile("classpath:generatorConfiguration.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("uijghbil");
    }
}