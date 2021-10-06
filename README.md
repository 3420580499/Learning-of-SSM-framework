# Learning-of-SSM-framework
ssm note    
``````
ps:最下面的ssm考试管理系统是根据javaweb项目改写的,还没有写完,只写了一点点,算是比较简单的CRUD项目了
``````
# maven模块名称的修改    
``````
同时要修改iml文件中的编译类存放的路径
``````     
# mybatis     
  * getMapper方法会去创建dao接口的实现类对象,我们不用去自己创建dao接口的是实现类       
# spring    
 spring中使用事务的方式有两种 :     
  * 通过spring中自带的事务处理机制(使用注解)--适合中小型的项目       
  * 通过aspectj处理事务(使用xml文件)--适合大型的项目      