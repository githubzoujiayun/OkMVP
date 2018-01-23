package com.lyf.okmvp.ui;

import android.os.Bundle;
import com.lyf.okmvp.R;
import com.lyf.okmvp.bean.BaseMsg;
import com.lyf.okmvp.mvp.model.get.GetAppRequest;
import com.lyf.okmvp.okhttp.interfaces.Callback;

import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetAppRequest.getAppConfig(new Callback<BaseMsg>() {
            @Override
            public void onFailure(Call call, Exception e) {

            }

            @Override
            public void onResponse(Call call, Response response, BaseMsg bean) {

            }
        });

    }


}