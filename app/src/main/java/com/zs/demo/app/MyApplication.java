package com.zs.demo.app;

import com.zs.demo.widgetattr.RadioButtonAttr;

import solid.ren.skinlibrary.SkinConfig;
import solid.ren.skinlibrary.base.SkinBaseApplication;

/**
 * Created by zs
 * Date：2018年 03月 15日
 * Time：17:49
 * —————————————————————————————————————
 * About:
 * —————————————————————————————————————
 */

public class MyApplication extends SkinBaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        SkinConfig.setCanChangeStatusColor(true);
        SkinConfig.enableGlobalSkinApply();
        SkinConfig.addSupportAttr("button",new RadioButtonAttr());
    }
}
