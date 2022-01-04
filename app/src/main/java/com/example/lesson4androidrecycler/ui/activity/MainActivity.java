package com.example.lesson4androidrecycler.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.lesson4androidrecycler.R;
import com.example.lesson4androidrecycler.ui.adapter.AdapterBook;
import com.example.lesson4androidrecycler.constants.Constans;
import com.example.lesson4androidrecycler.data.BookClient;
import com.example.lesson4androidrecycler.interaces.OnClick;
import com.example.lesson4androidrecycler.model.BookModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    AdapterBook adapterBook;
    ArrayList<BookModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
        clicklisteners();
    }

    private void initialization() {
        recyclerView = findViewById(R.id.recycler_view);
        list = BookClient.getBook();
        adapterBook = new AdapterBook(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterBook);



    }

    private void clicklisteners() {
        adapterBook.setOnClick(new OnClick() {
            @Override
            public void OnClickItem(BookModel bookModel) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(Constans.KEY, bookModel);
                startActivity(intent);
            }
        });
    }
}

