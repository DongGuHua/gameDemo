package com.dong.server.impl;

import com.dong.entity.Root;
import com.dong.entity.RootExample;
import com.dong.mapper.RootMapper;
import com.dong.server.RootServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 董古华
 * @Create 2019/11/16 13:51
 * @see
 */
@Service
public class RootServerImpl implements RootServer {

    @Resource
    private RootMapper mapper;

    @Override
    public List<Root> query() {
        List<Root> roots = mapper.selectByExample(null);
        return roots;
    }

    @Override
    public Root queryRoot(int id) {
        Root root = mapper.selectByPrimaryKey(id);
        return root;
    }
}
