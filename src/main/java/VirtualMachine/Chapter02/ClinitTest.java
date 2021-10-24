package VirtualMachine.Chapter02;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/30 11:23 上午
 */
public class ClinitTest {
    private int a = 1;
    private static int c = 3;

    public static void main(String[] args) {
        int b = 2;
    }

    // 显式的创建了类的构造器
    public ClinitTest() {
        a = 10;
        int d = 20;
    }
}
