package com.pump.infocollection.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pump.infocollection.R;
import com.pump.infocollection.domain.notice.Notice;
import com.pump.infocollection.domain.notice.RecentVisitCustomer;

import java.util.List;

public class RecentVisitAdapter extends RecyclerView.Adapter<RecentVisitAdapter.RecentVisitViewHolder>{

    private List<RecentVisitCustomer> recentVisitCustomerList;
    private Context context;

    public RecentVisitAdapter(List<RecentVisitCustomer> recentVisitCustomerList, Context context) {
        this.recentVisitCustomerList = recentVisitCustomerList;
        this.context=context;
    }


    //自定义ViewHolder类
    static class RecentVisitViewHolder extends RecyclerView.ViewHolder{

        TextView tv_recentVisit_date;
        TextView tv_recentVisit_weekday;
        TextView tv_recentVisit_customerName;
        TextView tv_recentVisit_phoneNumber;
        TextView tv_recentVisit_visitor;


        public RecentVisitViewHolder(final View itemView) {
            super(itemView);
            tv_recentVisit_date= (TextView) itemView.findViewById(R.id.tv_recentVisit_date);
            tv_recentVisit_weekday= (TextView) itemView.findViewById(R.id.tv_recentVisit_weekday);
            tv_recentVisit_customerName= (TextView) itemView.findViewById(R.id.tv_recentVisit_customerName);
            tv_recentVisit_phoneNumber= (TextView) itemView.findViewById(R.id.tv_recentVisit_phoneNumber);
            tv_recentVisit_visitor= (TextView) itemView.findViewById(R.id.tv_recentVisit_visitor);
        }


    }
    @Override
    public RecentVisitAdapter.RecentVisitViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(context).inflate(R.layout.item_recent_visit,viewGroup,false);
        RecentVisitViewHolder nvh=new RecentVisitViewHolder(v);
        return nvh;
    }

    @Override
    public void onBindViewHolder(RecentVisitAdapter.RecentVisitViewHolder personViewHolder, int i) {

        personViewHolder.tv_recentVisit_date.setText(recentVisitCustomerList.get(i).getDate());
        personViewHolder.tv_recentVisit_weekday.setText(recentVisitCustomerList.get(i).getWeekday());
        personViewHolder.tv_recentVisit_customerName.setText(recentVisitCustomerList.get(i).getName());
        personViewHolder.tv_recentVisit_phoneNumber.setText(recentVisitCustomerList.get(i).getPhoneNumber());
        personViewHolder.tv_recentVisit_visitor.setText(recentVisitCustomerList.get(i).getVisitor());

    }

    @Override
    public int getItemCount() {
        return recentVisitCustomerList.size();
    }
}