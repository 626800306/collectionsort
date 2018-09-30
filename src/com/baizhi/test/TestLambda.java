package com.baizhi.test;

import com.baizhi.entity.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * @author shkstart
 * @date 2018/9/25 - 21:25
 */
public class TestLambda {
    public static void main(String[] args) {
//        在Arrays这个工具类中,调用asList方法,得到ArrayList数组
        List<Employee> list = Arrays.asList(
                new Employee(1, "张三", 18),
                new Employee(2, "李四", 25),
                new Employee(3, "王五", 30),
                new Employee(4, "马六", 35),
                new Employee(4, "赵七", 25),
                new Employee(4, "田八", 30)
        );
//        在工具类中,调用sort方法,传入俩个参数  集合list,实现comparetor接口的compare方法
        Collections.sort(list,(e1,e2)->{
//          比较年龄
            if(e1.getAge()==e2.getAge()){
//                当年龄相等时,按姓名比较
                return e1.getName().compareTo(e2.getName());
            }else{
//             比较年龄大小 按从小到大比较 e1<e2 返回-1  相等 返回0 大于 返回1
                return Integer.compare(e1.getAge(),e2.getAge());
            }

        });
//         遍历list集合
        for (Employee e:list) {
            System.out.println(e);
        }
    }


}
