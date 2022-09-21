package cn.tineaine.origin.controller;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import cn.tineaine.origin.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "app")
public class PackageController {

    @Autowired
    PackageService packageService;
    // 获取应用列表
    @GetMapping("/list")
    public <T> T getList() {
        packageService.getPackageList();
        JSONArray arr = new JSONArray();
        JSONObject obj = JSONUtil.parseObj(
                "{" +
                        "name:\"Redis控制台\"," +
                        "type: \"script\"," +
                        "icon: \"https://github.githubassets.com/images/modules/profile/achievements/arctic-code-vault-contributor-default.png\"," +
                        "description: \"一个用于测试的软件包，没有实际意义\"," +
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

        arr.put(JSONUtil.parseObj(obj.toJSONString(0)));
        obj.set("name","Java环境部署");
        obj.set("icon","https://avatars.githubusercontent.com/u/112532863?s=64&v=4");
        arr.put(JSONUtil.parseObj(obj.toJSONString(0)));
        obj.set("name","Python环境部署");
        obj.set("state","installed");
        arr.put(obj);
        return (T) arr;
    }

}
