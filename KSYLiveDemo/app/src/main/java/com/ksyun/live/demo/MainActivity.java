package com.ksyun.live.demo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ksyun.live.demo.player.activity.CaptureActivity;
import com.ksyun.live.demo.player.activity.FloatingPlayingActivity;
import com.ksyun.live.demo.player.activity.FloatingVideoActivity;
import com.ksyun.live.demo.player.activity.HistoryActivity;
import com.ksyun.live.demo.player.activity.MultiplePlayerActivity;
import com.ksyun.live.demo.player.activity.NetMediaActivty;
import com.ksyun.live.demo.player.activity.PlayRecordActivity;
import com.ksyun.live.demo.player.activity.PlayerActivity;
import com.ksyun.live.demo.player.activity.SettingActivity;
import com.ksyun.live.demo.player.activity.TextureVideoActivity;
import com.ksyun.live.demo.player.activity.TextureViewMediaActivity;
import com.ksyun.live.demo.player.activity.TextureVodActivity;
import com.ksyun.media.streamer.capture.CameraCapture;
import com.ksyun.media.streamer.demo.AudioStreamingActivity;
import com.ksyun.media.streamer.demo.BaseCameraActivity;
import com.ksyun.media.streamer.demo.DemoActivity;
import com.ksyun.media.streamer.demo.FloatCameraActivity;
import com.ksyun.media.streamer.demo.StdCameraActivity;
import com.ksyun.media.streamer.encoder.VideoEncodeFormat;
import com.ksyun.media.streamer.framework.AVConst;
import com.ksyun.media.streamer.kit.StreamerConstants;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        Intent intentP = null;
        switch (v.getId()) {
            case R.id.btn_stream:
                intentP = new Intent(MainActivity.this, DemoActivity.class);
                break;
            case R.id.btn_player:
                intentP = new Intent(MainActivity.this, PlayerActivity.class);
                break;
            case R.id.btn_jump:
                intentP = new Intent(MainActivity.this, NetMediaActivty.class);
                break;
            case R.id.btn_jump2:
                intentP = new Intent(MainActivity.this, TextureVodActivity.class);
                startActivity(intentP);
                break;
            case R.id.btn_jump3:
                intentP = new Intent(MainActivity.this, PlayRecordActivity.class);
                break;
            case R.id.btn_jump4:
                intentP = new Intent(MainActivity.this, TextureVideoActivity.class);
                break;
            case R.id.btn_jump5:
                intentP = new Intent(MainActivity.this, TextureViewMediaActivity.class);
                break;
            case R.id.btn_jump6:
                intentP = new Intent(MainActivity.this, FloatingVideoActivity.class);
                break;
            case R.id.btn_jump7:
                intentP = new Intent(MainActivity.this, FloatingPlayingActivity.class);
                break;
            case R.id.btn_jump8:
                intentP = new Intent(MainActivity.this, MultiplePlayerActivity.class);
                break;
            case R.id.btn_jump9:
                intentP = new Intent(MainActivity.this, PlayerActivity.class);
                break;
            case R.id.btn_jump10:
                intentP = new Intent(MainActivity.this, NetMediaActivty.class);
                break;
            case R.id.btn_jump11:
                intentP = new Intent(MainActivity.this, SettingActivity.class);
                break;
            case R.id.btn_jump12:
                intentP = new Intent(MainActivity.this, CaptureActivity.class);
                break;
            case R.id.btn_jump13:
                intentP = new Intent(MainActivity.this, HistoryActivity.class);
                break;
            case R.id.btn_jump14:
                intentP = new Intent(MainActivity.this, DemoActivity.class);
                break;
            case R.id.btn_jump15:
                intentP = new Intent(MainActivity.this, BaseCameraActivity.class);
                break;
            case R.id.btn_jump16:
                StdCameraActivity.StdStreamConfig config = new StdCameraActivity.StdStreamConfig();
                config.mCaptureResolution = StreamerConstants.VIDEO_RESOLUTION_360P;
                config.mPreviewResolution = StreamerConstants.VIDEO_RESOLUTION_720P;
                config.mPreviewViewType = StdCameraActivity.PREVIEW_TYPE_GLSURFACEVIEW;
                config.mBgSwitchMode = StdCameraActivity.BG_SWITCH_MODE_KEEP_LAST_FRAME;
                config.mVideoCodecId = AVConst.CODEC_ID_AVC;
                config.mVideoEncodeScene = VideoEncodeFormat.ENCODE_SCENE_SHOWSELF;
                config.mVideoEncodeProfile = VideoEncodeFormat.ENCODE_PROFILE_BALANCE;
                config.mAudioEncodeProfile = AVConst.PROFILE_AAC_HE;
                // zoom focus
                config.mZoomFocus = true;
                // stereo stream
                config.mStereoStream = true;
                // bluetooth mic
                config.mBluetoothMicFirst = true;
                config.mFrameRate = 15.0f;
                config.mVideoKBitrate = 800;
                config.mAudioKBitrate = 48;
                config.mUrl = "rtmp://192.168.0.32/live/test";
                config.mCameraFacing = CameraCapture.FACING_FRONT;
                config.mTargetResolution = StreamerConstants.VIDEO_RESOLUTION_360P;
                config.mOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
                config.mEncodeMethod = StreamerConstants.ENCODE_METHOD_HARDWARE;
                BaseCameraActivity.startActivity(MainActivity.this,config,StdCameraActivity.class);
//                intentP = new Intent(MainActivity.this, StdCameraActivity.class);
                return;
            case R.id.btn_jump17:
                intentP = new Intent(MainActivity.this, FloatCameraActivity.class);
                break;
            case R.id.btn_jump18:
                intentP = new Intent(MainActivity.this, FloatCameraActivity.class);
                break;
            case R.id.btn_jump19:
                intentP = new Intent(MainActivity.this, AudioStreamingActivity.class);
                break;
        }
        startActivity(intentP);
    }
}
