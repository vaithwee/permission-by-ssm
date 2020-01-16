package xyz.vaith.pmbssm.dto;

import lombok.*;
import org.springframework.beans.BeanUtils;
import xyz.vaith.pmbssm.model.SysDept;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeptLevelDto extends SysDept {
    private List<DeptLevelDto> deptList = new ArrayList<>();

    public static DeptLevelDto adapt(SysDept dept) {
        DeptLevelDto dto = new DeptLevelDto();
        BeanUtils.copyProperties(dept, dto);
        return dto;
    }
}
