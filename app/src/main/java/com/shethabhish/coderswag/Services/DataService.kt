package com.shethabhish.coderswag.Services

import com.shethabhish.coderswag.Model.Category
import com.shethabhish.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "18$", "hat01"),
        Product("Devslopes Hat Black", "20$", "hat02"),
        Product("Devslopes Hat White", "18$", "hat03"),
        Product("Devslopes Hat Snapback", "22$", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "28$", "hoodie1"),
        Product("Devslopes Hoodie Red", "32$", "hoodie2"),
        Product("Devslopes Gray Hoodie", "28$", "hoodie3"),
        Product("Devslopes Black Hoodie", "32$", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "18$", "shirt1"),
        Product("Devslopes Badge Light Gray", "20$", "shirt2"),
        Product("Devslopes Logo Shirt Red", "22$", "shit3"),
        Product("Devslopes Hustle", "22$", "shirt4"),
        Product("Kickflip Hustle", "18$", "shirt5")
    )


}