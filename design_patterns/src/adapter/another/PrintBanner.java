package adapter.another;

import adapter.Banner;

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
