package chapter01适应设计模式.adapter加入适配器以便服用.another;

import chapter01适应设计模式.adapter加入适配器以便服用.Banner;

public class PrintBanner extends print {
    private Banner banner;

    @Override
    public void printWeak() {
        banner.showWithAster();

    }

    @Override
    public void printStrong() {
        banner.showWithParen();
    }
}
