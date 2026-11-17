package Mediatheque.app.src.main.java.edu_info0502_tp1;

/**
 * Media
 */
public class Media {
    protected String title;
    protected StringBuffer code;
    private int rate;
    private static String name;

            public Media(String title, StringBuffer code, int rate) {
        this.title = title;
        this.code = code;
        this.rate = rate;
    }


    public Media() {
        title = "media";
        code = new StringBuffer("0405");
        rate = 5;
    }

    public Media(Media m) {
        this.title = m.title;
        this.code = m.code;
        this.rate = m.rate;
    }


    public String getTitle() {
        return title;
    }

    public StringBuffer getCode() {
        return new StringBuffer(code);
    }

    public int getRate() {
        return rate;
    }

    public void setCode(StringBuffer code) {
        this.code = code;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Title: " + title + " Code: " + code + " rate: " + rate;
    }
}
