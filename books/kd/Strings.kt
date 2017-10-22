fun main(args: Array<String>) {

    val s = "Hello, world!\n"
    println(s)

    val text = """
    for (c in "foo"){
        print(c)
    }
    """
    println(text)

    val text2 = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
        """.trimMargin()
    println(text2)
}