package cn.sfturing.patterns.strategy.example.Quack;

import cn.sfturing.patterns.strategy.inter.QuackBehavior;

/**
 * Created by Shi Xiaohao on 2017/8/4 下午3:46.
 * E-mail:sfturing@gamil.com
 * version:1.0
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence!");
    }
}
