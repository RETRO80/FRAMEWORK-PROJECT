/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1944.framework.servlet;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author itu
 */
@Target({ElementType.TYPE , ElementType.METHOD})
@Retention (RetentionPolicy.RUNTIME)
public @interface Url {
    String nom()default "";
}
