package com.loginweb.posmovil.ui.dashboard;

import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.loginweb.posmovil.Posts;
import com.loginweb.posmovil.PostsApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DashboardViewModel extends ViewModel {

//    private final MutableLiveData<String> mText;
//    TextView milist;
//    public DashboardViewModel() {
//        mText = new MutableLiveData<>();
//        mText.setValue("This is dashboard fragment");
//    }
//
//    public LiveData<String> getText() {
//        return mText;
//    }
}