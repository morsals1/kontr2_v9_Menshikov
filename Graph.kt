import java.time.LocalDate
import java.time.LocalTime
import java.util.*
class Graph:Student() {
    override var dob = LocalDate.parse("2020-01-01")
    override var kfs = ""
    override var height = 0.0
    override var weight = 0.0
    override var name = ""
    override var gender = ""
    override var group = ""
    override var patronymic = ""
    override var surname = ""

    override fun Input() {
        try {
            println("Введите имя:")
            name = readln()
            println("Введите фамилию:")
            surname = readln()
            println("Введите отчество:")
            patronymic = readln()
            println("Введите пол:")
            gender = readln()
            println("Введите группу:")
            group = readln()
            println("Введите дату рождения:")
            dob = LocalDate.parse(readln())
            println("Введите рост")
            height = readln().toDouble()
            println("Введите вес")
            weight = readln().toDouble()
            println("Введите вид спорта")
            kfs = readln()
        }catch (e:Exception){ println("неверный ввод") }
    }

    fun repeat(): Int{
        try{
            println("введите сколько повторений будет")
            var rp = readln().toInt()
            if(rp>0){
                return rp
            }
            else println("число повторений должно быть > 0")
            return 1
        } catch (e:Exception) { println("неверный ввод") }
        return 1
    }

    override fun Graphic(time: Double) {
        if(time>7 && time<=9){
            println("Сборка на работу")
        }
        if(time>9 && time<=18){
            println("Рабочее время")
        }
        if(time>18 && time<=22){
            println("Свободное время, хотите пойти на занятия спортом?\n 1-(yes)/2-(no)")
            var otv = readln().toInt()

            if(otv == 1){
                println("Вы занимаетесь спортом $kfs")
            }
            else if(otv == 2){
                println("Вы отдыхаете")
            }
            else println("неверный ввод!!\n введите 1-(yes)/2-(no)")
        }
        if (time>22 && time<=7) println("вы спите")
        else if (time > 24 || time < 0) println("неверный ввод")
    }

}