java-maven-mybatis:第一个入门的mybatis例子

实现步骤:
1.新建的student表
2.加入maven的mybatis坐标,mysql驱动的坐标
3.创建实体类,Student--保存一行数据的
4.创建持久层的dao接口,定义操作数据库的方法
5.创建一个mybatis使用的配置文件
  叫做SQL映射文件:写sql语句的.一般一个表一个sql映射文件.这个文件是xml文件
  1.写在接口所在的目录中
  2.文件名称与接口保持一致
6.创建mybatis的主配置文件:
  一个项目就一个主配置文件.
  主配置文件提供了数据库的连接信息和SQL映射文件的位置信息
7.创建使用mybatis类,通过mybatis
-------------------------------------------------
8.找不到文件的三种处理方式:
  1).点击maven中的clean命令,然后再点击compile命令
  2).点击Build中的Rebuild Project
  3).点击File中的invalidate Caches/Restart(清除缓存并重启)
