package structural.facade.debt;

public class PayInfoDto {
    private String userName;
    private String userCartNumber;
    private Long userCartMonth;
    private Long userCartYear;
    private Long userCartCvv;

    public PayInfoDto(String userName, String userCartNumber, Long userCartMonth, Long userCartYear, Long userCartCvv) {
        this.userName = userName;
        this.userCartNumber = userCartNumber;
        this.userCartMonth = userCartMonth;
        this.userCartYear = userCartYear;
        this.userCartCvv = userCartCvv;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserCartNumber() {
        return userCartNumber;
    }

    public Long getUserCartMonth() {
        return userCartMonth;
    }

    public Long getUserCartYear() {
        return userCartYear;
    }

    public Long getUserCartCvv() {
        return userCartCvv;
    }
}
