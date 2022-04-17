## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
    // 抽象方法：它只有声明，而没有具体的实现 abstract关键字
    // 抽象类的定义为存在抽象方法的类，由此可知抽象类是为了继承而存在，但这并不代表抽象类只有抽象方法；
    // 其中他与普通类的区别在于：
    //1.抽象类只能是public与protected，默认是public
    // 2.抽象类是不能创建对象
    // 3.若子类继承后必须实现父类的抽象方法，若没实现父类则该子类也得是抽象类
    // -------------------------------------------------------
    // 接口
    // 接口中可以包含变量和方法，其中接口中的变量会被默认为public static final 变量不可使用private修饰，而方法也只能使用public与abstract关键字，接口是不能有具体的实现方法所以接口中的方法全是抽象方法，它比抽象类更加抽象
    // 接口的重要作用是实现类的多重继承
    // 1.抽象方法中可以有main方法并运行，抽象方法可以继承一个类和实现那个多个接口，比接口速度要块
    1.类：返回的是该类的对象
2.抽象类：返回的是该抽象类的子类对象
3.接口：返回的是该接口的实现类对象，返回值类型是接口，其实返回的是接口的实现类对象
	包：其实就是文件夹
	作用：对类进行分类管理
	
	包的划分：
	举例：
		学生的增加，删除，修改，查询
		老师的增加，删除，修改，查询
		工人的增加，删除，修改，查询
	A:按照功能分
		cn.itcast.add
			AddStudent
			AddTeacher
			AddWorker
		cn.itcast.delete
			DeleteStudent
			DeleteTeacher
			DeleteWorker
		cn.itcast.update
		cn.itcast.find
	B:按照模块分
		cn.itcast.student
			add
			delete
			update
			find
		cn.itcast.teacher
			add
			delete
			update
			find
		cn.itcast.worker
			add
			delete
			update
			find
	
	定义包的格式:
		package 包名;
	带包的编译和运行：
		手动式：
			A:编译带包的类文件
			B:自己手动创建包
			C:把编译生成的class文件放到包里面去
			D:运行即可，注意要带包名
				java cn.itcast.HelloWorld
		自动式：
			A:编译的时候带一个参数 -d
				javac -d . HelloWorld.java
			B:运行即可，注意要带包名
				java cn.itcast.HelloWorld
		注意事项：
			package语句必须是程序的第一条可执行的代码
			package语句在一个java文件中只能有一个
			如果没有package，默认表示无包名
内部类：把类定义在其他类的内部，这个类就被称为内部类。
		举例：把类A定义在类B的内部，A被称为内部类。
	内部类的访问特点：
		A:内部类可以直接访问外部类的成员，包括私有。
		B:外部类要访问内部类的成员，必须创建对象。
	根据内部类在类中的位置不同，内部类可以分为：
		A:成员位置
			成员内部类
		B:局部位置
			局部内部类
	成员内部类：
		A:访问内部的方法
			创建内部类的对象即可。
			格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象
####hasNextXxx():判断下一个输入项是不是指定的数据类型   
 * public int nextInt():获取一个int类型的数据
 * public String nextLine():获取一个字符串类型的数据 
 * 实列变量不能通过类名来进行访问而应该利用实列对象来访问
 * 类变量可通过类名直接访问也可利用实列对象来访问    
 * 类方法只能访问类变量而实列方法两者变量都可以操作
 * 1.实例方法与类方法的定义。通过static关键字进行区分,方法类型说明符前有satic关键字的为类方法,无关键字的为实例方法,这里需要注意的是static关键字一定是最先申明的,在类型说明符之前
 * 类变量是对象共有的，其中一个对象将他值改变，其他对象得到的就是改变后的结构；
 * 实例对象是则是对象私有，讲一个对象的只改变，不影响其他对象的值。
1. 类方法
    1. 类方法不能引用对象变量（实例变量）
    2. 类方法中不能调用类的对象方法(实列方法)
    3. 在类方法中不能调用使用super，this关键字
    4. 类方法不能被覆盖
2. 实例方法
    1. 实例方法可以引用对象变量和类变量
    2. 实例方法可以调用类方法
    3. 对象方法中可以使用super，this关键字

3. 区别
    1. 类方法可以通过类名调用，而实例方法不能通过类名来调用
    2. 类方法不仅可以被类创建的任何对象调用执行，也可以通过类名调用
    3. 当类创建对象后，类的实例方法才分配入口地址，而类方法当类开始运行时类方法就已经分配完地址了
###final关键字
1. 使用final修饰的类不能有子类
2. 使用final修饰的方法不能别子类重写
3. 使用final修饰的变量（成员变量和局部变量）是常量，常量不可修改
###天数计算
1. 键盘录入你的出生年月日
2. 把这个字符串转换为一个日期sdf.parse(s)
3. 通过日期获取到一个毫秒值 对象.getTime()
4. 获取当前时间的毫秒值 currentTimeMillis()
5. 用D-C得到一个毫秒值 减法
6. 把E得到的毫秒值计算成一个天即可 /1000/60/24 codeif
##Math类
1. abs()绝对值
2. ceil();大于等于参数的最小整数值
3. floor();小于等于的最大整数值
4. min max 两个参数取最大值和最小值，两者可以嵌套使用
5. pow（a,b）a的b次方的值
6. random()产生随机数
7. round()取整
8. sqrt()平方
##Array类
1. arraycopy(src,srcPos, dest,destpos ,length)
   1. src：要复制的数组(源数组)

   2. srcPos：复制源数组的起始位置

   3. dest：目标数组

   4.  destPos：目标数组的下标位置

   5.  length：要复制的长度
##正侧表达式

1. 字符
	>>x 字符x
	\\ 反斜线字符
	\n 换行符
	\r 回车符
	
2. 字符类
	>>[abc] a、b 或 c
	[^abc] 任何字符，除了 a、b 或 c
	[a-zA-Z] a到 z或 A到 Z，两头的字母包括在内 
	[0-9] 包括数字字符0-9
	
3. 预定义字符类
	>>. 任何字符
	\d 数字：[0-9]
	\w 单词字符：[a-zA-Z_0-9]
	
4. 边界匹配器
	>>^ 行的开头 
	$ 行的结尾 
	\b 单词边界(不能是单词字符)
		hello?hao are you.
		
5. 数量词
    >>X? X，一次或一次也没有 
    X* X，零次或多次 
    X+ X，一次或多次 
    X{n} X，恰好 n 次 
    X{n,} X，至少 n 次 
    X{n,m} X，至少 n 次，但是不超过 m 次 