package com.ewha.lewis.kakao;

import com.ewha.lewis.kakao.tab1.Tab1ChildItem;

import java.util.ArrayList;

/**
 * Created by Lewis on 2015-05-26.
 */
public class MyUserData {
        private static MyUserData ourInstance=null;
    public static sycronized MyUserData getInstance() {
        if(ourInstance==null)
            ourInstance=new MyUserData();
        return ourInstance;
    }

    private MyUserData() {
    }

  public Tab1ChildItem myData=new Tab1ChildItem("https://fbcdn-profile-a.akamaihd.net/hprofile-ak-xfp1/v/t1.0-1/c0.0.160.160/p160x160/10273966_540814226028175_6480642910613879966_n.jpg?oh=bb474cbe3f2226b6995cb5ca04acde5f&oe=56093067&__gda__=1441933431_13007269727d813681b6f7a169998689","임현우","피곤하다");
    public  ArrayList<Tab1ChildItem> favolriteFriends=new ArrayList<>();
    public ArrayList<Tab1ChildItem> friends=new ArrayList<>();

    public  void initData(){
        MyUserData.getInstance().friends.clear();
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://fbcdn-profile-a.akamaihd.net/hprofile-ak-xap1/v/t1.0-1/p160x160/10376734_664961013580295_5805031175429098358_n.jpg?oh=03f94f914aa2fdd65d34896a4b56f359&oe=560002D4&__gda__=1439201233_e71729dd5f6fb83ecd9b2100fd526efb", "만종주커버그", "천재"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcT4sJXr5PwF9ExOsgm_3kLYq8Xnn5RuzkmwdgTM2mi91guINJNp", "설기현", "9번"));

        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSZnpl9RFnLojgZQLktKI_A1bhdCl6yitnxGK7V0vQMsVAWtcOtlA", "제라드", "은퇴"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTuRuEBfLtG2MO-WFmz5aDzIhpeXfbslliZ4dgBr3wrUpoHf7VmxQ", "램파드", "맨전드"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://static.news.zumst.com/images/1/2014/11/03/f4918a6b4440428caff61bb69b483ec7.jpg", "박주영", "따봉"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://www.fmkorea.com/files/attach/new/20141225/33854530/15323321/91498004/70b6c03d85b9477b9d7522401e7387e5.png", "정성룡", "퐈이야"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://static.news.zumst.com/images/1/2015/03/12/0d349693a5764f7c85ff198009cdf2c5.jpg", "이동국", "발리왕"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRwQ60aOM60qZlkRTsfos7iF-UUfDcAq0OFANwdPDfBin0E-jElGQ", "누구지", "모름"));

        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://img3.doosanmagazine.gscdn.com/thumb/300/2010/11/010000000000425_2.jpg", "박지성", "맨유입단"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://fbcdn-profile-a.akamaihd.net/hprofile-ak-xap1/v/t1.0-1/p160x160/10376734_664961013580295_5805031175429098358_n.jpg?oh=03f94f914aa2fdd65d34896a4b56f359&oe=560002D4&__gda__=1439201233_e71729dd5f6fb83ecd9b2100fd526efb", "만종주커버그", "천재"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcT4sJXr5PwF9ExOsgm_3kLYq8Xnn5RuzkmwdgTM2mi91guINJNp", "설기현", "9번"));

        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSZnpl9RFnLojgZQLktKI_A1bhdCl6yitnxGK7V0vQMsVAWtcOtlA", "제라드", "은퇴"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTuRuEBfLtG2MO-WFmz5aDzIhpeXfbslliZ4dgBr3wrUpoHf7VmxQ", "램파드", "맨전드"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://static.news.zumst.com/images/1/2014/11/03/f4918a6b4440428caff61bb69b483ec7.jpg", "박주영", "따봉"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://www.fmkorea.com/files/attach/new/20141225/33854530/15323321/91498004/70b6c03d85b9477b9d7522401e7387e5.png", "정성룡", "퐈이야"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://static.news.zumst.com/images/1/2015/03/12/0d349693a5764f7c85ff198009cdf2c5.jpg", "이동국", "발리왕"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRwQ60aOM60qZlkRTsfos7iF-UUfDcAq0OFANwdPDfBin0E-jElGQ", "누구지", "모름"));

        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://img3.doosanmagazine.gscdn.com/thumb/300/2010/11/010000000000425_2.jpg", "박지성", "맨유입단"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://fbcdn-profile-a.akamaihd.net/hprofile-ak-xap1/v/t1.0-1/p160x160/10376734_664961013580295_5805031175429098358_n.jpg?oh=03f94f914aa2fdd65d34896a4b56f359&oe=560002D4&__gda__=1439201233_e71729dd5f6fb83ecd9b2100fd526efb", "만종주커버그", "천재"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcT4sJXr5PwF9ExOsgm_3kLYq8Xnn5RuzkmwdgTM2mi91guINJNp", "설기현", "9번"));

        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSZnpl9RFnLojgZQLktKI_A1bhdCl6yitnxGK7V0vQMsVAWtcOtlA", "제라드", "은퇴"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTuRuEBfLtG2MO-WFmz5aDzIhpeXfbslliZ4dgBr3wrUpoHf7VmxQ", "램파드", "맨전드"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://static.news.zumst.com/images/1/2014/11/03/f4918a6b4440428caff61bb69b483ec7.jpg", "박주영", "따봉"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://www.fmkorea.com/files/attach/new/20141225/33854530/15323321/91498004/70b6c03d85b9477b9d7522401e7387e5.png", "정성룡", "퐈이야"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://static.news.zumst.com/images/1/2015/03/12/0d349693a5764f7c85ff198009cdf2c5.jpg", "이동국", "발리왕"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRwQ60aOM60qZlkRTsfos7iF-UUfDcAq0OFANwdPDfBin0E-jElGQ", "누구지", "모름"));

        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://img3.doosanmagazine.gscdn.com/thumb/300/2010/11/010000000000425_2.jpg", "박지성", "맨유입단"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://fbcdn-profile-a.akamaihd.net/hprofile-ak-xap1/v/t1.0-1/p160x160/10376734_664961013580295_5805031175429098358_n.jpg?oh=03f94f914aa2fdd65d34896a4b56f359&oe=560002D4&__gda__=1439201233_e71729dd5f6fb83ecd9b2100fd526efb", "만종주커버그", "천재"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcT4sJXr5PwF9ExOsgm_3kLYq8Xnn5RuzkmwdgTM2mi91guINJNp", "설기현", "9번"));

        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSZnpl9RFnLojgZQLktKI_A1bhdCl6yitnxGK7V0vQMsVAWtcOtlA", "제라드", "은퇴"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTuRuEBfLtG2MO-WFmz5aDzIhpeXfbslliZ4dgBr3wrUpoHf7VmxQ", "램파드", "맨전드"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://static.news.zumst.com/images/1/2014/11/03/f4918a6b4440428caff61bb69b483ec7.jpg", "박주영", "따봉"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://www.fmkorea.com/files/attach/new/20141225/33854530/15323321/91498004/70b6c03d85b9477b9d7522401e7387e5.png", "정성룡", "퐈이야"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://static.news.zumst.com/images/1/2015/03/12/0d349693a5764f7c85ff198009cdf2c5.jpg", "이동국", "발리왕"));
        MyUserData.getInstance().friends.add(new Tab1ChildItem("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRwQ60aOM60qZlkRTsfos7iF-UUfDcAq0OFANwdPDfBin0E-jElGQ", "누구지", "모름"));

        MyUserData.getInstance().friends.add(new Tab1ChildItem("http://img3.doosanmagazine.gscdn.com/thumb/300/2010/11/010000000000425_2.jpg", "박지성", "맨유입단"));
    }


}
