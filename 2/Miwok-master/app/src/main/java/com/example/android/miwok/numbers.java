package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class numbers extends AppCompatActivity {

    ArrayList<Word> words=new ArrayList<Word>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        words.add(new Word("one","lutti",R.drawable.number_one));
        words.add(new Word("two","otiliko",R.drawable.number_two));

        words.add(new Word("three","tolookosu",R.drawable.number_three));
        words.add(new Word("four","oyissa",R.drawable.number_four));
        words.add(new Word("five","massokka",R.drawable.number_five));
        words.add(new Word("six","temmokka",R.drawable.number_six));

        words.add(new Word("seven","kenekaku",R.drawable.number_seven));

        words.add(new Word("eight","kawinta",R.drawable.number_eight));
        words.add(new Word("nine","wo'e",R.drawable.number_nine));

        words.add(new Word("ten","na'aatha",R.drawable.number_ten));

       // LinearLayout rootview=(LinearLayout)findViewById(R.id.rootView);
//        for(int i=0;i<words.size();i++) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            rootview.addView(wordView);
//        }
        //ArrayAdapter<Word> itemAdapter=new ArrayAdapter<Word>(this,R.layout.list_item,words);
       // WordAdapter<Word> adapter=new WordAdapter<Word>(this,R.layout.list_item,words);
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView=(ListView)findViewById(R.id.rootview);
        listView.setAdapter(adapter);



    }




}
