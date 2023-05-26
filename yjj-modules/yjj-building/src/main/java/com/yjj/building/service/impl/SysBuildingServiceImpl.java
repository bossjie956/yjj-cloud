package com.yjj.building.service.impl;

import java.util.List;
import com.yjj.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yjj.building.mapper.SysBuildingMapper;
import com.yjj.building.domain.SysBuilding;
import com.yjj.building.service.ISysBuildingService;

/**
 * 楼宇信息Service业务层处理
 * 
 * @author yjj
 * @date 2023-04-10
 */
@Service
public class SysBuildingServiceImpl implements ISysBuildingService 
{
    @Autowired
    private SysBuildingMapper sysBuildingMapper;

    /**
     * 查询楼宇信息
     * 
     * @param buildingId 楼宇信息主键
     * @return 楼宇信息
     */
    @Override
    public SysBuilding selectSysBuildingByBuildingId(Long buildingId)
    {
        return sysBuildingMapper.selectSysBuildingByBuildingId(buildingId);
    }

    /**
     * 查询楼宇信息列表
     * 
     * @param sysBuilding 楼宇信息
     * @return 楼宇信息
     */
    @Override
    public List<SysBuilding> selectSysBuildingList(SysBuilding sysBuilding)
    {
        return sysBuildingMapper.selectSysBuildingList(sysBuilding);
    }

    /**
     * 新增楼宇信息
     * 
     * @param sysBuilding 楼宇信息
     * @return 结果
     */
    @Override
    public int insertSysBuilding(SysBuilding sysBuilding)
    {
        sysBuilding.setCreateTime(DateUtils.getNowDate());
        return sysBuildingMapper.insertSysBuilding(sysBuilding);
    }

    /**
     * 修改楼宇信息
     * 
     * @param sysBuilding 楼宇信息
     * @return 结果
     */
    @Override
    public int updateSysBuilding(SysBuilding sysBuilding)
    {
        sysBuilding.setUpdateTime(DateUtils.getNowDate());
        return sysBuildingMapper.updateSysBuilding(sysBuilding);
    }

    /**
     * 批量删除楼宇信息
     * 
     * @param buildingIds 需要删除的楼宇信息主键
     * @return 结果
     */
    @Override
    public int deleteSysBuildingByBuildingIds(Long[] buildingIds)
    {
        return sysBuildingMapper.deleteSysBuildingByBuildingIds(buildingIds);
    }

    /**
     * 删除楼宇信息信息
     * 
     * @param buildingId 楼宇信息主键
     * @return 结果
     */
    @Override
    public int deleteSysBuildingByBuildingId(Long buildingId)
    {
        return sysBuildingMapper.deleteSysBuildingByBuildingId(buildingId);
    }
}
