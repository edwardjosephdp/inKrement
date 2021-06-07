package me.edwardjosephpegollo.shared

class Presenter {
    private var count = 0
    private var viewState = ViewState(Platform().name,
        "Kounter: $count")
        set(value) {
            field = value
            viewStateListener?.invoke(value)
        }
    var viewStateListener: ((ViewState) -> Unit)? = null
        set(value) {
            field = value
            value?.invoke(viewState)
        }
    fun onIncClick() {
        viewState = viewState.copy(counter =
        "Kounter: ${++count}")
    }

    fun onDecClick() {
        viewState = viewState.copy(counter =
        "Kounter: ${--count}")
    }
}
