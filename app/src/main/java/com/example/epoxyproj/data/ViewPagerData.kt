package com.example.epoxyproj.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
open class ViewPagerData(var items: Array<String> = emptyArray(),
                         var visibleItemIndex: Int = -1
) : Parcelable
