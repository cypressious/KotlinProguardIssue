package com.cypressworks.proguardissue

interface Mixin {
    fun MainActivity.foo() {
        bar()
    }

    private fun MainActivity.bar() {
        runOnUiThread { }
    }

}


