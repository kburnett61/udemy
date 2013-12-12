package com.seleniumsimplified.webdriver;

import java.io.FileOutputStream;
import java.util.*;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.*;
import java.io.BufferedReader.*;

/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 12/12/13
 * Time: 10:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class RearrangeWordsFromSentence {

String myString = "one two three";

    void reorganizeString(String myString){

        String s = myString;
        int words = 1;

        for (int i=0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ')
                words ++;
        }

        int arr[] = new int[words];

        for (int i=1; i <= words; i++)
        {
            for (int j=0; j < s.length(); j++)
            {
                arr[i] += 1;
            }
        }

        //String reOrgString = ;

        //return(reOrgString);
    }

}
