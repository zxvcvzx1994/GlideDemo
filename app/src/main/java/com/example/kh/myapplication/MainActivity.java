package com.example.kh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
@BindView(R.id.img)
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        process();
    }
@OnClick(R.id.img)
public void click(){
    Toast.makeText(this, "rgrgfgdfgd", Toast.LENGTH_SHORT).show();
}
    private void process() {
        String url= "http://images.tapchianhdep.net/15-11hinh-nen-dong-phong-canh-cuc-dep-cho-dien-thoai1.gif";
        Glide.with(this).load(url)
                .into(img);
    }
}
