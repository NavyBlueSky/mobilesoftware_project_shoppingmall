package com.course.myproject01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button csb;
    public RecyclerView recyclerView;
    ArrayList<Item> itemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        csb = (Button)findViewById(R.id.button);
        csb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Customer_Service01.class);
                startActivity(intent);
            }
        });

        recyclerView = findViewById(R.id.recycler_view);

//      RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this); //상하
//      RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
//                LinearLayoutManager.HORIZONTAL,false); //좌우
//      RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 3); //3개 상하 나오게
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2,
                LinearLayoutManager.HORIZONTAL,false); //2개 좌우 나오게

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new MyAdapter(insertItem()));

    }

    ArrayList insertItem()
    {
        itemList = new ArrayList<>();
        Item item1 = new Item(R.drawable.hanger1, "원목 옷걸이");
        Item item2 = new Item(R.drawable.foot1, "발 거치대");
        Item item3 = new Item(R.drawable.cloud1 , "구름 무드등");
        Item item4 = new Item(R.drawable.clock1, "소품 시계");
        Item item5 = new Item(R.drawable.retro1, "레트로 밥상");
        Item item6 = new Item(R.drawable.light1, "조립 무드등");
        Item item7 = new Item(R.drawable.table1, "변형 테이블");
        Item item8 = new Item(R.drawable.sofa1, "미니 소파");
        Item item9 = new Item(R.drawable.chair1, "스툴 의자");
        Item item10 = new Item(R.drawable.box1, "선정리 박스");

        itemList.add(item1);itemList.add(item2);itemList.add(item3);itemList.add(item4);itemList.add(item5);
        itemList.add(item6);itemList.add(item7);itemList.add(item8);itemList.add(item9);itemList.add(item10);
        return itemList;
    }
}