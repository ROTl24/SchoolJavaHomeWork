# SchoolJavaHomeWork
学校作业

【案例5-1】 模拟订单号生成
【案例介绍】
1.任务描述
编写一个程序，模拟订单系统中订单号的生成。例如给定一个包括年月日以及毫秒值的数组arr={2019,0504,1101},将其拼接成字符串s:[201905041101]。要求使用String类常用方法来实现字符串的拼接。

【案例任务】
	学会分析“模拟订单号生成”任务的实现思路。
	根据思路独立完成“模拟订单号生成”任务的源代码编写、编译及运行。
	掌握String类中常用方法的使用。
	掌握之前学习的for循环、方法调用等知识。

【案例思路】
（1）分析任务描述可知，做此任务需要先定义一个数组，数组中包括年月日以及毫秒值。
（2）要实现数组转成一个字符串，首先定义一个方法实现数组拼接成字符串。参数类型为数组，返回值类型为String，可先使用String定义一个空串，然后使用字符串的操作方法在开始最后加上“[]”字符。之后在加“[]”字符中间循环遍历数组用开始定义的字符串接收。自此，我们拼接的方法完成。在方法中将数组遍历，然后把每一个得到的字符拼接成一个字符串并且返回。    
（3） 在主函数入口调用刚才的方法。并定义一个字符串变量接收结果
（4） 输出结果，观察控制台的效果。
