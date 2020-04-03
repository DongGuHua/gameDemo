package com.dong.server;

import com.dong.entity.Root;

import java.util.List;

/**
 * @Author 董古华
 * @Create 2019/11/15 18:00
 * @see  业务数据逻辑实现
 */
public interface RootServer {

    List<Root> query();  //查询全部
    Root queryRoot(int id); //查询单个

}
