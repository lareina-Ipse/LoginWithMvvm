package kr.co.chience.loginwithmvvm.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import kr.co.chience.loginwithmvvm.Interface.LoginResultCallbacks;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private LoginResultCallbacks loginResultCallbacks;

    public LoginViewModelFactory(LoginResultCallbacks loginResultCallbacks) {
        this.loginResultCallbacks = loginResultCallbacks;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(loginResultCallbacks);
    }
}
