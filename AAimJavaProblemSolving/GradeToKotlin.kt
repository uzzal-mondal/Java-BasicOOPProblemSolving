package FeburaryJAVA

import java.util.*

fun main(args: Array<String>) {


    val gpa: String;

    val sc = Scanner(System.`in`)
    println("Input your data please: - ")
    gpa = sc.nextLine();
    println("Your gpa $gpa : ")

    when(gpa){

        "a+"-> println("Your result is Excelent");

        "a", "a-", "B" -> println("Your result is good");

        "b", "c" -> println("Your result is expected")

        "d" -> println("Your result is passed")

        "f" -> println("Your result is fail ");

        else -> println("sorry , this is not identity in your Gpa")




    }
}