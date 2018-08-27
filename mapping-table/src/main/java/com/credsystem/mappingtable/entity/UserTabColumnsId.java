package com.credsystem.mappingtable.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

public class UserTabColumnsId implements Serializable{

	private static final long serialVersionUID = 3734799359917516652L;
	private String tableName;
	private String columnName;

	public UserTabColumnsId(String tableName, String columnName) {
		super();
		this.tableName = tableName;
		this.columnName = columnName;
	}
	
	public UserTabColumnsId() {
	}

	@Column(name="TABLE_NAME")
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Column(name="COLUMN_NAME")
	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((columnName == null) ? 0 : columnName.hashCode());
		result = prime * result + ((tableName == null) ? 0 : tableName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserTabColumnsId other = (UserTabColumnsId) obj;
		if (columnName == null) {
			if (other.columnName != null)
				return false;
		} else if (!columnName.equals(other.columnName))
			return false;
		if (tableName == null) {
			if (other.tableName != null)
				return false;
		} else if (!tableName.equals(other.tableName))
			return false;
		return true;
	}

}
