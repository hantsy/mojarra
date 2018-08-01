/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates.
 * Copyright (c) 2018 Payara Services Limited.
 * All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.faces.test.servlet30.composite;

import java.io.Serializable;

import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


/**
 * Created by xinyuan.zhang on 5/5/17.
 */
@Named("testBean")
@ViewScoped
public class Issue4240Bean implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean isVisible;

    public void onSetItemVisible(AjaxBehaviorEvent e) {
        this.isVisible = true;
    }

    public void onSetItemInvisible(AjaxBehaviorEvent e) {
        this.isVisible = false;
    }

    public boolean isItemVisible()  {
        return this.isVisible;
    }
}
