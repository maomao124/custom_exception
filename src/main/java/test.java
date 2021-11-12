import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Project name(项目名称)：自定义异常
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/12
 * Time(创建时间)： 10:26
 * Version(版本): 1.0
 * Description(描述)：
 * 如果 Java 提供的内置异常类型不能满足程序设计的需求，这时我们可以自己设计 Java 类库或框架，其中包括异常类型。
 * 实现自定义异常类需要继承 Exception 类或其子类，如果自定义运行时异常类需继承 RuntimeException 类或其子类。
 * 自定义异常的语法形式为：
 * <class><自定义异常名><extends><Exception>
 * 自定义异常类一般包含两个构造方法：一个是无参的默认构造方法，另一个构造方法以字符串的形式接收一个定制的异常消息，并将该消息传递给超类的构造方法。
 */

public class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("请输入您的年龄：");
        try
        {
            age = input.nextInt();    // 获取年龄
            if (age < 0)
            {
                throw new MyException();
            }
            else if (age > 100)
            {
                throw new MyException("您输入的年龄大于100！输入有误！");
            }
            else
            {
                System.out.println("您的年龄为：" + age);
            }
        }
        catch (InputMismatchException e1)
        {
            Toolkit.getDefaultToolkit().beep();
            System.out.println("输入的年龄不是数字！");
        }
        catch (MyException e2)
        {
            System.out.println(e2.getMessage());
        }
    }
}
