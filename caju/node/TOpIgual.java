/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class TOpIgual extends Token
{
    public TOpIgual()
    {
        super.setText("=");
    }

    public TOpIgual(int line, int pos)
    {
        super.setText("=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOpIgual(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOpIgual(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TOpIgual text.");
    }
}
