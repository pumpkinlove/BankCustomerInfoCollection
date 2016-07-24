package com.pump.infocollection.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pump.infocollection.R;
import com.pump.infocollection.domain.notice.Notice;

import java.util.List;

public class NoticeAdapter extends RecyclerView.Adapter<NoticeAdapter.NoticeViewHolder>{

    private List<Notice> noticeList;
    private Context context;

    public NoticeAdapter(List<Notice> noticeList, Context context) {
        this.noticeList = noticeList;
        this.context=context;
    }


    //自定义ViewHolder类
    static class NoticeViewHolder extends RecyclerView.ViewHolder{

        TextView tv_content;
        TextView tv_date;

        public NoticeViewHolder(final View itemView) {
            super(itemView);
            tv_content= (TextView) itemView.findViewById(R.id.tv_notice_content);
            tv_date= (TextView) itemView.findViewById(R.id.tv_notice_date);
        }


    }
    @Override
    public NoticeAdapter.NoticeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(context).inflate(R.layout.item_notice,viewGroup,false);
        NoticeViewHolder nvh=new NoticeViewHolder(v);
        return nvh;
    }

    @Override
    public void onBindViewHolder(NoticeAdapter.NoticeViewHolder personViewHolder, int i) {
        final int j=i;

        personViewHolder.tv_content.setText(noticeList.get(i).getContent());
        personViewHolder.tv_date.setText(noticeList.get(i).getDate());

    }

    @Override
    public int getItemCount() {
        return noticeList.size();
    }
}