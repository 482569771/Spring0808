package com.ssm.demo.dao;
//这个部分声明了当前文件所在的包路径。

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ssm.demo.entity.AttendanceRegistrationUpdateEntity;
import java.util.List;
//这些语句用于导入需要使用的类
//这里包括了SpringDataJPA相关的类
//以及你项目中的实体类AttendanceRegistrationUpdateEntity。

@Repository
//这是一个Spring注解，用于将这个接口标记为数据访问层的组件。
public interface AttendanceRegistrationUpdateDAO extends JpaRepository<AttendanceRegistrationUpdateEntity, Long> {
//这个接口定义了你的DAO接口
//AttendanceRegistrationUpdateDAO
//它继承了SpringDataJPA的JpaRepository接口
//并指定了泛型类型AttendanceRegistrationUpdateEntity
//（表示实体类的类型）和 Long（表示主键的类型）。
	
	
	List<AttendanceRegistrationUpdateEntity> findByDate(String date);
	//这是一个自定义查询方法，它声明了根据日期查询记录的操作。
	//SpringDataJPA会根据方法名自动生成相应的查询语句。
	//自定义查询方法，根据状态查询记录
    @Query("SELECT a FROM AttendanceRegistrationUpdateEntity a WHERE a.status = :status")
    List<AttendanceRegistrationUpdateEntity> findByStatus(String status);
    //这是一个自定义查询方法，它使用@Query注解来声明一个自定义的查询语句
    //用于查询符合特定状态的记录。
    //这段代码的主要作用是定义了一个接口
    //其中包含了用于对数据库进行操作的方法
    //包括标准的CRUD操作以及自定义的查询操作。
    //这些方法通过继承JpaRepository接口和使用@Query注解来实现。
    //这样，你可以在其他地方调用这些方法来执行相应的数据库操作。
}




//这段DAO（DataAccessObject）代码定义了一个接口
//AttendanceRegistrationUpdateDAO
//它继承了SpringDataJPA提供的JpaRepository接口
//用于对数据库进行基本的数据访问操作。
//【导入依赖】首先，这段代码导入了一些必要的依赖
//包括SpringDataJPA相关的类和你自己项目中的
//AttendanceRegistrationUpdateEntity类。
//【定义接口】这段代码定义了一个名为
//AttendanceRegistrationUpdateDAO的接口
//并使用了@Repository注解来表示它是一个数据访问层的组件
//用于处理与数据库的交互。
//【继承JpaRepository】
//AttendanceRegistrationUpdateDAO接口继承了
//JpaRepository<AttendanceRegistrationUpdateEntity,Long>
//这意味着你可以使用SpringDataJPA提供的各种方法来对
//AttendanceRegistrationUpdateEntity实体进行数据库操作。
//JpaRepository提供了一系列标准的CRUD（Create,Read,Update,Delete）
//操作方法，以及分页、排序等功能。
//【自定义查询方法】在这个接口中，还定义了两个自定义查询方法：
//List<AttendanceRegistrationUpdateEntity>
//findByDate(String date)
//这个方法通过方法名的方式，声明了一个根据日期date进行查询的方法。
//SpringDataJPA将会根据方法名自动生成相应的SQL查询语句，返回所有匹配的记录。
//@Query("SELECT a FROM AttendanceRegistrationUpdateEntity a WHERE a.status = :status")
//这个方法使用@Query注解定义了一个自定义查询语句
//查询符合特定状态status的AttendanceRegistrationUpdateEntity记录。
//这段DAO代码的作用是定义了一组用于对
//AttendanceRegistrationUpdateEntity实体进行数据库访问的方法
//包括标准的CRUD操作以及自定义的查询操作。
//这样，你可以通过调用这些方法来与数据库交互，从而实现数据的存储、检索和更新等操作。