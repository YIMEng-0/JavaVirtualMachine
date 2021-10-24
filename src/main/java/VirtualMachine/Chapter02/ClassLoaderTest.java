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

        // 获取其上层 扩展类加载器
        ClassLoader extClassLader = systemClassLoader.getParent();
        System.out.println(extClassLader);     // sun.misc.Launcher$ExtClassLoader@2503dbd3
        // 是一种包含的关系


        ClassLoader bootstrapClassLader = extClassLader.getParent();
        System.out.println(bootstrapClassLader); // null\
        ClinitTest test = new ClinitTest();
    }
}
