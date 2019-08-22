package com.xust.iot.service;

import java.util.List;

/**
 * @Author: HuangXin
 * @Date: Created in 11:28 2019/8/22
 * @Description:
 */
public interface ServiceBase<T> {

    public T getById(Object param);


    public void deleteById(Object param);

    public void updateAndSave(T t);

    public void addAndSave(T t);


    public List<T> getAll();

}
