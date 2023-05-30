package org.springframework.wx.lifesycle;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @author wuxin
 * @date 2023/04/18 16:28:21
 */
@Component
public class MySmartLifeCycle implements SmartLifecycle {


    private boolean isRuning = false;

    /**
     * isRunning是false的时候才会执行
     */
    @Override
    public void start() {
        System.out.println("容器现在开始启动");
        isRuning = true;
    }

    /**
     * jvm默认会等所有的hook都执行完毕之后才会 关闭虚拟机
     * isRunning是true的时候才会执行
     */
    @Override
    public void stop() {
        System.out.println("现在关闭开始----------------------------------现在关闭");

        for (int i = 1; i < 100; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(("执行" + i + "次"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("现在关闭结束----------------------------------现在关闭");
        isRuning = false;
    }

    /**
     * 在DefualtLifeCycleProcessor在调用这些是实现类的时候
     * 会先检测容器是否还存货，如果不在存活则不会调用
     * 也就是说这里给了false这里就不会被调用
     * @return
     */
    @Override
    public boolean isRunning() {
        return isRuning;
    }


}
