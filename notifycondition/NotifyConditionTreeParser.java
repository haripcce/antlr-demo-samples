// $ANTLR 2.7.7 (20060906): "NotifyCondition.g" -> "NotifyConditionTreeParser.java"$

    

import antlr.TreeParser;
import antlr.Token;
import antlr.collections.AST;
import antlr.RecognitionException;
import antlr.ANTLRException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.collections.impl.BitSet;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;


public class NotifyConditionTreeParser extends antlr.TreeParser       implements NotifyConditionLexerTokenTypes
 {
public NotifyConditionTreeParser() {
	tokenNames = _tokenNames;
}

	public final void cond(AST _t) throws RecognitionException {
		
		AST cond_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		try {      // for error handling
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LITERAL_and:
			{
				AST __t21 = _t;
				AST tmp14_AST_in = (AST)_t;
				match(_t,LITERAL_and);
				_t = _t.getFirstChild();
				cond(_t);
				_t = _retTree;
				cond(_t);
				_t = _retTree;
				_t = __t21;
				_t = _t.getNextSibling();
				break;
			}
			case LITERAL_or:
			{
				AST __t22 = _t;
				AST tmp15_AST_in = (AST)_t;
				match(_t,LITERAL_or);
				_t = _t.getFirstChild();
				cond(_t);
				_t = _retTree;
				cond(_t);
				_t = _retTree;
				_t = __t22;
				_t = _t.getNextSibling();
				break;
			}
			case LITERAL_not:
			{
				AST __t23 = _t;
				AST tmp16_AST_in = (AST)_t;
				match(_t,LITERAL_not);
				_t = _t.getFirstChild();
				cond(_t);
				_t = _retTree;
				_t = __t23;
				_t = _t.getNextSibling();
				break;
			}
			case LITERAL_true:
			case LITERAL_false:
			case LITERAL_success:
			case LITERAL_failure:
			case LITERAL_error:
			case LITERAL_changed:
			case 18:
			case 19:
			{
				condition(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
	}
	
	public final void condition(AST _t) throws RecognitionException {
		
		AST condition_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		try {      // for error handling
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LITERAL_true:
			{
				AST tmp17_AST_in = (AST)_t;
				match(_t,LITERAL_true);
				_t = _t.getNextSibling();
				break;
			}
			case LITERAL_false:
			{
				AST tmp18_AST_in = (AST)_t;
				match(_t,LITERAL_false);
				_t = _t.getNextSibling();
				break;
			}
			case LITERAL_success:
			{
				AST tmp19_AST_in = (AST)_t;
				match(_t,LITERAL_success);
				_t = _t.getNextSibling();
				break;
			}
			case LITERAL_failure:
			{
				AST tmp20_AST_in = (AST)_t;
				match(_t,LITERAL_failure);
				_t = _t.getNextSibling();
				break;
			}
			case LITERAL_error:
			{
				AST tmp21_AST_in = (AST)_t;
				match(_t,LITERAL_error);
				_t = _t.getNextSibling();
				break;
			}
			case LITERAL_changed:
			{
				AST tmp22_AST_in = (AST)_t;
				match(_t,LITERAL_changed);
				_t = _t.getNextSibling();
				break;
			}
			case 18:
			{
				AST tmp23_AST_in = (AST)_t;
				match(_t,18);
				_t = _t.getNextSibling();
				break;
			}
			case 19:
			{
				AST tmp24_AST_in = (AST)_t;
				match(_t,19);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"WORD",
		"INT",
		"LEFT_PAREN",
		"RIGHT_PAREN",
		"WHITESPACE",
		"\"or\"",
		"\"and\"",
		"\"not\"",
		"\"true\"",
		"\"false\"",
		"\"success\"",
		"\"failure\"",
		"\"error\"",
		"\"changed\"",
		"\"changed.by.me\"",
		"\"state.change\""
	};
	
	}
	
