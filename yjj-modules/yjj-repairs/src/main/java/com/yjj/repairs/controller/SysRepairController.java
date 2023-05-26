package com.yjj.repairs.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yjj.common.log.annotation.Log;
import com.yjj.common.log.enums.BusinessType;
import com.yjj.common.security.annotation.RequiresPermissions;
import com.yjj.repairs.domain.SysRepair;
import com.yjj.repairs.service.ISysRepairService;
import com.yjj.common.core.web.controller.BaseController;
import com.yjj.common.core.web.domain.AjaxResult;
import com.yjj.common.core.utils.poi.ExcelUtil;
import com.yjj.common.core.web.page.TableDataInfo;

/**
 * 报修信息Controller
 * 
 * @author yjj
 * @date 2023-04-10
 */
@RestController
@RequestMapping("/repair")
public class SysRepairController extends BaseController
{
    @Autowired
    private ISysRepairService sysRepairService;

    /**
     * 查询报修信息列表
     */
    @RequiresPermissions("repairs:repair:list")
    @GetMapping("/list")
    public TableDataInfo list(SysRepair sysRepair)
    {
        startPage();
        List<SysRepair> list = sysRepairService.selectSysRepairList(sysRepair);
        return getDataTable(list);
    }

    /**
     * 导出报修信息列表
     */
    @RequiresPermissions("repairs:repair:export")
    @Log(title = "报修信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysRepair sysRepair)
    {
        List<SysRepair> list = sysRepairService.selectSysRepairList(sysRepair);
        ExcelUtil<SysRepair> util = new ExcelUtil<SysRepair>(SysRepair.class);
        util.exportExcel(response, list, "报修信息数据");
    }

    /**
     * 获取报修信息详细信息
     */
    @RequiresPermissions("repairs:repair:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysRepairService.selectSysRepairById(id));
    }

    /**
     * 新增报修信息
     */
    @RequiresPermissions("repairs:repair:add")
    @Log(title = "报修信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysRepair sysRepair)
    {
        return toAjax(sysRepairService.insertSysRepair(sysRepair));
    }

    /**
     * 修改报修信息
     */
    @RequiresPermissions("repairs:repair:edit")
    @Log(title = "报修信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysRepair sysRepair)
    {
        return toAjax(sysRepairService.updateSysRepair(sysRepair));
    }

    /**
     * 删除报修信息
     */
    @RequiresPermissions("repairs:repair:remove")
    @Log(title = "报修信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysRepairService.deleteSysRepairByIds(ids));
    }
}
