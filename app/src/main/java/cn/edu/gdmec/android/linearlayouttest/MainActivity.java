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
//android:id

//这是视图的唯一标识符。可以在程序代码中通过该标识符引用对象。例如对这个对象进行读和修改的操作（在下一课里将会用到）。
//
//        当需要从 XML 里引用资源对象时，必须使用 @ 符号。
// 紧随 @ 之后的是资源的类型（这里是 id），然后是资源的名字（这里使用的是 edit_message）。
//
//        + 号只在第一次定义一个资源 ID 的时候需要。
// 它是告诉 SDK——此资源 ID 需要被创建。
// 在应用程序被编译之后，SDK 就可以直接使用这个 ID。
// edit_message 是在项目文件 gen/R.java 中创建一个新的标识符，这个标识符和 EditText 关联。
// 一旦资源 ID 被创建了，其他资源如果引用这个 ID 就不再需要 + 号。

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }
}
