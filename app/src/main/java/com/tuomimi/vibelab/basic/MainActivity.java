package com.tuomimi.vibelab.basic;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * 最小可行页面：用于验证 VibeLab 提交 → 云端构建 → 安装启动的整条链路。
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        int pad = (int) (24 * getResources().getDisplayMetrics().density);
        root.setPadding(pad, pad, pad, pad);

        TextView title = new TextView(this);
        title.setText(getString(R.string.hello_title));
        title.setTextSize(22f);
        title.setGravity(Gravity.CENTER);

        TextView info = new TextView(this);
        info.setText(getString(R.string.hello_info));
        info.setTextSize(14f);
        info.setGravity(Gravity.CENTER);
        info.setPadding(0, pad / 2, 0, 0);

        root.addView(title);
        root.addView(info);
        setContentView(root);
    }
}
