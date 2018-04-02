package com.sxtx.controller;

import com.sxtx.ffmpeg.ConvertVedio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Created by wang on 2018/3/30.
 */
public class Test2 {
  
  @RequestMapping("test1")
    @ResponseBody
    public String TestVideo(){
        ConvertVedio.convertVedio("C:\\Users\\Administrator\\Desktop\\dialrotation.mp4");
        return "hahahahah";
    }
}
