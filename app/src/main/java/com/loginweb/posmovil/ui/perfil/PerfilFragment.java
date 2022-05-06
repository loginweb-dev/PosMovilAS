package com.loginweb.posmovil.ui.perfil;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.loginweb.posmovil.R;
import com.loginweb.posmovil.databinding.PerfilFragmentBinding;

public class PerfilFragment extends Fragment {

    private PerfilViewModel mViewModel;
    private WebView miweb_perfil;
    private PerfilFragmentBinding binding;
    public static PerfilFragment newInstance() {
        return new PerfilFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = PerfilFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        miweb_perfil = root.findViewById(R.id.miweb_perfil);

        WebSettings webSettings = miweb_perfil.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setGeolocationEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        miweb_perfil.setWebViewClient(new WebViewClient());
        miweb_perfil.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
                super.onGeolocationPermissionsShowPrompt(origin, callback);
                callback.invoke(origin, true, false);
            }
        });
        miweb_perfil.loadUrl("https://pos.loginweb.dev/page/consultas");
        return root;
    }


}