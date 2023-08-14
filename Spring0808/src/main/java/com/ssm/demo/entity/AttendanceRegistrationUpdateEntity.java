package com.ssm.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//引入javax.persistence中的@Entity注解，表示这是一个JPA实体类

@Entity
@Data
public class AttendanceRegistrationUpdateEntity {

	//主键标识，使用自增策略生成
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //以下是表中的各个列（字段）
    private String date;
    private String startTime;
    private String endTime;
    private String restTime;
    private String overtime;
    private String status;
    private String reason;
    private String workContent;

}

//这段代码定义了一个名为
//AttendanceRegistrationUpdateEntity的实体类
//用于映射到数据库中的表。
//它使用了JPA注解来指定如何映射实体类的属性和数据库表的字段。
//【@Entity】
//这是JPA注解，表示这个类是一个JPA实体类，会被映射到数据库表。
//【@Id】
//这个注解标注了实体类中用作主键的属性。
//【@GeneratedValue(strategy = GenerationType.IDENTITY)】
//这个注解指定主键的生成策略，这里使用了自增长的方式。
//然后，该类定义了多个私有属性，如date、startTime、endTime等等
//这些属性与你在HTML页面中定义的输入字段相对应。
//接着，每个属性都有对应的getter和setter方法，用于获取和设置属性的值。
//这个实体类的主要作用是定义了数据库表的结构。
//通过注解将实体类的属性映射到表的字段。
//从而使得在程序中可以操作数据库表中的数据。