package com.yjj.building.service;

import java.util.List;
import com.yjj.building.domain.SysBuilding;

/**
 * 楼宇信息Service接口
 * 
 * @author yjj
 * @date 2023-04-10
 */
public interface ISysBuildingService 
{
    /**
     * 查询楼宇信息
     * 
     * @param buildingId 楼宇信息主键
     * @return 楼宇信息
     */
    public SysBuilding selectSysBuildingByBuildingId(Long buildingId);

    /**
     * 查询楼宇信息列表
     * 
     * @param sysBuilding 楼宇信息
     * @return 楼宇信息集合
     */
    public List<SysBuilding> selectSysBuildingList(SysBuilding sysBuilding);

    /**
     * 新增楼宇信息
     * 
     * @param sysBuilding 楼宇信息
     * @return 结果
     */
    public int insertSysBuilding(SysBuilding sysBuilding);

    /**
     * 修改楼宇信息
     * 
     * @param sysBuilding 楼宇信息
     * @return 结果
     */
    public int updateSysBuilding(SysBuilding sysBuilding);

    /**
     * 批量删除楼宇信息
     * 
     * @param buildingIds 需要删除的楼宇信息主键集合
     * @return 结果
     */
    public int deleteSysBuildingByBuildingIds(Long[] buildingIds);

    /**
     * 删除楼宇信息信息
     * 
     * @param buildingId 楼宇信息主键
     * @return 结果
     */
    public int deleteSysBuildingByBuildingId(Long buildingId);
}
