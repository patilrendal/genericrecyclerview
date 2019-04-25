package com.patilrendal.myapplication;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.patilrendal.genericrecyclerview.BaseViewHolder;
import com.patilrendal.genericrecyclerview.listners.BaseRecyclerListener;
import com.patilrendal.genericrecyclerview.listners.OnRecyclerObjectClickListener;

public class UserViewHolder extends BaseViewHolder<UserDTO, OnRecyclerObjectClickListener<UserDTO>> {

    private TextView name;
    private TextView roll;


    public UserViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.textViewName);
        roll = itemView.findViewById(R.id.textViewRollNumber);
    }

    /**
     * Bind data to the item and set listener if needed.
     *
     * @param item     object, associated with the item.
     * @param listener listener a listener {@link BaseRecyclerListener} which has to b set at the item (if not `null`).
     */
    @Override
    public void onBind(final UserDTO item, @Nullable final OnRecyclerObjectClickListener<UserDTO> listener) {
        // set all data
        name.setText(item.getName());
        roll.setText(item.getRollNumber());
        // set listener if needed
        // you can set it at any of the views instead of whole itemView if you wish
        if (listener != null) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClicked(item);
                }
            });

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    listener.onItemLongPress(item);
                    return true;
                }
            });
        }
    }
}