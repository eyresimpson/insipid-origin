package cn.tineaine.origin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("package")
public class PackageController {

    @GetMapping("/getList")
    public <T> T getList() {
        return (T) "package/list";
    }

}
