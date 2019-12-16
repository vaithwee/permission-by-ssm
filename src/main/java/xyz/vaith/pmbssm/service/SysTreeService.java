package xyz.vaith.pmbssm.service;

import xyz.vaith.pmbssm.dto.DeptLevelDto;
import java.util.List;

public interface SysTreeService {
    List<DeptLevelDto> getDeptTree();
}
