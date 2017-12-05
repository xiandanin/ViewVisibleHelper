package com.dyhdyh.helper.viewvisible.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author dengyuhan
 * @created 2017/12/4 18:13
 */
public class ExampleData {
    private String title;
    private String image;
    private String fileUrl;
    private int displayHeight;

    private static final String[] TITLE_DATA = new String[]{
            "很荣幸获得年度影响力人物的荣誉！很开心的夜晚，感谢腾讯视频 #星光大赏#让我们新老朋友相聚！",
            "晨空,上方,荷兰人,农场,风车,山羊晨空,上方,荷兰人,农场,风车,山羊晨空,上方,荷兰人,农场,风车,山羊晨空,上方,荷兰人,农场,风车,山羊",
            "9个世界上美得不真实的风景，你最想去哪一个？",
            "2017年很快就会过去，而我却恋恋不舍，因为我还有好多事没有去做，许多风景都还没有去看。抓住岁月的尾巴，活出精彩的自己。一切都是浮云。 ",

    };

    private static final String[] IMAGE_DATA = new String[]{
            "http://mpic.tiankong.com/5d3/0e9/5d30e9334a1f75e9bcc6fb1819eb3bb2/640.jpg",
            "http://mpic.tiankong.com/08c/06d/08c06d4f67314d6a70d3af508189499d/640.jpg",
            "http://mpic.tiankong.com/0e3/f59/0e3f59d37b6d22c6aa17ac88cf2227b9/640.jpg",
            "http://mpic.tiankong.com/23e/ea7/23eea7184ef0d4292f7311a85dd643b8/640.jpg"
    };

    public static List<ExampleData> randomData(int count, String videoPath) {
        List<ExampleData> data = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int index = random.nextInt(TITLE_DATA.length);
            ExampleData model = new ExampleData();
            model.setTitle(TITLE_DATA[index]);
            model.setImage(IMAGE_DATA[index]);
            model.setFileUrl(videoPath);
            int height = random.nextInt(400) + 400;
            //int height = 500;
            model.setDisplayHeight(height);
            data.add(model);
        }
        return data;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public int getDisplayHeight() {
        return displayHeight;
    }

    public void setDisplayHeight(int displayHeight) {
        this.displayHeight = displayHeight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
