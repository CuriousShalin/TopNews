package com.example.topnews;

import static com.example.topnews.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.topnews.Models.NewsHeadlines;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
NewsHeadlines headlines;
TextView txt_title,txt_author,txt_time,txt_detail,txt_content;
ImageView img_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_details);
        txt_title=findViewById(id.text_detail_title);
        txt_time=findViewById(id.text_detail_time);
        txt_author=findViewById(id.text_detail_author);
        txt_detail=findViewById(id.text_detail_detail);
        txt_content=findViewById(id.text_detail_content);
        img_news=findViewById(id.img_detail_news);
        headlines=(NewsHeadlines) getIntent().getSerializableExtra("data");

        txt_title.setText(headlines.getTitle());
        txt_author.setText(headlines.getAuthor());
        txt_time.setText(headlines.getPublishedAt());
        txt_detail.setText(headlines.getDescription());
        txt_content.setText(headlines.getContent());


        Picasso.get().load(headlines.getUrlToImage()).into(img_news);
    }
}