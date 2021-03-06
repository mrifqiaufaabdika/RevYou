package com.rievoluzione.revyou.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rievoluzione.revyou.R;

public class CercaRisultatiAdapter extends RecyclerView.Adapter<CercaRisultatiAdapter.UltimateHold> {

    private int count ;
    private Context mContext;

    public CercaRisultatiAdapter(Context context, int count){
        this.mContext =context;
        this.count = count;
    }


    @NonNull
    @Override
    public UltimateHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list_ultime, parent, false);
        CercaRisultatiAdapter.UltimateHold holder = new CercaRisultatiAdapter.UltimateHold(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull UltimateHold holder, int position) {

    }

    @Override
    public int getItemCount() {
        return count;
    }

    public class UltimateHold extends RecyclerView.ViewHolder {


        public UltimateHold(View itemView) {
            super(itemView);
//            ButterKnife.bind(this, itemView);
        }
    }
}
