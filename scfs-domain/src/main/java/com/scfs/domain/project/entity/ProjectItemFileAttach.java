package com.scfs.domain.project.entity;

import java.util.List;
import java.util.Map;

import com.scfs.common.consts.BusUrlConsts;
import com.scfs.common.consts.OperateConsts;
import com.scfs.domain.CodeValue;
import com.scfs.domain.base.entity.BaseEntity;
import com.google.common.collect.Maps;

public class ProjectItemFileAttach extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer busId;

	private Integer busType;
	private String busTypeName;
	private String name;

	private String type;

	private String path;

	private List<CodeValue> opertaList;

	public static class Operate {
		public static Map<String, String> operMap = Maps.newHashMap();
		static {
			operMap.put(OperateConsts.DOWNLOAD, BusUrlConsts.DOWNLOADFILEITEM);
			operMap.put(OperateConsts.DELETE, BusUrlConsts.DELETEFILEITEM);
		}

	}

	public List<CodeValue> getOpertaList() {
		return opertaList;
	}

	public void setOpertaList(List<CodeValue> opertaList) {
		this.opertaList = opertaList;
	}

	public String getBusTypeName() {
		return busTypeName;
	}

	public void setBusTypeName(String busTypeName) {
		this.busTypeName = busTypeName;
	}

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public Integer getBusType() {
		return busType;
	}

	public void setBusType(Integer busType) {
		this.busType = busType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}