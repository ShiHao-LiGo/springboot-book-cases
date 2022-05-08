package com.example.demo.service;

import com.example.demo.model.AyMood;

/**
 * @author Lishihao
 * @create 2022/04/29
 **/
public interface AyMoodService {

    AyMood save(AyMood ayMood);

    String asynSave(AyMood ayMood);
}
