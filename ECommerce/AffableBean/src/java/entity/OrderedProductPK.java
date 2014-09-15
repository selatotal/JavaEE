/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author talesviegas
 */
@Embeddable
public class OrderedProductPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "cusumer_order_id")
    private int cusumerOrderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;

    public OrderedProductPK() {
    }

    public OrderedProductPK(int cusumerOrderId, int productId) {
        this.cusumerOrderId = cusumerOrderId;
        this.productId = productId;
    }

    public int getCusumerOrderId() {
        return cusumerOrderId;
    }

    public void setCusumerOrderId(int cusumerOrderId) {
        this.cusumerOrderId = cusumerOrderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cusumerOrderId;
        hash += (int) productId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderedProductPK)) {
            return false;
        }
        OrderedProductPK other = (OrderedProductPK) object;
        if (this.cusumerOrderId != other.cusumerOrderId) {
            return false;
        }
        if (this.productId != other.productId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.OrderedProductPK[ cusumerOrderId=" + cusumerOrderId + ", productId=" + productId + " ]";
    }
    
}
