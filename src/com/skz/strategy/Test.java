package com.skz.strategy;

/**
 * @author: 宋开宗
 * @create: 2018-10-19 12:58
 **/
public class Test {
    public static void main(String[] args) {
        MuteDuck muteDuck = new MuteDuck();
        muteDuck.setFlyBehaviour(new FlyWithWings());
        muteDuck.setQuackBehaviour(new Quack());
        muteDuck.performFly();
        muteDuck.performQuack();
    }
}
/**
 * 设计原则：1.找出应用中 可能需要变化之处，独立出来，不要和不变的代码混在一起。2.针对接口编程，实现动态绑定。
 * 组合复用原则：多使用组合达到代码的重用，少使用继承复用，组合大于继承。
 * 定义（维基百科）：对象有某个行为，但是在不同的场景中，该行为有不同的实现算法。
 *                   1.定义了一族算法
 *                   2.封装了每个算法
 *                   3.这族的算法可互换代替
 *
 * 本人总结：策略模式体现了组合大于继承的面向对象设计原则，使用场景是对象具有某个行为，但在不同场景中，该行为有不同的实现方法，
 *           我们要把这类行为独立出来，定义一个该行为的接口，并且有多个实现类，使得不同的实例对象可以动态绑定不同的实现方法。
 *
 * 举个栗子：1.假设鸭子都会游泳，鸭子样貌各有不同，有的鸭子会飞，有的不会，有的会呱呱叫，有的会吱吱叫，有的不会叫。
 *           那么会游泳是鸭子通用行为，样貌是全部各有不同，只有飞和叫，是部分不同。
 *
 *           分析：此时应当有一个抽象类Duck，swim方法（游泳）是普通方法由所有子类通用，display方法（样貌）是抽象方法交给子类实现。
 *           此时fly方法（飞）和quack方法（叫）如果定义在父类并不通用，交给子类实现又会有重复，唯有独立出来，组合使用最佳。
 *           飞和叫即为算法族，对于飞，会飞、不会飞为具体实现，对于叫，呱呱叫、吱吱叫、不会叫为具体实现。
 *           此时应有接口FlyBehavior，实现类FlyWithWings（用翅膀飞）,实现类FlyNoWay（不会飞），应有接口QuackBehaviour,实现类Quack,
 *           实现类Squeak,实现类MuteQuack。
 *           既然每个鸭子都具有飞和叫行为只是实现不同，在超类Duck 定义FlyBehavior，和QuackBehaviour字段，
 *           剩下就是看你需要静态绑定还是动态绑定，静态你直接在子类初始化具体实例，写死就ok，动态绑定，提供方法在创建实例时动态设置即可。
 *
 **/