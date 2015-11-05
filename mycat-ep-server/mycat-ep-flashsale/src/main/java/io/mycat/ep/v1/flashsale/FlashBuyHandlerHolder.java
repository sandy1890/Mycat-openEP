// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.0
//
// <auto-generated>
//
// Generated from file `flashsale.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package io.mycat.ep.v1.flashsale;

public final class FlashBuyHandlerHolder extends Ice.ObjectHolderBase<FlashBuyHandler>
{
    public
    FlashBuyHandlerHolder()
    {
    }

    public
    FlashBuyHandlerHolder(FlashBuyHandler value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof FlashBuyHandler)
        {
            value = (FlashBuyHandler)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _FlashBuyHandlerDisp.ice_staticId();
    }
}