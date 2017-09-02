package org.bits_waves.waves2017;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by aryan on 3/9/17.
 */

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {
    private List<EventItem> listItems;
    private Context context;


    public EventAdapter(List<EventItem> moviesList) {
        this.listItems = moviesList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_recycler, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final EventItem listItem = listItems.get(position);
        holder.head.setText(listItem.getHead());
        holder.desc.setText(listItem.getDesc());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "hello"+listItem.getHead(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView head;
        public TextView desc;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            head = (TextView)itemView.findViewById(R.id.heading);
            desc = (TextView)itemView.findViewById(R.id.desc);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linear_lay);
        }
    }
}
