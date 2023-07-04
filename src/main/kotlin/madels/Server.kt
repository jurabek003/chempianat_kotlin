package madels

import Interface
import java.util.*
import kotlin.collections.ArrayList

class Server:Interface {
    val input= Scanner(System.`in`)
    val array= ArrayList<User>()
    var count=0
    override fun add() {
        println(" eng so'z")
        val eng=input.next()
        println("uz so'z")
        val uz=input.next()
        val user=User(eng, uz)
        array.add(user)
        count++
    }

    override fun show() {

        for (i in 0 until array.size){
            if (!array[i].Eng.equals("") && !array[i].Uzb.equals("")){
                println("$i ${array[i]}")
            }
        }
    }

    override fun delet() {
        show()
        print("qaysi birini uchirmoq chisiz  ")
        val aa=input.nextInt()
        array[aa].Uzb=""
        array[aa].Eng=""
    }

    override fun tahrirlash() {
        show()
        println("qaysi birini tahrirlamoqchisiz")
        val bb=input.nextInt()
        println("yangi Eng suz")
        val ss=input.next()
        array[bb].Eng=ss.toString()
        println("yangi Uz suz")
        val uu=input.next()
        array[bb].Uzb=uu.toString()
        println("uzgartiriladi")
    }

    override fun qidirish() {
        println("qdirila yotgan Eng yoki Uz suzni kiriting")
        val qq=input.next()
        for (i in 0 until array.size){
            if (array[i].Uzb.equals(qq) || array[i].Eng.equals(qq)){
                println("qidirilgan suzning Eng va Uz chasi  ${array[i]}")
                break
            }
        }
    }

}