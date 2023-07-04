import madels.Server
import madels.User
import java.util.Scanner

fun main(args: Array<String>) {


    val input=Scanner(System.`in`)
    val server=Server()
    while (true){
        println("🌗 1 -> qushish  🌖 2 -> kurish  🌕 3 -> uchirish  🌔 4 -> tahrirlash  🌓 5 -> qidirish  🌒 6 -> break"  )
        val a=input.nextInt()
        when(a){
            1->server.add()
            2->server.show()
            3->server.delet()
            4->server.tahrirlash()
            5->server.qidirish()
            6-> {
                println("Tamom hayr  🖐️🖐️🖐️")
                break
            }
        }
    }
}