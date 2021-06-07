import kotlinx.html.InputType
import kotlinx.html.js.onClickFunction
import me.edwardjosephpegollo.shared.Platform
import me.edwardjosephpegollo.shared.Presenter
import react.*
import react.dom.h1
import react.dom.h4
import react.dom.input
import styled.css
import styled.styledDiv

@JsExport
class App(props: KrementProps): RComponent<KrementProps, KrementState>(props) {

    private val presenter = Presenter().apply {
        viewStateListener = {
            setState(KrementState(it.counter))
            println(it.counter)
        }
    }

    init {
        state = KrementState(props.counter)
    }
    override fun RBuilder.render() {

        h1 {
            + "Krement in ${Platform().name}"
        }

        styledDiv {
            + state.counter
        }

        input(
            type = InputType.button,
        ) {
            attrs {
                value = "InKrement"
                onClickFunction = {
                    presenter.onIncClick()
                }
            }
        }
        input(
            type = InputType.button,
        ) {
            attrs {
                value = "DeKrement"
                onClickFunction = {
                    presenter.onDecClick()
                }
            }
        }
    }
}

external interface KrementProps : RProps {
    var counter: String
}
data class KrementState(var counter: String): RState