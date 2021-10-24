package VirtualMachine.Chapter02;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/30 11:28 上午
 */
public class ClinitTest01 {
    static class Father {
        public static int A = 1;

        static {
            A = 2;
        }
    }

    static class Son extends Father {
        public static int B = A;
    }

    public static void main(String[] args) {
        // 加载 Father 类，然后加载 Son 类
        // 父类中的 A 已经变成 2 了，所以在这里显示的就是 2
        System.out.println(Son.B); // 2
    }
}
