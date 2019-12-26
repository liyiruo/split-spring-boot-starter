####自己手写一个spring-boot-starter

1. 写接口和实现类
`ISplitService
 SplitServiceImpl`
2. 配置类 
`SplitAutoConfigure`

3. 编写文件 spring.factories配置里面的信息
`org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.liyiruo.springboot.configure.SplitAutoConfigure`
4. 将项目打包  install  
   `split-spring-boot-starter-1.0-SNAPSHOT.jar`

5. 获取到版本信息 添加到新的项目即可使用

```xml
   <dependency>
           <groupId>com.liyiruo.springboot</groupId>
           <artifactId>split-spring-boot-starter</artifactId>
           <version>1.0-SNAPSHOT</version>
    </dependency>
```