package storeitems;

public class ExpirationDate {
    private Integer month;
    private Integer day;

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }
    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    private Integer year;

    @Override
    public String toString() {
        return "ExpirationDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}
