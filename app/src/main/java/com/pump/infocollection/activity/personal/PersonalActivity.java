package com.pump.infocollection.activity.personal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import com.pump.infocollection.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_personal)
public class PersonalActivity extends AppCompatActivity {

    @ViewInject(R.id.tv_middleContent)
    private TextView tv_middleContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏
        super.onCreate(savedInstanceState);


        initView();
    }

    private void initView(){
        x.view().inject(this);
        tv_middleContent.setText("我");
    }

}
