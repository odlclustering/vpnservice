/*
 * Copyright (c) 2015 - 2016 Ericsson India Global Services Pvt Ltd. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.vpnmanager.api;

import java.math.BigInteger;

import java.util.Collection;
import org.opendaylight.fibmanager.api.IFibManager;

public interface IVpnManager {
    void setFibService(IFibManager fibManager);
    void addExtraRoute(String destination, String nextHop, String rd, String routerID, int label);
    void delExtraRoute(String destination, String rd, String routerID);
}
