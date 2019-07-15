package backend.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties
public class UserModel implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String namaDepan;
    private String namaBelakang;
    private String alamatUser;
    private String noHpUser;
    private String agamaUser;
    private String pendidikanUser;
    private String fotoUser;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        UserModel.serialVersionUID = serialVersionUID;
    }
        public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public String getAlamatUser() {
        return alamatUser;
    }

    public void setAlamatUser(String alamatUser) {
        this.alamatUser = alamatUser;
    }

    public String getNoHpUser() {
        return noHpUser;
    }

    public void setNoHpUser(String noHpUser) {
        this.noHpUser = noHpUser;
    }

    public String getAgamaUser() {
        return agamaUser;
    }

    public void setAgamaUser(String agamaUser) {
        this.agamaUser = agamaUser;
    }

    public String getPendidikanUser() {
        return pendidikanUser;
    }

    public void setPendidikanUser(String pendidikanUser) {
        this.pendidikanUser = pendidikanUser;
    }

    public String getFotoUser() {
        return fotoUser;
    }

    public void setFotoUser(String fotoUser) {
        this.fotoUser = fotoUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
