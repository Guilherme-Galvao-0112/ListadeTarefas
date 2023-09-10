package com.example.listatarefas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> tarefas = new ArrayList<>(
                Arrays.asList());
        ListView ListaTarefas = findViewById(R.id.ListaTarefas);
        ListaTarefas.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tarefas ));

    }
}