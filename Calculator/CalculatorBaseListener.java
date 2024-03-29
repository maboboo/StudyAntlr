// Generated from /Users/mayanbo/study/StudyAntlr/Calculator/Calculator.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

/**
 * This class provides an empty implementation of {@link CalculatorListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CalculatorBaseListener implements CalculatorListener {

    private Stack<Double> st = new Stack<>();

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    int result;

    @Override
    public void enterProg(CalculatorParser.ProgContext ctx) {
//		Log.debug("enterProg");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProg(CalculatorParser.ProgContext ctx) {
        String result = String.valueOf(st.pop());
        Log.debug("exitProg result is: " + result);
        Log.info("=" + result);

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterPrintExpr(CalculatorParser.PrintExprContext ctx) {
//		Log.debug("enterPrintExpr");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitPrintExpr(CalculatorParser.PrintExprContext ctx) {
//		Log.debug("exitPrintExpr");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAssign(CalculatorParser.AssignContext ctx) {
//		Log.debug("enterAssign");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAssign(CalculatorParser.AssignContext ctx) {
//		Log.debug("exitAssign");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBlank(CalculatorParser.BlankContext ctx) {
//		Log.debug("enterBlank");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBlank(CalculatorParser.BlankContext ctx) {
//		Log.debug("exitBlank");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterParens(CalculatorParser.ParensContext ctx) {
//		Log.debug("enterParens");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitParens(CalculatorParser.ParensContext ctx) {
//		Log.debug("exitParens");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMulDiv(CalculatorParser.MulDivContext ctx) {
        Log.debug("enterMulDiv");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMulDiv(CalculatorParser.MulDivContext ctx) {
        Log.debug("exitMulDiv");
        Double b = st.pop();
        Double a = st.pop();
        if ((b != null) && (a != null)) {
            if (ctx.op.getType() == CalculatorParser.MUL) {
                st.push(a * b);
            }
            else if (ctx.op.getType() == CalculatorParser.DIV) {
                st.push(a / b);
            }
        }
        Log.debug(String.valueOf(a) + ctx.op.getText() + String.valueOf(b));
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAddSub(CalculatorParser.AddSubContext ctx) {
//        if (ctx.op.getType() == CalculatorParser.ADD) {
//            Log.debug("enterAdd");
//        } else if (ctx.op.getType() == CalculatorParser.SUB) {
//            Log.debug("enterSub");
//
//        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAddSub(CalculatorParser.AddSubContext ctx) {
        Double b = st.pop();
        Double a = st.pop();
        if ((b != null) && (a != null)) {
            if (ctx.op.getType() == CalculatorParser.ADD) {
                st.push(a + b);
            }
            else if (ctx.op.getType() == CalculatorParser.SUB) {
                st.push(a - b);
            }
        }
        Log.debug(String.valueOf(a) + ctx.op.getText() + String.valueOf(b));

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterId(CalculatorParser.IdContext ctx) {
        Log.debug("enterId");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitId(CalculatorParser.IdContext ctx) {
        Log.debug("exitId");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInt(CalculatorParser.IntContext ctx) {
//		Log.debug("enterInt");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInt(CalculatorParser.IntContext ctx) {
        Log.debug("exitInt:" + ctx.INT().getText());
        st.push(Double.valueOf(ctx.INT().getText()));

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
//		Log.debug("enterEveryRule");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
//		Log.debug("exitEveryRule");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {
//		Log.debug("visitTerminal");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
        Log.debug("visitErrorNode");

    }
}