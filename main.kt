import kotlinx.coroutines.*
val a: Graph = Graph()
fun main(){
    var count = 0
    var exit = 4
    var b = a.repeat()
    GlobalScope.launch {
        println("для выхода нажмите 0")
        for (i in 1..b) {
            count++
            a.Input()
            delay(2000)
            a.info()
            exit = readln().toInt()
            if (exit == 0) {
                break
            }
            delay(2000)
        }
    }
    runBlocking {
        delay(30000)
        println("хотите узнать распорядок дня\n 1-(yes)/2-(no)")
        var otv1 = readln().toInt()
        if(otv1 == 1){
            println("введите время")
            var time = readln().toDouble()
            a.Graphic(time)
        }
        else if(otv1 == 2){
        }
        else{
            println("введите 1/2!!!!")
        }
        delay(60000)
    }
}