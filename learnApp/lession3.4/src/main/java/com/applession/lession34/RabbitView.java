package com.applession.lession34;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class RabbitView extends View {
    public float bitmapX; //兔子的XY坐标
    public float bitmapY;
    //Paint paint = new Paint();
    public RabbitView(Context context){
        super(context);
        bitmapX = 290;
        bitmapY = 130;
    }
    @Override
    public boolean performClick() {
        // do what you want
        return super.performClick();
    }
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint paint = new Paint();//创建并实例化paint对象
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.mipmap.rabbit);//根据图片生成位图对象
        canvas.drawBitmap(bitmap,bitmapX,bitmapY,paint);//绘制兔子
        if (bitmap.isRecycled()){
            bitmap.recycle();//如果图片可以回收，强制回收图片
        }

    }

}
