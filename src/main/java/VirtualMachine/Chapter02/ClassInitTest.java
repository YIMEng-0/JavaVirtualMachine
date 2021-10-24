package VirtualMachine.Chapter02;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/30 11:04 上午
 */

// 任何的类在声明之后，至少存在一个类的构造器
public class ClassInitTest {
    private static int num = 1;

    static {
        num = 2;
        System.out.println(num);
        number = 20;
//        System.out.println(number); // 非法的前向引用，后面才声明的，在前面是不可以调用的
    }

    // 看起来声明是在下面的，上面进行了重新的赋值操作
    // 虚拟机中执行的过程： linking 中的 prepare：number = 0 --》 initial = 0 --》：20 = 10；
    private static int number = 10;
    public static void main(String[] args) {
        System.out.println(ClassInitTest.num); // 2
        System.out.println(number); // 10
    }
}