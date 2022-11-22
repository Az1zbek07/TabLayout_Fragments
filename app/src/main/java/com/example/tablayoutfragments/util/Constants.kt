package com.example.tablayoutfragments.util

import com.example.tablayoutfragments.R
import com.example.tablayoutfragments.model.ItemData

object Constants {
    val titles = listOf<String>(
        "Mobile",
        "Front",
        "BackEnd"
    )
    val icons = listOf(
        R.drawable.ic_baseline_phone_android_24,
        R.drawable.ic_baseline_code_24,
        R.drawable.ic_baseline_computer_24
    )

    fun mobileLanguages() = listOf(
        ItemData("Kotlin", R.drawable.img_2),
        ItemData("Java", R.drawable.img),
        ItemData("Swift", R.drawable.img_1),
        ItemData("Dart", R.drawable.img_3)
    )

    fun frontLanguages() = listOf(
        ItemData("HTML", R.drawable.img_4),
        ItemData("CSS", R.drawable.img_5),
        ItemData("JavaScript", R.drawable.img_6)
    )

    fun backendLanguages() = listOf(
        ItemData("Golang", R.drawable.img_7),
        ItemData("Python", R.drawable.img_8),
        ItemData("SQL", R.drawable.img_9),
        ItemData("PHP", R.drawable.img_10)
    )
}