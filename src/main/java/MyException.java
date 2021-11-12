/**
 * Project name(项目名称)：自定义异常
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyException
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/12
 * Time(创建时间)： 10:26
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class MyException extends Exception
{
    public MyException()
    {
        super();
        System.out.println("调用无参构造方法");
        System.out.println("您输入的年龄为负数！输入有误！");
    }

    public MyException(String str)
    {
        super(str);
        System.out.println("调用有参构造方法");
    }
}
