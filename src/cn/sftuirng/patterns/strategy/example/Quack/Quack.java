package cn.sftuirng.patterns.strategy.example.Quack;

import cn.sftuirng.patterns.strategy.inter.QuackBehavior;

/**
 * Created by Shi Xiaohao on 2017/8/4 下午3:45.
 * E-mail:sfturing@gamil.com
 * version:1.0
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
