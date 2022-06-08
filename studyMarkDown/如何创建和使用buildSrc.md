## 如何创建和使用buildSrc
参考网站：https://blog.csdn.net/qq_16692517/article/details/112882305

### 1、项目根目录下新建一个名为 buildSrc 的文件夹
 注意：名字必须是 buildSrc，因为运行 Gradle 时会检查项目中是否存在一个名为 buildSrc 的目录
### 2、在 buildSrc 文件夹里创建名为 build.gradle.kts 的文件
```
 plugins {
 `kotlin-dsl`
 }
 repositories {
 mavenCentral()
 google()
 gradlePluginPortal()
 } 
```

### 3、buildSrc下新建目录
其实选哪个都行，建议选择src\main\kotlin，因为这个项目使用到了kotlin-dsl，而且准备用kotlin开发，尊重一下。

### 4、在新建目录下新建各配置文件
提示：直接在kotlin文件目录下新建的好处在于，工程目录下的各Moudle引用的时候可以少输入一段代码。
举个例子
```
    //kotlin 目录下直接新建BuildConfig.kt并能添加stdlib对象
    implementation(BuildConfig.stdlib)
    //kotlin 目录下com/phz/build下新建BuildConfig.kt并能添加stdlib对象
    implementation(com.phz.build.BuildConfig.stdlib)
```
