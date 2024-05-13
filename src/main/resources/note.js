/**
 * idea使用笔记
 * 1.jdk18及之后版本，idea运行控制台中文显示乱码解决方案
 * 首先设置里调整idea控制台编码-文件编码为UTF-8
 * 然后自定义vm选项加入-Dfile.encoding=UTF-8
 * 最后编辑配置中，添加vm选项 输入 -Dfile.encoding=GBK
 * 分析问题原因，jdk18版本及以后，修改了jdk内部编码格式为GBK utf-8和GBK显示冲突
 */