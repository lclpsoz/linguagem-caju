/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import java.util.*;
import caju.analysis.*;

@SuppressWarnings("nls")
public final class ABloco extends PBloco
{
    private TReservadaInicio _reservadaInicio_;
    private final LinkedList<PDecVariavel> _decVariavel_ = new LinkedList<PDecVariavel>();
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();
    private TReservadaFim _reservadaFim_;

    public ABloco()
    {
        // Constructor
    }

    public ABloco(
        @SuppressWarnings("hiding") TReservadaInicio _reservadaInicio_,
        @SuppressWarnings("hiding") List<?> _decVariavel_,
        @SuppressWarnings("hiding") List<?> _comando_,
        @SuppressWarnings("hiding") TReservadaFim _reservadaFim_)
    {
        // Constructor
        setReservadaInicio(_reservadaInicio_);

        setDecVariavel(_decVariavel_);

        setComando(_comando_);

        setReservadaFim(_reservadaFim_);

    }

    @Override
    public Object clone()
    {
        return new ABloco(
            cloneNode(this._reservadaInicio_),
            cloneList(this._decVariavel_),
            cloneList(this._comando_),
            cloneNode(this._reservadaFim_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABloco(this);
    }

    public TReservadaInicio getReservadaInicio()
    {
        return this._reservadaInicio_;
    }

    public void setReservadaInicio(TReservadaInicio node)
    {
        if(this._reservadaInicio_ != null)
        {
            this._reservadaInicio_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._reservadaInicio_ = node;
    }

    public LinkedList<PDecVariavel> getDecVariavel()
    {
        return this._decVariavel_;
    }

    public void setDecVariavel(List<?> list)
    {
        for(PDecVariavel e : this._decVariavel_)
        {
            e.parent(null);
        }
        this._decVariavel_.clear();

        for(Object obj_e : list)
        {
            PDecVariavel e = (PDecVariavel) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._decVariavel_.add(e);
        }
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    public TReservadaFim getReservadaFim()
    {
        return this._reservadaFim_;
    }

    public void setReservadaFim(TReservadaFim node)
    {
        if(this._reservadaFim_ != null)
        {
            this._reservadaFim_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._reservadaFim_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._reservadaInicio_)
            + toString(this._decVariavel_)
            + toString(this._comando_)
            + toString(this._reservadaFim_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._reservadaInicio_ == child)
        {
            this._reservadaInicio_ = null;
            return;
        }

        if(this._decVariavel_.remove(child))
        {
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        if(this._reservadaFim_ == child)
        {
            this._reservadaFim_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._reservadaInicio_ == oldChild)
        {
            setReservadaInicio((TReservadaInicio) newChild);
            return;
        }

        for(ListIterator<PDecVariavel> i = this._decVariavel_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDecVariavel) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._reservadaFim_ == oldChild)
        {
            setReservadaFim((TReservadaFim) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
