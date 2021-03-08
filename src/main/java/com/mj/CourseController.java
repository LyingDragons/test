package com.mj;

import org.springframework.web.bind.annotation.*;

/**
 * @author ""
 * @version 1.0
 * @date 2020/4/15 15:30
 */
@RestController
public class CourseController {


    @GetMapping("index")
    public String getCoueses() {
        return "666";
    }
    
}
