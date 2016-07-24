package com.pump.infocollection.fragment.sheetContent;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.pump.infocollection.R;

import org.xutils.view.annotation.ViewInject;

/**
 * Created by Administrator on 2016/7/22 0022.
 */
public class PersonInfoFragment extends Fragment {

    private Spinner sp_certificateType;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_personinfo, container, false);
    }


    @Override
    public void onStart() {
        sp_certificateType = (Spinner) getActivity().findViewById(R.id.sp_certificateType);
        String[] types = {"身份证","军人证","护照"};
        sp_certificateType.setAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_spinner_item, types));
        ArrayAdapter<String>  adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,types);

        //设置下拉列表的风格
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //将adapter 添加到spinner中
        sp_certificateType.setAdapter(adapter);
        sp_certificateType.setVisibility(View.VISIBLE);
        super.onStart();
    }
}
