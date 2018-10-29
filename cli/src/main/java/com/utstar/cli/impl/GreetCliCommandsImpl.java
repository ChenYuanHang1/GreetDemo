/*
 * Copyright © 2017 Copyright (c) 2017 greet, Inc and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package com.utstar.cli.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.utstar.cli.api.GreetCliCommands;

public class GreetCliCommandsImpl implements GreetCliCommands {

    private static final Logger LOG = LoggerFactory.getLogger(GreetCliCommandsImpl.class);
    private final DataBroker dataBroker;

    public GreetCliCommandsImpl(final DataBroker db) {
        this.dataBroker = db;
        LOG.info("GreetCliCommandImpl initialized");
    }

    @Override
    public Object testCommand(Object testArgument) {
        return "This is a test implementation of test-command";
    }
}