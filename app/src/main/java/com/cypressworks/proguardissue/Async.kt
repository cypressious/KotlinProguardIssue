package com.cypressworks.proguardissue


fun <T> T.doAsync(
        exceptionHandler: ((Throwable) -> Unit)?
) {
    try {
        println()
    } catch (thr: Throwable) {
        exceptionHandler?.invoke(thr) ?: Unit
    }
}