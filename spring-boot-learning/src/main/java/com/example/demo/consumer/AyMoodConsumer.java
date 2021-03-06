package com.example.demo.consumer;

import com.example.demo.model.AyMood;
import com.example.demo.service.AyMoodService;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 消费者
 * @author Lishihao
 * @create 2022/04/29
 */
@Component
public class AyMoodConsumer{

    @JmsListener(destination = "ay.queue")
    public void receiveQueue(String text) {
        System.out.println("用户发表说说【" + text + "】成功");
    }

    @Resource
    private AyMoodService ayMoodService;

    @JmsListener(destination = "ay.queue.asyn.save")
    public void receiveQueue(AyMood ayMood){
        ayMoodService.save(ayMood);
    }

}
