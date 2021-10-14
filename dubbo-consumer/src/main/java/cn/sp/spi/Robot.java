package cn.sp.spi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @Author: Ship
 * @Description:
 * @Date: Created in 2021/10/13
 */
@SPI
public interface Robot {

    /**
     * say hello
     * @return
     */
    String sayHello();
}
