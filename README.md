# HashLookup
HashLookup 是一个 Java 命令行程序，旨在利用哈希表实现元素值的快速查找。用户可以输入多个元素，并在后续根据输入的查询值获取该元素在数组中所有出现的序号。该程序特别适合处理数据中存在重复元素的情况，能够大幅提升查找效率。

功能
输入元素: 用户可以输入任意数量的数组元素。
快速查找: 支持根据指定元素值查询该元素在数组中的所有序号。
处理重复: 可以有效处理输入中重复的元素，返回所有对应的索引。
技术栈
编程语言: Java
数据结构:
java.util.HashMap：用于存储元素值与对应的序号列表。
java.util.ArrayList：用于存储元素在数组中出现的所有序号。
软件安装
系统要求
操作系统: Windows, macOS 或 Linux
Java 运行时环境: JDK 8 或更高版本
。
配置环境变量:

将 JDK 的 bin 目录添加到您的系统 PATH 环境变量中，以便在命令行中访问 Java 编译器和运行时工具。
下载代码:

您可以通过以下命令克隆项目代码，或直接下载 ZIP 文件：
bash
git clone https://github.com/yourusername/HashLookup.git  
替换 yourusername 为您的 GitHub 用户名。
进入项目目录:



编译成功后，运行以下命令启动程序：
bash
java HashLookup  
输入示例
输入数组元素的个数:
makefile
请输入数组元素的个数: 5  
输入每个元素的值:
请输入 5 个元素（只输入值）：  
输入第 1 个元素的值: Apple  
输入第 2 个元素的值: Banana  
输入第 3 个元素的值: Apple  
输入第 4 个元素的值: Orange  
输入第 5 个元素的值: Banana  
查找元素:
makefile
请输入要查找的元素值: Banana  
输出示例
查找结果：
arduino
元素值 "Banana" 在数组中的序号为: [2, 5]  
如果未找到该元素：
未找到对应的元素.  
