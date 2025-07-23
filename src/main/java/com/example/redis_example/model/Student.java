package com.example.redis_example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
@RedisHash("Student")
public class Student implements Serializable {

    public enum Gender {
        MALE, FEMALE
    }

    private String id;
    private String name;
    private Gender gender;
    private int grade;
}
