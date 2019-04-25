package com.patilrendal.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.patilrendal.genericrecyclerview.listners.OnRecyclerObjectClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        myAdapter=new MyAdapter(this);
        recyclerView.setAdapter(myAdapter);
        myAdapter.setListener(new OnRecyclerObjectClickListener<UserDTO>() {
            @Override
            public void onItemClicked(UserDTO item) {
                Toast.makeText(MainActivity.this, "name: "+item.getName() + " \n "+" roll number: "+item.getRollNumber(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongPress(UserDTO item) {
                Toast.makeText(MainActivity.this, "Long pressed name: "+item.getName() + " \n "+" roll number: "+item.getRollNumber(), Toast.LENGTH_SHORT).show();

            }
        });
        myAdapter.addAll(getUserList());
    }

    private List<UserDTO> getUserList() {

        List<UserDTO> userDTOS=new ArrayList<>();
         for(int i = 0 ; i< 100 ; i++){
            userDTOS.add(new UserDTO(String.valueOf((i+1)),"User "+(i+1)));
        }

        return userDTOS;
    }
}
