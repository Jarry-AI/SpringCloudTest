package com.example.easyexcel.utils;

import com.alibaba.fastjson.JSON;
import org.assertj.core.util.Lists;
import org.springframework.beans.BeanUtils;

import java.util.Collection;
import java.util.List;

/**
 * description CopyUtil
 * @date 2020/1/17
 */
public class CopyUtils {
    /**
     * 将对象A的值拷贝到对象B中.
     */
    public static void copy(Object source, Object destinationObject) {
        BeanUtils.copyProperties(source, destinationObject);
    }

    /**
     * 转换对象的类型.
     */
    public static <T> T copy(Object source, Class<T> destinationClass) {
        T destinationObject = null;
        try {
            destinationObject = destinationClass.newInstance();
            BeanUtils.copyProperties(source, destinationObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return destinationObject;
    }

    /**
     * 通过序列化拷贝Collection
     */
    public static <T> List<T> jsonCopyList(Collection<?> sourceList, Class<T> destinationClass) {
        return JSON.parseArray(JSON.toJSONString(sourceList), destinationClass);
    }


    /**
     * 转换Collection中对象的类型.
     */
    public static <T> List<T> copyList(Collection<?> sourceList, Class<T> destinationClass) {
        List<T> destinationList = Lists.newArrayList();
        for (Object sourceObject : sourceList) {
            try {
                T destinationObject = destinationClass.newInstance();
                BeanUtils.copyProperties(sourceObject, destinationObject);
                destinationList.add(destinationObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return destinationList;
    }


}
