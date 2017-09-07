---
title:Java8新特性
data:2017/9/7
tags:
---
java8的一些新特性：

 1. 流处理（`stream API`）
 2. 行为参数化  ::
 3. Lambda
 4. 方法引用（predicate--谓词）
 5. 默认方法（default）
 6. `Optional<T>`容器对象 可包含空值

**Stream API+lambda+行为参数化**

```
things=filterThings(things,(Thing a)->a.getColor().equals("red"));
List<Thing> blueThings=things.stream().filter((Thing t)->t.getColor().equals("blue")).collect(Collectors.toList());
List<Thing> parallelThings=things.parallelStream().filter((Thing t)->t.getSize()<5).collect(Collectors.toList());
```

**行为参数化**
 1. predicate 流程
```flow
st=>start: 建立接口（接口有一个默认的方法test） 
e=>end: 行为参数化 
op=>operation: 实现这个接口，并重写方法

st->op->e 
```

```
public static boolean testSizeBig(Thing thing){
        return thing.getSize()>5;
}
filter(xxx,class::testSizeBig)
```

**default**

 - 扩写接口且实体类不用显式实现

