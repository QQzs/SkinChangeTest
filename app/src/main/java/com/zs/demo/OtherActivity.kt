package com.zs.demo

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

/**
 *
Created by zs
Date：2018年 03月 15日
Time：17:50
—————————————————————————————————————
About:
—————————————————————————————————————
 */
class OtherActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        dynamicAddView(radio_button,"button",R.drawable.selector_rb)

    }

}