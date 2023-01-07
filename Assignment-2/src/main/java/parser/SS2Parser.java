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
		SUB=10, ADD=11, AND=12, OR=13, SRA=14, LABEL=15, NUMBER=16, INT=17, REG=18, 
		FVAR=19;
	public static final int
		RULE_program = 0, RULE_tail = 1, RULE_effect = 2, RULE_var = 3, RULE_triv = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "tail", "effect", "var", "triv"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'letrec'", "'['", "'lambda'", "')'", "']'", "'begin'", 
			"'set!'", "'*'", "'-'", "'+'", "'logand'", "'logor'", "'sra'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "MUL", "SUB", "ADD", 
			"AND", "OR", "SRA", "LABEL", "NUMBER", "INT", "REG", "FVAR"
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
		public List<TailContext> tail() {
			return getRuleContexts(TailContext.class);
		}
		public TailContext tail(int i) {
			return getRuleContext(TailContext.class,i);
		}
		public List<TerminalNode> LABEL() { return getTokens(SS2Parser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(SS2Parser.LABEL, i);
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
			setState(10);
			match(T__0);
			setState(11);
			match(T__1);
			setState(12);
			match(T__0);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(13);
				match(T__2);
				setState(14);
				match(LABEL);
				setState(15);
				match(T__0);
				setState(16);
				match(T__3);
				setState(17);
				match(T__0);
				setState(18);
				match(T__4);
				setState(19);
				tail();
				setState(20);
				match(T__4);
				setState(21);
				match(T__5);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(T__4);
			setState(29);
			tail();
			setState(30);
			match(T__4);
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
		public TrivContext triv() {
			return getRuleContext(TrivContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public List<EffectContext> effect() {
			return getRuleContexts(EffectContext.class);
		}
		public EffectContext effect(int i) {
			return getRuleContext(EffectContext.class,i);
		}
		public TailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).enterTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).exitTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SS2Visitor ) return ((SS2Visitor<? extends T>)visitor).visitTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tail);
		try {
			int _alt;
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(T__0);
				setState(33);
				triv();
				setState(34);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(T__0);
				setState(37);
				match(T__6);
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(38);
						effect();
						}
						} 
					}
					setState(43);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(44);
				tail();
				setState(45);
				match(T__4);
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
		public EffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).enterEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SS2Listener ) ((SS2Listener)listener).exitEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SS2Visitor ) return ((SS2Visitor<? extends T>)visitor).visitEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_effect);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__0);
				setState(50);
				match(T__7);
				setState(51);
				var();
				setState(52);
				triv();
				setState(53);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(T__0);
				setState(56);
				match(T__7);
				setState(57);
				var();
				setState(58);
				match(T__0);
				setState(59);
				((EffectContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0) ) {
					((EffectContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(60);
				triv();
				setState(61);
				triv();
				setState(62);
				match(T__4);
				setState(63);
				match(T__4);
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
		enterRule(_localctx, 6, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
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
		enterRule(_localctx, 8, RULE_triv);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REG:
			case FVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				var();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(NUMBER);
				}
				break;
			case LABEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
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
		"\u0004\u0001\u0013K\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001(\b\u0001"+
		"\n\u0001\f\u0001+\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"0\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"B\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004I\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004"+
		"\u0006\b\u0000\u0002\u0001\u0000\t\u000e\u0001\u0000\u0012\u0013K\u0000"+
		"\n\u0001\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u0004A\u0001"+
		"\u0000\u0000\u0000\u0006C\u0001\u0000\u0000\u0000\bH\u0001\u0000\u0000"+
		"\u0000\n\u000b\u0005\u0001\u0000\u0000\u000b\f\u0005\u0002\u0000\u0000"+
		"\f\u0019\u0005\u0001\u0000\u0000\r\u000e\u0005\u0003\u0000\u0000\u000e"+
		"\u000f\u0005\u000f\u0000\u0000\u000f\u0010\u0005\u0001\u0000\u0000\u0010"+
		"\u0011\u0005\u0004\u0000\u0000\u0011\u0012\u0005\u0001\u0000\u0000\u0012"+
		"\u0013\u0005\u0005\u0000\u0000\u0013\u0014\u0003\u0002\u0001\u0000\u0014"+
		"\u0015\u0005\u0005\u0000\u0000\u0015\u0016\u0005\u0006\u0000\u0000\u0016"+
		"\u0018\u0001\u0000\u0000\u0000\u0017\r\u0001\u0000\u0000\u0000\u0018\u001b"+
		"\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0001\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0019"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0005\u0000\u0000\u001d\u001e"+
		"\u0003\u0002\u0001\u0000\u001e\u001f\u0005\u0005\u0000\u0000\u001f\u0001"+
		"\u0001\u0000\u0000\u0000 !\u0005\u0001\u0000\u0000!\"\u0003\b\u0004\u0000"+
		"\"#\u0005\u0005\u0000\u0000#0\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000"+
		"\u0000%)\u0005\u0007\u0000\u0000&(\u0003\u0004\u0002\u0000\'&\u0001\u0000"+
		"\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000"+
		",-\u0003\u0002\u0001\u0000-.\u0005\u0005\u0000\u0000.0\u0001\u0000\u0000"+
		"\u0000/ \u0001\u0000\u0000\u0000/$\u0001\u0000\u0000\u00000\u0003\u0001"+
		"\u0000\u0000\u000012\u0005\u0001\u0000\u000023\u0005\b\u0000\u000034\u0003"+
		"\u0006\u0003\u000045\u0003\b\u0004\u000056\u0005\u0005\u0000\u00006B\u0001"+
		"\u0000\u0000\u000078\u0005\u0001\u0000\u000089\u0005\b\u0000\u00009:\u0003"+
		"\u0006\u0003\u0000:;\u0005\u0001\u0000\u0000;<\u0007\u0000\u0000\u0000"+
		"<=\u0003\b\u0004\u0000=>\u0003\b\u0004\u0000>?\u0005\u0005\u0000\u0000"+
		"?@\u0005\u0005\u0000\u0000@B\u0001\u0000\u0000\u0000A1\u0001\u0000\u0000"+
		"\u0000A7\u0001\u0000\u0000\u0000B\u0005\u0001\u0000\u0000\u0000CD\u0007"+
		"\u0001\u0000\u0000D\u0007\u0001\u0000\u0000\u0000EI\u0003\u0006\u0003"+
		"\u0000FI\u0005\u0010\u0000\u0000GI\u0005\u000f\u0000\u0000HE\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000I\t\u0001"+
		"\u0000\u0000\u0000\u0005\u0019)/AH";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}