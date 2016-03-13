package com.fuzhepan;

import AmberMVC.BaseController;

/**
 * Created by FuzhePan on 2016/3/13.
 */
public class DefaultController extends BaseController {

    public String index(){
        return "Hello World!";
    }

    public String login(){
        return view("default/login.vm","name","FuzhePan");
    }
}
