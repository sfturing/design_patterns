package cn.sfturing.patterns.strategy.test;

import cn.sfturing.patterns.strategy.example.Fly.FlyNoWay;
import cn.sfturing.patterns.strategy.example.duck.Duck;
import cn.sfturing.patterns.strategy.example.duck.GreenDuck;

/**
 * Created by Shi Xiaohao on 2017/8/4 下午3:47.
 * E-mail:sfturing@gamil.com
 * version:1.0
 */
public class Test {
    public static void main(String [] arg){
        Duck greenDuck = new GreenDuck();
        greenDuck.display();
        greenDuck.performFly();
        greenDuck.performQuack();
        greenDuck.setFlyBehavior(new FlyNoWay());
        greenDuck.performFly();
    }
}
