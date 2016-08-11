package com.cypressworks.proguardissue


fun <T> T.doAsync(
        exceptionHandler: ((Throwable) -> Unit)? = null
) {
    try {
        println()
    } catch (thr: Throwable) {
        exceptionHandler?.invoke(thr) ?: Unit
    }
}