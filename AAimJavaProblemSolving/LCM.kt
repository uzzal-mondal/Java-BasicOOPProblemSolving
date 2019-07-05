package FeburaryJAVA

fun main(args: Array<String>) {

    val n1: Int = 72;
    val n2: Int = 120;
    var lcm: Int

    lcm = if (n1 > n2) n1 else n2

    while (true) {

        if (lcm % n1 == 0 && lcm % 2 == 0) {

            println("The lcm of $n1 and $n2 is $lcm")
            break
        }

        lcm++
    }


}