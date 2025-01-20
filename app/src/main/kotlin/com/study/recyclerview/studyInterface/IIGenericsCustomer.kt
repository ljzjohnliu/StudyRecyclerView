package com.study.recyclerview.studyInterface

/**
 * 逆变< in T>
 *
 * Kotlin提供了in修饰符，in修饰符能够确保：
 *
 * 保证T只能出现在参数输入位置，而不能出现在函数返回位置上;
 */
interface IIGenericsCustomer<in T> {
    fun put(item: T)
}