package cn.sftuirng.patterns.strategy.example.duck;

import cn.sftuirng.patterns.strategy.example.Fly.FlyWithWing;
import cn.sftuirng.patterns.strategy.example.Quack.Quack;

/**
 * Created by Shi Xiaohao on 2017/8/4 下午3:50.
 * E-mail:sfturing@gamil.com
 * version:1.0
 */
public class GreenDuck extends Duck{
    public  GreenDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWing();
    }

    @Override
    public void display() {
        System.out.println("green!");
    }
}
