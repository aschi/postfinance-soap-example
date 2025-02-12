
package ch.tocco.soaptest.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDownloadFile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDownloadFile">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DownloadFile" type="{http://swisspost_ch.ebs.ebill.b2bservice}DownloadFile" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDownloadFile", namespace = "http://swisspost_ch.ebs.ebill.b2bservice", propOrder = {
    "downloadFile"
})
public class ArrayOfDownloadFile {

    @XmlElement(name = "DownloadFile", nillable = true)
    protected List<DownloadFile> downloadFile;

    /**
     * Gets the value of the downloadFile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the downloadFile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDownloadFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DownloadFile }
     * </p>
     * 
     * 
     * @return
     *     The value of the downloadFile property.
     */
    public List<DownloadFile> getDownloadFile() {
        if (downloadFile == null) {
            downloadFile = new ArrayList<>();
        }
        return this.downloadFile;
    }

}
