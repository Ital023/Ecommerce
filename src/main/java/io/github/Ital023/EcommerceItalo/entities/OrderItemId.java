package io.github.Ital023.EcommerceItalo.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemId {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderItemEntity order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    public OrderItemId() {
    }

    public OrderItemEntity getOrder() {
        return order;
    }

    public void setOrder(OrderItemEntity order) {
        this.order = order;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }
}
