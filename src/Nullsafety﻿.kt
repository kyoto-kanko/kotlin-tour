fun main() {
//    var neverNull: String = "This can't be null"
//    neverNull = null
//
//    var nullable: String? = "You can keep a null here"
//    nullable = null
//
//    var inferredNonNull = "The compiler assumes non-nullable"
//    inferredNonNull = null
//
//    fun strLength(notNull: String): Int {
//        return notNull.length
//    }
//
//    println(strLength(neverNull))
//    println(strLength(nullable))

    fun describeString(maybeString: String?): String {
        if(maybeString != null&& maybeString.length > 0){
            return "安全だよ"
        }else{
            return "安全ではない"
        }
    }
    val nullString: String? = null
    println(describeString(nullString))

    fun lengthString(maybeString: String?): String = maybeString?.length?.toString() ?: "ねっこ"

    val nullString2: String? = null
    println(lengthString(nullString2))
}