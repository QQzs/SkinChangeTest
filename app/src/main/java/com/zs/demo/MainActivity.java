package com.zs.demo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import solid.ren.skinlibrary.SkinLoaderListener;
import solid.ren.skinlibrary.loader.SkinManager;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void defaultSkin(View view){
        SkinManager.getInstance().restoreDefaultTheme();
    }

    public void nightSkin(View view){
        SkinManager.getInstance().nightMode();
    }

    public void other(View view){
        Intent intent = new Intent(this,OtherActivity.class);
        startActivity(intent);
    }


    public void moreSkin(View view){
        SkinManager.getInstance().loadSkin("theme_green.skin",
                new SkinLoaderListener() {
                    @Override
                    public void onStart() {
                        Log.i("SkinLoaderListener", "正在切换中");
                        //dialog.show();
                    }

                    @Override
                    public void onSuccess() {
                        Log.i("SkinLoaderListener", "切换成功");
                    }

                    @Override
                    public void onFailed(String errMsg) {
                        Log.i("SkinLoaderListener", "切换失败:" + errMsg);
                    }

                    @Override
                    public void onProgress(int progress) {
                        Log.i("SkinLoaderListener", "皮肤文件下载中:" + progress);

                    }
                }

        );
    }
}
