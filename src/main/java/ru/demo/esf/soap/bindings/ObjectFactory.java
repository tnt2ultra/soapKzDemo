//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.15 at 11:44:13 PM MSK 
//


package ru.demo.esf.soap.bindings;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.demo.esf.soap.bindings package. 
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

    private final static QName _VersionResponse_QNAME = new QName("esf", "versionResponse");
    private final static QName _EsfVersionRequest_QNAME = new QName("esf", "esfVersionRequest");
    private final static QName _EsfVersionResponse_QNAME = new QName("esf", "esfVersionResponse");
    private final static QName _ApiVersionRequest_QNAME = new QName("esf", "apiVersionRequest");
    private final static QName _ApiVersionResponse_QNAME = new QName("esf", "apiVersionResponse");
    private final static QName _ErrorCodesRequest_QNAME = new QName("esf", "errorCodesRequest");
    private final static QName _ErrorCodesResponse_QNAME = new QName("esf", "errorCodesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.demo.esf.soap.bindings
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorCodesResponse }
     * 
     */
    public ErrorCodesResponse createErrorCodesResponse() {
        return new ErrorCodesResponse();
    }

    /**
     * Create an instance of {@link VersionResponse }
     * 
     */
    public VersionResponse createVersionResponse() {
        return new VersionResponse();
    }

    /**
     * Create an instance of {@link VersionRequest }
     * 
     */
    public VersionRequest createVersionRequest() {
        return new VersionRequest();
    }

    /**
     * Create an instance of {@link ErrorCodesRequest }
     * 
     */
    public ErrorCodesRequest createErrorCodesRequest() {
        return new ErrorCodesRequest();
    }

    /**
     * Create an instance of {@link ErrorDescription }
     * 
     */
    public ErrorDescription createErrorDescription() {
        return new ErrorDescription();
    }

    /**
     * Create an instance of {@link ErrorCodesResponse.ErrorDescriptions }
     * 
     */
    public ErrorCodesResponse.ErrorDescriptions createErrorCodesResponseErrorDescriptions() {
        return new ErrorCodesResponse.ErrorDescriptions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VersionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "esf", name = "versionResponse")
    public JAXBElement<VersionResponse> createVersionResponse(VersionResponse value) {
        return new JAXBElement<VersionResponse>(_VersionResponse_QNAME, VersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VersionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "esf", name = "esfVersionRequest")
    public JAXBElement<VersionRequest> createEsfVersionRequest(VersionRequest value) {
        return new JAXBElement<VersionRequest>(_EsfVersionRequest_QNAME, VersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VersionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "esf", name = "esfVersionResponse")
    public JAXBElement<VersionResponse> createEsfVersionResponse(VersionResponse value) {
        return new JAXBElement<VersionResponse>(_EsfVersionResponse_QNAME, VersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VersionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "esf", name = "apiVersionRequest")
    public JAXBElement<VersionRequest> createApiVersionRequest(VersionRequest value) {
        return new JAXBElement<VersionRequest>(_ApiVersionRequest_QNAME, VersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VersionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "esf", name = "apiVersionResponse")
    public JAXBElement<VersionResponse> createApiVersionResponse(VersionResponse value) {
        return new JAXBElement<VersionResponse>(_ApiVersionResponse_QNAME, VersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorCodesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorCodesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "esf", name = "errorCodesRequest")
    public JAXBElement<ErrorCodesRequest> createErrorCodesRequest(ErrorCodesRequest value) {
        return new JAXBElement<ErrorCodesRequest>(_ErrorCodesRequest_QNAME, ErrorCodesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorCodesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorCodesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "esf", name = "errorCodesResponse")
    public JAXBElement<ErrorCodesResponse> createErrorCodesResponse(ErrorCodesResponse value) {
        return new JAXBElement<ErrorCodesResponse>(_ErrorCodesResponse_QNAME, ErrorCodesResponse.class, null, value);
    }

}
