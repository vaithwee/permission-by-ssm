package xyz.vaith.permission.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
public class TestParam {
    @NotBlank
    private String msg;

    @NotNull
    private Integer id;
}
