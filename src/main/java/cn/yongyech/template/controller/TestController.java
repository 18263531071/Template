package cn.yongyech.template.controller;

import cn.yongyech.template.R.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


/**
 * @author W
 * @Description
 * @create 2022/4/22 11:08
 */
@Slf4j
@CrossOrigin        //开放前端的跨域请求
@Api(tags = "测试controller")
@RestController
@RequestMapping("api")
public class TestController {

    @ApiOperation("测试接口")
    @GetMapping("test")
    public R list() {

        return R.ok("test");
    }



}
