package example

import javaExample.JavaInterface

class MyClass : JavaInterface {
    override fun hello() {
        // will give compilation error if jvm is < 1.8:
        // Super calls to Java default methods are prohibited in JVM target 1.6. Recompile with '-jvm-target 1.8'
        super.hello()
    }

}

object Hello {

    @JvmStatic
    fun main(args: Array<String>) {
        MyClass().hello()
    }

}