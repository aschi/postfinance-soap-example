
package ch.tocco.soaptest.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSearchInvoice complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfSearchInvoice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SearchInvoice" type="{http://swisspost_ch.ebs.ebill.b2bservice}SearchInvoice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchInvoice", namespace = "http://swisspost_ch.ebs.ebill.b2bservice", propOrder = {
    "searchInvoice"
})
public class ArrayOfSearchInvoice {

    @XmlElement(name = "SearchInvoice", nillable = true)
    protected List<SearchInvoice> searchInvoice;

    /**
     * Gets the value of the searchInvoice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchInvoice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchInvoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchInvoice }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchInvoice property.
     */
    public List<SearchInvoice> getSearchInvoice() {
        if (searchInvoice == null) {
            searchInvoice = new ArrayList<>();
        }
        return this.searchInvoice;
    }

}
