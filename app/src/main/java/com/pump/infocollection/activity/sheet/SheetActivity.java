package com.pump.infocollection.activity.sheet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.pump.infocollection.R;
import com.pump.infocollection.activity.sheet.business.BusinessItemListActivity;
import com.pump.infocollection.activity.sheet.rural.RuralItemListActivity;
import com.pump.infocollection.activity.sheet.topublic.ToPublicItemListActivity;
import com.pump.infocollection.activity.sheet.urban.UrbanItemListActivity;
import com.pump.infocollection.activity.sheet.urban.UrbanSheetActivity;
import com.pump.infocollection.adapter.SheetTypeGridAdapter;
import com.pump.infocollection.domain.SheetType;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

@ContentView(R.layout.activity_sheet)
public class SheetActivity extends AppCompatActivity {

    @ViewInject(R.id.tv_middleContent)
    private TextView tv_middleContent;

    @ViewInject(R.id.gv_sheetTypes)
    private GridView gv_sheetType;

    private List<SheetType> sheetTypeList = new ArrayList<SheetType>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏
        super.onCreate(savedInstanceState);

        initView();
        initData();

    }

    private void initData() {
        SheetType urbanResident = new SheetType("城镇居民", 1);
        SheetType ruralResident = new SheetType("农村居民", 2);
        SheetType businessman = new SheetType("个体工商户", 3);
        SheetType toPublic = new SheetType("对公", 4);

        sheetTypeList.add(urbanResident);
        sheetTypeList.add(ruralResident);
        sheetTypeList.add(businessman);
        sheetTypeList.add(toPublic);

        SheetTypeGridAdapter sheetTypeGridAdapter = new SheetTypeGridAdapter(sheetTypeList, this);
        gv_sheetType.setAdapter(sheetTypeGridAdapter);
        sheetTypeGridAdapter.notifyDataSetChanged();
    }

    private void initView(){
        x.view().inject(this);
        tv_middleContent.setText("表单");
    }

    @Event(value={R.id.gv_sheetTypes},type=GridView.OnItemClickListener.class)
    private void onItemClick(AdapterView<?> parent, View view, int position, long id){

        switch (sheetTypeList.get(position).getType()){
            case 1:
                startActivity(new Intent(SheetActivity.this, UrbanSheetActivity.class));
                break;
            case 2:
                startActivity(new Intent(SheetActivity.this, RuralItemListActivity.class));
                break;
            case 3:
                startActivity(new Intent(SheetActivity.this, BusinessItemListActivity.class));
                break;
            case 4:
                startActivity(new Intent(SheetActivity.this, ToPublicItemListActivity.class));
                break;
        }



    }
}
