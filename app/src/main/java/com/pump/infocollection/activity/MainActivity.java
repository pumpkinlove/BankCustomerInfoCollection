package com.pump.infocollection.activity;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

import com.pump.infocollection.R;
import com.pump.infocollection.activity.notice.NoticeActivity;
import com.pump.infocollection.activity.personal.PersonalActivity;
import com.pump.infocollection.activity.record.RecordActivity;
import com.pump.infocollection.activity.sheet.SheetActivity;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_main)
public class MainActivity extends TabActivity {
    public static final String TAB_NOTICE = "notice";
    public static final String TAB_SHEET = "sheet";
    public static final String TAB_RECORD = "record";
    public static final String TAB_PERSONAL = "personal";

    @ViewInject(R.id.tab_notice)
    private TextView tv_noticeTab;
    @ViewInject(R.id.tab_sheet)
    private TextView tv_sheetTab;
    @ViewInject(R.id.tab_record)
    private TextView tv_recordTab;
    @ViewInject(R.id.tab_personal)
    private TextView tv_personalTab;



    private Drawable dNoticePressed;
    private Drawable dNoticeNormal;
    private Drawable dSheetPressed;
    private Drawable dSheetNormal;
    private Drawable dRecordPressed;
    private Drawable dRecordNormal;
    private Drawable dPersonalNormal;
    private Drawable dPersonalPressed;
    private TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏
        super.onCreate(savedInstanceState);

        x.view().inject(this);

        initTabIntents();

    }

    @Event(value={R.id.tab_notice,R.id.tab_sheet,R.id.tab_record,R.id.tab_personal},type=View.OnClickListener.class)
    private void onClick(View view) {
        switch(view.getId()){
            case R.id.tab_notice:
                pressNoticeTab();
                break;
            case R.id.tab_sheet:
                pressSheetTab();
                break;
            case R.id.tab_record:
                pressRecordTab();
                break;
            case R.id.tab_personal:
                pressPersonalTab();
                break;
        }
    }

    private void pressNoticeTab(){
        if (tabHost != null) {
            setNoticeTab(true);
            tabHost.setCurrentTabByTag(TAB_NOTICE);
            setSheetTab(false);
            setRecordTab(false);
            setPersonalTab(false);
        }
    }
    private void pressSheetTab(){
        if (tabHost != null) {
            setSheetTab(true);
            tabHost.setCurrentTabByTag(TAB_SHEET);
            setNoticeTab(false);
            setRecordTab(false);
            setPersonalTab(false);
        }
    }
    private void pressRecordTab(){
        if (tabHost != null) {
            setRecordTab(true);
            tabHost.setCurrentTabByTag(TAB_RECORD);
            setNoticeTab(false);
            setSheetTab(false);
            setPersonalTab(false);
        }
    }

    private void pressPersonalTab(){
        if (tabHost != null) {
            setPersonalTab(true);
            tabHost.setCurrentTabByTag(TAB_PERSONAL);
            setNoticeTab(false);
            setSheetTab(false);
            setRecordTab(false);
        }
    }

    private void setNoticeTab(boolean isSelected) {
        Drawable drawable = null;
        if (isSelected) {
            tv_noticeTab.setTextColor(getResources().getColor(R.color.blue_theme_normal));
            if (dNoticePressed == null) {
                dNoticePressed = getResources().getDrawable(R.mipmap.tab1_p);
            }
            drawable = dNoticePressed;
        } else {
            tv_noticeTab.setTextColor(getResources().getColor(R.color.gray_light));
            if (dNoticeNormal == null) {
                dNoticeNormal = getResources().getDrawable(R.mipmap.tab1_n);
            }
            drawable = dNoticeNormal;
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            tv_noticeTab.setCompoundDrawables(null, drawable, null, null);
        }
    }

    private void setSheetTab(boolean isSelected) {
        Drawable drawable = null;
        if (isSelected) {
            tv_sheetTab.setTextColor(getResources().getColor(R.color.blue_theme_normal));
            if (dSheetPressed == null) {
                dSheetPressed = getResources().getDrawable(R.mipmap.tab2_p);
            }
            drawable = dSheetPressed;
        } else {
            tv_sheetTab.setTextColor(getResources().getColor(R.color.gray_light));
            if (dSheetNormal == null) {
                dSheetNormal = getResources().getDrawable(R.mipmap.tab2_n);
            }
            drawable = dSheetNormal;
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            tv_sheetTab.setCompoundDrawables(null, drawable, null, null);
        }
    }

    private void setRecordTab(boolean isSelected) {
        Drawable drawable = null;
        if (isSelected) {
            tv_recordTab.setTextColor(getResources().getColor(R.color.blue_theme_normal));
            if (dRecordPressed == null) {
                dRecordPressed = getResources().getDrawable(R.mipmap.tab3_p);
            }
            drawable = dRecordPressed;
        } else {
            tv_recordTab.setTextColor(getResources().getColor(R.color.gray_light));
            if (dRecordNormal == null) {
                dRecordNormal = getResources().getDrawable(R.mipmap.tab3_n);
            }
            drawable = dRecordNormal;
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            tv_recordTab.setCompoundDrawables(null, drawable, null, null);
        }
    }

    private void setPersonalTab(boolean isSelected) {
        Drawable drawable = null;
        if (isSelected) {
            tv_personalTab.setTextColor(getResources().getColor(R.color.blue_theme_normal));
            if (dPersonalPressed == null) {
                dPersonalPressed = getResources().getDrawable(R.mipmap.tab4_p);
            }
            drawable = dPersonalPressed;
        } else {
            tv_personalTab.setTextColor(getResources().getColor(R.color.gray_light));
            if (dPersonalNormal == null) {
                dPersonalNormal = getResources().getDrawable(R.mipmap.tab4_n);
            }
            drawable = dPersonalNormal;
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            tv_personalTab.setCompoundDrawables(null, drawable, null, null);
        }
    }

    private void initTabIntents() {
        tabHost =  getTabHost();
        TabSpec spec = tabHost.newTabSpec(TAB_NOTICE);
        spec.setIndicator(TAB_NOTICE);
        Intent noticeIntent = new Intent(this, NoticeActivity.class);
        spec.setContent(noticeIntent);
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec(TAB_SHEET);
        spec.setIndicator(TAB_SHEET);
        Intent sheetIntent = new Intent(this, SheetActivity.class);
        spec.setContent(sheetIntent);
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec(TAB_RECORD);
        spec.setIndicator(TAB_RECORD);
        Intent recordIntent = new Intent(this, RecordActivity.class);
        spec.setContent(recordIntent);
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec(TAB_PERSONAL);
        spec.setIndicator(TAB_PERSONAL);
        Intent personalIntent = new Intent(this, PersonalActivity.class);
        spec.setContent(personalIntent);
        tabHost.addTab(spec);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (dNoticeNormal != null) {
            dNoticeNormal.setCallback(null);
        }
        if (dNoticePressed != null) {
            dNoticePressed.setCallback(null);
        }
        if (dSheetNormal != null) {
            dSheetNormal.setCallback(null);
        }
        if (dSheetPressed != null) {
            dSheetPressed.setCallback(null);
        }
        if (dRecordNormal != null) {
            dRecordNormal.setCallback(null);
        }
        if (dRecordPressed != null) {
            dRecordPressed.setCallback(null);
        }
        if (dPersonalNormal != null) {
            dPersonalNormal.setCallback(null);
        }
        if (dPersonalPressed != null) {
            dPersonalPressed.setCallback(null);
        }

    }

}
