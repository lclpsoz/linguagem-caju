/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class ASimplesComandoSemSenao extends PComandoSemSenao
{
    private PComandoSimples _comandoSimples_;

    public ASimplesComandoSemSenao()
    {
        // Constructor
    }

    public ASimplesComandoSemSenao(
        @SuppressWarnings("hiding") PComandoSimples _comandoSimples_)
    {
        // Constructor
        setComandoSimples(_comandoSimples_);

    }

    @Override
    public Object clone()
    {
        return new ASimplesComandoSemSenao(
            cloneNode(this._comandoSimples_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimplesComandoSemSenao(this);
    }

    public PComandoSimples getComandoSimples()
    {
        return this._comandoSimples_;
    }

    public void setComandoSimples(PComandoSimples node)
    {
        if(this._comandoSimples_ != null)
        {
            this._comandoSimples_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoSimples_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comandoSimples_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comandoSimples_ == child)
        {
            this._comandoSimples_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comandoSimples_ == oldChild)
        {
            setComandoSimples((PComandoSimples) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
