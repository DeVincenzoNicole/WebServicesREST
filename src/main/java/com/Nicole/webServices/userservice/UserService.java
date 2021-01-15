package com.Nicole.webServices.userservice;

import com.Nicole.webServices.ui.model.request.UserDetailsRequestModel;
import com.Nicole.webServices.ui.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
}
