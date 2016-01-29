@file:JvmMultifileClass
@file:JvmName("ViewUtils")

package com.cypressworks.proguardissue

import android.view.View

inline fun <reified T> View.holder(factory: (View) -> T): T {
    val tag = tag

    return if (tag is T) {
        tag
    } else {
        val newTag = factory(this)
        setTag(newTag)
        newTag
    }
}