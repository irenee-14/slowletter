package org.techtown.slowletter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView inbox = (ImageView)findViewById(R.id.inbox_button);
        Button write = (Button)findViewById(R.id.button4);
        inbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),InboxList.class);
                startActivity(intent);
            }
        });

        write.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),WriteLetter.class);
                startActivity(intent);
            }
        }));
    }
}