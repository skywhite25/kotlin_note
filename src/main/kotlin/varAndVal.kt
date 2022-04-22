fun main(args: Array<String>) {
    println("Hello World!")

    // 파일 이름 변경 -> Shift + F6

    // val, var
    val a = 10 // 고정 const 마냥
    var b = 10 // 나중에 값이 변해도 상관 x

    val c : Int = 10 // 변수 타입 설정 가능
    val d = 10 // 변수 타입을 설정하지 않아도 한 거와 같음 -> 값이 10(Int)

    // [lateinit]
    // lateinit -> only String, var
    // lateinit var e = 10 // x -> 초기값 설정 x, Int 불가
    lateinit var f : String // ok

    // [by lazy]
    val g : Int by lazy { // String도 가능
        println("by lazy .. ") // (2)
        10 // (3) val g = 10
    }
    fun main(){
        println("in main..") // (1)
        // 20 -> by lazy : {..} 부분이 선언되어 소스에서 변수가 실행되는 순간 선언이 실행되어
        // 그 결과가 변수의 초기값으로 할당 ex) val g = 10
        println(g + 10) // (4) 10 + 10
    }
}