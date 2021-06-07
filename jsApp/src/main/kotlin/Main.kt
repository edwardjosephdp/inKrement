import kotlinx.browser.document
import me.edwardjosephpegollo.shared.Platform
import react.dom.h1
import react.dom.render

fun main() {
    render(document.getElementById("root")) {
        child(App::class) {
            attrs {
                counter = "Kounter: 0"
            }
        }
    }
}