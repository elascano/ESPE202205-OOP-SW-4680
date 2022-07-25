package edu.ec.espe.model;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Customer {
    private String UserName;
    private int UserId;
    private String UserEmail;
    private int UserPhone;
    private int UserAge;
    private int UserPassword;

    public Customer(String UserName, int UserId, String UserEmail, int UserPhone, int UserAge, int UserPassword) {
        this.UserName = UserName;
        this.UserId = UserId;
        this.UserEmail = UserEmail;
        this.UserPhone = UserPhone;
        this.UserAge = UserAge;
        this.UserPassword = UserPassword;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the UserId
     */
    public int getUserId() {
        return UserId;
    }

    /**
     * @param UserId the UserId to set
     */
    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    /**
     * @return the UserEmail
     */
    public String getUserEmail() {
        return UserEmail;
    }

    /**
     * @param UserEmail the UserEmail to set
     */
    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }

    /**
     * @return the UserPhone
     */
    public int getUserPhone() {
        return UserPhone;
    }

    /**
     * @param UserPhone the UserPhone to set
     */
    public void setUserPhone(int UserPhone) {
        this.UserPhone = UserPhone;
    }

    /**
     * @return the UserAge
     */
    public int getUserAge() {
        return UserAge;
    }

    /**
     * @param UserAge the UserAge to set
     */
    public void setUserAge(int UserAge) {
        this.UserAge = UserAge;
    }

    /**
     * @return the UserPassword
     */
    public int getUserPassword() {
        return UserPassword;
    }

    /**
     * @param UserPassword the UserPassword to set
     */
    public void setUserPassword(int UserPassword) {
        this.UserPassword = UserPassword;
    }
}
