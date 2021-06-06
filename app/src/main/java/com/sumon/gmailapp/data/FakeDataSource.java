package com.sumon.gmailapp.data;

import com.sumon.gmailapp.R;
import com.sumon.gmailapp.mail.MailCategoryItem;
import com.sumon.gmailapp.mail.MailItem;
import com.sumon.gmailapp.mail.MailSimpleItem;

import java.util.ArrayList;
import java.util.List;

public class FakeDataSource {


    // Dummy Titles

    public static final String TITLE_1 ="Google Developer Profile";
    public static final String TITLE_2 ="Delowar Rahman";
    public static final String TITLE_3 ="Hasan Ali";
    public static final String TITLE_4 ="Sabbir Hossain";
    public static final String TITLE_5 ="Space News Latest Update";
    public static final String TITLE_6 ="Ayesha";
    public static final String TITLE_7 ="Android Blog Daily Post";
    public static final String TITLE_8 ="Google Team";

    // Dummy User Images

    public static final int IMG_1 = R.drawable.pnggoogle;
    public static final int IMG_2 = R.drawable.adobe ;
    public static final int IMG_3 = R.drawable.user4;
    public static final int IMG_4 = R.drawable.user;
    public static final int IMG_5 = R.drawable.user2;
    public static final int IMG_6 = R.drawable.girl0;
    public static final int IMG_7 = R.drawable.androidstudio;


    // Dummy Mail Content
    public static final String Content_1 = "Hi Sumon, Collect your I/O ";

    // Dummy Description
    public static final String DESC_1 = "Collect your I/O attendee Google Developer Profile badge";
    public static final String DESC_2 = "Adobe Creative Cloud Updates";
    public static final String DESC_3 = "Lorem ipsum dolor sit amet";
    public static final String DESC_4 = "Lorem ipsum dolor sit amet";
    public static final String DESC_5 = "Lorem ipsum dolor sit amet";
    public static final String DESC_6 = "Lorem ipsum dolor sit amet";
    public static final String DESC_7 = "Lorem ipsum dolor sit amet";






    public static List<MailItem> getListMail(){

        List<MailItem> data = new ArrayList<>();

        data.add(new MailItem(new MailCategoryItem(
                R.drawable.ic_outline_info_24,
                "Updates",
                "Google, GOG.COM, Uplabs And 19 more...\nCheck Important Recent update",
                "",
                "YELLOW",
                12
        )));

        data.add(new MailItem(new MailCategoryItem(
                R.drawable.ic_outline_local_offer_24,
                "PROMOTION",
                DESC_1,
                "GREEN",
                "GREEN",
                122
        )));

        data.add(new MailItem(new MailCategoryItem(
                R.drawable.ic_outline_forum_24,
                TITLE_1,
                DESC_1,
                "PURPLE",
                "PURPLE",
                5
        )));




        data.add(new MailItem(new MailSimpleItem(
                1,
                TITLE_1,
                DESC_1,
                IMG_1,
                Content_1,
                true
        )));

        data.add(new MailItem(new MailSimpleItem(
                2,
                TITLE_2,
                DESC_2,
                R.drawable.usernoimg01,
                Content_1
        )));

        data.add(new MailItem(new MailSimpleItem(
                3,
                TITLE_3,
                DESC_1,
                R.drawable.usernoimg0,
                Content_1,
                true,
                true
        )));
        data.add(new MailItem(new MailSimpleItem(
                4,
                TITLE_4,
                DESC_1,
                IMG_4,
                Content_1
        )));
        data.add(new MailItem(new MailSimpleItem(
                5,
                TITLE_5,
                DESC_1,
                IMG_5,
                Content_1

        )));
        data.add(new MailItem(new MailSimpleItem(
                6,
                TITLE_6,
                DESC_1,
                IMG_6,
                Content_1
        )));
        data.add(new MailItem(new MailSimpleItem(
                7,
                TITLE_7,
                DESC_1,
                IMG_7,
                Content_1,
                true
        )));
        data.add(new MailItem(new MailSimpleItem(
                8,
                TITLE_6,
                DESC_1,
                IMG_6,
                Content_1,
                true
        )));
        data.add(new MailItem(new MailSimpleItem(
                9,
                TITLE_2,
                DESC_1,
                R.drawable.usernoimg01,
                Content_1
        )));
        data.add(new MailItem(new MailSimpleItem(
                10,
                TITLE_6,
                DESC_1,
                IMG_6,
                Content_1
        )));
        data.add(new MailItem(new MailSimpleItem(
                11,
                TITLE_1,
                DESC_1,
                IMG_1,
                Content_1
        )));
        data.add(new MailItem(new MailSimpleItem(
                12,
                TITLE_3,
                DESC_1,
                R.drawable.usernoimg0,
                Content_1,
                true
        )));
        data.add(new MailItem(new MailSimpleItem(
                13,
                TITLE_5,
                DESC_1,
                IMG_5,
                Content_1
        )));



        return data;
    }


}
