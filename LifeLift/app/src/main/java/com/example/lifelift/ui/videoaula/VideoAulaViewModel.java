package com.example.lifelift.ui.videoaula;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VideoAulaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public VideoAulaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}