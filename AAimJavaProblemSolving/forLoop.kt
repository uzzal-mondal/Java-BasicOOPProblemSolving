package FeburaryJAVA

object forLoop {

    @JvmStatic
    fun main(args: Array<String>) {

        var i: Int

        i = 0
        while (i <= 10) {

            if (i % 2 != 0) {

                println("Odd num $i")
            } else {

                println("Even Num $i")
            }
            i++

            // System.out.println("possition : "+i);
        }
    }
}
