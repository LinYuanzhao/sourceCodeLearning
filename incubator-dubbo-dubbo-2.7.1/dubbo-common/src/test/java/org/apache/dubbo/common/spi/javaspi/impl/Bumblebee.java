package org.apache.dubbo.common.spi.javaspi.impl;

import org.apache.dubbo.common.spi.javaspi.service.Robot;

/**
 * @author billylin
 * @version 1.0
 * @description TODO
 * @date 2019/4/26
 */
public class Bumblebee implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.");
    }
}
