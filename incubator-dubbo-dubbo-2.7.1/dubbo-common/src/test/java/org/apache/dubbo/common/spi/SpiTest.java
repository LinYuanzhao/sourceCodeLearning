package org.apache.dubbo.common.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.common.spi.dubbospi.service.DubboRobot;
import org.apache.dubbo.common.spi.javaspi.service.Robot;
import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

/**
 * @author billylin
 * @version 1.0
 * @description Spi test
 * @date 2019/4/26
 */
public class SpiTest {

    @Test
    public void javaSpiSayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }


    @Test
    public void dubboSpiSayHello() throws Exception {
        ExtensionLoader<DubboRobot> extensionLoader =
                ExtensionLoader.getExtensionLoader(DubboRobot.class);
        System.out.println("Dubbo SPI");
        DubboRobot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        DubboRobot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }

}
