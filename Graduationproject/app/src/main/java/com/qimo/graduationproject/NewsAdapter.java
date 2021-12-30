package com.qimo.graduationproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class NewsAdapter extends BaseAdapter  {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public NewsAdapter(Context context){
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return 10;
    }   //有几个组件

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView tvTitle,tvTime,tvContent;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) { //列表每一行长什么样子
        ViewHolder holder =null;
        if (convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.layout_news_item,null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv);
            holder.tvTitle = convertView.findViewById(R.id.tv_title);
            holder.tvTime = convertView.findViewById(R.id.tv_time);
            holder.tvContent = convertView.findViewById(R.id.tv_content);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        //给控件赋值
        holder.tvTitle.setText("这是标题");
        holder.tvTime.setText("2021-12.30");
        holder.tvContent.setText("这是内容");
        return convertView;
    }
}
