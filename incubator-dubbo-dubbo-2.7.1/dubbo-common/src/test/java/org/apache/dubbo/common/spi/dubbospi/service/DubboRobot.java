package org.apache.dubbo.common.spi.dubbospi.service;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author billylin
 * @version 1.0
 * @description dubbo spi interface for test
 * @date 2019/4/26
 */
@SPI
public interface DubboRobot {
    void sayHello();
}
