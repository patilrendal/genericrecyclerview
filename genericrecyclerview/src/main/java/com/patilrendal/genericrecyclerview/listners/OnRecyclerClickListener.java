package com.patilrendal.genericrecyclerview.listners;

public interface OnRecyclerClickListener extends BaseRecyclerListener {
    /**
     * RecyclerView item has been clicked
     *
     * @param id item id
     */
    void onItemClicked(long id);

    /**
     * Item long pressed.
     *
     * @param id item id
     */
    void onItemLongPress(long id);



}