package cn.yongyech.template.config.task;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;


/**
 * @author W
 * @Description
 * @create 2022/4/24 9:00
 */

@Slf4j
@Component
public class WxPayTask {

    /**
     * 秒, 分, 时, 日, 月, 周
     *?不指定   * 为无条件指定
     * 1-3从第一秒开始执行,从第三秒结束
     * 0/3 从0开始每隔三秒执行一次
     * 1,2,3从指定的1,2,3秒执行
     * 日和周不能同时指定,指定其一,则另一个设置为?
     */
//    @Scheduled(cron = "0/10 * * * * ?")
    public void task1(){
        log.warn("task1被执行>>>>>>>>>>>>>>>>>>>>>");
    }

    /**
     * 从0秒开始每隔30秒执行1次,查询创建超过5分钟,并且未支付的订单
     */
//    @Scheduled(cron = "0/10 * * * * ?")
    public void orderConfirm() throws IOException {

    }


}
