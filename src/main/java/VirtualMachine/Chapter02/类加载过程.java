package VirtualMachine.Chapter02;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/30 10:51 上午
 */
public class 类加载过程 {
    private static int i = 1; // 在程序的准备阶段，此处的 i = 0; initial 的时候，赋值为 1

    public static void main(String[] args) {
        // 默认在其后面会加载很多与之相关的
        //  #29 = Utf8               VirtualMachine/Chapter02/类加载过程
        //  #30 = Utf8               java/lang/Object
        //  #31 = Utf8               java/lang/System
        //  #32 = Utf8               out
        //  #33 = Utf8               Ljava/io/PrintStream;
        //  #34 = Utf8               java/io/PrintStream
        //  #35 = Utf8               println
        //  #36 = Utf8               (I)V

        System.out.println(i);
    }
}
