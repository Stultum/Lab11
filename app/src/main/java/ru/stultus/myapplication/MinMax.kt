package ru.stultus.myapplication

class MinMax {

    /**
     * Возращает минимальное значение среди 2 элементов
     */
    fun min(first: Int, second: Int): Int =
        if (first <= second)
            first
        else
            second

    /**
     * Возращает максимальное значение среди 2 элементов
     */
    fun max(first: Int, second: Int): Int =
        if (first >= second)
            first
        else
            second
}