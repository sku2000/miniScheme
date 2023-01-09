// Generated from java-escape by ANTLR 4.11.1

package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SS2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, MUL=9, 
		SUB=10, ADD=11, AND=12, OR=13, SRA=14, WS=15, LABEL=16, NUMBER=17, INT=18, 
		REG=19, FVAR=20;
	public static final int
		RULE_program = 0, RULE_abstracts = 1, RULE_tail = 2, RULE_effect = 3, 
		RULE_var = 4, RULE_triv = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "abstracts", "tail", "effect", "var", "triv"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'letrec'", "')'", "'['", "'lambda'", "']'", "'begin'", 
			"'set!'", "'*'", "'-'", "'+'", "'logand'", "'logor'", "'sra'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "MUL", "SUB", "ADD", 
			"AND", "OR", "SRA", "WS", "LABEL", "NUMBER", "INT", "REG", "FVAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SS2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public List<AbstractsContext> abstracts() {
			return getRuleContexts(AbstractsContext.class);
		}
		public AbstractsContext abstracts(int i) {
			return getRuleContext(AbstractsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SS2Visitor ) return ((SS2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(13);
			match(T__1);
			setState(14);
			match(T__0);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(15);
				abstracts();
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			match(T__2);
			setState(22);
			tail();
			setState(23);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractsContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(SS2Parser.LABEL, 0); }
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public AbstractsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstracts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).enterAbstracts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).exitAbstracts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SS2Visitor ) return ((SS2Visitor<? extends T>)visitor).visitAbstracts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractsContext abstracts() throws RecognitionException {
		AbstractsContext _localctx = new AbstractsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abstracts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__3);
			setState(26);
			match(LABEL);
			setState(27);
			match(T__0);
			setState(28);
			match(T__4);
			setState(29);
			match(T__0);
			setState(30);
			match(T__2);
			setState(31);
			tail();
			setState(32);
			match(T__2);
			setState(33);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TailContext extends ParserRuleContext {
		public TailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail; }
	 
		public TailContext() { }
		public void copyFrom(TailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SequenceContext extends TailContext {
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public List<EffectContext> effect() {
			return getRuleContexts(EffectContext.class);
		}
		public EffectContext effect(int i) {
			return getRuleContext(EffectContext.class,i);
		}
		public SequenceContext(TailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SS2Visitor ) return ((SS2Visitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImmediateContext extends TailContext {
		public TrivContext triv() {
			return getRuleContext(TrivContext.class,0);
		}
		public ImmediateContext(TailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).enterImmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).exitImmediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SS2Visitor ) return ((SS2Visitor<? extends T>)visitor).visitImmediate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tail);
		try {
			int _alt;
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ImmediateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(T__0);
				setState(36);
				triv();
				setState(37);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new SequenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(T__0);
				setState(40);
				match(T__6);
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(41);
						effect();
						}
						} 
					}
					setState(46);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(47);
				tail();
				setState(48);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EffectContext extends ParserRuleContext {
		public EffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect; }
	 
		public EffectContext() { }
		public void copyFrom(EffectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAssignContext extends EffectContext {
		public Token op;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<TrivContext> triv() {
			return getRuleContexts(TrivContext.class);
		}
		public TrivContext triv(int i) {
			return getRuleContext(TrivContext.class,i);
		}
		public TerminalNode ADD() { return getToken(SS2Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SS2Parser.SUB, 0); }
		public TerminalNode MUL() { return getToken(SS2Parser.MUL, 0); }
		public TerminalNode AND() { return getToken(SS2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(SS2Parser.OR, 0); }
		public TerminalNode SRA() { return getToken(SS2Parser.SRA, 0); }
		public ExpressionAssignContext(EffectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).enterExpressionAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).exitExpressionAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SS2Visitor ) return ((SS2Visitor<? extends T>)visitor).visitExpressionAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectAssignContext extends EffectContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TrivContext triv() {
			return getRuleContext(TrivContext.class,0);
		}
		public DirectAssignContext(EffectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).enterDirectAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).exitDirectAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SS2Visitor ) return ((SS2Visitor<? extends T>)visitor).visitDirectAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_effect);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new DirectAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__0);
				setState(53);
				match(T__7);
				setState(54);
				var();
				setState(55);
				triv();
				setState(56);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new ExpressionAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__0);
				setState(59);
				match(T__7);
				setState(60);
				var();
				setState(61);
				match(T__0);
				setState(62);
				((ExpressionAssignContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0) ) {
					((ExpressionAssignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(63);
				triv();
				setState(64);
				triv();
				setState(65);
				match(T__2);
				setState(66);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode REG() { return getToken(SS2Parser.REG, 0); }
		public TerminalNode FVAR() { return getToken(SS2Parser.FVAR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SS2Visitor ) return ((SS2Visitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==REG || _la==FVAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrivContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(SS2Parser.NUMBER, 0); }
		public TerminalNode LABEL() { return getToken(SS2Parser.LABEL, 0); }
		public TrivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).enterTriv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).exitTriv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SS2Visitor ) return ((SS2Visitor<? extends T>)visitor).visitTriv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrivContext triv() throws RecognitionException {
		TrivContext _localctx = new TrivContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_triv);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REG:
			case FVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				var();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(NUMBER);
				}
				break;
			case LABEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(LABEL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014N\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0011\b\u0000\n\u0000\f\u0000\u0014\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002+\b\u0002\n\u0002\f\u0002.\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00023\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003E\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005L\b\u0005\u0001\u0005"+
		"\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0002\u0001\u0000"+
		"\t\u000e\u0001\u0000\u0013\u0014M\u0000\f\u0001\u0000\u0000\u0000\u0002"+
		"\u0019\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u0006D\u0001"+
		"\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000"+
		"\f\r\u0005\u0001\u0000\u0000\r\u000e\u0005\u0002\u0000\u0000\u000e\u0012"+
		"\u0005\u0001\u0000\u0000\u000f\u0011\u0003\u0002\u0001\u0000\u0010\u000f"+
		"\u0001\u0000\u0000\u0000\u0011\u0014\u0001\u0000\u0000\u0000\u0012\u0010"+
		"\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0015"+
		"\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0005\u0003\u0000\u0000\u0016\u0017\u0003\u0004\u0002\u0000\u0017\u0018"+
		"\u0005\u0003\u0000\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005\u0004\u0000\u0000\u001a\u001b\u0005\u0010\u0000\u0000\u001b\u001c"+
		"\u0005\u0001\u0000\u0000\u001c\u001d\u0005\u0005\u0000\u0000\u001d\u001e"+
		"\u0005\u0001\u0000\u0000\u001e\u001f\u0005\u0003\u0000\u0000\u001f \u0003"+
		"\u0004\u0002\u0000 !\u0005\u0003\u0000\u0000!\"\u0005\u0006\u0000\u0000"+
		"\"\u0003\u0001\u0000\u0000\u0000#$\u0005\u0001\u0000\u0000$%\u0003\n\u0005"+
		"\u0000%&\u0005\u0003\u0000\u0000&3\u0001\u0000\u0000\u0000\'(\u0005\u0001"+
		"\u0000\u0000(,\u0005\u0007\u0000\u0000)+\u0003\u0006\u0003\u0000*)\u0001"+
		"\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000/0\u0003\u0004\u0002\u000001\u0005\u0003\u0000\u000013\u0001\u0000"+
		"\u0000\u00002#\u0001\u0000\u0000\u00002\'\u0001\u0000\u0000\u00003\u0005"+
		"\u0001\u0000\u0000\u000045\u0005\u0001\u0000\u000056\u0005\b\u0000\u0000"+
		"67\u0003\b\u0004\u000078\u0003\n\u0005\u000089\u0005\u0003\u0000\u0000"+
		"9E\u0001\u0000\u0000\u0000:;\u0005\u0001\u0000\u0000;<\u0005\b\u0000\u0000"+
		"<=\u0003\b\u0004\u0000=>\u0005\u0001\u0000\u0000>?\u0007\u0000\u0000\u0000"+
		"?@\u0003\n\u0005\u0000@A\u0003\n\u0005\u0000AB\u0005\u0003\u0000\u0000"+
		"BC\u0005\u0003\u0000\u0000CE\u0001\u0000\u0000\u0000D4\u0001\u0000\u0000"+
		"\u0000D:\u0001\u0000\u0000\u0000E\u0007\u0001\u0000\u0000\u0000FG\u0007"+
		"\u0001\u0000\u0000G\t\u0001\u0000\u0000\u0000HL\u0003\b\u0004\u0000IL"+
		"\u0005\u0011\u0000\u0000JL\u0005\u0010\u0000\u0000KH\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\u000b\u0001"+
		"\u0000\u0000\u0000\u0005\u0012,2DK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}