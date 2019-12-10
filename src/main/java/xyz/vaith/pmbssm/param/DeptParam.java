package xyz.vaith.pmbssm.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class DeptParam {
    private Integer id;

    @NotBlank(message = "dept name is not allowed null")
    @Length(min = 2, max = 15, message = "dept name is limit 2 to 15")
    private String name;

    private Integer parentId = 0;

    @NotNull(message = "dept seq is not allowed null")
    private Integer seq;

    @Length(max = 150, message = "remark length is limit to 150")
    private String remark;

}
