package com.study.recyclerview.studyInterface

/**
 * 协变< out T>
 *
 * Kotlin提供了out修饰符，out修饰符能够确保：
 *
 * T只能用于函数返回中，不能用于参数输入中;
 */
interface IGenericsProduce<out T> {
    fun getType(): T
}