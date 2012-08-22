
package com.skcc.tutorial.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.skcc.tutorial.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrderId_QNAME = new QName("http://www.skcc.com/tutorial/ws/", "orderId");
    private final static QName _Order_QNAME = new QName("http://www.skcc.com/tutorial/ws/", "order");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.skcc.tutorial.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderType }
     * 
     */
    public OrderType createOrderType() {
        return new OrderType();
    }

    /**
     * Create an instance of {@link OrderItemType }
     * 
     */
    public OrderItemType createOrderItemType() {
        return new OrderItemType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.skcc.com/tutorial/ws/", name = "orderId")
    public JAXBElement<String> createOrderId(String value) {
        return new JAXBElement<String>(_OrderId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.skcc.com/tutorial/ws/", name = "order")
    public JAXBElement<OrderType> createOrder(OrderType value) {
        return new JAXBElement<OrderType>(_Order_QNAME, OrderType.class, null, value);
    }

}
