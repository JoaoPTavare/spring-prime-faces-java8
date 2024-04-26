package exemplo.model;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Order order;

    private Long paymentdate;

    private Double value;

    private Long parcel;

    private String paymentmethod;

    public Payment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Long paymentdate) {
        this.paymentdate = paymentdate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Long getParcel() {
        return parcel;
    }

    public void setParcel(Long parcel) {
        this.parcel = parcel;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public Payment(Long id, Order order, Long paymentdate, Double value, Long parcel, String paymentmethod) {
        this.id = id;
        this.order = order;

        this.paymentdate = paymentdate;
        this.value = value;
        this.parcel = parcel;
        this.paymentmethod = paymentmethod;
    }
}
