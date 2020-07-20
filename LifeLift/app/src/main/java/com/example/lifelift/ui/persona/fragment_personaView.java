package com.example.lifelift.ui.persona;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class fragment_personaView extends ViewModel {
    private MutableLiveData<String> mText;

    public fragment_personaView() {
        mText = new MutableLiveData<>();
        mText.setValue("This is persona fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
