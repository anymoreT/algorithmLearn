package com.fanzhi;

/*
泛指,同一方法，不同的传入参数类型
 */
public class FanZhi<T>{
    public T add(T first, T second){
        return first;
    }

    public static  void main(String[] args){
        new FanZhi<String>().add("12", "23");
        new FanZhi<Integer>().add(12, 23);
    }
}
