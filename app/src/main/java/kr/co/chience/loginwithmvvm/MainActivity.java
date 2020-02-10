package kr.co.chience.loginwithmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;
import kr.co.chience.loginwithmvvm.Interface.LoginResultCallbacks;
import kr.co.chience.loginwithmvvm.databinding.ActivityMainBinding;
import kr.co.chience.loginwithmvvm.viewmodel.LoginViewModel;
import kr.co.chience.loginwithmvvm.viewmodel.LoginViewModelFactory;

public class MainActivity extends AppCompatActivity implements LoginResultCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewmodel(ViewModelProviders.of(this, new LoginViewModelFactory(this))
                .get(LoginViewModel.class));


    }

    @Override
    public void onSuccess(String message) {
        Toasty.success(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String message) {
        Toasty.error(this, message, Toast.LENGTH_SHORT).show();
    }
}
