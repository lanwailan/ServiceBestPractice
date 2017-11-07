package com.example.servicebestpractice;

/**
 * Created by lanwailan on 2017/10/31.
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();

}
