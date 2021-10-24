package VirtualMachine.类加载器;

import sun.security.provider.Sun;

import java.net.URL;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/24 7:37 下午
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("**=== 启动类加载器（也叫做引导类加载器） ===**");
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls) {
            System.out.println("可以加载的类路径为：" + url);
        }
    }
}
