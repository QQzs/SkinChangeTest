package com.zs.demo.widgetattr;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RadioButton;

import solid.ren.skinlibrary.attr.base.SkinAttr;
import solid.ren.skinlibrary.utils.SkinResourcesUtils;

/**
 * Created by zs
 * Date：2018年 03月 16日
 * Time：17:03
 * —————————————————————————————————————
 * About:
 * —————————————————————————————————————
 */

public class RadioButtonAttr extends SkinAttr {
    @Override
    protected void applySkin(View view) {

        if (view instanceof RadioButton){
            if (isDrawable()){
                RadioButton radioButton = (RadioButton)view;
                Drawable drawable = SkinResourcesUtils.getDrawable(attrValueRefId);
                radioButton.setButtonDrawable(drawable);
            }
        }

    }
}
