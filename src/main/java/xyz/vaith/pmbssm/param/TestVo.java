package xyz.vaith.pmbssm.param;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class TestVo {
    @NotBlank
    private String msg;

    @NotNull(message = "id can't be null")
    @Max(value = 10, message = "id can't over 10")
    @Min(value = 0, message = "id must over or equal 0")
    private Integer id;

    private List<String> str;
}
