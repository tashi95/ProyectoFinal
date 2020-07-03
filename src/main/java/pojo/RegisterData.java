package pojo;

public class RegisterData
{
    private String firstname;
    private String lastname;
    private String telephone;
    private String password;
    private String confirmpass;

    public RegisterData(String _firstname, String _lastname,String _telephone, String _password, String _confirmpass)
    {
        this.firstname=_firstname;
        this.lastname=_lastname;
        this.telephone=_telephone;
        this.password=_password;
        this.confirmpass=_confirmpass;
    }

    public String getFirstname() { return firstname; }

    public String getLastname() { return lastname; }

    public String getTelephone() { return telephone; }

    public String getPassword() { return password; }

    public String getConfirmpass() { return confirmpass; }
}
