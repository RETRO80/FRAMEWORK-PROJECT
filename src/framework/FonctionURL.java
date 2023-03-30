/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1944.framework;

import etu2010.framework.servlet.Url;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author itu
 */
public class FonctionURL {
    public  static Map<String,Mapping> fonction()
    {
       Map<String,Mapping> MappingUrls=new HashMap<>();
       List<Class<?>>li= AnnotationFunction.getModelClasses("test");
         System.out.println(li.size());
       for(int i =0;i<li.size();i++)
       {
         
           Method[] m=li.get(i).getMethods();
            for(int j=0;j<m.length;i++)
            {
                System.out.println("huhu");
               if(m[j].isAnnotationPresent(Url.class))
               {
                                  
                   Url u=m[j].getAnnotation(Url.class);
                   MappingUrls.put(u.nom(),new Mapping(li.get(i).getName(),m[j].getName()));
                    System.out.println("haha");
               }
            }
       }
        return MappingUrls;
    }

}
