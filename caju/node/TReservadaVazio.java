/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class TReservadaVazio extends Token
{
    public TReservadaVazio()
    {
        super.setText("vazio");
    }

    public TReservadaVazio(int line, int pos)
    {
        super.setText("vazio");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TReservadaVazio(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTReservadaVazio(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TReservadaVazio text.");
    }
}
