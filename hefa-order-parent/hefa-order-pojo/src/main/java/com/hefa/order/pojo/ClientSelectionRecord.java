package com.hefa.order.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientSelectionRecord implements Serializable {
    /**
     * 主键id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 选型记录编码
     *
     * @mbg.generated
     */
    private String selectionRecordCode;

    /**
     * 客户编码
     *
     * @mbg.generated
     */
    private String userCode;

    /**
     * 产品编码对应iwebshop_goods的id
     *
     * @mbg.generated
     */
    private String productCode;

    /**
     * 产品型号对应iwebshop_goods的goods_no
     *
     * @mbg.generated
     */
    private String productModelNo;

    /**
     * 产品型号对应iwebshop_goods的name
     *
     * @mbg.generated
     */
    private String productName;

    /**
     * 参考价格
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * 产品规格（逗号隔开）
     *
     * @mbg.generated
     */
    private String specificationInfo;
    
    private Byte status;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String creator;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 修改人
     *
     * @mbg.generated
     */
    private String modifier;

    /**
     * 最后修改时间
     *
     * @mbg.generated
     */
    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    /**
     * 主键id<br/>
     * 返回值对应的表列名 client_selection_record.id
     *
     * @return 返回值对应 client_selection_record.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键id<br/>
     * client_selection_record.id
     *
     * @param id 值对应 client_selection_record.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 选型记录编码<br/>
     * 返回值对应的表列名 client_selection_record.selection_record_code
     *
     * @return 返回值对应 client_selection_record.selection_record_code
     *
     * @mbg.generated
     */
    public String getSelectionRecordCode() {
        return selectionRecordCode;
    }

    /**
     * 选型记录编码<br/>
     * client_selection_record.selection_record_code
     *
     * @param selectionRecordCode 值对应 client_selection_record.selection_record_code
     *
     * @mbg.generated
     */
    public void setSelectionRecordCode(String selectionRecordCode) {
        this.selectionRecordCode = selectionRecordCode == null ? null : selectionRecordCode.trim();
    }

    /**
     * 客户编码<br/>
     * 返回值对应的表列名 client_selection_record.user_code
     *
     * @return 返回值对应 client_selection_record.user_code
     *
     * @mbg.generated
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 客户编码<br/>
     * client_selection_record.user_code
     *
     * @param userCode 值对应 client_selection_record.user_code
     *
     * @mbg.generated
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * 产品编码对应iwebshop_goods的id<br/>
     * 返回值对应的表列名 client_selection_record.product_code
     *
     * @return 返回值对应 client_selection_record.product_code
     *
     * @mbg.generated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * 产品编码对应iwebshop_goods的id<br/>
     * client_selection_record.product_code
     *
     * @param productCode 值对应 client_selection_record.product_code
     *
     * @mbg.generated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * 产品型号对应iwebshop_goods的goods_no<br/>
     * 返回值对应的表列名 client_selection_record.product_model_no
     *
     * @return 返回值对应 client_selection_record.product_model_no
     *
     * @mbg.generated
     */
    public String getProductModelNo() {
        return productModelNo;
    }

    /**
     * 产品型号对应iwebshop_goods的goods_no<br/>
     * client_selection_record.product_model_no
     *
     * @param productModelNo 值对应 client_selection_record.product_model_no
     *
     * @mbg.generated
     */
    public void setProductModelNo(String productModelNo) {
        this.productModelNo = productModelNo == null ? null : productModelNo.trim();
    }

    /**
     * 产品型号对应iwebshop_goods的name<br/>
     * 返回值对应的表列名 client_selection_record.product_name
     *
     * @return 返回值对应 client_selection_record.product_name
     *
     * @mbg.generated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 产品型号对应iwebshop_goods的name<br/>
     * client_selection_record.product_name
     *
     * @param productName 值对应 client_selection_record.product_name
     *
     * @mbg.generated
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 参考价格<br/>
     * 返回值对应的表列名 client_selection_record.price
     *
     * @return 返回值对应 client_selection_record.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 参考价格<br/>
     * client_selection_record.price
     *
     * @param price 值对应 client_selection_record.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 产品规格（逗号隔开）<br/>
     * 返回值对应的表列名 client_selection_record.specification_info
     *
     * @return 返回值对应 client_selection_record.specification_info
     *
     * @mbg.generated
     */
    public String getSpecificationInfo() {
        return specificationInfo;
    }

    /**
     * 产品规格（逗号隔开）<br/>
     * client_selection_record.specification_info
     *
     * @param specificationInfo 值对应 client_selection_record.specification_info
     *
     * @mbg.generated
     */
    public void setSpecificationInfo(String specificationInfo) {
        this.specificationInfo = specificationInfo == null ? null : specificationInfo.trim();
    }

    /**
     * 创建人<br/>
     * 返回值对应的表列名 client_selection_record.creator
     *
     * @return 返回值对应 client_selection_record.creator
     *
     * @mbg.generated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建人<br/>
     * client_selection_record.creator
     *
     * @param creator 值对应 client_selection_record.creator
     *
     * @mbg.generated
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 创建时间<br/>
     * 返回值对应的表列名 client_selection_record.create_time
     *
     * @return 返回值对应 client_selection_record.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间<br/>
     * client_selection_record.create_time
     *
     * @param createTime 值对应 client_selection_record.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改人<br/>
     * 返回值对应的表列名 client_selection_record.modifier
     *
     * @return 返回值对应 client_selection_record.modifier
     *
     * @mbg.generated
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 修改人<br/>
     * client_selection_record.modifier
     *
     * @param modifier 值对应 client_selection_record.modifier
     *
     * @mbg.generated
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * 最后修改时间<br/>
     * 返回值对应的表列名 client_selection_record.modify_time
     *
     * @return 返回值对应 client_selection_record.modify_time
     *
     * @mbg.generated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 最后修改时间<br/>
     * client_selection_record.modify_time
     *
     * @param modifyTime 值对应 client_selection_record.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ClientSelectionRecord other = (ClientSelectionRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSelectionRecordCode() == null ? other.getSelectionRecordCode() == null : this.getSelectionRecordCode().equals(other.getSelectionRecordCode()))
            && (this.getUserCode() == null ? other.getUserCode() == null : this.getUserCode().equals(other.getUserCode()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getProductModelNo() == null ? other.getProductModelNo() == null : this.getProductModelNo().equals(other.getProductModelNo()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getSpecificationInfo() == null ? other.getSpecificationInfo() == null : this.getSpecificationInfo().equals(other.getSpecificationInfo()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSelectionRecordCode() == null) ? 0 : getSelectionRecordCode().hashCode());
        result = prime * result + ((getUserCode() == null) ? 0 : getUserCode().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getProductModelNo() == null) ? 0 : getProductModelNo().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getSpecificationInfo() == null) ? 0 : getSpecificationInfo().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", selectionRecordCode=").append(selectionRecordCode);
        sb.append(", userCode=").append(userCode);
        sb.append(", productCode=").append(productCode);
        sb.append(", productModelNo=").append(productModelNo);
        sb.append(", productName=").append(productName);
        sb.append(", price=").append(price);
        sb.append(", specificationInfo=").append(specificationInfo);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}
}