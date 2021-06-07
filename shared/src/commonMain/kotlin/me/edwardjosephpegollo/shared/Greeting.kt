package me.edwardjosephpegollo.shared


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().name}!"
    }
}
