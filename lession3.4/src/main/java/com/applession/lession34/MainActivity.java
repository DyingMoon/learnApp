package com.applession.lession34;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.mylayout);//获取帧布局管理器
        final RabbitView rabbit = new RabbitView(this);//创建并实例化RabbitView类；
        //为兔子添加触摸时间监听

        rabbit.setOnTouchListener(new View.OnTouchListener() {
          @Override
            public boolean onTouch(View var1, MotionEvent motionEvent) {
                rabbit.bitmapX = motionEvent.getX();
                rabbit.bitmapY = motionEvent.getY();
                rabbit.invalidate(); //重绘rabbit组件
                return true;
            }

        });
    frameLayout.addView(rabbit);
    }
}
