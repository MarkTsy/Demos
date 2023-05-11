package com.seeyou.databinding

import android.text.TextUtils
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

/**
 * <pre>
 *     author : tao
 *     time   : 2023/05/10
 * </pre>
 */
class ImageViewBindingAdapter {

    companion object {

        @JvmStatic
        @BindingAdapter(value = ["imageUrl"], requireAll = false)
        fun loadImage(view: ImageView, url: String) {
            Glide.with(view.context).load(url).into(view)
        }

    }

}