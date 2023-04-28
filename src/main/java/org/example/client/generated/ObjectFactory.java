
package org.example.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.client.generated package. 
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

    private final static QName _CanPlayerMakeStep_QNAME = new QName("http://server.example.org/", "canPlayerMakeStep");
    private final static QName _CanPlayerMakeStepResponse_QNAME = new QName("http://server.example.org/", "canPlayerMakeStepResponse");
    private final static QName _GetWinner_QNAME = new QName("http://server.example.org/", "getWinner");
    private final static QName _GetWinnerResponse_QNAME = new QName("http://server.example.org/", "getWinnerResponse");
    private final static QName _JoinGame_QNAME = new QName("http://server.example.org/", "joinGame");
    private final static QName _JoinGameResponse_QNAME = new QName("http://server.example.org/", "joinGameResponse");
    private final static QName _MakeStep_QNAME = new QName("http://server.example.org/", "makeStep");
    private final static QName _MakeStepResponse_QNAME = new QName("http://server.example.org/", "makeStepResponse");
    private final static QName _PrintGameField_QNAME = new QName("http://server.example.org/", "printGameField");
    private final static QName _PrintGameFieldResponse_QNAME = new QName("http://server.example.org/", "printGameFieldResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CanPlayerMakeStep }
     * 
     */
    public CanPlayerMakeStep createCanPlayerMakeStep() {
        return new CanPlayerMakeStep();
    }

    /**
     * Create an instance of {@link CanPlayerMakeStepResponse }
     * 
     */
    public CanPlayerMakeStepResponse createCanPlayerMakeStepResponse() {
        return new CanPlayerMakeStepResponse();
    }

    /**
     * Create an instance of {@link GetWinner }
     * 
     */
    public GetWinner createGetWinner() {
        return new GetWinner();
    }

    /**
     * Create an instance of {@link GetWinnerResponse }
     * 
     */
    public GetWinnerResponse createGetWinnerResponse() {
        return new GetWinnerResponse();
    }

    /**
     * Create an instance of {@link JoinGame }
     * 
     */
    public JoinGame createJoinGame() {
        return new JoinGame();
    }

    /**
     * Create an instance of {@link JoinGameResponse }
     * 
     */
    public JoinGameResponse createJoinGameResponse() {
        return new JoinGameResponse();
    }

    /**
     * Create an instance of {@link MakeStep }
     * 
     */
    public MakeStep createMakeStep() {
        return new MakeStep();
    }

    /**
     * Create an instance of {@link MakeStepResponse }
     * 
     */
    public MakeStepResponse createMakeStepResponse() {
        return new MakeStepResponse();
    }

    /**
     * Create an instance of {@link PrintGameField }
     * 
     */
    public PrintGameField createPrintGameField() {
        return new PrintGameField();
    }

    /**
     * Create an instance of {@link PrintGameFieldResponse }
     * 
     */
    public PrintGameFieldResponse createPrintGameFieldResponse() {
        return new PrintGameFieldResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanPlayerMakeStep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanPlayerMakeStep }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.example.org/", name = "canPlayerMakeStep")
    public JAXBElement<CanPlayerMakeStep> createCanPlayerMakeStep(CanPlayerMakeStep value) {
        return new JAXBElement<CanPlayerMakeStep>(_CanPlayerMakeStep_QNAME, CanPlayerMakeStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanPlayerMakeStepResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanPlayerMakeStepResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.example.org/", name = "canPlayerMakeStepResponse")
    public JAXBElement<CanPlayerMakeStepResponse> createCanPlayerMakeStepResponse(CanPlayerMakeStepResponse value) {
        return new JAXBElement<CanPlayerMakeStepResponse>(_CanPlayerMakeStepResponse_QNAME, CanPlayerMakeStepResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWinner }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWinner }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.example.org/", name = "getWinner")
    public JAXBElement<GetWinner> createGetWinner(GetWinner value) {
        return new JAXBElement<GetWinner>(_GetWinner_QNAME, GetWinner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWinnerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWinnerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.example.org/", name = "getWinnerResponse")
    public JAXBElement<GetWinnerResponse> createGetWinnerResponse(GetWinnerResponse value) {
        return new JAXBElement<GetWinnerResponse>(_GetWinnerResponse_QNAME, GetWinnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinGame }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JoinGame }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.example.org/", name = "joinGame")
    public JAXBElement<JoinGame> createJoinGame(JoinGame value) {
        return new JAXBElement<JoinGame>(_JoinGame_QNAME, JoinGame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinGameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JoinGameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.example.org/", name = "joinGameResponse")
    public JAXBElement<JoinGameResponse> createJoinGameResponse(JoinGameResponse value) {
        return new JAXBElement<JoinGameResponse>(_JoinGameResponse_QNAME, JoinGameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeStep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeStep }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.example.org/", name = "makeStep")
    public JAXBElement<MakeStep> createMakeStep(MakeStep value) {
        return new JAXBElement<MakeStep>(_MakeStep_QNAME, MakeStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeStepResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeStepResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.example.org/", name = "makeStepResponse")
    public JAXBElement<MakeStepResponse> createMakeStepResponse(MakeStepResponse value) {
        return new JAXBElement<MakeStepResponse>(_MakeStepResponse_QNAME, MakeStepResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintGameField }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrintGameField }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.example.org/", name = "printGameField")
    public JAXBElement<PrintGameField> createPrintGameField(PrintGameField value) {
        return new JAXBElement<PrintGameField>(_PrintGameField_QNAME, PrintGameField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintGameFieldResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrintGameFieldResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.example.org/", name = "printGameFieldResponse")
    public JAXBElement<PrintGameFieldResponse> createPrintGameFieldResponse(PrintGameFieldResponse value) {
        return new JAXBElement<PrintGameFieldResponse>(_PrintGameFieldResponse_QNAME, PrintGameFieldResponse.class, null, value);
    }

}
