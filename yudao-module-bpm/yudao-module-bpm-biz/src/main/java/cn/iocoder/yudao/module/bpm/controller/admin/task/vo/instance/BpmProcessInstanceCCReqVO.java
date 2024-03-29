package cn.iocoder.yudao.module.bpm.controller.admin.task.vo.instance;

import cn.iocoder.yudao.module.bpm.controller.admin.candidate.vo.BpmTaskCandidateRuleVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

// TODO @kyle：这个 VO 可以改成 BpmProcessInstanceCopyCreateReqVO
@Schema(description = "管理后台 - 流程实例的抄送 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BpmProcessInstanceCCReqVO extends BpmTaskCandidateRuleVO {

    @Schema(description = "任务编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    @NotEmpty(message = "任务编号不能为空")
    private String taskKey;

    @Schema(description = "任务名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    @NotEmpty(message = "任务名称不能为空")
    private String taskName;

    @Schema(description = "流程实例的编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    @NotEmpty(message = "流程实例的编号不能为空")
    private String processInstanceKey;

    @Schema(description = "发起流程的用户的编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    @NotNull(message = "发起流程的用户的编号不能为空")
    private Long startUserId;

    @Schema(description = "任务实例名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    @NotEmpty(message = "任务实例名称不能为空")
    private String processInstanceName;

    @Schema(description = "抄送原因", requiredMode = Schema.RequiredMode.REQUIRED, example = "请帮忙审查下！")
    @NotBlank(message = "抄送原因不能为空")
    private String reason;

    // TODO @kyle：看了下字段有点多，尽量不传递可推导的字段；
    // 需要传递：taskId（任务编号）、reason、userIds（被抄送的人）
    // 不需要传递：taskKey、taskName、processInstanceKey、startUserId、processInstanceName 因为这些可以后端查询到

}
