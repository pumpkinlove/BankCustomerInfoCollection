package com.pump.infocollection.activity.notice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;
import android.widget.TextView;

import com.pump.infocollection.R;
import com.pump.infocollection.adapter.NoticeAdapter;
import com.pump.infocollection.adapter.RecentDevelopAdapter;
import com.pump.infocollection.adapter.RecentVisitAdapter;
import com.pump.infocollection.domain.notice.Notice;
import com.pump.infocollection.domain.notice.RecentDevelopCustomer;
import com.pump.infocollection.domain.notice.RecentVisitCustomer;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

@ContentView(R.layout.activity_notice)
public class NoticeActivity extends AppCompatActivity {

    @ViewInject(R.id.tv_middleContent)
    private TextView tv_middleContent;

    @ViewInject(R.id.rv_notice)
    private RecyclerView rv_notice;

    @ViewInject(R.id.rv_recentVisit)
    private RecyclerView rv_recentVisit;

    @ViewInject(R.id.rv_recentDevelop)
    private RecyclerView rv_recentDevelop;

    private List<Notice> noticeList;
    private List<RecentVisitCustomer> recentVisitCustomerList;
    private List<RecentDevelopCustomer> recentDevelopCustomerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏
        super.onCreate(savedInstanceState);

        initData();
        initView();
        fetchCardView();
    }

    private void initData() {
        noticeList = new ArrayList<Notice>();
        noticeList.add(new Notice("昌乐农商行关于使用客户管理系统的通知", "05-08"));
        noticeList.add(new Notice("昌乐农商行关于开展客户信息采集的通知", "05-08"));
        noticeList.add(new Notice("潍坊农商行安全主体责任名单的通知", "05-08"));
        noticeList.add(new Notice("昌乐农商行关于表彰各位员工的通知", "05-08"));
        noticeList.add(new Notice("昌乐农商行关于使用客户管理系统的通知", "05-08"));
        noticeList.add(new Notice("昌乐农商行关于开展客户信息采集的通知", "05-08"));
        noticeList.add(new Notice("潍坊农商行安全主体责任名单的通知", "05-08"));
        noticeList.add(new Notice("昌乐农商行关于表彰各位员工的通知", "05-08"));
        noticeList.add(new Notice("昌乐农商行关于使用客户管理系统的通知", "05-08"));
        noticeList.add(new Notice("昌乐农商行关于开展客户信息采集的通知", "05-08"));
        noticeList.add(new Notice("潍坊农商行安全主体责任名单的通知", "05-08"));
        noticeList.add(new Notice("昌乐农商行关于表彰各位员工的通知", "05-08"));


        recentVisitCustomerList = new ArrayList<RecentVisitCustomer>();
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));
        recentVisitCustomerList.add(new RecentVisitCustomer("刘秀全","05-08","星期一","139039409876","章庆"));

        recentDevelopCustomerList = new ArrayList<RecentDevelopCustomer>();
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","22分钟前"));
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","1小时前"));
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","今天14：23"));
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","今天10：23"));
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","22分钟前"));
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","22分钟前"));
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","1小时前"));
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","今天14：23"));
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","今天10：23"));
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","22分钟前"));
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","22分钟前"));
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","1小时前"));
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","今天14：23"));
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","今天10：23"));
        recentDevelopCustomerList.add(new RecentDevelopCustomer("刘三强","西村网点","22分钟前"));

    }

    private void initView() {
        x.view().inject(this);
        tv_middleContent.setText("首页");
    }


    private void fetchCardView(){
        NoticeAdapter na = new NoticeAdapter(noticeList, this);
        rv_notice.setHasFixedSize(true);
        rv_notice.setLayoutManager(new LinearLayoutManager(this));
        rv_notice.setAdapter(na);

        RecentVisitAdapter rva = new RecentVisitAdapter(recentVisitCustomerList, this);
        rv_recentVisit.setHasFixedSize(true);
        rv_recentVisit.setLayoutManager(new LinearLayoutManager(this));
        rv_recentVisit.setAdapter(rva);

        RecentDevelopAdapter rda = new RecentDevelopAdapter(recentDevelopCustomerList, this);
        rv_recentDevelop.setHasFixedSize(true);
        rv_recentDevelop.setLayoutManager(new LinearLayoutManager(this));
        rv_recentDevelop.setAdapter(rda);
    }

}
