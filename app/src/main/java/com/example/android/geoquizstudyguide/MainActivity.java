package com.example.android.geoquizstudyguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Question> questions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionAdapter (questions,this));
    }

    private void initialData(){
        questions = new ArrayList<>();
        questions.add(new Question(R.string.europe, R.string.question_europe, R.drawable.europe,true));
        questions.add(new Question(R.string.ocean,R.string.question_ocean,R.drawable.oceans,false));
        questions.add(new Question(R.string.asia,R.string.question_asia,R.drawable.asia,true));
        questions.add(new Question(R.string.americas, R.string.question_americas, R.drawable.americas,false));
        questions.add(new Question(R.string.city,R.string.question_city,R.drawable.rome,false));
        questions.add(new Question(R.string.river,R.string.question_river,R.drawable.river,true));

    }


}
