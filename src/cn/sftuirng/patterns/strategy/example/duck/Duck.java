package cn.sftuirng.patterns.strategy.example.duck;

import cn.sftuirng.patterns.strategy.inter.FlyBehavior;
import cn.sftuirng.patterns.strategy.inter.QuackBehavior;


public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("Duck swim!");
    }

    public void display() {
        System.out.println("Duck!");
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    //......另外的行为

}
