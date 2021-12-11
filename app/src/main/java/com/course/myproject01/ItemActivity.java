package com.course.myproject01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemActivity extends AppCompatActivity {
    private Intent intent;
    private int number;
    private String title;
    private ImageView imageView, imageViewtwo;
    private TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail); //전환된 xml

        intent = getIntent();
        number = intent.getIntExtra("number", -1);
        title = intent.getStringExtra("title");

        imageView = findViewById(R.id.item_detail_image);
        textView = findViewById(R.id.item_detail_text);
        imageViewtwo = findViewById(R.id.imageView2);

        switch (number)
        {
            case 0:
                imageView.setImageResource(R.drawable.hanger1);
                imageViewtwo.setImageResource(R.drawable.hanger2);
                textView.setText(title);
                textView.append("\n");
                textView.append("제품가격 : 25,900원 \n");
                textView.append("제품 설명 : 원목 소재의 베이직한 옷걸이\n");
                textView.append("제조사 : 예다움 - https://yedaoom.net/\n");
                break;

            case 1:
                imageView.setImageResource(R.drawable.foot1);
                imageViewtwo.setImageResource(R.drawable.foot2);
                textView.setText(title);
                textView.append("\n");
                textView.append("제품가격 : 48,000원 \n");
                textView.append("제품 설명 : 바닥에 발을 두는 것이 불편한 당신에게\n");
                textView.append("제조사 : 듀오백 - https://www.duoback.co.kr/duoback\n");
                break;

            case 2:
                imageView.setImageResource(R.drawable.cloud1);
                imageViewtwo.setImageResource(R.drawable.cloud2);
                textView.setText(title);
                textView.append("\n");
                textView.append("제품가격 : 6,000원 \n");
                textView.append("제품 설명 : 당신의 방을 하늘속으로 \n");
                break;

            case 3:
                imageView.setImageResource(R.drawable.clock1);
                imageViewtwo.setImageResource(R.drawable.clock2);
                textView.setText(title);
                textView.append("\n");
                textView.append("제품가격 : 15,000원 \n");
                textView.append("제품 설명 : 이 시계를 보고있으면 당신도 녹아내릴수 있습니다...! \n");
                break;

            case 4:
                imageView.setImageResource(R.drawable.retro1);
                imageViewtwo.setImageResource(R.drawable.retro2);
                textView.setText(title);
                textView.append("\n");
                textView.append("제품가격 : 38,900원 \n");
                textView.append("제품 설명 : 당신의 밥상을 덕선이의 방으로\n");
                textView.append("제조사 : 예다움 - https://yedaoom.net/\n");
                break;

            case 5:
                imageView.setImageResource(R.drawable.light1);
                imageViewtwo.setImageResource(R.drawable.light2);
                textView.setText(title);
                textView.append("\n");
                textView.append("제품가격 : 20,000원 \n");
                textView.append("제품 설명 : 당신의 입맛대로 조명을 꾸며보세요.\n");
                break;

            case 6:
                imageView.setImageResource(R.drawable.table1);
                imageViewtwo.setImageResource(R.drawable.table2);
                textView.setText(title);
                textView.append("\n");
                textView.append("제품가격 : 130,000원 \n");
                textView.append("제품 설명 : 거실 테이블에서 밥을 먹고싶은 당신에게\n");
                break;

            case 7:
                imageView.setImageResource(R.drawable.sofa1);
                imageViewtwo.setImageResource(R.drawable.sofa2);
                textView.setText(title);
                textView.append("\n");
                textView.append("제품가격 : 120,000원 \n");
                textView.append("제품 설명 : 자취생인 당신을 위한 맞춤소파\n");
                textView.append("제조사 : 이케아 - https://www.ikea.com/kr/ko/\n");
                break;

            case 8:
                imageView.setImageResource(R.drawable.chair1);
                imageViewtwo.setImageResource(R.drawable.chair2);
                textView.setText(title);
                textView.append("\n");
                textView.append("제품가격 : 29,900원 \n");
                textView.append("제품 설명 : 최소의 공간에 최고의 인테리어\n");
                textView.append("제조사 : 예다움 - https://yedaoom.net/\n");
                break;
            case 9:
                imageView.setImageResource(R.drawable.box1);
                imageViewtwo.setImageResource(R.drawable.box2);
                textView.setText(title);
                textView.append("\n");
                textView.append("제품가격 : 18,000원 \n");
                textView.append("제품 설명 : 선이 늘어져있는 것이 싫은 당신에게\n");
                break;
        }
    }
}
