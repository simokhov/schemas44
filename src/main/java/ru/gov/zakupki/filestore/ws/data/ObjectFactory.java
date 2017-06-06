//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 11:23:43 AM MSK 
//


package ru.gov.zakupki.filestore.ws.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gov.zakupki.filestore.ws.data package. 
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

    private final static QName _StartResponse_QNAME = new QName("http://zakupki.gov.ru/filestore/ws/data", "startResponse");
    private final static QName _BaseFault_QNAME = new QName("http://zakupki.gov.ru/filestore/ws/data", "baseFault");
    private final static QName _StartRequest_QNAME = new QName("http://zakupki.gov.ru/filestore/ws/data", "startRequest");
    private final static QName _ChunkResponse_QNAME = new QName("http://zakupki.gov.ru/filestore/ws/data", "chunkResponse");
    private final static QName _FinishResponse_QNAME = new QName("http://zakupki.gov.ru/filestore/ws/data", "finishResponse");
    private final static QName _FinishRequest_QNAME = new QName("http://zakupki.gov.ru/filestore/ws/data", "finishRequest");
    private final static QName _ChunkRequest_QNAME = new QName("http://zakupki.gov.ru/filestore/ws/data", "chunkRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gov.zakupki.filestore.ws.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StartRequestType }
     * 
     */
    public StartRequestType createStartRequestType() {
        return new StartRequestType();
    }

    /**
     * Create an instance of {@link BaseFaultPacketType }
     * 
     */
    public BaseFaultPacketType createBaseFaultPacketType() {
        return new BaseFaultPacketType();
    }

    /**
     * Create an instance of {@link StartRequestPacketType }
     * 
     */
    public StartRequestPacketType createStartRequestPacketType() {
        return new StartRequestPacketType();
    }

    /**
     * Create an instance of {@link ChunkResponsePacketType }
     * 
     */
    public ChunkResponsePacketType createChunkResponsePacketType() {
        return new ChunkResponsePacketType();
    }

    /**
     * Create an instance of {@link StartResponsePacketType }
     * 
     */
    public StartResponsePacketType createStartResponsePacketType() {
        return new StartResponsePacketType();
    }

    /**
     * Create an instance of {@link FinishRequestPacketType }
     * 
     */
    public FinishRequestPacketType createFinishRequestPacketType() {
        return new FinishRequestPacketType();
    }

    /**
     * Create an instance of {@link ChunkRequestPacketType }
     * 
     */
    public ChunkRequestPacketType createChunkRequestPacketType() {
        return new ChunkRequestPacketType();
    }

    /**
     * Create an instance of {@link FinishResponsePacketType }
     * 
     */
    public FinishResponsePacketType createFinishResponsePacketType() {
        return new FinishResponsePacketType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link ChunkRequestType }
     * 
     */
    public ChunkRequestType createChunkRequestType() {
        return new ChunkRequestType();
    }

    /**
     * Create an instance of {@link StartResponseType }
     * 
     */
    public StartResponseType createStartResponseType() {
        return new StartResponseType();
    }

    /**
     * Create an instance of {@link RangeType }
     * 
     */
    public RangeType createRangeType() {
        return new RangeType();
    }

    /**
     * Create an instance of {@link FinishResponseType }
     * 
     */
    public FinishResponseType createFinishResponseType() {
        return new FinishResponseType();
    }

    /**
     * Create an instance of {@link FinishRequestType }
     * 
     */
    public FinishRequestType createFinishRequestType() {
        return new FinishRequestType();
    }

    /**
     * Create an instance of {@link BaseFaultType }
     * 
     */
    public BaseFaultType createBaseFaultType() {
        return new BaseFaultType();
    }

    /**
     * Create an instance of {@link ChunkResponseType }
     * 
     */
    public ChunkResponseType createChunkResponseType() {
        return new ChunkResponseType();
    }

    /**
     * Create an instance of {@link ru.gov.zakupki.filestore.ws.data.RefPacketType.Index }
     * 
     */
    public ru.gov.zakupki.filestore.ws.data.RefPacketType.Index createRefPacketTypeIndex() {
        return new ru.gov.zakupki.filestore.ws.data.RefPacketType.Index();
    }

    /**
     * Create an instance of {@link StartRequestType.Owner }
     * 
     */
    public StartRequestType.Owner createStartRequestTypeOwner() {
        return new StartRequestType.Owner();
    }

    /**
     * Create an instance of {@link StartRequestType.FileInfo }
     * 
     */
    public StartRequestType.FileInfo createStartRequestTypeFileInfo() {
        return new StartRequestType.FileInfo();
    }

    /**
     * Create an instance of {@link ru.gov.zakupki.filestore.ws.data.PacketType.Index }
     * 
     */
    public ru.gov.zakupki.filestore.ws.data.PacketType.Index createPacketTypeIndex() {
        return new ru.gov.zakupki.filestore.ws.data.PacketType.Index();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartResponsePacketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/filestore/ws/data", name = "startResponse")
    public JAXBElement<StartResponsePacketType> createStartResponse(StartResponsePacketType value) {
        return new JAXBElement<StartResponsePacketType>(_StartResponse_QNAME, StartResponsePacketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFaultPacketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/filestore/ws/data", name = "baseFault")
    public JAXBElement<BaseFaultPacketType> createBaseFault(BaseFaultPacketType value) {
        return new JAXBElement<BaseFaultPacketType>(_BaseFault_QNAME, BaseFaultPacketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartRequestPacketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/filestore/ws/data", name = "startRequest")
    public JAXBElement<StartRequestPacketType> createStartRequest(StartRequestPacketType value) {
        return new JAXBElement<StartRequestPacketType>(_StartRequest_QNAME, StartRequestPacketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkResponsePacketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/filestore/ws/data", name = "chunkResponse")
    public JAXBElement<ChunkResponsePacketType> createChunkResponse(ChunkResponsePacketType value) {
        return new JAXBElement<ChunkResponsePacketType>(_ChunkResponse_QNAME, ChunkResponsePacketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinishResponsePacketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/filestore/ws/data", name = "finishResponse")
    public JAXBElement<FinishResponsePacketType> createFinishResponse(FinishResponsePacketType value) {
        return new JAXBElement<FinishResponsePacketType>(_FinishResponse_QNAME, FinishResponsePacketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinishRequestPacketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/filestore/ws/data", name = "finishRequest")
    public JAXBElement<FinishRequestPacketType> createFinishRequest(FinishRequestPacketType value) {
        return new JAXBElement<FinishRequestPacketType>(_FinishRequest_QNAME, FinishRequestPacketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkRequestPacketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/filestore/ws/data", name = "chunkRequest")
    public JAXBElement<ChunkRequestPacketType> createChunkRequest(ChunkRequestPacketType value) {
        return new JAXBElement<ChunkRequestPacketType>(_ChunkRequest_QNAME, ChunkRequestPacketType.class, null, value);
    }

}
