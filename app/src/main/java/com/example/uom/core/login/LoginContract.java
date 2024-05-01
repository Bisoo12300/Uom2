package com.example.uom.core.login;

import com.example.uom.base.BaseListenerContract;
import com.example.uom.base.BasePresenterContract;
import com.example.uom.base.BaseViewContract;

public interface LoginContract {
    interface View extends BaseViewContract {
        void setEmailError(int error);

        void setPasswordError(int error);

        void onLoginSuccess(int message);

        void onLoginFailure(String message);
    }

    interface Presenter extends BasePresenterContract {
        void login(String username, String password);
    }

    interface Interactor {
        void performLogin( String email, String password);
    }

    interface Listener extends BaseListenerContract {
        void onSuccess(int message);
        void onFailure(String message);
    }
}
