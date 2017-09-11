package org.bits_waves.waves2017;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by aryan on 3/9/17.
 */

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.ViewHolder> {
    private List<AppItem> listItems;
    private Context context;
  //  private LinearLayout rootView;


    public AppAdapter(List<AppItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.our_team_fragement_app_card_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        AppItem listItem = listItems.get(position);
        holder.name.setText(listItem.getName());
        holder.email.setText(listItem.getEmail());
        holder.number.setText(listItem.getNumber());

        Picasso.with(context).load(listItem.getImageUrl()).fit().into(holder.imgViewIcon);
//        Picasso.with(context).load(listItem.getImageUrl()).fit().into(holder.imgViewIcon);
//        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(context, Events.class);
//                context.startActivity(intent);
//            }
//        });
//        if(position % 2 == 0)
//        {
//            //holder.rootView.setBackgroundColor(Color.BLACK);
//            holder.linearLayout.setBackgroundResource(R.color.black);
//        }
//        else
//        {
//            //holder.rootView.setBackgroundColor(Color.WHITE);
//            holder.linearLayout.setBackgroundResource(R.color.white);
//        }
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView email;
        public TextView number;
        //public LinearLayout linearLayout;
        public ImageView imgViewIcon;

        public ViewHolder(View itemView) {
            super(itemView);

            name = (TextView)itemView.findViewById(R.id.name);
            email = (TextView)itemView.findViewById(R.id.email);
            number = (TextView)itemView.findViewById(R.id.number);
            imgViewIcon = (ImageView) itemView.findViewById(R.id.imageView3);
        //    linearLayout = (LinearLayout) itemView.findViewById(R.id.linear_lay);
        }
    }
}
