/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class TOpAtribuicao extends Token
{
    public TOpAtribuicao()
    {
        super.setText(":=");
    }

    public TOpAtribuicao(int line, int pos)
    {
        super.setText(":=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOpAtribuicao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOpAtribuicao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TOpAtribuicao text.");
    }
}
