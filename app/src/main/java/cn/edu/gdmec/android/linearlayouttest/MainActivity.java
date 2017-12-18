package cn.edu.gdmec.android.linearlayouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//Android 的图形用户界面由多个视图（View）
// 和视图组（ViewGroup）构建而成。
// View 是通用的 UI 窗体小组件，
// 如：按钮（Button）
// 、文本框（Text field）；
// 而 ViewGroup 则是用来定义子视图布局的不可见的容器，
// 如：网格部件（grid）、垂直列表部件（vertical list）。

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }
}
