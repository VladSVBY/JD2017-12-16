//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.13 at 12:04:13 PM MSK 
//


package by.it.sendetskaya.jd02_09;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Buyers" type="{http://by.it.sendetskaya.jd02_09}Buyers" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Goods" type="{http://by.it.sendetskaya.jd02_09}Goods" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Baskets" type="{http://by.it.sendetskaya.jd02_09}Baskets" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "buyers",
    "goods",
    "baskets"
})
@XmlRootElement(name = "Shop")
public class Shop {

    @XmlElement(name = "Buyers", required = true)
    protected List<Buyers> buyers;
    @XmlElement(name = "Goods", required = true)
    protected List<Goods> goods;
    @XmlElement(name = "Baskets", required = true)
    protected List<Baskets> baskets;

    /**
     * Gets the value of the buyers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Buyers }
     * 
     * 
     */
    public List<Buyers> getBuyers() {
        if (buyers == null) {
            buyers = new ArrayList<Buyers>();
        }
        return this.buyers;
    }

    /**
     * Gets the value of the goods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Goods }
     * 
     * 
     */
    public List<Goods> getGoods() {
        if (goods == null) {
            goods = new ArrayList<Goods>();
        }
        return this.goods;
    }

    /**
     * Gets the value of the baskets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baskets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaskets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Baskets }
     * 
     * 
     */
    public List<Baskets> getBaskets() {
        if (baskets == null) {
            baskets = new ArrayList<Baskets>();
        }
        return this.baskets;
    }

}
