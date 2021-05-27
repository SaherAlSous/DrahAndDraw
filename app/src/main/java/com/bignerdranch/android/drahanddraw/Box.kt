package com.bignerdranch.android.drahanddraw

import android.graphics.PointF

class Box(val start: PointF) { // page. 616

    var end: PointF = start

    var left: Float = 0.0f
        get() = Math.min(start.x, end.x)

    var right: Float = 0.0f
        get() = Math.max(start.x, end.x)

    var top: Float = 0.0f
        get() = Math.min(start.y, end.y)

    var bottom: Float = 0.0f
        get() = Math.max(start.y, end.y)
}