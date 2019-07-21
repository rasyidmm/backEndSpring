package backend.spring.dao;

import backend.spring.model.MasukModel;

import java.util.List;

public interface MasukDao {
    public List<MasukModel> getAllMasuk();

    public MasukModel getMasukById(String id);

    public MasukModel SaveOrUpdateMasuk(MasukModel k);

    public void deleteMasuk(String id);

    public void deleteMasuk(MasukModel d);
}
