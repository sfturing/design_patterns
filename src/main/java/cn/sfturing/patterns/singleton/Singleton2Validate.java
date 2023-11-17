package cn.sfturing.patterns.singleton;

/**
 * Created by Shi Xiaohao on 2017/9/27 上午9:14.
 * E-mail:sfturing@gamil.com
 * version:1.0
 */


/**
 * 单例设计模式中的双重判断的理解和分析
 */
public class Singleton2Validate {
    //持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
    private static Singleton2Validate instance = null;

    //私有构造方法，防止创建实例
    private Singleton2Validate() {

    }

    //创建实例方法
    public static Singleton2Validate getInstance() {
        //位置1　
        if (instance == null) {
            //位置2
            synchronized (instance) {
                //位置3
                if (instance == null) {
                    instance = new Singleton2Validate();
                }
            }
        }
        return instance;
    }
}
/**
 * 假设线程A和B作为第一批调用者同时或几乎同时调用静态工厂方法getInstance。

 1）因为A和B是第一批调用者，当它们进入静态工厂方法时，instance变量是null。因此它们几乎同时到达 位置2。

 2)  假设A线程先进入 synchronized (instance)，到达位置3，这时由于同步机制，线程B无法到达位置3，只能在位置2等待。

 3）线程A执行instance = new SingletonTwo()语句，使得instance引用指向一个对象。此时线程B还在位置2上等待。

 4）线程A退出synchronized (instance)，返回SingletonTwo对象，退出静态工厂方法。

 5）线程B进入 synchronized (instance)块，达到位置3，此时instance已经不为null，因此线程B退出synchronized (instance)，

 返回SingletonTwo对象（线程A所创建的SingletonTwo对象），退出静态工厂方法。

 到此为止，线程A和B得到同一个SingletonTwo对象。


 第一个if判断的作用：是为了提高程序的 效率，当SingletonTwo对象被创建以后，再获取SingletonTwo对象时就不用去验证同步代码块的锁及后面的代码，直接返回SingletonTwo对象

 第二个if判断的作用：是为了解决多线程下的安全性问题，也就是保证对象的唯一。如果没有第二个if判断，在上面介绍的步骤5处，线程B进入synchronized (instance)块，不用去验证instance是否为null，就会直接创建一个SingletonTwo新对象，这样整个程序运行下来就有可能创建多个实例。



 */
