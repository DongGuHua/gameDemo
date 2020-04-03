package com.dong.controller;

import com.dong.entity.Root;
import com.dong.server.impl.RootServerImpl;
import com.dong.util.Constans;
import com.dong.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 董古华
 * @Create 2019/11/15 17:43
 * @see 控制实现类
 */
@RestController
public class RootController {
    @Resource
    private RootServerImpl rootServer;

    @RequestMapping("/query")
    public Result query() {
        List<Root> query = rootServer.query();
        if (query != null) {
            return new Result(Constans.SUCCERS, Constans.MESSAGESU, "", query);
        }
        return new Result(Constans.SUCCERS, Constans.MESSAGESU, "", query);
    }

    @GetMapping("/hello/{id}")
    public Result queryId(@PathVariable int id) {
        Root root = rootServer.queryRoot(id);
        if (root != null) {
            return new Result(Constans.SUCCERS, Constans.MESSAGESU, root, null);
        }
        return new Result(Constans.SUCCERS, Constans.MESSAGESU, root, null);
    }
}