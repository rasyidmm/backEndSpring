package backend.spring.model;

import backend.spring.constants.TableConstants;

import javax.persistence.*;
import java.io.Serializable;
@Entity
//@JsonIgnoreProperties
//@Table(name = TableConstants.TABLE_LOGIN_MODEL)
public class MasukModel implements Serializable {
    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = TableConstants.COLUMN_ID)
    private Long id;
    @Column(name = TableConstants.COLUMN_USERNAME_LOGIN)
    private String usernameLogin;
    @Column(name = TableConstants.COLUMN_PASSWORD_LOGIN)
    private String passwordLogin;
    @OneToOne
    private MemeberModel memeberModel;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        MasukModel.serialVersionUID = serialVersionUID;
    }



    public String getUsernameLogin() {
        return usernameLogin;
    }

    public void setUsernameLogin(String usernameLogin) {
        this.usernameLogin = usernameLogin;
    }

    public String getPasswordLogin() {
        return passwordLogin;
    }

    public void setPasswordLogin(String passwordLogin) {
        this.passwordLogin = passwordLogin;
    }


    public MemeberModel getMemeberModel() {
        return memeberModel;
    }

    public void setMemeberModel(MemeberModel memeberModel) {
        this.memeberModel = memeberModel;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
