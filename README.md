## JAVA版微服务

### eureka-server
服务的注册与发现
eureka server 是有界面的，启动工程,打开浏览器访问： http://localhost:8761

### service
复杂逻辑和db都写在这里，可以开启多个

### v2-api和v2-web
对应:app服务和web服务通过Feign和service通信

### gateway
根据URL`v2-api`和`v2-web`后缀把流量分配到`v2-api`和`v2-web`2个服务

### server-zipkin
在spring Cloud为F版本的时候，已经不需要自己构建Zipkin Server了，只需要下载jar即可，下载地址：
https://dl.bintray.com/openzipkin/maven/io/zipkin/java/zipkin-server/
下载完成jar 包之后，需要运行jar，如下：
java -jar zipkin-server-2.10.1-exec.jar
访问浏览器localhost:9494

### 拓扑图

![拓扑图](.\拓扑图.png)