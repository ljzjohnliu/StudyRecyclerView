package com.study.recyclerview.discover

import com.study.recyclerview.bean.Book
import com.study.recyclerview.bean.EnglishBook
import com.study.recyclerview.studyInterface.IGenericsProduce
import com.study.recyclerview.studyInterface.IIGenericsCustomer

class MultiGenericsStudyClass {
    /**
     * 不变、协变、逆变，他们统称为型变：
     * 在泛型中，型变指的是子类型和超类型之间的关系中，泛型类型参数是否具有相同的变化方向。Java和Kotlin中支持通常的型变方式：协变和逆变，与不变对应。
     *
     * 不变：有继承关系的两个类，在变成泛型类型时不再有关系。如：MathBook是Book的子类，而BaseBook<MathBook>与BaseBook<Book>就没关系了，是不同对象。
     * 协变：如果想让BaseBook<MathBook>与BaseBook<Book>继续有父子关系，即想继续支持协变，在Java中使用? extends E表示；Kotlin中使用out E，表示上界是E。那么BaseBook<MathBook>继续是BaseBook<Book>的子类。
     * 逆变：与协变相反，有继承关系的两个类，在逆变之后，关系反过来了。Java中使用? super E，Kotlin中使用in E，表示下界为E。
     *
     *    * 无限定通配符
     *     无限制通配符（Unbounded wildcard）：可以接受任意类型的参数
     *
     *    * 有限定的通配符
     *      使用 extends(kotlin中用out表示上界) 关键字指定上界或者使用 super(kotlin中用in表示上界) 关键字指定下界，限制了泛型方法接受的参数类型范围
     */

    /**
     * inline内联函数 + reified 使得类型参数被实化  reified:实体化的
     * 注：带reified类型参数的内联函数，Java是无法直接调用的
     */
    inline fun <reified T> isAny(value: Any): Boolean {
        return value is T
    }

    companion object{
        /**
         * 泛型方法可以独立于泛型类存在，并且可以在任何类中定义和使用。它们提供了更大的灵活性，使我们能够对特定的方法进行泛型化，而不仅仅是整个类
         */
        fun useGenericsMethods(){
            // 调用泛型方法
            val intArray = mutableListOf(1, 2, 3, 4, 5)
            printArray(intArray)

            val stringArray = mutableListOf("Hello", "World")
            printArray(stringArray)
        }

        fun <T> printArray(array: MutableList<T>) {
            for (element in array) {
                println(element)
            }
        }


        /**
         * 协变
         */
        fun produce(from: IGenericsProduce<EnglishBook>){
            val book: IGenericsProduce<Book> = from
        }
        /**
         * 逆变
         */
        fun customer(params: IIGenericsCustomer<Book>){
            val book: IIGenericsCustomer<EnglishBook> = params
        }
    }
}