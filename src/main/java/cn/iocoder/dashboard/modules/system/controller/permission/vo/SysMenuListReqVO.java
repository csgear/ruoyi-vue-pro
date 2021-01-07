package cn.iocoder.dashboard.modules.system.controller.permission.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("菜单列表 Request VO")
@Data
public class SysMenuListReqVO {

    @ApiModelProperty(value = "菜单名称", example = "芋道", notes = "模糊匹配")
    private String menuName;

    @ApiModelProperty(value = "展示状态", example = "1", notes = "参见 CommonStatusEnum 枚举类")
    private Integer status;

}
