package com.example.lifelift.ui.acompanhamento;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AcompanhamentoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AcompanhamentoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}