package com.monsterlin.pigeon.view;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.monsterlin.pigeon.R;
import com.monsterlin.pigeon.base.BaseFragment;
import com.monsterlin.pigeon.ui.chat.ChatActivity;
import com.monsterlin.pigeon.ui.family.MyFamilyActivity;
import com.monsterlin.pigeon.ui.sticker.StickerActivity;
import com.monsterlin.pigeon.ui.weather.WeatherActivity;

/**
 * @author : monsterLin
 * @version : 1.0
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @time : 2017/7/9
 * @desc : 主页
 */

public class HomeFragment extends BaseFragment {

    private TextView mHomeTvFamily, mHomeTvSticker, mHomeTvWeather, mHomeTvRebot;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initViews() {
        mHomeTvFamily = findView(R.id.home_tv_family);
        mHomeTvSticker = findView(R.id.home_tv_sticker);
        mHomeTvWeather = findView(R.id.home_tv_weather);
        mHomeTvRebot = findView(R.id.home_tv_rebot);
    }

    @Override
    public void initListener() {
        setOnClick(mHomeTvFamily);
        setOnClick(mHomeTvSticker);
        setOnClick(mHomeTvWeather);
        setOnClick(mHomeTvRebot);
    }

    @Override
    public void initData() {

    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.home_tv_family:
                startActivity(new Intent(getContext(), MyFamilyActivity.class));
                break;
            case R.id.home_tv_sticker:
                startActivity(new Intent(getContext(), StickerActivity.class));
                break;
            case R.id.home_tv_weather:
                startActivity(new Intent(getContext(), WeatherActivity.class));
                break;
            case R.id.home_tv_rebot:
                startActivity(new Intent(getContext(), ChatActivity.class));
                break;
        }
    }

}
