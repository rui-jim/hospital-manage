package org.test.hospitalserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
public class Medicines implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 药品ID
     */
    @TableId(value = "m_id", type = IdType.AUTO)
    private Integer mId;

    /**
     * 药品名称
     */
    @TableField("m_name")
    private String mName;

    /**
     * 药品价格
     */
    @TableField("m_price")
    private Float mPrice;

    /**
     * 药品介绍
     */
    @TableField("m_introduce")
    private String mIntroduce;

    /**
     * 开方医生
     */
    @TableField("d_id")
    private Integer dId;

    /**
     * 药品厂家
     */
    @TableField("m_manufactures")
    private String mManufactures;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;


    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Float getmPrice() {
        return mPrice;
    }

    public void setmPrice(Float mPrice) {
        this.mPrice = mPrice;
    }

    public String getmIntroduce() {
        return mIntroduce;
    }

    public void setmIntroduce(String mIntroduce) {
        this.mIntroduce = mIntroduce;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getmManufactures() {
        return mManufactures;
    }

    public void setmManufactures(String mManufactures) {
        this.mManufactures = mManufactures;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Medicines{" +
        "mId=" + mId +
        ", mName=" + mName +
        ", mPrice=" + mPrice +
        ", mIntroduce=" + mIntroduce +
        ", dId=" + dId +
        ", mManufactures=" + mManufactures +
        ", isDelete=" + isDelete +
        "}";
    }
}
