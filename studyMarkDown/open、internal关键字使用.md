## open、internal 关键字使用

### open关键字
 在Java中允许创建任意的子类并重写任意方法，除非显示的使用了final 关键字进行标注。
 kotlin中，所有的类默认都是final的，那么就意味者不能被继承，而且在类中所有的方法也是默认是final的也不能被重写
 在kotlin中想继承父类应该怎么做呢？
 为类增加 open,class就可以被继承了
 ```
 open class Person{
 }
 ```
  为方法增加open，那么方法就可以被重写了
   ```
 open class Person{
    open fun eat(food:String){
    }
 }
 
 class Man:Person(){
    override fun eat(food:String){
        super.eat(food)
    }
 }
 ```
### internal关键字
 internal 修饰类的方法，表示这个类方法只适合当前module使用，如果其他modeule使用的话，会找不到这个internal 方法或报错