package com.study.recyclerview.bean

open class Book(val name: String)
data class EnglishBook(val english: String) : Book(english)
data class MathBook(val math: String) : Book(math)