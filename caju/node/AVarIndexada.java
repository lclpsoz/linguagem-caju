/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class AVarIndexada extends PVarIndexada
{
    private TAbreColchetes _abreColchetes_;
    private PExp _exp_;
    private TFechaColchetes _fechaColchetes_;

    public AVarIndexada()
    {
        // Constructor
    }

    public AVarIndexada(
        @SuppressWarnings("hiding") TAbreColchetes _abreColchetes_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TFechaColchetes _fechaColchetes_)
    {
        // Constructor
        setAbreColchetes(_abreColchetes_);

        setExp(_exp_);

        setFechaColchetes(_fechaColchetes_);

    }

    @Override
    public Object clone()
    {
        return new AVarIndexada(
            cloneNode(this._abreColchetes_),
            cloneNode(this._exp_),
            cloneNode(this._fechaColchetes_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarIndexada(this);
    }

    public TAbreColchetes getAbreColchetes()
    {
        return this._abreColchetes_;
    }

    public void setAbreColchetes(TAbreColchetes node)
    {
        if(this._abreColchetes_ != null)
        {
            this._abreColchetes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreColchetes_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TFechaColchetes getFechaColchetes()
    {
        return this._fechaColchetes_;
    }

    public void setFechaColchetes(TFechaColchetes node)
    {
        if(this._fechaColchetes_ != null)
        {
            this._fechaColchetes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaColchetes_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._abreColchetes_)
            + toString(this._exp_)
            + toString(this._fechaColchetes_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._abreColchetes_ == child)
        {
            this._abreColchetes_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._fechaColchetes_ == child)
        {
            this._fechaColchetes_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._abreColchetes_ == oldChild)
        {
            setAbreColchetes((TAbreColchetes) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._fechaColchetes_ == oldChild)
        {
            setFechaColchetes((TFechaColchetes) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
