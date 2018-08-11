package com.mydog.website.utils;

import com.mydog.entity.TUsers;
import com.mydog.website.constant.WebConst;
import org.apache.commons.lang3.StringUtils;
import org.commonmark.parser.Parser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TableUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(TableUtils.class);

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private static Parser parser = Parser.builder().build();

    public static boolean isEmail(String emailStr){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    public static int getCurrentTime(){
        return (int)(new Date().getTime()/1000);
    }

    public static String md5Encode(String source){
        if(StringUtils.isBlank(source))
            return null;
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] encodes = messageDigest.digest(source.getBytes());
        StringBuilder hexStr = new StringBuilder();
        for(byte eleEncode: encodes){
            String hex = Integer.toHexString(0xff & eleEncode);
            if(hex.length() == 1)
                hexStr.append("0");
            hexStr.append(hex);
        }
        return hexStr.toString();
    }

    public static TUsers getLoginUser(HttpServletRequest request){
        HttpSession session = request.getSession();
        if(session == null)
            return  null;
        return (TUsers) session.getAttribute(WebConst.LOGIN_SESSION_KEY);
    }

}
