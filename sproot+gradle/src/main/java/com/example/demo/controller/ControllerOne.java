package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class ControllerOne {
    @GetMapping
    public String One(){
        return get();
    }

        public static String get() {
            URL u;
            HttpURLConnection httpURLConnection;
            String ret = "";
            PrintWriter pw = null;
            try {
                u = new URL("http://bestcbooks.com/");
                httpURLConnection = (HttpURLConnection) u.openConnection();
                if (httpURLConnection.getResponseCode() == 200) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
                    String read;
                    while ((read = bufferedReader.readLine()) != null) {
                        ret += read;
                        ret += "\r\n";

                    }
                }
            } catch (Exception e) {

            }
            return ret;
        }

}
