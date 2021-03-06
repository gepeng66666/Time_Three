package com.geekghost.gp.geekghost.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.geekghost.gp.geekghost.R;
import com.geekghost.gp.geekghost.entity.SpecialListBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：戈鹏
 * on 2018/1/9 10:29
 */

public class SpecialRvAdapter2 extends RecyclerView.Adapter<SpecialRvAdapter2.ViewHolder> {

    private Context context;
    private List<SpecialListBean> list = new ArrayList<>();

    /*private onFoundRvClick onFoundRvClick;

    public interface onFoundRvClick{
        void onFoundRvClick(int position);
    }

    public void setOnFoundRvClick(onFoundRvClick onFoundRvClick){
        this.onFoundRvClick = onFoundRvClick;
    }*/


    public SpecialRvAdapter2(Context context, List<SpecialListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_nicemovie_rv, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       /* holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFoundRvClick.onFoundRvClick(position);
            }
        });*/

        holder.foundRvImg.setImageURI(list.get(position).getPic());
        holder.foundRvTv.setText(list.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.found_rv_img)
        SimpleDraweeView foundRvImg;
        @BindView(R.id.found_rv_tv)
        TextView foundRvTv;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

    }
}
