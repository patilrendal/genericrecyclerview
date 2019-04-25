package com.patilrendal.genericrecyclerview.listners;

public interface OnRecyclerObjectClickListener<T> extends BaseRecyclerListener {
    /**
     * Item has been clicked.
     *
     * @param item object associated with the clicked item.
     */
    void onItemClicked(T item);


    /**
     * Item long pressed.
     *
     * @param item object associated with the clicked item.
     */
    void onItemLongPress(T item);




}