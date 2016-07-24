package com.pump.infocollection.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pump.infocollection.R;
import com.pump.infocollection.domain.notice.Notice;
import com.pump.infocollection.domain.notice.RecentDevelopCustomer;

import java.util.List;

public class RecentDevelopAdapter extends RecyclerView.Adapter<RecentDevelopAdapter.RecentDevelopViewHolder>{

    private List<RecentDevelopCustomer> recentDevelopCustomerList;
    private Context context;

    public RecentDevelopAdapter(List<RecentDevelopCustomer> recentDevelopCustomerList, Context context) {
        this.recentDevelopCustomerList = recentDevelopCustomerList;
        this.context=context;
    }


    //自定义ViewHolder类
    static class RecentDevelopViewHolder extends RecyclerView.ViewHolder{

        TextView tv_customerName;
        TextView tv_dept;
        TextView tv_time;

        public RecentDevelopViewHolder(final View itemView) {
            super(itemView);
            tv_customerName= (TextView) itemView.findViewById(R.id.tv_recentDevelop_customerName);
            tv_dept= (TextView) itemView.findViewById(R.id.tv_recentDevelop_dept);
            tv_time= (TextView) itemView.findViewById(R.id.tv_recentDevelop_time);
        }


    }
    @Override
    public RecentDevelopAdapter.RecentDevelopViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(context).inflate(R.layout.item_recent_develop,viewGroup,false);
        RecentDevelopViewHolder nvh=new RecentDevelopViewHolder(v);
        return nvh;
    }

    @Override
    public void onBindViewHolder(RecentDevelopAdapter.RecentDevelopViewHolder personViewHolder, int i) {
        personViewHolder.tv_customerName.setText(recentDevelopCustomerList.get(i).getName());
        personViewHolder.tv_dept.setText(recentDevelopCustomerList.get(i).getDept());
        personViewHolder.tv_time.setText(recentDevelopCustomerList.get(i).getTime());
    }

    @Override
    public int getItemCount() {
        return recentDevelopCustomerList.size();
    }
}