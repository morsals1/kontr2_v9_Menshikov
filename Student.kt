import kotlinx.coroutines.*
import java.time.LocalDate
import java.util.*

abstract class Student:Student_info {
    abstract val name: String
    abstract val surname: String
    abstract val patronymic: String
    abstract val gender: String
    abstract val group: String
    abstract val dob: LocalDate
    abstract val height: Double
    abstract val weight: Double
    abstract val kfs: String
    abstract fun Input()
    abstract fun Graphic(time:Double)

    override fun info() {
        println("ФИО: $name, $surname, $patronymic\n Пол: $gender, дата рождения: $dob\n Группа: $group, рост: $height, вес: $weight, вид спорта: $kfs")
    }
}