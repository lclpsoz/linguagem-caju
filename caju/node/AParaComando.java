/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class AParaComando extends PComando
{
    private TReservadaPara _reservadaPara_;
    private TAbreParenteses _abreParenteses_;
    private PListaAtrib _init_;
    private TPontoVirgula _condSep_;
    private PExp _cond_;
    private TPontoVirgula _incSep_;
    private PListaAtrib _inc_;
    private TFechaParenteses _fechaParenteses_;
    private PComandoSemSenao _comandoSemSenao_;

    public AParaComando()
    {
        // Constructor
    }

    public AParaComando(
        @SuppressWarnings("hiding") TReservadaPara _reservadaPara_,
        @SuppressWarnings("hiding") TAbreParenteses _abreParenteses_,
        @SuppressWarnings("hiding") PListaAtrib _init_,
        @SuppressWarnings("hiding") TPontoVirgula _condSep_,
        @SuppressWarnings("hiding") PExp _cond_,
        @SuppressWarnings("hiding") TPontoVirgula _incSep_,
        @SuppressWarnings("hiding") PListaAtrib _inc_,
        @SuppressWarnings("hiding") TFechaParenteses _fechaParenteses_,
        @SuppressWarnings("hiding") PComandoSemSenao _comandoSemSenao_)
    {
        // Constructor
        setReservadaPara(_reservadaPara_);

        setAbreParenteses(_abreParenteses_);

        setInit(_init_);

        setCondSep(_condSep_);

        setCond(_cond_);

        setIncSep(_incSep_);

        setInc(_inc_);

        setFechaParenteses(_fechaParenteses_);

        setComandoSemSenao(_comandoSemSenao_);

    }

    @Override
    public Object clone()
    {
        return new AParaComando(
            cloneNode(this._reservadaPara_),
            cloneNode(this._abreParenteses_),
            cloneNode(this._init_),
            cloneNode(this._condSep_),
            cloneNode(this._cond_),
            cloneNode(this._incSep_),
            cloneNode(this._inc_),
            cloneNode(this._fechaParenteses_),
            cloneNode(this._comandoSemSenao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParaComando(this);
    }

    public TReservadaPara getReservadaPara()
    {
        return this._reservadaPara_;
    }

    public void setReservadaPara(TReservadaPara node)
    {
        if(this._reservadaPara_ != null)
        {
            this._reservadaPara_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._reservadaPara_ = node;
    }

    public TAbreParenteses getAbreParenteses()
    {
        return this._abreParenteses_;
    }

    public void setAbreParenteses(TAbreParenteses node)
    {
        if(this._abreParenteses_ != null)
        {
            this._abreParenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreParenteses_ = node;
    }

    public PListaAtrib getInit()
    {
        return this._init_;
    }

    public void setInit(PListaAtrib node)
    {
        if(this._init_ != null)
        {
            this._init_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._init_ = node;
    }

    public TPontoVirgula getCondSep()
    {
        return this._condSep_;
    }

    public void setCondSep(TPontoVirgula node)
    {
        if(this._condSep_ != null)
        {
            this._condSep_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._condSep_ = node;
    }

    public PExp getCond()
    {
        return this._cond_;
    }

    public void setCond(PExp node)
    {
        if(this._cond_ != null)
        {
            this._cond_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cond_ = node;
    }

    public TPontoVirgula getIncSep()
    {
        return this._incSep_;
    }

    public void setIncSep(TPontoVirgula node)
    {
        if(this._incSep_ != null)
        {
            this._incSep_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._incSep_ = node;
    }

    public PListaAtrib getInc()
    {
        return this._inc_;
    }

    public void setInc(PListaAtrib node)
    {
        if(this._inc_ != null)
        {
            this._inc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inc_ = node;
    }

    public TFechaParenteses getFechaParenteses()
    {
        return this._fechaParenteses_;
    }

    public void setFechaParenteses(TFechaParenteses node)
    {
        if(this._fechaParenteses_ != null)
        {
            this._fechaParenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaParenteses_ = node;
    }

    public PComandoSemSenao getComandoSemSenao()
    {
        return this._comandoSemSenao_;
    }

    public void setComandoSemSenao(PComandoSemSenao node)
    {
        if(this._comandoSemSenao_ != null)
        {
            this._comandoSemSenao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoSemSenao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._reservadaPara_)
            + toString(this._abreParenteses_)
            + toString(this._init_)
            + toString(this._condSep_)
            + toString(this._cond_)
            + toString(this._incSep_)
            + toString(this._inc_)
            + toString(this._fechaParenteses_)
            + toString(this._comandoSemSenao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._reservadaPara_ == child)
        {
            this._reservadaPara_ = null;
            return;
        }

        if(this._abreParenteses_ == child)
        {
            this._abreParenteses_ = null;
            return;
        }

        if(this._init_ == child)
        {
            this._init_ = null;
            return;
        }

        if(this._condSep_ == child)
        {
            this._condSep_ = null;
            return;
        }

        if(this._cond_ == child)
        {
            this._cond_ = null;
            return;
        }

        if(this._incSep_ == child)
        {
            this._incSep_ = null;
            return;
        }

        if(this._inc_ == child)
        {
            this._inc_ = null;
            return;
        }

        if(this._fechaParenteses_ == child)
        {
            this._fechaParenteses_ = null;
            return;
        }

        if(this._comandoSemSenao_ == child)
        {
            this._comandoSemSenao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._reservadaPara_ == oldChild)
        {
            setReservadaPara((TReservadaPara) newChild);
            return;
        }

        if(this._abreParenteses_ == oldChild)
        {
            setAbreParenteses((TAbreParenteses) newChild);
            return;
        }

        if(this._init_ == oldChild)
        {
            setInit((PListaAtrib) newChild);
            return;
        }

        if(this._condSep_ == oldChild)
        {
            setCondSep((TPontoVirgula) newChild);
            return;
        }

        if(this._cond_ == oldChild)
        {
            setCond((PExp) newChild);
            return;
        }

        if(this._incSep_ == oldChild)
        {
            setIncSep((TPontoVirgula) newChild);
            return;
        }

        if(this._inc_ == oldChild)
        {
            setInc((PListaAtrib) newChild);
            return;
        }

        if(this._fechaParenteses_ == oldChild)
        {
            setFechaParenteses((TFechaParenteses) newChild);
            return;
        }

        if(this._comandoSemSenao_ == oldChild)
        {
            setComandoSemSenao((PComandoSemSenao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
