package com.lenovo.opengles;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;

public class MyGLRenderer implements GLSurfaceView.Renderer {
    private static final String TAG = "MyGLRenderer";

    public void onSurfaceCreated(GL10 unused, EGLConfig config) {
        Log.d(TAG, "onSurfaceCreated: unused = " + unused +"+ config = " + config);

    }

    public void onDrawFrame(GL10 unused) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
    }

    public void onSurfaceChanged(GL10 unused, int width, int height) {
        Log.d(TAG, "onSurfaceChanged: width = " + width + " height = " + height);
        GLES20.glViewport(0, 0, width, height);
    }
}
