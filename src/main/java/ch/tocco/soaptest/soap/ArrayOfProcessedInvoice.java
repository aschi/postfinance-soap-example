
package ch.tocco.soaptest.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProcessedInvoice complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfProcessedInvoice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProcessedInvoice" type="{http://swisspost_ch.ebs.ebill.b2bservice}ProcessedInvoice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProcessedInvoice", namespace = "http://swisspost_ch.ebs.ebill.b2bservice", propOrder = {
    "processedInvoice"
})
public class ArrayOfProcessedInvoice {

    @XmlElement(name = "ProcessedInvoice", nillable = true)
    protected List<ProcessedInvoice> processedInvoice;

    /**
     * Gets the value of the processedInvoice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processedInvoice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProcessedInvoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessedInvoice }
     * </p>
     * 
     * 
     * @return
     *     The value of the processedInvoice property.
     */
    public List<ProcessedInvoice> getProcessedInvoice() {
        if (processedInvoice == null) {
            processedInvoice = new ArrayList<>();
        }
        return this.processedInvoice;
    }

}
