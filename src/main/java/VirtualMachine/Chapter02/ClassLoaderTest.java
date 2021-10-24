package VirtualMachine.Chapter02;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/3 10:34 下午
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader); // 打印了系统类加载器的一个引用  sun.misc.Launcher$AppClassLoader@18b4aac2

        // 获取其上层扩展类加载器
        ClassLoader extentClassLader = systemClassLoader.getParent();
        System.out.println(extentClassLader);     // sun.misc.Launcher$ExtClassLoader@2503dbd3
        // 是一种包含的关系


        ClassLoader bootstrapClassLader = extentClassLader.getParent(); // 扩展类加载器的上层是 null 说明其使用了引导类加载器，不是普通的系统类加载器；
        System.out.println(bootstrapClassLader); // null\
        ClinitTest test = new ClinitTest();

        // 对于用户自己定义的类来讲，默认使用的是系统类加载器进行加载的
        // 对于JDK 中的核心类库，默认使用的俄式引导类加载器进行加载的
        // 引导类加载器是使用 C C++ 编写的，它的对象是获取不到的
    }
}