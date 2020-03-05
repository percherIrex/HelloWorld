package com.gdou.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

@TableName(value = "user")      //实体类名与表名不一致时候用TableName
@Data
public class User {
    @TableId(value = "id",type = IdType.AUTO)   //设置主键自增
    private Integer id;
    private String name;
    private boolean gender;
}
