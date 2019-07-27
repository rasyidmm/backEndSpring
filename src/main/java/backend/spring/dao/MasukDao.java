package backend.spring.dao;

import backend.spring.dto.RegisterUserDTO;
import backend.spring.model.MasukModel;
import backend.spring.model.MemeberModel;

import java.util.List;

public interface MasukDao {
    public List<MasukModel> getAllMasuk();

    public MasukModel getMasukById(Long id);

    public MasukModel SaveOrUpdateMasuk(MasukModel k);

    public void deleteMasuk(Long id);

    public void deleteMasuk(MasukModel d);
}
