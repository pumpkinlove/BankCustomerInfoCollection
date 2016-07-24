package com.pump.infocollection.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.pump.infocollection.R;
import com.pump.infocollection.domain.SheetType;

import java.util.List;

/**
 * Created by Administrator on 2016/7/17 0017.
 */
public class SheetTypeGridAdapter extends BaseAdapter {

    private Context context;
    private List<SheetType> sheetTypeList;

    public SheetTypeGridAdapter(List<SheetType> sheetTypeList, Context context) {
        this.sheetTypeList = sheetTypeList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return sheetTypeList.size();
    }

    @Override
    public Object getItem(int position) {
        return sheetTypeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=null;
        try{
            ViewHolder holder = new ViewHolder();
            if (convertView == null) {
                view = View.inflate(context, R.layout.item_grid_sheettype, null);
                holder.sheetTypeName = (TextView) view.findViewById(R.id.sheetTypeName);
                view.setTag(holder);
            } else {
                view = convertView;
                holder = (ViewHolder) view.getTag();
            }
            SheetType sheetType = sheetTypeList.get(position);
            if(sheetType!=null){
                holder.sheetTypeName.setText("\n客户基本信息表\n("+sheetType.getTypeName()+")\n");
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        view.setBackgroundColor(Color.WHITE);
        return view;
    }

    static class ViewHolder {
        TextView sheetTypeName;
    }

    public List<SheetType> getSheetTypeList(){
        return sheetTypeList;
    }
}
