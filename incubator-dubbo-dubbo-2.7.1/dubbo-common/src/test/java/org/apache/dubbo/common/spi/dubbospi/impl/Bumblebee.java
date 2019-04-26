package org.apache.dubbo.common.spi.dubbospi.impl;

import org.apache.dubbo.common.spi.dubbospi.service.DubboRobot;

/**
 * @author billylin
 * @version 1.0
 * @description TODO
 * @date 2019/4/26
 */
public class Bumblebee implements DubboRobot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime, DubboRobot");
    }
}
