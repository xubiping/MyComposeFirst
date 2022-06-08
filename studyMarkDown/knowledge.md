## compose 基础知识
###1、语言限制：Compose仅支持kotlin语言，kotlin最低版本 1.4.32
###2、语法重定义：去掉原有的xml布局方式，全部改为代码操控ui。
###3、Surface是什么？
   Surface的 本质是一块或几块GraphicBuffer内存的管理类，并提供对Buffer的管理方法。
###4、包名下面多了一个ui.theme包,as自动给我们创建了几个类：
   Color.kt: 存放颜色的类，类似之前的colors.xml
   Shape.kt: 存放形状等资源的类，类似之前的drawable资源文件下的shape
   Theme.kt: 存放样式的类，类似之前的style.xml/theme.xml
   Type.kt: 存放样式的类
###5、res部分，和以前创建项目明显的区别就是：没有了layout 文件夹，因为compose 是一种完全基于
   声明式组件的方法，存代码编写，不用再去编写xml布局文件了

###6、Gradle7.0 推出了一个新的特性，使用Catalog 统一依赖版本，它支持以下特性：
   参考网站：http://www.proyy.com/6997396071055900680.html
   1）、对多有module可见，可统一管理所有的module的依赖
   2）、支持声明依赖bundles，即总是一起使用的依赖可以组合在一起
   3）、支持版本号与依赖名分离，可以在多个依赖间共享版本号
   4）、支持在单独的libs.versions.toml文件中配置依赖
   5）、支持在项目间共享依赖