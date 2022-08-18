import java.util.Date;


public record Book(String title, int price, Date date, String user_name) {
    public Book(String title, int price, Date date, String user_name) {
        this.title = title;
        this.price = price;
        this.date = date;
        this.user_name = user_name;
    }

    public Book(Dto dto) {
        this(dto.getTitle()
                ,dto.getPrice()
                , dto.getDate()
                , dto.getUser_name()
        );
    }

//    @todo record value is final
    public void update(Dto dto){
        this.title = dto.getTitle();
        this.price = dto.getPrice();
        this.date = dto.getDate();
        this.user_name = dto.getUser_name();
    }
}
