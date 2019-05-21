# Java 学习

# java 程序运行流程

```
编写：是指在 Java 开发环境中进行程序代码的输入，最终形成后缀名为 java 的 Java 源文件。
编译：是指使用 Java 编译器对源文件进行错误排査的过程，编译后将生成后缀名为 .class 的字芾码文件，不像 C 语言那样生成可执行文件。
运行：是指使用 Java 解释器将字节码文件翻译成机器代码，执行并显示结果。

```
# JVM 原理：

> Java 源程序编译之后生成的是字节码文件（平台无关的）, 不同平台上的JVM是不同的, 不同平台jvm负责将字节翻译成对应平台的机器指令,这样过程即可实现Java程序的跨平台

# JVM 和 JRE(Java Runtime Environment)

> JRE = JVM + 各种基础类库 + Java类库(String\System)

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
  - 静态方法之只能访问静态成员, 非静态方法既可以访问静态也可访问非静态成员
  - 静态方法中不可以定义 this , super 关键字, 因为静态优先于对象存在, this和super 所代表的当前对象或父类对象可能还不存在
      
     
# 线程控制


  | 方法名称 | 功能描述 |
  | ------ | ------ |
  | sleep(long millis) | 线程休眠,让当前线程暂停，进入休眠等待状态 |
  | join() | 线程加入,等待目标线程执行完之后再继续执行,调用该方法的线程会插入优先先执行 |
  | yield() | 线程礼让,暂停当前执行的线程对象，并执行其他线程 |
  | setDaenon(booleanon) | 将该线程标记为守护线程或用户线程。当正在运行的线程都是守护线程时,Java虚拟机推出.该方法必须再启动线程前调用 |
  | stop() | 让线程停止,过时了,但是还可以使用 | 
  | interrupt() | 中断线程, 把线程的状态终止 |
  | setPriority() | 更改线程的优先级 |
  | isInterrupted() | 线程是否被中断 |
  
  

# 单列集合

Collection: 单列集合类的根接口, 用于存储一系列符合某种规则的元素,它有两个重要的子接口. 分别是List 和 Set.




参考: https://alleniverson.gitbooks.io/java-basic-introduction