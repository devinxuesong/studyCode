在Android的SDK之外，有一个工具就是NDK，用于进行C/C++的开发。一般情况，是用NDK工具把C/C++编译为.co文件，然后在Java中调用。
1、在平台之间移植其应用
2、重复使用现在库，或者提供其自己的库重复使用
3、在某些情况下提性能，特别是像游戏这种计算密集型应用
4、使用第三方库，现在许多第三方库都是由C/C++库编写的，比如Ffmpeg这样库。
5、不依赖于Dalvik Java虚拟机的设计
6、代码的保护。由于APK的Java层代码很容易被反编译，而C/C++库反编译难度大。

 so文件其本质就是一堆C、C++的头文件和实现文件打包成一个库。目前Android系统支持以下七种不用的CPU架构，每一种对应着各自的应用程序二进制接口ABI：(Application Binary Interface)定义了二进制文件(尤其是.so文件)如何运行在相应的系统平台上，从使用的指令集，内存对齐到可用的系统函数库。对应关系如下：
 ARMv5——armeabi
ARMv7 ——armeabi-v7a
ARMv8——arm64- v8a
x86——x86
MIPS ——mips
MIPS64——mips64
x86_64——x86_64
JNI下一共涉及到三个角色：C/C++代码、本地方法接口类、Java层中具体业务类。

JNI的命名规则
JNIExport jstring JNICALL Java_com_example_hellojni_MainActivity_stringFromJNI( JNIEnv* env,jobject thiz ) 
jstring 是返回值类型
Java_com_example_hellojni 是包名
MainActivity 是类名
stringFromJNI 是方法名
其中JNIExport和JNICALL是不固定保留的关键字不要修改

JNI开发流程的步骤：
第1步：在Java中先声明一个native方法
第2步：编译Java源文件javac得到.class文件
第3步：通过javah -jni命令导出JNI的.h头文件
第4步：使用Java需要交互的本地代码，实现在Java中声明的Native方法（如果Java需要与C++交互，那么就用C++实现Java的Native方法。）
第5步：将本地代码编译成动态库(Windows系统下是.dll文件，如果是Linux系统下是.so文件，如果是Mac系统下是.jnilib)
第6步：通过Java命令执行Java程序，最终实现Java调用本地代码。
 https://www.jianshu.com/p/87ce6f565d37
