package com.novelreader.caiyunmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.novelreader.caiyunmvvm.databinding.ActivityWelcomeBinding
import com.novelreader.caiyunmvvm.viewmodel.state.WelcomeViewModel
import com.zhpan.bannerview.BannerViewPager
import com.zhpan.bannerview.BaseViewHolder
import me.hgj.jetpackmvvm.demo.app.base.BaseActivity
import me.hgj.jetpackmvvm.demo.app.base.BaseActivity1

class WelcomeActivity : BaseActivity<WelcomeViewModel, ActivityWelcomeBinding>() {

    private var reslist = arrayOf("唱", "跳", "rap")

    private lateinit var mViewPager: BannerViewPager<String, WelcomeBannerViewHolder>

    override fun initView(savedInstanceState: Bundle?) {
        mDatabind
    }

    inner class WelcomeBannerViewHolder(view: View) : BaseViewHolder<String>(view) {
        override fun bindData(data: String?, position: Int, pageSize: Int) {
            val textView = findView<TextView>(R.id.banner_text)
            textView.text = data
        }

    }
}


