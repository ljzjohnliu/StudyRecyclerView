package com.study.recyclerview.discover;

import com.study.recyclerview.bean.Animal;

/**
 * @author zd
 */
public class GenericsClass<T extends Animal> {
    //类型参数 T 必须是 Animal 类的子类或实现了 Animal 接口的类型
    private T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
