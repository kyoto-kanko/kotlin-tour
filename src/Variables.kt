fun main() {
    val immutable = "変更できないよ"

    // 変数の種類
    var mutable = "変更できるよ"
    mutable = "変更したよ"

    println(immutable)
    println(mutable)

    // 変数展開
    println("mutable: => ${mutable}")
}