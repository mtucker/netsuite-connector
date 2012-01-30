/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api;

import java.rmi.RemoteException;

import javax.validation.constraints.NotNull;
import javax.xml.ws.BindingProvider;

import org.apache.commons.lang.Validate;

import com.netsuite.webservices.platform.core_2010_2.Passport;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.platform.messages_2010_2.LoginRequest;
import com.netsuite.webservices.platform_2010_2.NetSuitePortType;
import com.netsuite.webservices.platform_2010_2.NetSuiteService;
import com.zauberlabs.commons.ws.connection.ConnectionBuilder;

public class DefaultCxfPortProvider implements CxfPortProvider
{
    private final String address;
    private final String email;
    private final String password;
    private final String account;
    private final String roleId;

    /**
     * Creates the port provider
     *
     * @param address
     * @param email
     * @param password
     * @param account
     * @param roleId
     */
    public DefaultCxfPortProvider(@NotNull String address,
                                   @NotNull String email,
                                   @NotNull String password,
                                   @NotNull String account,
                                   @NotNull String roleId)
    {
        Validate.notNull(address);
        Validate.notNull(email);
        Validate.notNull(password);
        Validate.notNull(account);
        Validate.notNull(roleId);
        this.address = address;
        this.email = email;
        this.password = password;
        this.account = account;
        this.roleId = roleId;
    }

    public NetSuitePortType getPort() throws RemoteException
    {
        return ConnectionBuilder.fromPortType(NetSuitePortType.class)
            .withServiceType(NetSuiteService.class)
            .withClasspathWsdl("netsuite.wsdl")
            .withEndpoint(address)
            .build();
    }

    public NetSuitePortType getAuthenticatedPort() throws Exception
    {
        NetSuitePortType port = getPort();
        ((BindingProvider) port).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);
        port.login(new LoginRequest(new Passport(email, password, account, new RecordRef(null, roleId, null))));
        return port;
    }

}
