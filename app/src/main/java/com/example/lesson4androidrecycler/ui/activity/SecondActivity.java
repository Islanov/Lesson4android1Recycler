package com.example.lesson4androidrecycler.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.lesson4androidrecycler.R;
import com.example.lesson4androidrecycler.constants.Constans;
import com.example.lesson4androidrecycler.model.BookModel;

public class SecondActivity extends AppCompatActivity {
    TextView tvDriversNick, tvDriversDeck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvDriversNick = findViewById(R.id.tv_drivers_nick);
        tvDriversDeck = findViewById(R.id.tv_drivers_deck);

        getData();
    }

    private void getData() {
        BookModel bookModel = (BookModel) getIntent().getSerializableExtra(Constans.KEY);
        tvDriversNick.setText(bookModel.getName());
        tvDriversDeck.setText(bookModel.getDescription());

    }
}