fun main() {
    println(canConstruct("abcdef", arrayOf("abc", "def")))

}

fun canConstruct(target:String,alpha:Array<String>):Boolean?{
    if (target=="") return true
    alpha.forEach{ word:String->
        if (target.indexOf(word)==0){
            val suffix:String=target.substring(word.length)
            if (canConstruct(suffix,alpha)==true) return true
        }
    }
    return false
 }
