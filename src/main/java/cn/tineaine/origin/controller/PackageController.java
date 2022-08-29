package cn.tineaine.origin.controller;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "app")
public class PackageController {
    // 获取应用列表
    @GetMapping("/list")
    public <T> T getList() {
//        {
        //   name,
        //   type: "script",
        //   description: "一个简单的脚本",
        //   author: "aine",
        //   updateTime: new Date(),
        //   downloadCount: 0,
        //   grade: 0,
        //   picture: [],
        //   size: "1220kb",
        //   language: "zh-CN",
        //   cost: "0￥",
        //   state: "uninstalled",
        // }
        JSONArray arr = new JSONArray();
        JSONObject obj = JSONUtil.parseObj(
                "{" +
                        "name:\"test\"," +
                        "type: \"script\"," +
                        "description: \"非常好\"," +
                        "author: \"aine\"," +
                        "updateTime: new Date()," +
                        "downloadCount: 0," +
                        "grade: 0," +
                        "picture: []," +
                        "size: \"1220kb\"," +
                        "language: \"zh-CN\"," +
                        "cost: \"0￥\"," +
                        "state: \"uninstalled\"," +
                        "}"
        );
        arr.put(obj);
        return (T) arr;
    }

}
