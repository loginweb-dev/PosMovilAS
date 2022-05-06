package com.loginweb.posmovil.ui.cart;

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
import com.loginweb.posmovil.databinding.CartFragmentBinding;
import com.loginweb.posmovil.databinding.FragmentDashboardBinding;

public class CartFragment extends Fragment {

    private CartViewModel mViewModel;
    private CartFragmentBinding binding;
    private WebView miweb_cart;
    public static CartFragment newInstance() {
        return new CartFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = CartFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        miweb_cart = root.findViewById(R.id.miweb_cart);
        WebSettings webSettings = miweb_cart.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setGeolocationEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        miweb_cart.setWebViewClient(new WebViewClient());
        miweb_cart.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
                super.onGeolocationPermissionsShowPrompt(origin, callback);
                callback.invoke(origin, true, false);
            }
        });
        miweb_cart.loadUrl("https://pos.loginweb.dev/page/carrito");
        return root;
    }



}