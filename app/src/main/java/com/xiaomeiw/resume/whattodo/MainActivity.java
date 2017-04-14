package com.xiaomeiw.resume.whattodo;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.xiaomeiw.resume.whattodo.models.Todo;
import com.xiaomeiw.resume.whattodo.utils.DateUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Fab clicked", Toast.LENGTH_LONG).show();
            }
        });

        setupUI(mockData());
    }

    private void setupUI(List<Todo> todos) {
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.crappy_list);
        linearlayout.removeAllViews();

        for (Todo todo : todos) {
            View view = getListItemView(todo);
            linearlayout.addView(view);
        }
    }

    private View getListItemView(Todo todo) {
        View view = getLayoutInflater().inflate(R.layout.main_list_item, null);
        ((TextView) view.findViewById(R.id.main_list_item_text)).setText(todo.text);
        return view;
    }

    private List<Todo> mockData() {
        List<Todo> list = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            list.add(new Todo("todo" + i, DateUtils.stringToDate("2015 7 29 0:00")));
        }
        return  list;
    }
}
