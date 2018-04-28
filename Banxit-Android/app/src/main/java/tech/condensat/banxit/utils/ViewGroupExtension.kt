package tech.condensat.banxit.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflate(viewResId: Int): View {
    return LayoutInflater.from(context).inflate(viewResId, this, false)
}