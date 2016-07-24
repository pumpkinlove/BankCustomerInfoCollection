package com.pump.infocollection.activity.sheet.urban;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.pump.infocollection.R;
import com.pump.infocollection.domain.sheetContent.BankBusiness;
import com.pump.infocollection.domain.sheetContent.Conclusion;
import com.pump.infocollection.domain.sheetContent.FamilyAssets;
import com.pump.infocollection.domain.sheetContent.FamilyFinance;
import com.pump.infocollection.domain.sheetContent.FamilyLiabilities;
import com.pump.infocollection.domain.sheetContent.FamilyMember;
import com.pump.infocollection.domain.sheetContent.PersonInfo;
import com.pump.infocollection.domain.sheetContent.PotentialDemand;
import com.pump.infocollection.domain.sheetContent.urban.JobInfo;
import com.pump.infocollection.fragment.sheetContent.BankBusinessFragment;
import com.pump.infocollection.fragment.sheetContent.ConclusionFragment;
import com.pump.infocollection.fragment.sheetContent.FamilyAssetsFragment;
import com.pump.infocollection.fragment.sheetContent.FamilyFinanceFragment;
import com.pump.infocollection.fragment.sheetContent.FamilyLiabilitiesFragment;
import com.pump.infocollection.fragment.sheetContent.FamilyMemberFragment;
import com.pump.infocollection.fragment.sheetContent.PersonInfoFragment;
import com.pump.infocollection.fragment.sheetContent.PotentialDemandFragment;
import com.pump.infocollection.fragment.sheetContent.urban.JobFragment;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

@ContentView(R.layout.activity_urban_sheet)
public class UrbanSheetActivity extends AppCompatActivity {

    @ViewInject(R.id.tv_middleContent)
    private TextView tv_middleContent;

    @ViewInject(R.id.tv_leftContent)
    private TextView tv_leftContent;

//    @ViewInject(R.id.lv_urban_list)
//    private ListView lv_urban_list;

    @ViewInject(R.id.frameLayout_content)
    private FrameLayout frameLayout_content;

//    private PersonInfoFragment personInfoFragment = new PersonInfoFragment();
//    private JobFragment jobFragment = new JobFragment();
//    private FamilyMemberFragment familyMemberFragment = new FamilyMemberFragment();
//    private FamilyAssetsFragment familyAssetsFragment = new FamilyAssetsFragment();
//    private FamilyLiabilitiesFragment familyLiabilitiesFragment = new FamilyLiabilitiesFragment();
//    private FamilyFinanceFragment familyFinanceFragment = new FamilyFinanceFragment();
//    private BankBusinessFragment bankBusinessFragment = new BankBusinessFragment();
//    private PotentialDemandFragment potentialDemandFragment = new PotentialDemandFragment();
//    private ConclusionFragment conclusionFragment = new ConclusionFragment();
//
//    private PersonInfo personInfo;
//    private JobInfo jobInfo;
//    private List<FamilyMember> familyMemberList;
//    private FamilyAssets familyAssets;
//    private FamilyLiabilities familyLiabilities;
//    private FamilyFinance familyFinance;
//    private BankBusiness bankBusiness;
//    private PotentialDemand potentialDemand;
//    private Conclusion conclusion;
//    private static final String[] TITLES = {"个人信息","职业信息","家庭成员","家庭总资产","家庭总负债","家庭年收支","银行业务","潜在需求","结论、备注"};

//    private FragmentManager fm;
//    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏
        super.onCreate(savedInstanceState);

        initData();
        initView();

    }

    private void initData(){
//        fm = getFragmentManager();
//        transaction = fm.beginTransaction();
    }

    private void initView(){
        x.view().inject(this);
        tv_middleContent.setText("城镇居民");
        tv_leftContent.setText("返回");
        tv_leftContent.setVisibility(View.VISIBLE);
//        lv_urban_list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, TITLES));

//        FragmentManager fm = getFragmentManager();
//        FragmentTransaction transaction = fm.beginTransaction();
//        personInfoFragment = new PersonInfoFragment();
//        transaction.replace(R.id.frameLayout_content, personInfoFragment);
//        transaction.commit();

    }

    @Event(value={R.id.tv_leftContent},type=View.OnClickListener.class)
    private void finish(View view) {
        finish();
    }

//    @Event(value={R.id.lv_urban_list},type=ListView.OnItemClickListener.class)
//    private void onItemClick(AdapterView<?> parent, View view, int position, long id){
//        transaction = fm.beginTransaction();
//        switch(position){
//            case 0:
//                transaction.replace(R.id.frameLayout_content, personInfoFragment);
//                break;
//            case 1:
//                transaction.replace(R.id.frameLayout_content, jobFragment);
//                break;
//            case 2:
//                transaction.replace(R.id.frameLayout_content, familyMemberFragment);
//                break;
//            case 3:
//                transaction.replace(R.id.frameLayout_content, familyAssetsFragment);
//                break;
//            case 4:
//                transaction.replace(R.id.frameLayout_content, familyLiabilitiesFragment);
//                break;
//            case 5:
//                transaction.replace(R.id.frameLayout_content, familyFinanceFragment);
//                break;
//            case 6:
//                transaction.replace(R.id.frameLayout_content, bankBusinessFragment);
//                break;
//            case 7:
//                transaction.replace(R.id.frameLayout_content, potentialDemandFragment);
//                break;
//            case 8:
//                transaction.replace(R.id.frameLayout_content, conclusionFragment);
//                break;
//        }
//        // transaction.addToBackStack();
//        // 事务提交
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }
}
