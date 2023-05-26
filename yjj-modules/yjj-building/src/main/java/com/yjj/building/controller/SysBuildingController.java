package com.yjj.building.controller;

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
import com.yjj.building.domain.SysBuilding;
import com.yjj.building.service.ISysBuildingService;
import com.yjj.common.core.web.controller.BaseController;
import com.yjj.common.core.web.domain.AjaxResult;
import com.yjj.common.core.utils.poi.ExcelUtil;
import com.yjj.common.core.web.page.TableDataInfo;

/**
 * 楼宇信息Controller
 * 
 * @author yjj
 * @date 2023-04-10
 */
@RestController
@RequestMapping("/building")
public class SysBuildingController extends BaseController
{
    @Autowired
    private ISysBuildingService sysBuildingService;

    /**
     * 查询楼宇信息列表
     */
    @RequiresPermissions("building:building:list")
    @GetMapping("/list")
    public TableDataInfo list(SysBuilding sysBuilding)
    {
        startPage();
        List<SysBuilding> list = sysBuildingService.selectSysBuildingList(sysBuilding);
        return getDataTable(list);
    }

    /**
     * 导出楼宇信息列表
     */
    @RequiresPermissions("building:building:export")
    @Log(title = "楼宇信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysBuilding sysBuilding)
    {
        List<SysBuilding> list = sysBuildingService.selectSysBuildingList(sysBuilding);
        ExcelUtil<SysBuilding> util = new ExcelUtil<SysBuilding>(SysBuilding.class);
        util.exportExcel(response, list, "楼宇信息数据");
    }

    /**
     * 获取楼宇信息详细信息
     */
    @RequiresPermissions("building:building:query")
    @GetMapping(value = "/{buildingId}")
    public AjaxResult getInfo(@PathVariable("buildingId") Long buildingId)
    {
        return success(sysBuildingService.selectSysBuildingByBuildingId(buildingId));
    }

    /**
     * 新增楼宇信息
     */
    @RequiresPermissions("building:building:add")
    @Log(title = "楼宇信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysBuilding sysBuilding)
    {
        return toAjax(sysBuildingService.insertSysBuilding(sysBuilding));
    }

    /**
     * 修改楼宇信息
     */
    @RequiresPermissions("building:building:edit")
    @Log(title = "楼宇信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysBuilding sysBuilding)
    {
        return toAjax(sysBuildingService.updateSysBuilding(sysBuilding));
    }

    /**
     * 删除楼宇信息
     */
    @RequiresPermissions("building:building:remove")
    @Log(title = "楼宇信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{buildingIds}")
    public AjaxResult remove(@PathVariable Long[] buildingIds)
    {
        return toAjax(sysBuildingService.deleteSysBuildingByBuildingIds(buildingIds));
    }
}
