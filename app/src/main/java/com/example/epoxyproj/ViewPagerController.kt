package com.example.epoxyproj

import com.airbnb.epoxy.TypedEpoxyController
import com.airbnb.epoxy.VisibilityState.FOCUSED_VISIBLE
import com.airbnb.epoxy.carousel
import com.example.epoxyproj.R
import com.example.epoxyproj.data.ViewPagerData
import com.example.epoxyproj.models.ViewPagerItem_

class ViewPagerController : TypedEpoxyController<ViewPagerData>() {

    override fun buildModels(data: ViewPagerData) {
        carousel {
            id("This is a ViewPagerController")
            hasFixedSize(true)
            paddingRes(R.dimen.view_pager_item_padding)
            models(data.items.mapIndexed { index, item ->
                ViewPagerItem_()
                    .id(item)
                    .title(item)
                    .onVisibilityStateChanged { _, _, visibilityState ->
                        if (visibilityState == FOCUSED_VISIBLE) {
                            data.visibleItemIndex = index
                            setData(data)
                        }
                    }
            })
        }
    }
}
