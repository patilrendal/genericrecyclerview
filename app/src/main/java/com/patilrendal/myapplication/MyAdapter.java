package com.patilrendal.myapplication;

import android.content.Context;
import android.view.ViewGroup;

import com.patilrendal.genericrecyclerview.GenericRecyclerAdapter;
import com.patilrendal.genericrecyclerview.listners.OnRecyclerObjectClickListener;

public class MyAdapter extends GenericRecyclerAdapter<UserDTO, OnRecyclerObjectClickListener<UserDTO>, UserViewHolder> {


    /**
     * Base constructor.
     * Allocate adapter-related objects here if needed.
     *
     * @param context Context needed to retrieve LayoutInflater
     */
    public MyAdapter(Context context) {
        super(context);
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new UserViewHolder(inflate(R.layout.item_user,parent,false));
    }
}