package cn.iocoder.dashboard.modules.system.controller.permission.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 菜单 Base VO，提供给添加、修改、详细的子 VO 使用
 * 如果子 VO 存在差异的字段，请不要添加到这里，影响 Swagger 文档生成
 */
@Data
public class SysMenuBaseVO {

    @ApiModelProperty(value = "菜单名称", required = true, example = "芋道")
    @NotBlank(message = "菜单名称不能为空")
    @Size(max = 50, message = "菜单名称长度不能超过50个字符")
    private String menuName;

    @ApiModelProperty(value = "权限标识", example = "sys:menu:add", notes = "仅菜单类型为按钮时，才需要传递")
    @Size(max = 100)
    private String permission;

    @ApiModelProperty(value = "类型", required = true, example = "1", notes = "参见 MenuTypeEnum 枚举类")
    @NotBlank(message = "菜单类型不能为空")
    private Integer menuType;

    @ApiModelProperty(value = "显示顺序不能为空", required = true, example = "1024")
    @NotBlank(message = "显示顺序不能为空")
    private String sort;

    @ApiModelProperty(value = "父菜单 ID", required = true, example = "1024")
    @NotNull(message = "父菜单 ID 不能为空")
    private Long parentId;

    @ApiModelProperty(value = "路由地址", example = "post", notes = "仅菜单类型为菜单或者目录时，才需要传")
    @Size(max = 200, message = "路由地址不能超过200个字符")
    private String path;

    @ApiModelProperty(value = "菜单图标", example = "/menu/list", notes = "仅菜单类型为菜单或者目录时，才需要传")
    private String icon;

    /**
     * 组件路径
     */
    @ApiModelProperty(value = "组件路径", example = "system/post/index", notes = "仅菜单类型为菜单时，才需要传")
    @Size(max = 200, message = "组件路径不能超过255个字符")
    private String component;

}
