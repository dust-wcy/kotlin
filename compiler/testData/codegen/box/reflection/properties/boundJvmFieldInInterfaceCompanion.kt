// !LANGUAGE: +JvmFieldInInterface
// WITH_RUNTIME
// WITH_REFLECT
import kotlin.reflect.full.memberProperties

class Bar(val value: String)

interface  Foo {

    companion object {
        @JvmField
        val z = Bar("OK")
    }
}


fun box(): String {
    val field = Foo.Companion::z
    return field.get().value
}
