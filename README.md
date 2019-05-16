# Java 学习

# java 程序运行流程

```
编写：是指在 Java 开发环境中进行程序代码的输入，最终形成后缀名为 java 的 Java 源文件。
编译：是指使用 Java 编译器对源文件进行错误排査的过程，编译后将生成后缀名为 .class 的字芾码文件，不像 C 语言那样生成可执行文件。
运行：是指使用 Java 解释器将字节码文件翻译成机器代码，执行并显示结果。

```

# 修饰符

- 权限修饰符: private, 默认的, protected, public
- 状态修饰符: static, final
- 抽象修饰符: abstract

> 类
  
  - 权限修饰符: 默认修饰符，public
  - 状态修饰符: final
  - 抽象修饰符: abstract
  - 用的最多的就是: public
> 成员变量
  
  - 权限修饰符: 默认修饰符, public
  - 状态修饰符: static, final
  - 用的最多的就是: private

> 构造方法

  - 权限修饰符: private, 默认的, protected, public

> 成员方法
  
  - 权限修饰符: private, 默认的, protected, public
  - 状态修饰符: static, final
  - 抽象修饰符: abstract
  - 用的最多的: public
  
# 关键字

> super
    
  - super.成员变量: 父类的成员变量
  - super.成员方法(形参): 父类的成员方法
  - super(形参)： 父类的构造方法
  
> final
  
  - final 修饰的类是最终类,不可被继承
  - final 修饰的方法是最终方法, 不可被重写
  - final 修饰的变量是常量,只可以赋值一次
  
> this
  
  - 代表当前的对象,谁调用代表谁: 那个对象调用this所在的函数,this就是代表那个对象
  - this.成员变量:本类的成员变量
  - this.成员方法(形参): 本类的成员方法
  - this(形参): 本类的构造方法

> static

  - 随着类的加载而加载;优先于对象存在; 被所有对象所共享, 可以直接 被类名所调用
  -     
     
  
  
  
  



参考: https://alleniverson.gitbooks.io/java-basic-introduction