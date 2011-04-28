
package com.netsuite.webservices.platform_2010_2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.3.0
 * Tue Apr 26 17:35:33 ART 2011
 * Generated source version: 2.3.0
 * 
 */

@WebFault(name = "invalidAccountFault", targetNamespace = "urn:faults_2010_2.platform.webservices.netsuite.com")
public class InvalidAccountFault extends Exception {
    public static final long serialVersionUID = 20110426173533L;
    
    private com.netsuite.webservices.platform.faults_2010_2.InvalidAccountFault invalidAccountFault;

    public InvalidAccountFault() {
        super();
    }
    
    public InvalidAccountFault(String message) {
        super(message);
    }
    
    public InvalidAccountFault(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAccountFault(String message, com.netsuite.webservices.platform.faults_2010_2.InvalidAccountFault invalidAccountFault) {
        super(message);
        this.invalidAccountFault = invalidAccountFault;
    }

    public InvalidAccountFault(String message, com.netsuite.webservices.platform.faults_2010_2.InvalidAccountFault invalidAccountFault, Throwable cause) {
        super(message, cause);
        this.invalidAccountFault = invalidAccountFault;
    }

    public com.netsuite.webservices.platform.faults_2010_2.InvalidAccountFault getFaultInfo() {
        return this.invalidAccountFault;
    }
}