package cn.yongyech.template.config.exception;

import cn.yongyech.template.R.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 拦截任何异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(value=Exception.class)
    public R exceptionHandler(HttpServletRequest request, Exception e){

         if (e instanceof MyException){
            MyException exception = (MyException) e;
            return R.fail(exception.getMsg());
        }else if (e instanceof Exception){
             return R.fail(e.getMessage());
         } else {
            return R.fail("数据执行异常");
        }

    }


}
