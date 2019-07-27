package backend.spring.dao;

import backend.spring.model.MemeberModel;

import java.util.List;

public interface MemberDao {
    public List<MemeberModel> getAllMember();

    public MemeberModel getMemberById(Long id);

    public void SaveOrUpdateMember(MemeberModel k);

    public void deleteMember(Long id);

    public void deleteMember(MemeberModel d);
}
