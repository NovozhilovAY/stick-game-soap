
package org.example.client.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StickGameImpl", targetNamespace = "http://server.example.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StickGameImpl {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "joinGame", targetNamespace = "http://server.example.org/", className = "org.example.client.generated.JoinGame")
    @ResponseWrapper(localName = "joinGameResponse", targetNamespace = "http://server.example.org/", className = "org.example.client.generated.JoinGameResponse")
    @Action(input = "http://server.example.org/StickGameImpl/joinGameRequest", output = "http://server.example.org/StickGameImpl/joinGameResponse")
    public int joinGame();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWinner", targetNamespace = "http://server.example.org/", className = "org.example.client.generated.GetWinner")
    @ResponseWrapper(localName = "getWinnerResponse", targetNamespace = "http://server.example.org/", className = "org.example.client.generated.GetWinnerResponse")
    @Action(input = "http://server.example.org/StickGameImpl/getWinnerRequest", output = "http://server.example.org/StickGameImpl/getWinnerResponse")
    public int getWinner();

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "printGameField", targetNamespace = "http://server.example.org/", className = "org.example.client.generated.PrintGameField")
    @ResponseWrapper(localName = "printGameFieldResponse", targetNamespace = "http://server.example.org/", className = "org.example.client.generated.PrintGameFieldResponse")
    @Action(input = "http://server.example.org/StickGameImpl/printGameFieldRequest", output = "http://server.example.org/StickGameImpl/printGameFieldResponse")
    public void printGameField();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "makeStep", targetNamespace = "http://server.example.org/", className = "org.example.client.generated.MakeStep")
    @ResponseWrapper(localName = "makeStepResponse", targetNamespace = "http://server.example.org/", className = "org.example.client.generated.MakeStepResponse")
    @Action(input = "http://server.example.org/StickGameImpl/makeStepRequest", output = "http://server.example.org/StickGameImpl/makeStepResponse")
    public void makeStep(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "canPlayerMakeStep", targetNamespace = "http://server.example.org/", className = "org.example.client.generated.CanPlayerMakeStep")
    @ResponseWrapper(localName = "canPlayerMakeStepResponse", targetNamespace = "http://server.example.org/", className = "org.example.client.generated.CanPlayerMakeStepResponse")
    @Action(input = "http://server.example.org/StickGameImpl/canPlayerMakeStepRequest", output = "http://server.example.org/StickGameImpl/canPlayerMakeStepResponse")
    public boolean canPlayerMakeStep(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}