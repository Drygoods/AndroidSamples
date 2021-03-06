package com.sdwfqin.sample.view.viewz2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;

import com.sdwfqin.sample.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 描述：自定义View2凹凸边缘
 *
 * @author sdwfqin
 * @date 2017/5/10
 */
public class ViewZ2Activity extends AppCompatActivity {

    @BindView(R.id.viewz2_seek)
    SeekBar mViewz2Seek;
    @BindView(R.id.viewz2_main)
    ViewZ2View mViewz2Main;
    @BindView(R.id.viewz2_seek2)
    SeekBar mViewz2Seek2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_z2);
        ButterKnife.bind(this);

        mViewz2Seek.setProgress(mViewz2Main.getRadius());
        mViewz2Seek2.setProgress(mViewz2Main.getGap());

        // 圆的半径
        mViewz2Seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mViewz2Main.setRadius(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        // 圆的间距
        mViewz2Seek2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mViewz2Main.setGap(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
