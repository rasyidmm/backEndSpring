package backend.spring.model;

import backend.spring.constants.TableConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@JsonIgnoreProperties
@Table(name = TableConstants.TABLE_USER_MODEL)
public class MemeberModel implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = TableConstants.COLUMN_ID)
    private String id;
    @Column(name = TableConstants.COLUMN_NAMA_DEPAN_USER)
    private String namaDepanUser;
    @Column(name = TableConstants.COLUMN_NAMA_BELAKANG_USER)
    private String namaBelakangUser;
    @Column(name = TableConstants.COLUMN_ALAMAT_USER)
    private String alamatUser;
    @Column(name = TableConstants.COLUMN_NOHP_USER)
    private String noHpUser;
    @Column(name = TableConstants.COLUMN_AGAMA_USER)
    private String agamaUser;
    @Column(name = TableConstants.COLUMN_PENDIDIKAN_USER)
    private String pendidikanUser;
    @Column(name = TableConstants.COLUMN_FOTO_UDER)
    private String fotoUser;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        MemeberModel.serialVersionUID = serialVersionUID;
    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaDepanUser() {
        return namaDepanUser;
    }

    public void setNamaDepanUser(String namaDepanUser) {
        this.namaDepanUser = namaDepanUser;
    }

    public String getNamaBelakangUser() {
        return namaBelakangUser;
    }

    public void setNamaBelakangUser(String namaBelakangUser) {
        this.namaBelakangUser = namaBelakangUser;
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
}
