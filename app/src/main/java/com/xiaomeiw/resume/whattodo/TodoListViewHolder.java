package com.xiaomeiw.resume.whattodo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by wenxiaomei on 17/4/17.
 */

public class TodoListViewHolder extends RecyclerView.ViewHolder {

    TextView todoText;
    CheckBox doneCheckbox;

    public TodoListViewHolder(@NonNull View itemView) {
        super(itemView);

        todoText = (TextView) itemView.findViewById(R.id.main_list_item_text);
        doneCheckbox = (CheckBox) itemView.findViewById(R.id.main_list_item_check);
    }
}