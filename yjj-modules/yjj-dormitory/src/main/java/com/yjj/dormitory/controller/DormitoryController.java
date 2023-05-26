package com.yjj.dormitory.controller;

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
import com.yjj.dormitory.domain.Dormitory;
import com.yjj.dormitory.service.IDormitoryService;
import com.yjj.common.core.web.controller.BaseController;
import com.yjj.common.core.web.domain.AjaxResult;
import com.yjj.common.core.utils.poi.ExcelUtil;
import com.yjj.common.core.web.page.TableDataInfo;

/**
 * 宿舍信息Controller
 * 
 * @author yjj
 * @date 2023-04-10
 */
@RestController
@RequestMapping("/dormitory")
public class DormitoryController extends BaseController
{
    @Autowired
    private IDormitoryService dormitoryService;

    /**
     * 查询宿舍信息列表
     */
    @RequiresPermissions("dormitory:dormitory:list")
    @GetMapping("/list")
    public TableDataInfo list(Dormitory dormitory)
    {
        startPage();
        List<Dormitory> list = dormitoryService.selectDormitoryList(dormitory);
        return getDataTable(list);
    }

    /**
     * 导出宿舍信息列表
     */
    @RequiresPermissions("dormitory:dormitory:export")
    @Log(title = "宿舍信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Dormitory dormitory)
    {
        List<Dormitory> list = dormitoryService.selectDormitoryList(dormitory);
        ExcelUtil<Dormitory> util = new ExcelUtil<Dormitory>(Dormitory.class);
        util.exportExcel(response, list, "宿舍信息数据");
    }

    /**
     * 获取宿舍信息详细信息
     */
    @RequiresPermissions("dormitory:dormitory:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(dormitoryService.selectDormitoryById(id));
    }

    /**
     * 新增宿舍信息
     */
    @RequiresPermissions("dormitory:dormitory:add")
    @Log(title = "宿舍信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Dormitory dormitory)
    {
        return toAjax(dormitoryService.insertDormitory(dormitory));
    }

    /**
     * 修改宿舍信息
     */
    @RequiresPermissions("dormitory:dormitory:edit")
    @Log(title = "宿舍信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Dormitory dormitory)
    {
        return toAjax(dormitoryService.updateDormitory(dormitory));
    }

    /**
     * 删除宿舍信息
     */
    @RequiresPermissions("dormitory:dormitory:remove")
    @Log(title = "宿舍信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dormitoryService.deleteDormitoryByIds(ids));
    }
}
