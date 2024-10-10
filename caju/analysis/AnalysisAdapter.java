/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.analysis;

import java.util.*;
import caju.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracoesPrograma(ADeclaracoesPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelDeclaracao(AVariavelDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncaoDeclaracao(AFuncaoDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecVariavel(ADecVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaNomes(AListaNomes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaNomesCauda(AListaNomesCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABaseTipo(ABaseTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorTipo(AVetorTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroTipoBase(ANumeroTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereTipoBase(ACaractereTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanoTipoBase(ABooleanoTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorDimensoes(AVetorDimensoes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFuncao(ADecFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoTipoRetorno(ATipoTipoRetorno node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVazioTipoRetorno(AVazioTipoRetorno node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametros(AParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametroCauda(AParametroCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametro(AParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABloco(ABloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaCadaComando(AParaCadaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimplesComando(ASimplesComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoComandoSemSenao(ABlocoComandoSemSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimplesComandoSemSenao(ASimplesComandoSemSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoSenao(AComandoSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoComandoSimples(AAtribuicaoComandoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARetorneComandoSimples(ARetorneComandoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaComandoSimples(AChamadaComandoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExibirComandoSimples(AExibirComandoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALerComandoSimples(ALerComandoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtrib(AAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaAtrib(AListaAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaAtribCauda(AListaAtribCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimplesVar(ASimplesVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarIndexada(AVarIndexada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaVar(AListaVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaVarCauda(AListaVarCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExp(AExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpOu(AExpOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpOuCauda(AExpOuCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpE(AExpE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpECauda(AExpECauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpIgualdade(AExpIgualdade node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpIgualdadeCauda(AExpIgualdadeCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpRelacional(AExpRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorExpRelacionalCauda(AMenorExpRelacionalCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorExpRelacionalCauda(AMaiorExpRelacionalCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorIgualExpRelacionalCauda(AMenorIgualExpRelacionalCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorIgualExpRelacionalCauda(AMaiorIgualExpRelacionalCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpAditiva(AExpAditiva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaExpAditivaCauda(ASomaExpAditivaCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubtracaoExpAditivaCauda(ASubtracaoExpAditivaCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpMultiplicativa(AExpMultiplicativa node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplicacaoExpMultiplicativaCauda(AMultiplicacaoExpMultiplicativaCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivisaoExpMultiplicativaCauda(ADivisaoExpMultiplicativaCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANaoExpUnaria(ANaoExpUnaria node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegativoExpUnaria(ANegativoExpUnaria node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrimariaExpUnaria(APrimariaExpUnaria node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroExpPrimaria(ANumeroExpPrimaria node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereExpPrimaria(ACaractereExpPrimaria node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringExpPrimaria(AStringExpPrimaria node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanoExpPrimaria(ABooleanoExpPrimaria node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarExpPrimaria(AVarExpPrimaria node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaExpPrimaria(AChamadaExpPrimaria node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParentesesExpPrimaria(AParentesesExpPrimaria node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamada(AChamada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExp(AListaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExpCauda(AListaExpCauda node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaCaractere(TReservadaCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaBooleano(TReservadaBooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaNumero(TReservadaNumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaVetor(TReservadaVetor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaRetorne(TReservadaRetorne node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaVazio(TReservadaVazio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaInicio(TReservadaInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaFim(TReservadaFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaSe(TReservadaSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaSenao(TReservadaSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaEnquanto(TReservadaEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaPara(TReservadaPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaParaCada(TReservadaParaCada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaExibir(TReservadaExibir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReservadaLer(TReservadaLer node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentificador(TIdentificador node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBooleano(TBooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumero(TNumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpMais(TOpMais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpMenos(TOpMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpMult(TOpMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpDiv(TOpDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpMaior(TOpMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpMenor(TOpMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpMaiorIgual(TOpMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpMenorIgual(TOpMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpIgual(TOpIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpNao(TOpNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpE(TOpE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpOu(TOpOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpAtribuicao(TOpAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpRetornoFuncao(TOpRetornoFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreParenteses(TAbreParenteses node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaParenteses(TFechaParenteses node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreColchetes(TAbreColchetes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaColchetes(TFechaColchetes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBarraVertical(TBarraVertical node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioLinha(TComentarioLinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioBloco(TComentarioBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVazio(TVazio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
