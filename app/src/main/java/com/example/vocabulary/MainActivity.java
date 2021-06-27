package com.example.vocabulary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vocabulary.adapter.WordAdapter;
import com.example.vocabulary.entity.Word;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton addButton;
    private RecyclerView recyclerView;
    private WordAdapter wordAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = findViewById(R.id.add_button);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));
        wordAdapter = new WordAdapter();
        recyclerView.setAdapter(wordAdapter);

        List<Word> words = getWords();
        wordAdapter.setWords(words);
    }

    @org.jetbrains.annotations.NotNull
    private List<Word> getWords(){
        return Arrays.asList(
                new Word("Mother", "Мама"),
                new Word("Father", "Отец"),
                new Word("Brother", "Брат"),
                new Word("Sister", "Сестра")
        );
    }
}
