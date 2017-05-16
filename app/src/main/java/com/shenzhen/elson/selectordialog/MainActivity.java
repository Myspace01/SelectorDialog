package com.shenzhen.elson.selectordialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.shenzhen.elson.selectordialoglib.SelectorDialog;

public class MainActivity extends AppCompatActivity implements SelectorDialog.SelectorDialogListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    
    public void click(View view){
        showActionSheet();
    }

    public void showActionSheet()
    {
        SelectorDialog.createBuilder(this, getSupportFragmentManager()).setCancelButtonTitle("取消").setOtherButtonTitles("相机", "相册")
                .setCancelableOnTouchOutside(true).setListener(this).show();
    }

    @Override
    public void onOtherButtonClick(SelectorDialog actionSheet, int index)
    {
        switch (index)
        {
            case 0://相机
                Toast.makeText(this,"打开相机",Toast.LENGTH_SHORT).show();
                break;
            case 1://相册
                Toast.makeText(this,"打开相册",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onDismiss(SelectorDialog actionSheet, boolean isCancle)
    {
        //取消操作   isCancle=true;
    }
}
