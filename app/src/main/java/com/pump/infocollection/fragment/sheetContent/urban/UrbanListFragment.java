package com.pump.infocollection.fragment.sheetContent.urban;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.pump.infocollection.R;
import com.pump.infocollection.activity.MainActivity;
import com.pump.infocollection.activity.sheet.urban.UrbanSheetActivity;
import com.pump.infocollection.fragment.sheetContent.BankBusinessFragment;
import com.pump.infocollection.fragment.sheetContent.ConclusionFragment;
import com.pump.infocollection.fragment.sheetContent.FamilyAssetsFragment;
import com.pump.infocollection.fragment.sheetContent.FamilyFinanceFragment;
import com.pump.infocollection.fragment.sheetContent.FamilyLiabilitiesFragment;
import com.pump.infocollection.fragment.sheetContent.FamilyMemberFragment;
import com.pump.infocollection.fragment.sheetContent.PersonInfoFragment;
import com.pump.infocollection.fragment.sheetContent.PotentialDemandFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class UrbanListFragment extends ListFragment {
    private static final String[] TITLES = {"个人信息","职业信息","家庭成员","家庭总资产","家庭总负债","家庭年收支","银行业务","潜在需求","结论、备注"};

    private UrbanSheetActivity urbanSheetActivity;

    private PersonInfoFragment personInfoFragment = new PersonInfoFragment();
    private JobFragment jobFragment = new JobFragment();
    private FamilyMemberFragment familyMemberFragment = new FamilyMemberFragment();
    private FamilyAssetsFragment familyAssetsFragment = new FamilyAssetsFragment();
    private FamilyLiabilitiesFragment familyLiabilitiesFragment = new FamilyLiabilitiesFragment();
    private FamilyFinanceFragment familyFinanceFragment = new FamilyFinanceFragment();
    private BankBusinessFragment bankBusinessFragment = new BankBusinessFragment();
    private PotentialDemandFragment potentialDemandFragment = new PotentialDemandFragment();
    private ConclusionFragment conclusionFragment = new ConclusionFragment();

    private FragmentManager fm;
    private FragmentTransaction transaction;

    public UrbanListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        initData();

        return inflater.inflate(R.layout.fragment_urban_list, container, false);
    }

    private void initData() {
        urbanSheetActivity = (UrbanSheetActivity) getActivity();
        fm = getFragmentManager();
        transaction = fm.beginTransaction();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置ListFragment默认的ListView，即@id/android:list
        this.setListAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, TITLES));

    }

    public void onListItemClick(ListView parent, View v, int position, long id) {

        transaction = fm.beginTransaction();
        switch(position){
            case 0:
                transaction.replace(R.id.frameLayout_content, personInfoFragment, "personInfoFragment");
                break;
            case 1:
                transaction.replace(R.id.frameLayout_content, jobFragment, "jobFragment");
                break;
            case 2:
                transaction.replace(R.id.frameLayout_content, familyMemberFragment, "familyMemberFragment");
                break;
            case 3:
                transaction.replace(R.id.frameLayout_content, familyAssetsFragment, "familyAssetsFragment");
                break;
            case 4:
                transaction.replace(R.id.frameLayout_content, familyLiabilitiesFragment, "familyLiabilitiesFragment");
                break;
            case 5:
                transaction.replace(R.id.frameLayout_content, familyFinanceFragment, "familyFinanceFragment");
                break;
            case 6:
                transaction.replace(R.id.frameLayout_content, bankBusinessFragment, "bankBusinessFragment");
                break;
            case 7:
                transaction.replace(R.id.frameLayout_content, potentialDemandFragment, "potentialDemandFragment");
                break;
            case 8:
                transaction.replace(R.id.frameLayout_content, conclusionFragment, "conclusionFragment");
                break;
        }
        // transaction.addToBackStack();
        // 事务提交
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
