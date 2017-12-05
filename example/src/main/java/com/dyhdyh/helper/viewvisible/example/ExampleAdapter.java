package com.dyhdyh.helper.viewvisible.example;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * @author dengyuhan
 * @created 2017/12/4 18:12
 */
public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleHolder> {
    private List<ExampleData> data;

    public ExampleAdapter(List<ExampleData> data) {
        this.data = data;
    }

    @Override
    public ExampleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ExampleHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_example, parent, false));
    }

    @Override
    public void onBindViewHolder(ExampleHolder holder, int position) {
        ExampleData data = this.data.get(position);
        holder.tv.setText(position + " - " + data.getTitle());
        holder.player.getLayoutParams().height = data.getDisplayHeight();

        holder.player.setUp(data.getFileUrl(), true, "测试视频");

        holder.player.loadCoverImage(data.getFileUrl(), data.getImage());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class ExampleHolder extends RecyclerView.ViewHolder {
        TextView tv;
        SampleCoverVideo player;

        public ExampleHolder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);
            player = itemView.findViewById(R.id.video);
        }
    }
}
