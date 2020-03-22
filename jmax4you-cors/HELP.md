# 跨域请求
违法同源策略(Same-origin policy)导致，什么是同源策略？  
浏览器请求URL过程，如果链接中协议、域名、端口都一样，称为同源请求。  
非同源情况：  
>1、协议不同  
http://www.jmax4you.com/index 
https://www.jmax4you.com/send  
2、域名不同  
http://www.jmax4you.com/index  
http://www.jmax.com/send  
3、端口不同  
http://www.jmax4you.com/index  
http://www.jmax4you.com:8090/send 

相同源之间，浏览器默认允许互相访问资源和操作DOM；不同源之间想要互相访问或操作DOM，会有一套安全策略制约。体现在两方面： 

安全性：

> 浏览器防止当前站点私密数据往其它站点发送，如：当前站点Cookie、LocalStorage等；

可用性：

>允许静态资源跨站点访问，如为了缓解当前服务器带宽压力，会访问其它站点静态资源，通过<script>、<img>、<iframe>、<link>、<vedio>等

解决方案

>1、服务端解决方案  
针对简单请求
>>请求方法GET/HEAD/POST请求之一
仅能使用CORS安全的头部，Accept,Accept-Language, Content-Language,Content-Type，其中Content-Type的值只能是：text/plain,multipart/form-data,application/x-www-form-urlencoded三者其中之一
 服务端在http响应头中添加 Access-Control-Allow-Origin头，值为信任的站点。
复杂请求
>>  不符合简单请求都是复杂请求，复杂请求会先发起一个预检请求（OPTION请求）询问何种请求是被允许的，预检请求失败就不发起正式业务请求，预检请求成功才发起
复杂请求可以通过反向代理解决，前端访问统一站点，通过代理服务器内部转发。

>2、jsonp方式
其实就是利用script标签允许访问的src方式解决，后端返回一个js执行方法




