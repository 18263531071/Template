package cn.yongyech.template.config;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;

/**
 * @author W
 * @create 2022/8/12 11:46
 * @Description
 */
public class LambdaExcludeEmptyQueryWrapper<T> extends LambdaQueryWrapper<T> {

    @Override
    public LambdaQueryWrapper<T> eq(SFunction<T, ?> column, Object val) {
        if (val!=null) {

            return super.eq(true, column, val);
        }else {
            return super.eq(false, column, val);
        }
    }


    @Override
    public LambdaQueryWrapper<T> ne(SFunction<T, ?> column, Object val) {
        if (val!=null) {

            return super.ne(true, column, val);
        }else {
            return super.ne(false, column, val);
        }
    }

    @Override
    public LambdaQueryWrapper<T> gt(SFunction<T, ?> column, Object val) {
        if (val!=null) {

            return super.gt(true, column, val);
        }else {
            return super.gt(false, column, val);
        }
    }

    @Override
    public LambdaQueryWrapper<T> ge(SFunction<T, ?> column, Object val) {
        if (val!=null) {

            return super.ge(true, column, val);
        }else {
            return super.ge(false, column, val);
        }
    }

    @Override
    public LambdaQueryWrapper<T> lt(SFunction<T, ?> column, Object val) {
        if (val!=null) {

            return super.lt(true, column, val);
        }else {
            return super.lt(false, column, val);
        }
    }

    @Override
    public LambdaQueryWrapper<T> le(SFunction<T, ?> column, Object val) {
        if (val!=null) {

            return super.le(true, column, val);
        }else {
            return super.le(false, column, val);
        }
    }

    @Override
    public LambdaQueryWrapper<T> between(SFunction<T, ?> column, Object val1, Object val2) {
        if (val1!=null||val2!=null) {

            return super.between(true, column, val1,val2);
        }else {
            return super.between(false,column, val1,val2);
        }
    }

    @Override
    public LambdaQueryWrapper<T> notBetween(SFunction<T, ?> column, Object val1, Object val2) {
        if (val1!=null||val2!=null) {

            return super.notBetween(true, column, val1,val2);
        }else {
            return super.notBetween(false,column, val1,val2);
        }
    }

    @Override
    public LambdaQueryWrapper<T> like(SFunction<T, ?> column, Object val) {
        if (val!=null) {

            return super.like(true, column, val);
        }else {
            return super.like(false, column, val);
        }
    }

    @Override
    public LambdaQueryWrapper<T> notLike(SFunction<T, ?> column, Object val) {
        if (val!=null) {

            return super.notLike(true, column, val);
        }else {
            return super.notLike(false, column, val);
        }
    }

    @Override
    public LambdaQueryWrapper<T> likeLeft(SFunction<T, ?> column, Object val) {
        if (val!=null) {

            return super.likeLeft(true, column, val);
        }else {
            return super.likeLeft(false, column, val);
        }
    }

    @Override
    public LambdaQueryWrapper<T> likeRight(SFunction<T, ?> column, Object val) {
        if (val!=null) {

            return super.likeRight(true, column, val);
        }else {
            return super.likeRight(false, column, val);
        }
    }
}
