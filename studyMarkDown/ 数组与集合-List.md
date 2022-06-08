##数字与集合-List
kotlin 的list分为可变的和不可变的 两种

### 声明和创建 List
listOf(): List<T>
该函数返回不可变的List集合，包含null（Kotlin 1.1 返回的是 java.util.Arrays$ArrayList）
listOfNotNull(): List<T>
该函数返回不可变的List集合，不包含null（Kotlin 1.1 返回的是 java.util.ArrayList）
mutableListOf(): MutableList<T>
该函数返回可变的MutableList集合
arrayListOf(): ArrayList<T>
该函数返回可变的ArrayList集合

```
val list1 = listOf("Java", "Kotlin", null, "Go")
println(list1) //[Java, Kotlin, null, Go]
println("listOf() 返回的对象实例类型是：${list1.javaClass}") //listOf() 返回的对象实例类型是：class java.util.Arrays$ArrayList
val list2 = listOfNotNull("Java", "Kotlin", null, "Go")
println(list2) //[Java, Kotlin, Go]
println("listOfNotNull() 返回的对象实例类型是：${list2.javaClass}") //listOfNotNull() 返回的对象实例类型是：class java.util.ArrayList
val mutableList = mutableListOf("Java", "kotlin", null, "Go")
println(mutableList) //[Java, kotlin, null, Go]
println("mutableListOf() 返回的对象实例类型是：${mutableList.javaClass}") //mutableListOf() 返回的对象实例类型是：class java.util.ArrayList
val arrayList = arrayListOf("Java", "Kotlin", null, "Go")
println(arrayList) //[Java, Kotlin, null, Go]
println("arrayListOf() 返回的对象实例类型是：${arrayList.javaClass}") //arrayListOf() 返回的对象实例类型是：class java.util.ArrayList
```
注意：如果期望使用ArrayList的话，最好使用arrayListOf()，而不要使用mutableListOf()，以免 Kotlin 底层修改逻辑导致程序出现bug

### 使用 List 中的方法
get(): E / []: E
访问集合元素
indexOf(): Int
返回集合元素在 List 中的索引
lastIndexOf(): Int
返回集合元素在 List 中最后一次出现的位置
subList(): List<E>
返回 List 集合的子集合

```
val list = listOf("Java", "Kotlin", null, "Go", "Java")
// 使用 get 方法，或 [] 访问集合元素（因为 get 方法是由 operator 关键字修饰的）
println(list.get(1)) //Kotlin
println(list[1]) //Kotlin

// 返回集合元素在 List 中的索引
println(list.indexOf("Java")) //0

// 返回集合元素在 List 中最后一次出现的位置
println(list.lastIndexOf("Java")) //4

// 返回 List 集合的子集合
println(list.subList(1, 3)) //[Kotlin, null]
```

### List 的遍历
for(item in list) { ... }
for-in 遍历，遍历元素
for(index in list.indices) { ... }
for-in 遍历，遍历下标
for ((index, item) in list.withIndex()) { ... }
withIndex() 方法返回一个 Iterable 对象，该对象的所有元素都是 IndexedValue
list.forEach { ... }
forEach Lambda 表达式遍历

```
val list = listOf("Java", "Kotlin", null, "Go")
// for-in 遍历，遍历元素
for (item in list) {
    println(item)
}

// for-in 遍历，遍历下标
for (index in list.indices) {
    println(list[index])
}

// for-in 遍历，使用 withIndex
for ((index, item) in list.withIndex()) {
    println("第 $index 个元素是 $item")
}

// forEach Lambda 表达式遍历
list.forEach {
    println(it)
}
```

###可变 List 的添加、删除和替换
add(index: Int, element: E): Unit
在指定索引 index 处插入一个新元素 E
removeAt(index: Int): E
删除索引 index 处的元素，return 当前被删除的元素
list[index] = E
将索引 index 处的元素替换为 E
clear(): Unit
清空 List 中的所有元素

```
val mutableList = mutableListOf("Java", "kotlin", null, "Go")
// 在索引2处插入一个新元素
mutableList.add(2, "Swift")
println(mutableList) //[Java, kotlin, Swift, null, Go]
println(mutableList.size) //5

// 删除索引1处的元素
mutableList.removeAt(1)
println(mutableList) //[Java, Swift, null, Go]
println(mutableList.size) //4

// 将索引1处的元素替换为 TypeScript
mutableList[1] = "TypeScript"
println(mutableList) //[Java, TypeScript, null, Go]
println(mutableList.size) //4

// 清空List中的所有元素
mutableList.clear()
println(mutableList) //[]
println(mutableList.size) //0
```
List 中的很多方法均与 Set 中一致