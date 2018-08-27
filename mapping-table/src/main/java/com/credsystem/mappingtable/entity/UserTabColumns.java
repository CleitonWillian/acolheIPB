package com.credsystem.mappingtable.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="USER_TAB_COLUMNS")
@IdClass(UserTabColumnsId.class)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UserTabColumns implements Serializable {

	private static final long serialVersionUID = -2932677942559997969L;

	@Id
	private String tableName;
	
	@Id
	private String columnName;
	
	private String dataType;
	
	private String dataLength;
	
	private String nullable;

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

	@Column(name="DATA_TYPE")
	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	@Column(name="DATA_LENGTH")
	public String getDataLength() {
		return dataLength;
	}

	public void setDataLength(String dataLength) {
		this.dataLength = dataLength;
	}

	@Column(name="NULLABLE")
	public String getNullable() {
		return nullable;
	}

	public void setNullable(String nullable) {
		this.nullable = nullable;
	}
	
	
	
	
	
}
