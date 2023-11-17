package cn.sfturing.patterns.strategy.example.Fly;

import cn.sfturing.patterns.strategy.inter.FlyBehavior;

/**
 * Created by Shi Xiaohao on 2017/8/4 下午3:41.
 * E-mail:sfturing@gamil.com
 * version:1.0
 */
public class FlyNoWay implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
