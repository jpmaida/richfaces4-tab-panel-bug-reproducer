package com.redhat.reproducer.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "fooMB")
@RequestScoped
public class Foo {
    public String foo(){
        System.out.println("I was here !!!!");
        return "foo";
    }
}
