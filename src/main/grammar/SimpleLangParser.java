// Generated from c:/Users/User/Desktop/TERM 6/PLC/my CAs/CA2/template/src/main/grammar/SimpleLang.g4 by ANTLR 4.13.1

    package main.grammar;
    import main.ast.core.*;
    import main.ast.declarations.*;
    import main.ast.declarations.Module;
    import main.ast.statements.*;
    import main.ast.expressions.*;
    import main.ast.expressions.literals.*;
    import main.ast.types.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_MODULE=1, KW_STRUCT=2, KW_INCLUDES=3, KW_BEGIN=4, KW_END=5, KW_PUBLIC=6, 
		KW_PRIVATE=7, KW_INT=8, KW_FLOAT=9, KW_DOUBLE=10, KW_CHAR=11, KW_VOID=12, 
		KW_IF=13, KW_ELSE=14, KW_FOR=15, KW_WHILE=16, KW_DO=17, KW_RETURN=18, 
		KW_INPUT=19, KW_OUTPUT=20, KW_THIS=21, KW_NOT=22, KW_AND=23, KW_OR=24, 
		KW_MUT=25, KW_BREAK=26, KW_CONTINUE=27, KW_BOOL=28, CONSTBOOL=29, SEMI=30, 
		COMMA=31, LPAREN=32, RPAREN=33, LBRACK=34, RBRACK=35, ASSIGN=36, DOT=37, 
		ARROW=38, MINUS=39, PLUS=40, STAR=41, SLASH=42, AMPERSAND=43, LESS=44, 
		GREATER=45, LESS_EQ=46, GREATER_EQ=47, EQUAL=48, NOT_EQUAL=49, CONSTINT=50, 
		CONSTFLOAT=51, CONSTDOUBLE=52, CONSTCHAR=53, ID=54, WS=55, COMMENT=56, 
		MULTICOMMENT=57;
	public static final int
		RULE_program = 0, RULE_topLevelDecl = 1, RULE_module = 2, RULE_structDef = 3, 
		RULE_member = 4, RULE_accessModifier = 5, RULE_method_decl = 6, RULE_arguments = 7, 
		RULE_parameter = 8, RULE_type = 9, RULE_vardecl = 10, RULE_cons = 11, 
		RULE_block = 12, RULE_st = 13, RULE_jumpStmt = 14, RULE_ifStmt = 15, RULE_forStmt = 16, 
		RULE_whileStmt = 17, RULE_assignStmt = 18, RULE_returnStmt = 19, RULE_inputStmt = 20, 
		RULE_outputStmt = 21, RULE_loc = 22, RULE_simpleLoc = 23, RULE_memberLoc = 24, 
		RULE_thisLoc = 25, RULE_methodcall = 26, RULE_expr = 27, RULE_initexpr = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "topLevelDecl", "module", "structDef", "member", "accessModifier", 
			"method_decl", "arguments", "parameter", "type", "vardecl", "cons", "block", 
			"st", "jumpStmt", "ifStmt", "forStmt", "whileStmt", "assignStmt", "returnStmt", 
			"inputStmt", "outputStmt", "loc", "simpleLoc", "memberLoc", "thisLoc", 
			"methodcall", "expr", "initexpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'module'", "'struct'", "'includes'", "'begin'", "'end'", "'public'", 
			"'private'", "'int'", "'float'", "'double'", "'char'", "'void'", "'if'", 
			"'else'", "'for'", "'while'", "'do'", "'return'", "'input'", "'output'", 
			"'this'", "'not'", "'and'", "'or'", "'mut'", "'break'", "'continue'", 
			"'bool'", null, "';'", "','", "'('", "')'", "'['", "']'", "'='", "'.'", 
			"'->'", "'-'", "'+'", "'*'", "'/'", "'&'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KW_MODULE", "KW_STRUCT", "KW_INCLUDES", "KW_BEGIN", "KW_END", 
			"KW_PUBLIC", "KW_PRIVATE", "KW_INT", "KW_FLOAT", "KW_DOUBLE", "KW_CHAR", 
			"KW_VOID", "KW_IF", "KW_ELSE", "KW_FOR", "KW_WHILE", "KW_DO", "KW_RETURN", 
			"KW_INPUT", "KW_OUTPUT", "KW_THIS", "KW_NOT", "KW_AND", "KW_OR", "KW_MUT", 
			"KW_BREAK", "KW_CONTINUE", "KW_BOOL", "CONSTBOOL", "SEMI", "COMMA", "LPAREN", 
			"RPAREN", "LBRACK", "RBRACK", "ASSIGN", "DOT", "ARROW", "MINUS", "PLUS", 
			"STAR", "SLASH", "AMPERSAND", "LESS", "GREATER", "LESS_EQ", "GREATER_EQ", 
			"EQUAL", "NOT_EQUAL", "CONSTINT", "CONSTFLOAT", "CONSTDOUBLE", "CONSTCHAR", 
			"ID", "WS", "COMMENT", "MULTICOMMENT"
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
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public TopLevelDeclContext currentDecl;
		public TerminalNode EOF() { return getToken(SimpleLangParser.EOF, 0); }
		public List<TopLevelDeclContext> topLevelDecl() {
			return getRuleContexts(TopLevelDeclContext.class);
		}
		public TopLevelDeclContext topLevelDecl(int i) {
			return getRuleContext(TopLevelDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProgram(this);
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
			 ((ProgramContext)_localctx).programRet =  new Program(); 
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_MODULE || _la==KW_STRUCT) {
				{
				{
				setState(59);
				((ProgramContext)_localctx).currentDecl = topLevelDecl();
				 _localctx.programRet.addTopLevelDeclaration(((ProgramContext)_localctx).currentDecl.topLevelDeclRet); 
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(EOF);
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
	public static class TopLevelDeclContext extends ParserRuleContext {
		public TopLevelDecl topLevelDeclRet;
		public ModuleContext moduleNode;
		public StructDefContext structNode;
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public StructDefContext structDef() {
			return getRuleContext(StructDefContext.class,0);
		}
		public TopLevelDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTopLevelDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTopLevelDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTopLevelDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelDeclContext topLevelDecl() throws RecognitionException {
		TopLevelDeclContext _localctx = new TopLevelDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topLevelDecl);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MODULE:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				((TopLevelDeclContext)_localctx).moduleNode = module();
				 ((TopLevelDeclContext)_localctx).topLevelDeclRet =  ((TopLevelDeclContext)_localctx).moduleNode.moduleRet; 
				}
				break;
			case KW_STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				((TopLevelDeclContext)_localctx).structNode = structDef();
				 ((TopLevelDeclContext)_localctx).topLevelDeclRet =  ((TopLevelDeclContext)_localctx).structNode.structRet; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleContext extends ParserRuleContext {
		public Module moduleRet;
		public Token moduleIdent;
		public Token incId1;
		public Token incId2;
		public MemberContext currentMember;
		public TerminalNode KW_MODULE() { return getToken(SimpleLangParser.KW_MODULE, 0); }
		public TerminalNode KW_BEGIN() { return getToken(SimpleLangParser.KW_BEGIN, 0); }
		public TerminalNode KW_END() { return getToken(SimpleLangParser.KW_END, 0); }
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public TerminalNode KW_INCLUDES() { return getToken(SimpleLangParser.KW_INCLUDES, 0); }
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(KW_MODULE);
			setState(78);
			((ModuleContext)_localctx).moduleIdent = match(ID);
			 
			          ((ModuleContext)_localctx).moduleRet =  new Module(new Identifier((((ModuleContext)_localctx).moduleIdent!=null?((ModuleContext)_localctx).moduleIdent.getText():null)));
			          _localctx.moduleRet.setLine((((ModuleContext)_localctx).moduleIdent!=null?((ModuleContext)_localctx).moduleIdent.getLine():0)); 
			        
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_INCLUDES) {
				{
				setState(80);
				match(KW_INCLUDES);
				setState(81);
				((ModuleContext)_localctx).incId1 = match(ID);
				 _localctx.moduleRet.addInclude(new Identifier((((ModuleContext)_localctx).incId1!=null?((ModuleContext)_localctx).incId1.getText():null))); 
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(83);
					match(COMMA);
					setState(84);
					((ModuleContext)_localctx).incId2 = match(ID);
					 _localctx.moduleRet.addInclude(new Identifier((((ModuleContext)_localctx).incId2!=null?((ModuleContext)_localctx).incId2.getText():null))); 
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(93);
			match(KW_BEGIN);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014398811480000L) != 0)) {
				{
				{
				setState(94);
				((ModuleContext)_localctx).currentMember = member();
				 _localctx.moduleRet.addMember(((ModuleContext)_localctx).currentMember.memberRet); 
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(KW_END);
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
	public static class StructDefContext extends ParserRuleContext {
		public Struct structRet;
		public Token structIdent;
		public MemberContext currentMember;
		public TerminalNode KW_STRUCT() { return getToken(SimpleLangParser.KW_STRUCT, 0); }
		public TerminalNode KW_BEGIN() { return getToken(SimpleLangParser.KW_BEGIN, 0); }
		public TerminalNode KW_END() { return getToken(SimpleLangParser.KW_END, 0); }
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public StructDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStructDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStructDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStructDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefContext structDef() throws RecognitionException {
		StructDefContext _localctx = new StructDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(KW_STRUCT);
			setState(105);
			((StructDefContext)_localctx).structIdent = match(ID);
			 
			          ((StructDefContext)_localctx).structRet =  new Struct(new Identifier((((StructDefContext)_localctx).structIdent!=null?((StructDefContext)_localctx).structIdent.getText():null)));
			          _localctx.structRet.setLine((((StructDefContext)_localctx).structIdent!=null?((StructDefContext)_localctx).structIdent.getLine():0)); 
			        
			setState(107);
			match(KW_BEGIN);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014398811480000L) != 0)) {
				{
				{
				setState(108);
				((StructDefContext)_localctx).currentMember = member();
				 _localctx.structRet.addMember(((StructDefContext)_localctx).currentMember.memberRet); 
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(KW_END);
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
	public static class MemberContext extends ParserRuleContext {
		public Member memberRet;
		public AccessModifierContext accessKind;
		public Method_declContext targetMethod;
		public VardeclContext targetVar;
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public Method_declContext method_decl() {
			return getRuleContext(Method_declContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimpleLangParser.SEMI, 0); }
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_member);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((MemberContext)_localctx).accessKind = accessModifier();
				setState(119);
				((MemberContext)_localctx).targetMethod = method_decl();

				            MethodDecl methodDeclarationWrapper = new MethodDecl();
				            methodDeclarationWrapper.setMethod(((MemberContext)_localctx).targetMethod.methodRet);
				            methodDeclarationWrapper.setAccessModifier(((MemberContext)_localctx).accessKind.accessModifierRet);
				            ((MemberContext)_localctx).memberRet =  methodDeclarationWrapper;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				((MemberContext)_localctx).targetMethod = method_decl();

				            MethodDecl methodDeclarationWrapper = new MethodDecl();
				            methodDeclarationWrapper.setMethod(((MemberContext)_localctx).targetMethod.methodRet);
				            ((MemberContext)_localctx).memberRet =  methodDeclarationWrapper;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				((MemberContext)_localctx).accessKind = accessModifier();
				setState(126);
				((MemberContext)_localctx).targetVar = vardecl();
				setState(127);
				match(SEMI);

				            VarDecl variableDeclarationWrapper = new VarDecl();
				            variableDeclarationWrapper.setVar(((MemberContext)_localctx).targetVar.varRet);
				            variableDeclarationWrapper.setAccessModifier(((MemberContext)_localctx).accessKind.accessModifierRet);
				            ((MemberContext)_localctx).memberRet =  variableDeclarationWrapper;
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				((MemberContext)_localctx).targetVar = vardecl();
				setState(131);
				match(SEMI);

				            VarDecl variableDeclarationWrapper = new VarDecl();
				            variableDeclarationWrapper.setVar(((MemberContext)_localctx).targetVar.varRet);
				            ((MemberContext)_localctx).memberRet =  variableDeclarationWrapper;
				        
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
	public static class AccessModifierContext extends ParserRuleContext {
		public AccessModifier accessModifierRet;
		public TerminalNode KW_PRIVATE() { return getToken(SimpleLangParser.KW_PRIVATE, 0); }
		public TerminalNode KW_PUBLIC() { return getToken(SimpleLangParser.KW_PUBLIC, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_accessModifier);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PRIVATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(KW_PRIVATE);
				 ((AccessModifierContext)_localctx).accessModifierRet =  AccessModifier.PRIVATE; 
				}
				break;
			case KW_PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(KW_PUBLIC);
				 ((AccessModifierContext)_localctx).accessModifierRet =  AccessModifier.PUBLIC; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_declContext extends ParserRuleContext {
		public Method methodRet;
		public TypeContext returnType;
		public Token methodIdent;
		public ArgumentsContext methodArgs;
		public BlockContext methodBody;
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitMethod_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitMethod_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_method_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((Method_declContext)_localctx).returnType = type();
			setState(143);
			((Method_declContext)_localctx).methodIdent = match(ID);
			setState(144);
			match(LPAREN);
			setState(145);
			((Method_declContext)_localctx).methodArgs = arguments();
			setState(146);
			match(RPAREN);
			setState(147);
			((Method_declContext)_localctx).methodBody = block();
			 
			          ((Method_declContext)_localctx).methodRet =  new Method(((Method_declContext)_localctx).returnType.typeRet, new Identifier((((Method_declContext)_localctx).methodIdent!=null?((Method_declContext)_localctx).methodIdent.getText():null)), ((Method_declContext)_localctx).methodArgs.parametersRet, ((Method_declContext)_localctx).methodBody.blockRet);
			          _localctx.methodRet.setLine((((Method_declContext)_localctx).methodIdent!=null?((Method_declContext)_localctx).methodIdent.getLine():0)); 
			        
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
	public static class ArgumentsContext extends ParserRuleContext {
		public List<Parameter> parametersRet;
		public ParameterContext p1;
		public ParameterContext p2;
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArgumentsContext)_localctx).parametersRet =  new ArrayList<>(); 
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014398811479808L) != 0)) {
				{
				setState(151);
				((ArgumentsContext)_localctx).p1 = parameter();
				 _localctx.parametersRet.add(((ArgumentsContext)_localctx).p1.parameterRet); 
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(153);
					match(COMMA);
					setState(154);
					((ArgumentsContext)_localctx).p2 = parameter();
					 _localctx.parametersRet.add(((ArgumentsContext)_localctx).p2.parameterRet); 
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
	public static class ParameterContext extends ParserRuleContext {
		public Parameter parameterRet;
		public TypeContext paramType;
		public Token paramIdent;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TerminalNode KW_MUT() { return getToken(SimpleLangParser.KW_MUT, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean parameterIsMutable = false; 
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(165);
				match(KW_MUT);
				 parameterIsMutable = true; 
				}
			}

			setState(169);
			((ParameterContext)_localctx).paramType = type();
			setState(170);
			((ParameterContext)_localctx).paramIdent = match(ID);
			 
			          ((ParameterContext)_localctx).parameterRet =  new Parameter(parameterIsMutable, ((ParameterContext)_localctx).paramType.typeRet, new Identifier((((ParameterContext)_localctx).paramIdent!=null?((ParameterContext)_localctx).paramIdent.getText():null)));
			          _localctx.parameterRet.setLine((((ParameterContext)_localctx).paramIdent!=null?((ParameterContext)_localctx).paramIdent.getLine():0)); 
			        
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
	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public Token KW_INT;
		public Token KW_FLOAT;
		public Token KW_DOUBLE;
		public Token KW_CHAR;
		public Token KW_BOOL;
		public Token KW_VOID;
		public Token customTypeName;
		public TerminalNode KW_INT() { return getToken(SimpleLangParser.KW_INT, 0); }
		public TerminalNode KW_FLOAT() { return getToken(SimpleLangParser.KW_FLOAT, 0); }
		public TerminalNode KW_DOUBLE() { return getToken(SimpleLangParser.KW_DOUBLE, 0); }
		public TerminalNode KW_CHAR() { return getToken(SimpleLangParser.KW_CHAR, 0); }
		public TerminalNode KW_BOOL() { return getToken(SimpleLangParser.KW_BOOL, 0); }
		public TerminalNode KW_VOID() { return getToken(SimpleLangParser.KW_VOID, 0); }
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				((TypeContext)_localctx).KW_INT = match(KW_INT);
				 ((TypeContext)_localctx).typeRet =  new IntType(); _localctx.typeRet.setLine((((TypeContext)_localctx).KW_INT!=null?((TypeContext)_localctx).KW_INT.getLine():0)); 
				}
				break;
			case KW_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				((TypeContext)_localctx).KW_FLOAT = match(KW_FLOAT);
				 ((TypeContext)_localctx).typeRet =  new FloatType(); _localctx.typeRet.setLine((((TypeContext)_localctx).KW_FLOAT!=null?((TypeContext)_localctx).KW_FLOAT.getLine():0)); 
				}
				break;
			case KW_DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				((TypeContext)_localctx).KW_DOUBLE = match(KW_DOUBLE);
				 ((TypeContext)_localctx).typeRet =  new DoubleType(); _localctx.typeRet.setLine((((TypeContext)_localctx).KW_DOUBLE!=null?((TypeContext)_localctx).KW_DOUBLE.getLine():0)); 
				}
				break;
			case KW_CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				((TypeContext)_localctx).KW_CHAR = match(KW_CHAR);
				 ((TypeContext)_localctx).typeRet =  new CharType(); _localctx.typeRet.setLine((((TypeContext)_localctx).KW_CHAR!=null?((TypeContext)_localctx).KW_CHAR.getLine():0)); 
				}
				break;
			case KW_BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				((TypeContext)_localctx).KW_BOOL = match(KW_BOOL);
				 ((TypeContext)_localctx).typeRet =  new BoolType(); _localctx.typeRet.setLine((((TypeContext)_localctx).KW_BOOL!=null?((TypeContext)_localctx).KW_BOOL.getLine():0)); 
				}
				break;
			case KW_VOID:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				((TypeContext)_localctx).KW_VOID = match(KW_VOID);
				 ((TypeContext)_localctx).typeRet =  new VoidType(); _localctx.typeRet.setLine((((TypeContext)_localctx).KW_VOID!=null?((TypeContext)_localctx).KW_VOID.getLine():0)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				((TypeContext)_localctx).customTypeName = match(ID);
				 ((TypeContext)_localctx).typeRet =  new StructType(new Identifier((((TypeContext)_localctx).customTypeName!=null?((TypeContext)_localctx).customTypeName.getText():null))); _localctx.typeRet.setLine((((TypeContext)_localctx).customTypeName!=null?((TypeContext)_localctx).customTypeName.getLine():0)); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class VardeclContext extends ParserRuleContext {
		public Var varRet;
		public TypeContext varType;
		public ConsContext varCons;
		public Token varIdent;
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TerminalNode KW_MUT() { return getToken(SimpleLangParser.KW_MUT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConsContext cons() {
			return getRuleContext(ConsContext.class,0);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitVardecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean varIsMutable = false; 
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(190);
				match(KW_MUT);
				 varIsMutable = true; 
				}
			}

			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(194);
				((VardeclContext)_localctx).varType = type();
				 ((VardeclContext)_localctx).varRet =  new Var(varIsMutable, ((VardeclContext)_localctx).varType.typeRet); 
				}
				break;
			case 2:
				{
				setState(197);
				((VardeclContext)_localctx).varCons = cons();
				 ((VardeclContext)_localctx).varRet =  new Var(varIsMutable, ((VardeclContext)_localctx).varCons.constructorCallRet); 
				}
				break;
			}
			setState(202);
			((VardeclContext)_localctx).varIdent = match(ID);
			 
			          _localctx.varRet.setName(new Identifier((((VardeclContext)_localctx).varIdent!=null?((VardeclContext)_localctx).varIdent.getText():null)));
			          _localctx.varRet.setLine((((VardeclContext)_localctx).varIdent!=null?((VardeclContext)_localctx).varIdent.getLine():0)); 
			        
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
	public static class ConsContext extends ParserRuleContext {
		public ConstructorCall constructorCallRet;
		public Token classIdent;
		public ExprContext arg1;
		public ExprContext arg2;
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public ConsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsContext cons() throws RecognitionException {
		ConsContext _localctx = new ConsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			((ConsContext)_localctx).classIdent = match(ID);
			 ((ConsContext)_localctx).constructorCallRet =  new ConstructorCall(new Identifier((((ConsContext)_localctx).classIdent!=null?((ConsContext)_localctx).classIdent.getText():null))); 
			setState(207);
			match(LPAREN);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34903451706064896L) != 0)) {
				{
				setState(208);
				((ConsContext)_localctx).arg1 = expr(0);
				 _localctx.constructorCallRet.addArgument(((ConsContext)_localctx).arg1.expressionRet); 
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(210);
					match(COMMA);
					setState(211);
					((ConsContext)_localctx).arg2 = expr(0);
					 _localctx.constructorCallRet.addArgument(((ConsContext)_localctx).arg2.expressionRet); 
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(221);
			match(RPAREN);
			 _localctx.constructorCallRet.setLine((((ConsContext)_localctx).classIdent!=null?((ConsContext)_localctx).classIdent.getLine():0)); 
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
	public static class BlockContext extends ParserRuleContext {
		public Block blockRet;
		public Token startKey;
		public StContext currentStmt;
		public TerminalNode KW_END() { return getToken(SimpleLangParser.KW_END, 0); }
		public TerminalNode KW_BEGIN() { return getToken(SimpleLangParser.KW_BEGIN, 0); }
		public List<StContext> st() {
			return getRuleContexts(StContext.class);
		}
		public StContext st(int i) {
			return getRuleContext(StContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((BlockContext)_localctx).blockRet =  new Block(); 
			setState(225);
			((BlockContext)_localctx).startKey = match(KW_BEGIN);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014399016845072L) != 0)) {
				{
				{
				setState(226);
				((BlockContext)_localctx).currentStmt = st();
				 _localctx.blockRet.addStatement(((BlockContext)_localctx).currentStmt.statementRet); 
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(KW_END);
			 _localctx.blockRet.setLine((((BlockContext)_localctx).startKey!=null?((BlockContext)_localctx).startKey.getLine():0)); 
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
	public static class StContext extends ParserRuleContext {
		public Statement statementRet;
		public BlockContext innerBlock;
		public VardeclContext singleVar;
		public VardeclContext initVar;
		public ExprContext targetExpr;
		public MethodcallContext callStmt;
		public IfStmtContext conditional;
		public AssignStmtContext assignment;
		public ReturnStmtContext retStmt;
		public InputStmtContext inStmt;
		public OutputStmtContext outStmt;
		public JumpStmtContext flowJump;
		public ForStmtContext loopFor;
		public WhileStmtContext loopWhile;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimpleLangParser.SEMI, 0); }
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SimpleLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public InputStmtContext inputStmt() {
			return getRuleContext(InputStmtContext.class,0);
		}
		public OutputStmtContext outputStmt() {
			return getRuleContext(OutputStmtContext.class,0);
		}
		public JumpStmtContext jumpStmt() {
			return getRuleContext(JumpStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public StContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StContext st() throws RecognitionException {
		StContext _localctx = new StContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_st);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				((StContext)_localctx).innerBlock = block();
				 
				          ((StContext)_localctx).statementRet =  ((StContext)_localctx).innerBlock.blockRet; 
				          _localctx.statementRet.setLine(((StContext)_localctx).innerBlock.blockRet.getLine()); 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				((StContext)_localctx).singleVar = vardecl();
				setState(241);
				match(SEMI);
				 
				          ((StContext)_localctx).statementRet =  new VarDeclStmt(((StContext)_localctx).singleVar.varRet); 
				          _localctx.statementRet.setLine(((StContext)_localctx).singleVar.varRet.getLine()); 
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				((StContext)_localctx).initVar = vardecl();
				setState(245);
				match(ASSIGN);
				setState(246);
				((StContext)_localctx).targetExpr = expr(0);
				setState(247);
				match(SEMI);
				 
				          ((StContext)_localctx).statementRet =  new VarDeclStmt(((StContext)_localctx).initVar.varRet); 
				          ((VarDeclStmt)_localctx.statementRet).setInitial(((StContext)_localctx).targetExpr.expressionRet);
				          _localctx.statementRet.setLine(((StContext)_localctx).targetExpr.expressionRet.getLine()); 
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				((StContext)_localctx).callStmt = methodcall();
				setState(251);
				match(SEMI);
				 
				          ((StContext)_localctx).statementRet =  new MethodCallStmt(((StContext)_localctx).callStmt.methodCallRet); 
				          _localctx.statementRet.setLine(((StContext)_localctx).callStmt.methodCallRet.getLine()); 
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				((StContext)_localctx).conditional = ifStmt();
				 
				          ((StContext)_localctx).statementRet =  ((StContext)_localctx).conditional.ifStmtRet; 
				          _localctx.statementRet.setLine(((StContext)_localctx).conditional.ifStmtRet.getLine()); 
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				((StContext)_localctx).assignment = assignStmt();
				 
				          ((StContext)_localctx).statementRet =  ((StContext)_localctx).assignment.assignStmtRet; 
				          _localctx.statementRet.setLine(((StContext)_localctx).assignment.assignStmtRet.getLine()); 
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				((StContext)_localctx).retStmt = returnStmt();
				 
				          ((StContext)_localctx).statementRet =  ((StContext)_localctx).retStmt.returnStmtRet; 
				          _localctx.statementRet.setLine(((StContext)_localctx).retStmt.returnStmtRet.getLine()); 
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(263);
				((StContext)_localctx).inStmt = inputStmt();
				 
				          ((StContext)_localctx).statementRet =  ((StContext)_localctx).inStmt.inputStmtRet; 
				          _localctx.statementRet.setLine(((StContext)_localctx).inStmt.inputStmtRet.getLine()); 
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(266);
				((StContext)_localctx).outStmt = outputStmt();
				 
				          ((StContext)_localctx).statementRet =  ((StContext)_localctx).outStmt.outputStmtRet; 
				          _localctx.statementRet.setLine(((StContext)_localctx).outStmt.outputStmtRet.getLine()); 
				        
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(269);
				((StContext)_localctx).flowJump = jumpStmt();
				 
				          ((StContext)_localctx).statementRet =  ((StContext)_localctx).flowJump.jumpStmtRet; 
				          _localctx.statementRet.setLine(((StContext)_localctx).flowJump.jumpStmtRet.getLine()); 
				        
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(272);
				((StContext)_localctx).loopFor = forStmt();
				 
				          ((StContext)_localctx).statementRet =  ((StContext)_localctx).loopFor.forStmtRet; 
				          _localctx.statementRet.setLine(((StContext)_localctx).loopFor.forStmtRet.getLine()); 
				        
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(275);
				((StContext)_localctx).loopWhile = whileStmt();
				 
				          ((StContext)_localctx).statementRet =  ((StContext)_localctx).loopWhile.whileStmtRet; 
				          _localctx.statementRet.setLine(((StContext)_localctx).loopWhile.whileStmtRet.getLine()); 
				        
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
	public static class JumpStmtContext extends ParserRuleContext {
		public JumpStmt jumpStmtRet;
		public Token KW_BREAK;
		public Token KW_CONTINUE;
		public TerminalNode KW_BREAK() { return getToken(SimpleLangParser.KW_BREAK, 0); }
		public TerminalNode KW_CONTINUE() { return getToken(SimpleLangParser.KW_CONTINUE, 0); }
		public JumpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterJumpStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitJumpStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitJumpStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStmtContext jumpStmt() throws RecognitionException {
		JumpStmtContext _localctx = new JumpStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jumpStmt);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				((JumpStmtContext)_localctx).KW_BREAK = match(KW_BREAK);
				 ((JumpStmtContext)_localctx).jumpStmtRet =  new BreakJump(); _localctx.jumpStmtRet.setLine((((JumpStmtContext)_localctx).KW_BREAK!=null?((JumpStmtContext)_localctx).KW_BREAK.getLine():0)); 
				}
				break;
			case KW_CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				((JumpStmtContext)_localctx).KW_CONTINUE = match(KW_CONTINUE);
				 ((JumpStmtContext)_localctx).jumpStmtRet =  new ContinueJump(); _localctx.jumpStmtRet.setLine((((JumpStmtContext)_localctx).KW_CONTINUE!=null?((JumpStmtContext)_localctx).KW_CONTINUE.getLine():0)); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public IfStmt ifStmtRet;
		public Token startKey;
		public ExprContext condExpr;
		public StContext thenBranch;
		public StContext elseBranch;
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public TerminalNode KW_IF() { return getToken(SimpleLangParser.KW_IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StContext> st() {
			return getRuleContexts(StContext.class);
		}
		public StContext st(int i) {
			return getRuleContext(StContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(SimpleLangParser.KW_ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			((IfStmtContext)_localctx).startKey = match(KW_IF);
			setState(287);
			match(LPAREN);
			setState(288);
			((IfStmtContext)_localctx).condExpr = expr(0);
			setState(289);
			match(RPAREN);
			setState(290);
			((IfStmtContext)_localctx).thenBranch = st();
			 ((IfStmtContext)_localctx).ifStmtRet =  new IfStmt(((IfStmtContext)_localctx).condExpr.expressionRet, ((IfStmtContext)_localctx).thenBranch.statementRet); 
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(292);
				match(KW_ELSE);
				setState(293);
				((IfStmtContext)_localctx).elseBranch = st();
				 _localctx.ifStmtRet.setElseBranch(((IfStmtContext)_localctx).elseBranch.statementRet); 
				}
				break;
			}
			 _localctx.ifStmtRet.setLine((((IfStmtContext)_localctx).startKey!=null?((IfStmtContext)_localctx).startKey.getLine():0)); 
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
	public static class ForStmtContext extends ParserRuleContext {
		public ForStmt forStmtRet;
		public Token startKey;
		public InitexprContext init1;
		public InitexprContext init2;
		public ExprContext loopCond;
		public LocContext updateLoc1;
		public Token eqKey1;
		public ExprContext updateExpr1;
		public LocContext updateLoc2;
		public Token eqKey2;
		public ExprContext updateExpr2;
		public StContext bodyStmt;
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(SimpleLangParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SimpleLangParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public TerminalNode KW_FOR() { return getToken(SimpleLangParser.KW_FOR, 0); }
		public StContext st() {
			return getRuleContext(StContext.class,0);
		}
		public List<InitexprContext> initexpr() {
			return getRuleContexts(InitexprContext.class);
		}
		public InitexprContext initexpr(int i) {
			return getRuleContext(InitexprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<LocContext> loc() {
			return getRuleContexts(LocContext.class);
		}
		public LocContext loc(int i) {
			return getRuleContext(LocContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SimpleLangParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SimpleLangParser.ASSIGN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			((ForStmtContext)_localctx).startKey = match(KW_FOR);
			 
			          ((ForStmtContext)_localctx).forStmtRet =  new ForStmt(); 
			          _localctx.forStmtRet.setLine((((ForStmtContext)_localctx).startKey!=null?((ForStmtContext)_localctx).startKey.getLine():0)); 
			        
			setState(302);
			match(LPAREN);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014398813576960L) != 0)) {
				{
				setState(303);
				((ForStmtContext)_localctx).init1 = initexpr();
				 _localctx.forStmtRet.addInit(((ForStmtContext)_localctx).init1.initExprRet); 
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(305);
					match(COMMA);
					setState(306);
					((ForStmtContext)_localctx).init2 = initexpr();
					 _localctx.forStmtRet.addInit(((ForStmtContext)_localctx).init2.initExprRet); 
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(316);
			match(SEMI);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34903451706064896L) != 0)) {
				{
				setState(317);
				((ForStmtContext)_localctx).loopCond = expr(0);
				 _localctx.forStmtRet.setCondition(((ForStmtContext)_localctx).loopCond.expressionRet); 
				}
			}

			setState(322);
			match(SEMI);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_THIS || _la==ID) {
				{
				setState(323);
				((ForStmtContext)_localctx).updateLoc1 = loc();
				setState(324);
				((ForStmtContext)_localctx).eqKey1 = match(ASSIGN);
				setState(325);
				((ForStmtContext)_localctx).updateExpr1 = expr(0);
				 
				          AssignStmt loopUpdate1 = new AssignStmt(((ForStmtContext)_localctx).updateLoc1.locationRet, ((ForStmtContext)_localctx).updateExpr1.expressionRet); 
				          loopUpdate1.setLine((((ForStmtContext)_localctx).eqKey1!=null?((ForStmtContext)_localctx).eqKey1.getLine():0)); 
				          _localctx.forStmtRet.addUpdate(loopUpdate1); 
				        
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(327);
					match(COMMA);
					setState(328);
					((ForStmtContext)_localctx).updateLoc2 = loc();
					setState(329);
					((ForStmtContext)_localctx).eqKey2 = match(ASSIGN);
					setState(330);
					((ForStmtContext)_localctx).updateExpr2 = expr(0);
					 
					          AssignStmt loopUpdate2 = new AssignStmt(((ForStmtContext)_localctx).updateLoc2.locationRet, ((ForStmtContext)_localctx).updateExpr2.expressionRet); 
					          loopUpdate2.setLine((((ForStmtContext)_localctx).eqKey2!=null?((ForStmtContext)_localctx).eqKey2.getLine():0)); 
					          _localctx.forStmtRet.addUpdate(loopUpdate2); 
					        
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(340);
			match(RPAREN);
			setState(341);
			((ForStmtContext)_localctx).bodyStmt = st();
			 _localctx.forStmtRet.setBody(((ForStmtContext)_localctx).bodyStmt.statementRet); 
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
	public static class WhileStmtContext extends ParserRuleContext {
		public WhileStmt whileStmtRet;
		public Token startKey;
		public ExprContext loopCond;
		public StContext bodyStmt;
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public TerminalNode KW_WHILE() { return getToken(SimpleLangParser.KW_WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StContext st() {
			return getRuleContext(StContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			((WhileStmtContext)_localctx).startKey = match(KW_WHILE);
			setState(345);
			match(LPAREN);
			setState(346);
			((WhileStmtContext)_localctx).loopCond = expr(0);
			setState(347);
			match(RPAREN);
			setState(348);
			((WhileStmtContext)_localctx).bodyStmt = st();
			 
			          ((WhileStmtContext)_localctx).whileStmtRet =  new WhileStmt(((WhileStmtContext)_localctx).loopCond.expressionRet, ((WhileStmtContext)_localctx).bodyStmt.statementRet); 
			          _localctx.whileStmtRet.setLine((((WhileStmtContext)_localctx).startKey!=null?((WhileStmtContext)_localctx).startKey.getLine():0)); 
			        
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
	public static class AssignStmtContext extends ParserRuleContext {
		public AssignStmt assignStmtRet;
		public LocContext targetLoc;
		public Token eqKey;
		public ExprContext sourceExpr;
		public TerminalNode SEMI() { return getToken(SimpleLangParser.SEMI, 0); }
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SimpleLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			((AssignStmtContext)_localctx).targetLoc = loc();
			setState(352);
			((AssignStmtContext)_localctx).eqKey = match(ASSIGN);
			setState(353);
			((AssignStmtContext)_localctx).sourceExpr = expr(0);
			 ((AssignStmtContext)_localctx).assignStmtRet =  new AssignStmt(((AssignStmtContext)_localctx).targetLoc.locationRet, ((AssignStmtContext)_localctx).sourceExpr.expressionRet); 
			setState(355);
			match(SEMI);
			 _localctx.assignStmtRet.setLine((((AssignStmtContext)_localctx).eqKey!=null?((AssignStmtContext)_localctx).eqKey.getLine():0)); 
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
	public static class ReturnStmtContext extends ParserRuleContext {
		public ReturnStmt returnStmtRet;
		public Token startKey;
		public ExprContext retExpr;
		public TerminalNode SEMI() { return getToken(SimpleLangParser.SEMI, 0); }
		public TerminalNode KW_RETURN() { return getToken(SimpleLangParser.KW_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ReturnStmtContext)_localctx).returnStmtRet =  new ReturnStmt(); 
			setState(359);
			((ReturnStmtContext)_localctx).startKey = match(KW_RETURN);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34903451706064896L) != 0)) {
				{
				setState(360);
				((ReturnStmtContext)_localctx).retExpr = expr(0);
				 _localctx.returnStmtRet.setValue(((ReturnStmtContext)_localctx).retExpr.expressionRet); 
				}
			}

			setState(365);
			match(SEMI);
			 _localctx.returnStmtRet.setLine((((ReturnStmtContext)_localctx).startKey!=null?((ReturnStmtContext)_localctx).startKey.getLine():0)); 
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
	public static class InputStmtContext extends ParserRuleContext {
		public InputStmt inputStmtRet;
		public Token startKey;
		public LocContext targetLoc;
		public TerminalNode SEMI() { return getToken(SimpleLangParser.SEMI, 0); }
		public TerminalNode KW_INPUT() { return getToken(SimpleLangParser.KW_INPUT, 0); }
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public InputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStmtContext inputStmt() throws RecognitionException {
		InputStmtContext _localctx = new InputStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inputStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			((InputStmtContext)_localctx).startKey = match(KW_INPUT);
			setState(369);
			((InputStmtContext)_localctx).targetLoc = loc();
			 ((InputStmtContext)_localctx).inputStmtRet =  new InputStmt(((InputStmtContext)_localctx).targetLoc.locationRet); 
			setState(371);
			match(SEMI);
			 _localctx.inputStmtRet.setLine((((InputStmtContext)_localctx).startKey!=null?((InputStmtContext)_localctx).startKey.getLine():0)); 
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
	public static class OutputStmtContext extends ParserRuleContext {
		public OutputStmt outputStmtRet;
		public Token startKey;
		public ExprContext targetExpr;
		public TerminalNode SEMI() { return getToken(SimpleLangParser.SEMI, 0); }
		public TerminalNode KW_OUTPUT() { return getToken(SimpleLangParser.KW_OUTPUT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterOutputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitOutputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitOutputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStmtContext outputStmt() throws RecognitionException {
		OutputStmtContext _localctx = new OutputStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_outputStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			((OutputStmtContext)_localctx).startKey = match(KW_OUTPUT);
			setState(375);
			((OutputStmtContext)_localctx).targetExpr = expr(0);
			 ((OutputStmtContext)_localctx).outputStmtRet =  new OutputStmt(((OutputStmtContext)_localctx).targetExpr.expressionRet); 
			setState(377);
			match(SEMI);
			 _localctx.outputStmtRet.setLine((((OutputStmtContext)_localctx).startKey!=null?((OutputStmtContext)_localctx).startKey.getLine():0)); 
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
	public static class LocContext extends ParserRuleContext {
		public Location locationRet;
		public SimpleLocContext s;
		public MemberLocContext m;
		public ThisLocContext t;
		public SimpleLocContext simpleLoc() {
			return getRuleContext(SimpleLocContext.class,0);
		}
		public MemberLocContext memberLoc() {
			return getRuleContext(MemberLocContext.class,0);
		}
		public ThisLocContext thisLoc() {
			return getRuleContext(ThisLocContext.class,0);
		}
		public LocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitLoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocContext loc() throws RecognitionException {
		LocContext _localctx = new LocContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loc);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				((LocContext)_localctx).s = simpleLoc();
				 ((LocContext)_localctx).locationRet =  ((LocContext)_localctx).s.simpleLocRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				((LocContext)_localctx).m = memberLoc();
				 ((LocContext)_localctx).locationRet =  ((LocContext)_localctx).m.memberLocRet; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				((LocContext)_localctx).t = thisLoc();
				 
				          ((LocContext)_localctx).locationRet =  ((LocContext)_localctx).t.thisLocRet; 
				          _localctx.locationRet.setLine(((LocContext)_localctx).t.thisLocRet.getLine()); 
				        
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
	public static class SimpleLocContext extends ParserRuleContext {
		public SimpleLoc simpleLocRet;
		public Token identNode;
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public SimpleLocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleLoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSimpleLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSimpleLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitSimpleLoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleLocContext simpleLoc() throws RecognitionException {
		SimpleLocContext _localctx = new SimpleLocContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_simpleLoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			((SimpleLocContext)_localctx).identNode = match(ID);
			 ((SimpleLocContext)_localctx).simpleLocRet =  new SimpleLoc(new Identifier((((SimpleLocContext)_localctx).identNode!=null?((SimpleLocContext)_localctx).identNode.getText():null))); 
			 _localctx.simpleLocRet.setLine((((SimpleLocContext)_localctx).identNode!=null?((SimpleLocContext)_localctx).identNode.getLine():0)); 
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
	public static class MemberLocContext extends ParserRuleContext {
		public MemberLoc memberLocRet;
		public Token parentIdent;
		public LocContext childLoc;
		public TerminalNode DOT() { return getToken(SimpleLangParser.DOT, 0); }
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public MemberLocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberLoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterMemberLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitMemberLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitMemberLoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberLocContext memberLoc() throws RecognitionException {
		MemberLocContext _localctx = new MemberLocContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_memberLoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			((MemberLocContext)_localctx).parentIdent = match(ID);
			setState(396);
			match(DOT);
			setState(397);
			((MemberLocContext)_localctx).childLoc = loc();
			 ((MemberLocContext)_localctx).memberLocRet =  new MemberLoc(new Identifier((((MemberLocContext)_localctx).parentIdent!=null?((MemberLocContext)_localctx).parentIdent.getText():null)), ((MemberLocContext)_localctx).childLoc.locationRet); 
			 _localctx.memberLocRet.setLine((((MemberLocContext)_localctx).parentIdent!=null?((MemberLocContext)_localctx).parentIdent.getLine():0)); 
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
	public static class ThisLocContext extends ParserRuleContext {
		public ThisLoc thisLocRet;
		public Token startKey;
		public LocContext childLoc;
		public TerminalNode KW_THIS() { return getToken(SimpleLangParser.KW_THIS, 0); }
		public TerminalNode DOT() { return getToken(SimpleLangParser.DOT, 0); }
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public ThisLocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisLoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterThisLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitThisLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitThisLoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisLocContext thisLoc() throws RecognitionException {
		ThisLocContext _localctx = new ThisLocContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_thisLoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ThisLocContext)_localctx).thisLocRet =  new ThisLoc(); 
			setState(402);
			((ThisLocContext)_localctx).startKey = match(KW_THIS);
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(403);
				match(DOT);
				setState(404);
				((ThisLocContext)_localctx).childLoc = loc();
				 _localctx.thisLocRet.setLoc(((ThisLocContext)_localctx).childLoc.locationRet); 
				}
				break;
			}
			 _localctx.thisLocRet.setLine((((ThisLocContext)_localctx).startKey!=null?((ThisLocContext)_localctx).startKey.getLine():0)); 
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
	public static class MethodcallContext extends ParserRuleContext {
		public MethodCall methodCallRet;
		public LocContext instanceLoc;
		public Token calleeIdent;
		public ExprContext exprArg1;
		public ExprContext exprArg2;
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TerminalNode DOT() { return getToken(SimpleLangParser.DOT, 0); }
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public MethodcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterMethodcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitMethodcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitMethodcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodcallContext methodcall() throws RecognitionException {
		MethodcallContext _localctx = new MethodcallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methodcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodcallContext)_localctx).methodCallRet =  new MethodCall(); 
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(412);
				((MethodcallContext)_localctx).instanceLoc = loc();
				setState(413);
				match(DOT);
				 _localctx.methodCallRet.setInstance(((MethodcallContext)_localctx).instanceLoc.locationRet); 
				}
				break;
			}
			setState(418);
			((MethodcallContext)_localctx).calleeIdent = match(ID);
			 _localctx.methodCallRet.setCallee(new Identifier((((MethodcallContext)_localctx).calleeIdent!=null?((MethodcallContext)_localctx).calleeIdent.getText():null))); 
			setState(420);
			match(LPAREN);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34903451706064896L) != 0)) {
				{
				setState(421);
				((MethodcallContext)_localctx).exprArg1 = expr(0);
				 _localctx.methodCallRet.addArgument(((MethodcallContext)_localctx).exprArg1.expressionRet); 
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(423);
					match(COMMA);
					setState(424);
					((MethodcallContext)_localctx).exprArg2 = expr(0);
					 _localctx.methodCallRet.addArgument(((MethodcallContext)_localctx).exprArg2.expressionRet); 
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(434);
			match(RPAREN);
			 _localctx.methodCallRet.setLine((((MethodcallContext)_localctx).calleeIdent!=null?((MethodcallContext)_localctx).calleeIdent.getLine():0)); 
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
	public static class ExprContext extends ParserRuleContext {
		public Expression expressionRet;
		public ExprContext leftMul;
		public ExprContext leftAdd;
		public ExprContext leftRel;
		public ExprContext leftEq;
		public ExprContext leftAnd;
		public ExprContext leftOr;
		public LocContext currentLoc;
		public Token startKey;
		public MethodcallContext mCall;
		public ConsContext cCall;
		public ExprContext innerExpr;
		public Token litInt;
		public Token litFloat;
		public Token litDouble;
		public Token litChar;
		public Token litBool;
		public Token unaryOp;
		public ExprContext targetExpr;
		public Token mulOp;
		public ExprContext rightMul;
		public Token addOp;
		public ExprContext rightAdd;
		public Token relOp;
		public ExprContext rightRel;
		public Token eqOp;
		public ExprContext rightEq;
		public ExprContext rightAnd;
		public ExprContext rightOr;
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public TerminalNode KW_THIS() { return getToken(SimpleLangParser.KW_THIS, 0); }
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public ConsContext cons() {
			return getRuleContext(ConsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CONSTINT() { return getToken(SimpleLangParser.CONSTINT, 0); }
		public TerminalNode CONSTFLOAT() { return getToken(SimpleLangParser.CONSTFLOAT, 0); }
		public TerminalNode CONSTDOUBLE() { return getToken(SimpleLangParser.CONSTDOUBLE, 0); }
		public TerminalNode CONSTCHAR() { return getToken(SimpleLangParser.CONSTCHAR, 0); }
		public TerminalNode CONSTBOOL() { return getToken(SimpleLangParser.CONSTBOOL, 0); }
		public TerminalNode MINUS() { return getToken(SimpleLangParser.MINUS, 0); }
		public TerminalNode KW_NOT() { return getToken(SimpleLangParser.KW_NOT, 0); }
		public TerminalNode STAR() { return getToken(SimpleLangParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(SimpleLangParser.SLASH, 0); }
		public TerminalNode PLUS() { return getToken(SimpleLangParser.PLUS, 0); }
		public TerminalNode LESS() { return getToken(SimpleLangParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(SimpleLangParser.GREATER, 0); }
		public TerminalNode LESS_EQ() { return getToken(SimpleLangParser.LESS_EQ, 0); }
		public TerminalNode GREATER_EQ() { return getToken(SimpleLangParser.GREATER_EQ, 0); }
		public TerminalNode EQUAL() { return getToken(SimpleLangParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SimpleLangParser.NOT_EQUAL, 0); }
		public TerminalNode KW_AND() { return getToken(SimpleLangParser.KW_AND, 0); }
		public TerminalNode KW_OR() { return getToken(SimpleLangParser.KW_OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(438);
				((ExprContext)_localctx).currentLoc = loc();
				 ((ExprContext)_localctx).expressionRet =  ((ExprContext)_localctx).currentLoc.locationRet; 
				}
				break;
			case 2:
				{
				setState(441);
				((ExprContext)_localctx).startKey = match(KW_THIS);
				 ((ExprContext)_localctx).expressionRet =  new ThisExpr(); _localctx.expressionRet.setLine((((ExprContext)_localctx).startKey!=null?((ExprContext)_localctx).startKey.getLine():0)); 
				}
				break;
			case 3:
				{
				setState(443);
				((ExprContext)_localctx).mCall = methodcall();
				 ((ExprContext)_localctx).expressionRet =  ((ExprContext)_localctx).mCall.methodCallRet; 
				}
				break;
			case 4:
				{
				setState(446);
				((ExprContext)_localctx).cCall = cons();
				 ((ExprContext)_localctx).expressionRet =  ((ExprContext)_localctx).cCall.constructorCallRet; 
				}
				break;
			case 5:
				{
				setState(449);
				match(LPAREN);
				setState(450);
				((ExprContext)_localctx).innerExpr = expr(0);
				setState(451);
				match(RPAREN);
				 ((ExprContext)_localctx).expressionRet =  ((ExprContext)_localctx).innerExpr.expressionRet; 
				}
				break;
			case 6:
				{
				setState(454);
				((ExprContext)_localctx).litInt = match(CONSTINT);
				 ((ExprContext)_localctx).expressionRet =  new IntLiteral(Integer.parseInt((((ExprContext)_localctx).litInt!=null?((ExprContext)_localctx).litInt.getText():null))); _localctx.expressionRet.setLine((((ExprContext)_localctx).litInt!=null?((ExprContext)_localctx).litInt.getLine():0)); 
				}
				break;
			case 7:
				{
				setState(456);
				((ExprContext)_localctx).litFloat = match(CONSTFLOAT);
				 ((ExprContext)_localctx).expressionRet =  new FloatLiteral(Float.parseFloat((((ExprContext)_localctx).litFloat!=null?((ExprContext)_localctx).litFloat.getText():null))); _localctx.expressionRet.setLine((((ExprContext)_localctx).litFloat!=null?((ExprContext)_localctx).litFloat.getLine():0)); 
				}
				break;
			case 8:
				{
				setState(458);
				((ExprContext)_localctx).litDouble = match(CONSTDOUBLE);
				 ((ExprContext)_localctx).expressionRet =  new DoubleLiteral(Double.parseDouble((((ExprContext)_localctx).litDouble!=null?((ExprContext)_localctx).litDouble.getText():null))); _localctx.expressionRet.setLine((((ExprContext)_localctx).litDouble!=null?((ExprContext)_localctx).litDouble.getLine():0)); 
				}
				break;
			case 9:
				{
				setState(460);
				((ExprContext)_localctx).litChar = match(CONSTCHAR);
				 ((ExprContext)_localctx).expressionRet =  new CharLiteral((((ExprContext)_localctx).litChar!=null?((ExprContext)_localctx).litChar.getText():null).charAt(1)); _localctx.expressionRet.setLine((((ExprContext)_localctx).litChar!=null?((ExprContext)_localctx).litChar.getLine():0)); 
				}
				break;
			case 10:
				{
				setState(462);
				((ExprContext)_localctx).litBool = match(CONSTBOOL);
				 ((ExprContext)_localctx).expressionRet =  new BoolLiteral(Boolean.parseBoolean((((ExprContext)_localctx).litBool!=null?((ExprContext)_localctx).litBool.getText():null))); _localctx.expressionRet.setLine((((ExprContext)_localctx).litBool!=null?((ExprContext)_localctx).litBool.getLine():0)); 
				}
				break;
			case 11:
				{
				setState(464);
				((ExprContext)_localctx).unaryOp = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==KW_NOT || _la==MINUS) ) {
					((ExprContext)_localctx).unaryOp = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(465);
				((ExprContext)_localctx).targetExpr = expr(7);

				            UnaryOperator finalOp = (((ExprContext)_localctx).unaryOp!=null?((ExprContext)_localctx).unaryOp.getType():0) == MINUS ? UnaryOperator.MINUS : UnaryOperator.NOT;
				            ((ExprContext)_localctx).expressionRet =  new UnaryExpression(finalOp, ((ExprContext)_localctx).targetExpr.expressionRet);
				            _localctx.expressionRet.setLine((((ExprContext)_localctx).unaryOp!=null?((ExprContext)_localctx).unaryOp.getLine():0));
				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(500);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.leftMul = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(470);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(471);
						((ExprContext)_localctx).mulOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==SLASH) ) {
							((ExprContext)_localctx).mulOp = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(472);
						((ExprContext)_localctx).rightMul = expr(7);

						                      BinaryOperator finalOp = (((ExprContext)_localctx).mulOp!=null?((ExprContext)_localctx).mulOp.getType():0) == STAR ? BinaryOperator.MULT : BinaryOperator.DIV;
						                      ((ExprContext)_localctx).expressionRet =  new BinaryExpression(((ExprContext)_localctx).leftMul.expressionRet, ((ExprContext)_localctx).rightMul.expressionRet, finalOp);
						                      _localctx.expressionRet.setLine(((ExprContext)_localctx).leftMul.expressionRet.getLine());
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.leftAdd = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(475);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(476);
						((ExprContext)_localctx).addOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
							((ExprContext)_localctx).addOp = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(477);
						((ExprContext)_localctx).rightAdd = expr(6);

						                      BinaryOperator finalOp = (((ExprContext)_localctx).addOp!=null?((ExprContext)_localctx).addOp.getType():0) == PLUS ? BinaryOperator.PLUS : BinaryOperator.MINUS;
						                      ((ExprContext)_localctx).expressionRet =  new BinaryExpression(((ExprContext)_localctx).leftAdd.expressionRet, ((ExprContext)_localctx).rightAdd.expressionRet, finalOp);
						                      _localctx.expressionRet.setLine(((ExprContext)_localctx).leftAdd.expressionRet.getLine());
						                  
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.leftRel = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(480);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(481);
						((ExprContext)_localctx).relOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 263882790666240L) != 0)) ) {
							((ExprContext)_localctx).relOp = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(482);
						((ExprContext)_localctx).rightRel = expr(5);

						                      BinaryOperator finalOp = null;
						                      if ((((ExprContext)_localctx).relOp!=null?((ExprContext)_localctx).relOp.getType():0) == LESS) finalOp = BinaryOperator.LESS;
						                      else if ((((ExprContext)_localctx).relOp!=null?((ExprContext)_localctx).relOp.getType():0) == GREATER) finalOp = BinaryOperator.GREATER;
						                      else if ((((ExprContext)_localctx).relOp!=null?((ExprContext)_localctx).relOp.getType():0) == LESS_EQ) finalOp = BinaryOperator.LESS_EQ;
						                      else if ((((ExprContext)_localctx).relOp!=null?((ExprContext)_localctx).relOp.getType():0) == GREATER_EQ) finalOp = BinaryOperator.GREATER_EQ;
						                      ((ExprContext)_localctx).expressionRet =  new BinaryExpression(((ExprContext)_localctx).leftRel.expressionRet, ((ExprContext)_localctx).rightRel.expressionRet, finalOp);
						                      _localctx.expressionRet.setLine(((ExprContext)_localctx).leftRel.expressionRet.getLine());
						                  
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.leftEq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(485);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(486);
						((ExprContext)_localctx).eqOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
							((ExprContext)_localctx).eqOp = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(487);
						((ExprContext)_localctx).rightEq = expr(4);

						                      BinaryOperator finalOp = (((ExprContext)_localctx).eqOp!=null?((ExprContext)_localctx).eqOp.getType():0) == EQUAL ? BinaryOperator.EQUAL : BinaryOperator.NOT_EQUAL;
						                      ((ExprContext)_localctx).expressionRet =  new BinaryExpression(((ExprContext)_localctx).leftEq.expressionRet, ((ExprContext)_localctx).rightEq.expressionRet, finalOp);
						                      _localctx.expressionRet.setLine(((ExprContext)_localctx).leftEq.expressionRet.getLine());
						                  
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.leftAnd = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(490);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(491);
						match(KW_AND);
						setState(492);
						((ExprContext)_localctx).rightAnd = expr(3);

						                      ((ExprContext)_localctx).expressionRet =  new BinaryExpression(((ExprContext)_localctx).leftAnd.expressionRet, ((ExprContext)_localctx).rightAnd.expressionRet, BinaryOperator.AND);
						                      _localctx.expressionRet.setLine(((ExprContext)_localctx).leftAnd.expressionRet.getLine());
						                  
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.leftOr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(495);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(496);
						match(KW_OR);
						setState(497);
						((ExprContext)_localctx).rightOr = expr(2);

						                      ((ExprContext)_localctx).expressionRet =  new BinaryExpression(((ExprContext)_localctx).leftOr.expressionRet, ((ExprContext)_localctx).rightOr.expressionRet, BinaryOperator.OR);
						                      _localctx.expressionRet.setLine(((ExprContext)_localctx).leftOr.expressionRet.getLine());
						                  
						}
						break;
					}
					} 
				}
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitexprContext extends ParserRuleContext {
		public Statement initExprRet;
		public VardeclContext initVar1;
		public LocContext initLoc;
		public ExprContext targetExpr;
		public VardeclContext initVar2;
		public ExprContext assignedExpr;
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SimpleLangParser.ASSIGN, 0); }
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitexprContext initexpr() throws RecognitionException {
		InitexprContext _localctx = new InitexprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_initexpr);
		try {
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				((InitexprContext)_localctx).initVar1 = vardecl();
				 ((InitexprContext)_localctx).initExprRet =  new VarDeclStmt(((InitexprContext)_localctx).initVar1.varRet); _localctx.initExprRet.setLine(((InitexprContext)_localctx).initVar1.varRet.getLine()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				((InitexprContext)_localctx).initLoc = loc();
				setState(509);
				match(ASSIGN);
				setState(510);
				((InitexprContext)_localctx).targetExpr = expr(0);
				 
				          ((InitexprContext)_localctx).initExprRet =  new AssignStmt(((InitexprContext)_localctx).initLoc.locationRet, ((InitexprContext)_localctx).targetExpr.expressionRet); 
				          _localctx.initExprRet.setLine(((InitexprContext)_localctx).initLoc.locationRet.getLine()); 
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				((InitexprContext)_localctx).initVar2 = vardecl();
				setState(514);
				match(ASSIGN);
				setState(515);
				((InitexprContext)_localctx).assignedExpr = expr(0);
				 
				          ((InitexprContext)_localctx).initExprRet =  new VarDeclStmt(((InitexprContext)_localctx).initVar2.varRet); 
				          ((VarDeclStmt)_localctx.initExprRet).setInitial(((InitexprContext)_localctx).assignedExpr.expressionRet);
				          _localctx.initExprRet.setLine(((InitexprContext)_localctx).initVar2.varRet.getLine()); 
				        
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u0209\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000?\b\u0000\n\u0000\f\u0000B\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001L\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"W\b\u0002\n\u0002\f\u0002Z\t\u0002\u0003\u0002\\\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002b\b\u0002\n\u0002\f\u0002e\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003p\b\u0003\n\u0003"+
		"\f\u0003s\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0087\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u008d\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u009e\b\u0007\n\u0007\f\u0007\u00a1\t\u0007\u0003\u0007"+
		"\u00a3\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00a8\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00bc"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u00c1\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u00c9\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d7\b\u000b\n\u000b\f\u000b"+
		"\u00da\t\u000b\u0003\u000b\u00dc\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00e6\b\f\n\f\f"+
		"\f\u00e9\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0117\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u011d\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0129\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u0136\b\u0010\n\u0010\f\u0010\u0139\t\u0010\u0003\u0010"+
		"\u013b\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0141\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u014e\b\u0010\n\u0010\f\u0010\u0151\t\u0010\u0003\u0010\u0153"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u016c\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0186\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0198\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01a1"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01ac\b\u001a\n"+
		"\u001a\f\u001a\u01af\t\u001a\u0003\u001a\u01b1\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01d5\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01f5"+
		"\b\u001b\n\u001b\f\u001b\u01f8\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0207\b\u001c"+
		"\u0001\u001c\u0000\u00016\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0005\u0002"+
		"\u0000\u0016\u0016\'\'\u0001\u0000)*\u0001\u0000\'(\u0001\u0000,/\u0001"+
		"\u000001\u022e\u0000:\u0001\u0000\u0000\u0000\u0002K\u0001\u0000\u0000"+
		"\u0000\u0004M\u0001\u0000\u0000\u0000\u0006h\u0001\u0000\u0000\u0000\b"+
		"\u0086\u0001\u0000\u0000\u0000\n\u008c\u0001\u0000\u0000\u0000\f\u008e"+
		"\u0001\u0000\u0000\u0000\u000e\u0096\u0001\u0000\u0000\u0000\u0010\u00a4"+
		"\u0001\u0000\u0000\u0000\u0012\u00bb\u0001\u0000\u0000\u0000\u0014\u00bd"+
		"\u0001\u0000\u0000\u0000\u0016\u00cd\u0001\u0000\u0000\u0000\u0018\u00e0"+
		"\u0001\u0000\u0000\u0000\u001a\u0116\u0001\u0000\u0000\u0000\u001c\u011c"+
		"\u0001\u0000\u0000\u0000\u001e\u011e\u0001\u0000\u0000\u0000 \u012c\u0001"+
		"\u0000\u0000\u0000\"\u0158\u0001\u0000\u0000\u0000$\u015f\u0001\u0000"+
		"\u0000\u0000&\u0166\u0001\u0000\u0000\u0000(\u0170\u0001\u0000\u0000\u0000"+
		"*\u0176\u0001\u0000\u0000\u0000,\u0185\u0001\u0000\u0000\u0000.\u0187"+
		"\u0001\u0000\u0000\u00000\u018b\u0001\u0000\u0000\u00002\u0191\u0001\u0000"+
		"\u0000\u00004\u019b\u0001\u0000\u0000\u00006\u01d4\u0001\u0000\u0000\u0000"+
		"8\u0206\u0001\u0000\u0000\u0000:@\u0006\u0000\uffff\uffff\u0000;<\u0003"+
		"\u0002\u0001\u0000<=\u0006\u0000\uffff\uffff\u0000=?\u0001\u0000\u0000"+
		"\u0000>;\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0000\u0000\u0001D\u0001\u0001\u0000\u0000"+
		"\u0000EF\u0003\u0004\u0002\u0000FG\u0006\u0001\uffff\uffff\u0000GL\u0001"+
		"\u0000\u0000\u0000HI\u0003\u0006\u0003\u0000IJ\u0006\u0001\uffff\uffff"+
		"\u0000JL\u0001\u0000\u0000\u0000KE\u0001\u0000\u0000\u0000KH\u0001\u0000"+
		"\u0000\u0000L\u0003\u0001\u0000\u0000\u0000MN\u0005\u0001\u0000\u0000"+
		"NO\u00056\u0000\u0000O[\u0006\u0002\uffff\uffff\u0000PQ\u0005\u0003\u0000"+
		"\u0000QR\u00056\u0000\u0000RX\u0006\u0002\uffff\uffff\u0000ST\u0005\u001f"+
		"\u0000\u0000TU\u00056\u0000\u0000UW\u0006\u0002\uffff\uffff\u0000VS\u0001"+
		"\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000[P\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]c\u0005\u0004\u0000\u0000^_\u0003\b\u0004\u0000_`\u0006\u0002"+
		"\uffff\uffff\u0000`b\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005\u0005"+
		"\u0000\u0000g\u0005\u0001\u0000\u0000\u0000hi\u0005\u0002\u0000\u0000"+
		"ij\u00056\u0000\u0000jk\u0006\u0003\uffff\uffff\u0000kq\u0005\u0004\u0000"+
		"\u0000lm\u0003\b\u0004\u0000mn\u0006\u0003\uffff\uffff\u0000np\u0001\u0000"+
		"\u0000\u0000ol\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000tu\u0005\u0005\u0000\u0000u\u0007\u0001\u0000"+
		"\u0000\u0000vw\u0003\n\u0005\u0000wx\u0003\f\u0006\u0000xy\u0006\u0004"+
		"\uffff\uffff\u0000y\u0087\u0001\u0000\u0000\u0000z{\u0003\f\u0006\u0000"+
		"{|\u0006\u0004\uffff\uffff\u0000|\u0087\u0001\u0000\u0000\u0000}~\u0003"+
		"\n\u0005\u0000~\u007f\u0003\u0014\n\u0000\u007f\u0080\u0005\u001e\u0000"+
		"\u0000\u0080\u0081\u0006\u0004\uffff\uffff\u0000\u0081\u0087\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0003\u0014\n\u0000\u0083\u0084\u0005\u001e\u0000"+
		"\u0000\u0084\u0085\u0006\u0004\uffff\uffff\u0000\u0085\u0087\u0001\u0000"+
		"\u0000\u0000\u0086v\u0001\u0000\u0000\u0000\u0086z\u0001\u0000\u0000\u0000"+
		"\u0086}\u0001\u0000\u0000\u0000\u0086\u0082\u0001\u0000\u0000\u0000\u0087"+
		"\t\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0007\u0000\u0000\u0089\u008d"+
		"\u0006\u0005\uffff\uffff\u0000\u008a\u008b\u0005\u0006\u0000\u0000\u008b"+
		"\u008d\u0006\u0005\uffff\uffff\u0000\u008c\u0088\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u000b\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0003\u0012\t\u0000\u008f\u0090\u00056\u0000\u0000\u0090"+
		"\u0091\u0005 \u0000\u0000\u0091\u0092\u0003\u000e\u0007\u0000\u0092\u0093"+
		"\u0005!\u0000\u0000\u0093\u0094\u0003\u0018\f\u0000\u0094\u0095\u0006"+
		"\u0006\uffff\uffff\u0000\u0095\r\u0001\u0000\u0000\u0000\u0096\u00a2\u0006"+
		"\u0007\uffff\uffff\u0000\u0097\u0098\u0003\u0010\b\u0000\u0098\u009f\u0006"+
		"\u0007\uffff\uffff\u0000\u0099\u009a\u0005\u001f\u0000\u0000\u009a\u009b"+
		"\u0003\u0010\b\u0000\u009b\u009c\u0006\u0007\uffff\uffff\u0000\u009c\u009e"+
		"\u0001\u0000\u0000\u0000\u009d\u0099\u0001\u0000\u0000\u0000\u009e\u00a1"+
		"\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a2\u0097\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u000f\u0001\u0000\u0000\u0000\u00a4\u00a7"+
		"\u0006\b\uffff\uffff\u0000\u00a5\u00a6\u0005\u0019\u0000\u0000\u00a6\u00a8"+
		"\u0006\b\uffff\uffff\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0003\u0012\t\u0000\u00aa\u00ab\u00056\u0000\u0000\u00ab\u00ac\u0006"+
		"\b\uffff\uffff\u0000\u00ac\u0011\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"\b\u0000\u0000\u00ae\u00bc\u0006\t\uffff\uffff\u0000\u00af\u00b0\u0005"+
		"\t\u0000\u0000\u00b0\u00bc\u0006\t\uffff\uffff\u0000\u00b1\u00b2\u0005"+
		"\n\u0000\u0000\u00b2\u00bc\u0006\t\uffff\uffff\u0000\u00b3\u00b4\u0005"+
		"\u000b\u0000\u0000\u00b4\u00bc\u0006\t\uffff\uffff\u0000\u00b5\u00b6\u0005"+
		"\u001c\u0000\u0000\u00b6\u00bc\u0006\t\uffff\uffff\u0000\u00b7\u00b8\u0005"+
		"\f\u0000\u0000\u00b8\u00bc\u0006\t\uffff\uffff\u0000\u00b9\u00ba\u0005"+
		"6\u0000\u0000\u00ba\u00bc\u0006\t\uffff\uffff\u0000\u00bb\u00ad\u0001"+
		"\u0000\u0000\u0000\u00bb\u00af\u0001\u0000\u0000\u0000\u00bb\u00b1\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b3\u0001\u0000\u0000\u0000\u00bb\u00b5\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bc\u0013\u0001\u0000\u0000\u0000\u00bd\u00c0\u0006"+
		"\n\uffff\uffff\u0000\u00be\u00bf\u0005\u0019\u0000\u0000\u00bf\u00c1\u0006"+
		"\n\uffff\uffff\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c8\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003"+
		"\u0012\t\u0000\u00c3\u00c4\u0006\n\uffff\uffff\u0000\u00c4\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0003\u0016\u000b\u0000\u00c6\u00c7\u0006"+
		"\n\uffff\uffff\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u00056\u0000\u0000\u00cb\u00cc\u0006\n"+
		"\uffff\uffff\u0000\u00cc\u0015\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005"+
		"6\u0000\u0000\u00ce\u00cf\u0006\u000b\uffff\uffff\u0000\u00cf\u00db\u0005"+
		" \u0000\u0000\u00d0\u00d1\u00036\u001b\u0000\u00d1\u00d8\u0006\u000b\uffff"+
		"\uffff\u0000\u00d2\u00d3\u0005\u001f\u0000\u0000\u00d3\u00d4\u00036\u001b"+
		"\u0000\u00d4\u00d5\u0006\u000b\uffff\uffff\u0000\u00d5\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00d0\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0005!\u0000"+
		"\u0000\u00de\u00df\u0006\u000b\uffff\uffff\u0000\u00df\u0017\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0006\f\uffff\uffff\u0000\u00e1\u00e7\u0005\u0004"+
		"\u0000\u0000\u00e2\u00e3\u0003\u001a\r\u0000\u00e3\u00e4\u0006\f\uffff"+
		"\uffff\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u0005"+
		"\u0000\u0000\u00eb\u00ec\u0006\f\uffff\uffff\u0000\u00ec\u0019\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0003\u0018\f\u0000\u00ee\u00ef\u0006\r\uffff"+
		"\uffff\u0000\u00ef\u0117\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003\u0014"+
		"\n\u0000\u00f1\u00f2\u0005\u001e\u0000\u0000\u00f2\u00f3\u0006\r\uffff"+
		"\uffff\u0000\u00f3\u0117\u0001\u0000\u0000\u0000\u00f4\u00f5\u0003\u0014"+
		"\n\u0000\u00f5\u00f6\u0005$\u0000\u0000\u00f6\u00f7\u00036\u001b\u0000"+
		"\u00f7\u00f8\u0005\u001e\u0000\u0000\u00f8\u00f9\u0006\r\uffff\uffff\u0000"+
		"\u00f9\u0117\u0001\u0000\u0000\u0000\u00fa\u00fb\u00034\u001a\u0000\u00fb"+
		"\u00fc\u0005\u001e\u0000\u0000\u00fc\u00fd\u0006\r\uffff\uffff\u0000\u00fd"+
		"\u0117\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003\u001e\u000f\u0000\u00ff"+
		"\u0100\u0006\r\uffff\uffff\u0000\u0100\u0117\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0003$\u0012\u0000\u0102\u0103\u0006\r\uffff\uffff\u0000\u0103"+
		"\u0117\u0001\u0000\u0000\u0000\u0104\u0105\u0003&\u0013\u0000\u0105\u0106"+
		"\u0006\r\uffff\uffff\u0000\u0106\u0117\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0003(\u0014\u0000\u0108\u0109\u0006\r\uffff\uffff\u0000\u0109\u0117"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0003*\u0015\u0000\u010b\u010c\u0006"+
		"\r\uffff\uffff\u0000\u010c\u0117\u0001\u0000\u0000\u0000\u010d\u010e\u0003"+
		"\u001c\u000e\u0000\u010e\u010f\u0006\r\uffff\uffff\u0000\u010f\u0117\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0003 \u0010\u0000\u0111\u0112\u0006\r"+
		"\uffff\uffff\u0000\u0112\u0117\u0001\u0000\u0000\u0000\u0113\u0114\u0003"+
		"\"\u0011\u0000\u0114\u0115\u0006\r\uffff\uffff\u0000\u0115\u0117\u0001"+
		"\u0000\u0000\u0000\u0116\u00ed\u0001\u0000\u0000\u0000\u0116\u00f0\u0001"+
		"\u0000\u0000\u0000\u0116\u00f4\u0001\u0000\u0000\u0000\u0116\u00fa\u0001"+
		"\u0000\u0000\u0000\u0116\u00fe\u0001\u0000\u0000\u0000\u0116\u0101\u0001"+
		"\u0000\u0000\u0000\u0116\u0104\u0001\u0000\u0000\u0000\u0116\u0107\u0001"+
		"\u0000\u0000\u0000\u0116\u010a\u0001\u0000\u0000\u0000\u0116\u010d\u0001"+
		"\u0000\u0000\u0000\u0116\u0110\u0001\u0000\u0000\u0000\u0116\u0113\u0001"+
		"\u0000\u0000\u0000\u0117\u001b\u0001\u0000\u0000\u0000\u0118\u0119\u0005"+
		"\u001a\u0000\u0000\u0119\u011d\u0006\u000e\uffff\uffff\u0000\u011a\u011b"+
		"\u0005\u001b\u0000\u0000\u011b\u011d\u0006\u000e\uffff\uffff\u0000\u011c"+
		"\u0118\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d"+
		"\u001d\u0001\u0000\u0000\u0000\u011e\u011f\u0005\r\u0000\u0000\u011f\u0120"+
		"\u0005 \u0000\u0000\u0120\u0121\u00036\u001b\u0000\u0121\u0122\u0005!"+
		"\u0000\u0000\u0122\u0123\u0003\u001a\r\u0000\u0123\u0128\u0006\u000f\uffff"+
		"\uffff\u0000\u0124\u0125\u0005\u000e\u0000\u0000\u0125\u0126\u0003\u001a"+
		"\r\u0000\u0126\u0127\u0006\u000f\uffff\uffff\u0000\u0127\u0129\u0001\u0000"+
		"\u0000\u0000\u0128\u0124\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0006\u000f"+
		"\uffff\uffff\u0000\u012b\u001f\u0001\u0000\u0000\u0000\u012c\u012d\u0005"+
		"\u000f\u0000\u0000\u012d\u012e\u0006\u0010\uffff\uffff\u0000\u012e\u013a"+
		"\u0005 \u0000\u0000\u012f\u0130\u00038\u001c\u0000\u0130\u0137\u0006\u0010"+
		"\uffff\uffff\u0000\u0131\u0132\u0005\u001f\u0000\u0000\u0132\u0133\u0003"+
		"8\u001c\u0000\u0133\u0134\u0006\u0010\uffff\uffff\u0000\u0134\u0136\u0001"+
		"\u0000\u0000\u0000\u0135\u0131\u0001\u0000\u0000\u0000\u0136\u0139\u0001"+
		"\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001"+
		"\u0000\u0000\u0000\u013a\u012f\u0001\u0000\u0000\u0000\u013a\u013b\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u0140\u0005"+
		"\u001e\u0000\u0000\u013d\u013e\u00036\u001b\u0000\u013e\u013f\u0006\u0010"+
		"\uffff\uffff\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u013d\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0001"+
		"\u0000\u0000\u0000\u0142\u0152\u0005\u001e\u0000\u0000\u0143\u0144\u0003"+
		",\u0016\u0000\u0144\u0145\u0005$\u0000\u0000\u0145\u0146\u00036\u001b"+
		"\u0000\u0146\u014f\u0006\u0010\uffff\uffff\u0000\u0147\u0148\u0005\u001f"+
		"\u0000\u0000\u0148\u0149\u0003,\u0016\u0000\u0149\u014a\u0005$\u0000\u0000"+
		"\u014a\u014b\u00036\u001b\u0000\u014b\u014c\u0006\u0010\uffff\uffff\u0000"+
		"\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u0147\u0001\u0000\u0000\u0000"+
		"\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000"+
		"\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0143\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000"+
		"\u0154\u0155\u0005!\u0000\u0000\u0155\u0156\u0003\u001a\r\u0000\u0156"+
		"\u0157\u0006\u0010\uffff\uffff\u0000\u0157!\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0005\u0010\u0000\u0000\u0159\u015a\u0005 \u0000\u0000\u015a\u015b"+
		"\u00036\u001b\u0000\u015b\u015c\u0005!\u0000\u0000\u015c\u015d\u0003\u001a"+
		"\r\u0000\u015d\u015e\u0006\u0011\uffff\uffff\u0000\u015e#\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0003,\u0016\u0000\u0160\u0161\u0005$\u0000\u0000"+
		"\u0161\u0162\u00036\u001b\u0000\u0162\u0163\u0006\u0012\uffff\uffff\u0000"+
		"\u0163\u0164\u0005\u001e\u0000\u0000\u0164\u0165\u0006\u0012\uffff\uffff"+
		"\u0000\u0165%\u0001\u0000\u0000\u0000\u0166\u0167\u0006\u0013\uffff\uffff"+
		"\u0000\u0167\u016b\u0005\u0012\u0000\u0000\u0168\u0169\u00036\u001b\u0000"+
		"\u0169\u016a\u0006\u0013\uffff\uffff\u0000\u016a\u016c\u0001\u0000\u0000"+
		"\u0000\u016b\u0168\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0005\u001e\u0000"+
		"\u0000\u016e\u016f\u0006\u0013\uffff\uffff\u0000\u016f\'\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0005\u0013\u0000\u0000\u0171\u0172\u0003,\u0016\u0000"+
		"\u0172\u0173\u0006\u0014\uffff\uffff\u0000\u0173\u0174\u0005\u001e\u0000"+
		"\u0000\u0174\u0175\u0006\u0014\uffff\uffff\u0000\u0175)\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0005\u0014\u0000\u0000\u0177\u0178\u00036\u001b\u0000"+
		"\u0178\u0179\u0006\u0015\uffff\uffff\u0000\u0179\u017a\u0005\u001e\u0000"+
		"\u0000\u017a\u017b\u0006\u0015\uffff\uffff\u0000\u017b+\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0003.\u0017\u0000\u017d\u017e\u0006\u0016\uffff\uffff"+
		"\u0000\u017e\u0186\u0001\u0000\u0000\u0000\u017f\u0180\u00030\u0018\u0000"+
		"\u0180\u0181\u0006\u0016\uffff\uffff\u0000\u0181\u0186\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u00032\u0019\u0000\u0183\u0184\u0006\u0016\uffff\uffff"+
		"\u0000\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u017c\u0001\u0000\u0000"+
		"\u0000\u0185\u017f\u0001\u0000\u0000\u0000\u0185\u0182\u0001\u0000\u0000"+
		"\u0000\u0186-\u0001\u0000\u0000\u0000\u0187\u0188\u00056\u0000\u0000\u0188"+
		"\u0189\u0006\u0017\uffff\uffff\u0000\u0189\u018a\u0006\u0017\uffff\uffff"+
		"\u0000\u018a/\u0001\u0000\u0000\u0000\u018b\u018c\u00056\u0000\u0000\u018c"+
		"\u018d\u0005%\u0000\u0000\u018d\u018e\u0003,\u0016\u0000\u018e\u018f\u0006"+
		"\u0018\uffff\uffff\u0000\u018f\u0190\u0006\u0018\uffff\uffff\u0000\u0190"+
		"1\u0001\u0000\u0000\u0000\u0191\u0192\u0006\u0019\uffff\uffff\u0000\u0192"+
		"\u0197\u0005\u0015\u0000\u0000\u0193\u0194\u0005%\u0000\u0000\u0194\u0195"+
		"\u0003,\u0016\u0000\u0195\u0196\u0006\u0019\uffff\uffff\u0000\u0196\u0198"+
		"\u0001\u0000\u0000\u0000\u0197\u0193\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0006\u0019\uffff\uffff\u0000\u019a3\u0001\u0000\u0000\u0000\u019b\u01a0"+
		"\u0006\u001a\uffff\uffff\u0000\u019c\u019d\u0003,\u0016\u0000\u019d\u019e"+
		"\u0005%\u0000\u0000\u019e\u019f\u0006\u001a\uffff\uffff\u0000\u019f\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a0\u019c\u0001\u0000\u0000\u0000\u01a0\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u00056\u0000\u0000\u01a3\u01a4\u0006\u001a\uffff\uffff\u0000\u01a4\u01b0"+
		"\u0005 \u0000\u0000\u01a5\u01a6\u00036\u001b\u0000\u01a6\u01ad\u0006\u001a"+
		"\uffff\uffff\u0000\u01a7\u01a8\u0005\u001f\u0000\u0000\u01a8\u01a9\u0003"+
		"6\u001b\u0000\u01a9\u01aa\u0006\u001a\uffff\uffff\u0000\u01aa\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ab\u01a7\u0001\u0000\u0000\u0000\u01ac\u01af\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001"+
		"\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad\u0001"+
		"\u0000\u0000\u0000\u01b0\u01a5\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005"+
		"!\u0000\u0000\u01b3\u01b4\u0006\u001a\uffff\uffff\u0000\u01b45\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b6\u0006\u001b\uffff\uffff\u0000\u01b6\u01b7\u0003"+
		",\u0016\u0000\u01b7\u01b8\u0006\u001b\uffff\uffff\u0000\u01b8\u01d5\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0005\u0015\u0000\u0000\u01ba\u01d5\u0006"+
		"\u001b\uffff\uffff\u0000\u01bb\u01bc\u00034\u001a\u0000\u01bc\u01bd\u0006"+
		"\u001b\uffff\uffff\u0000\u01bd\u01d5\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0003\u0016\u000b\u0000\u01bf\u01c0\u0006\u001b\uffff\uffff\u0000\u01c0"+
		"\u01d5\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005 \u0000\u0000\u01c2\u01c3"+
		"\u00036\u001b\u0000\u01c3\u01c4\u0005!\u0000\u0000\u01c4\u01c5\u0006\u001b"+
		"\uffff\uffff\u0000\u01c5\u01d5\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005"+
		"2\u0000\u0000\u01c7\u01d5\u0006\u001b\uffff\uffff\u0000\u01c8\u01c9\u0005"+
		"3\u0000\u0000\u01c9\u01d5\u0006\u001b\uffff\uffff\u0000\u01ca\u01cb\u0005"+
		"4\u0000\u0000\u01cb\u01d5\u0006\u001b\uffff\uffff\u0000\u01cc\u01cd\u0005"+
		"5\u0000\u0000\u01cd\u01d5\u0006\u001b\uffff\uffff\u0000\u01ce\u01cf\u0005"+
		"\u001d\u0000\u0000\u01cf\u01d5\u0006\u001b\uffff\uffff\u0000\u01d0\u01d1"+
		"\u0007\u0000\u0000\u0000\u01d1\u01d2\u00036\u001b\u0007\u01d2\u01d3\u0006"+
		"\u001b\uffff\uffff\u0000\u01d3\u01d5\u0001\u0000\u0000\u0000\u01d4\u01b5"+
		"\u0001\u0000\u0000\u0000\u01d4\u01b9\u0001\u0000\u0000\u0000\u01d4\u01bb"+
		"\u0001\u0000\u0000\u0000\u01d4\u01be\u0001\u0000\u0000\u0000\u01d4\u01c1"+
		"\u0001\u0000\u0000\u0000\u01d4\u01c6\u0001\u0000\u0000\u0000\u01d4\u01c8"+
		"\u0001\u0000\u0000\u0000\u01d4\u01ca\u0001\u0000\u0000\u0000\u01d4\u01cc"+
		"\u0001\u0000\u0000\u0000\u01d4\u01ce\u0001\u0000\u0000\u0000\u01d4\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d5\u01f6\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\n\u0006\u0000\u0000\u01d7\u01d8\u0007\u0001\u0000\u0000\u01d8\u01d9\u0003"+
		"6\u001b\u0007\u01d9\u01da\u0006\u001b\uffff\uffff\u0000\u01da\u01f5\u0001"+
		"\u0000\u0000\u0000\u01db\u01dc\n\u0005\u0000\u0000\u01dc\u01dd\u0007\u0002"+
		"\u0000\u0000\u01dd\u01de\u00036\u001b\u0006\u01de\u01df\u0006\u001b\uffff"+
		"\uffff\u0000\u01df\u01f5\u0001\u0000\u0000\u0000\u01e0\u01e1\n\u0004\u0000"+
		"\u0000\u01e1\u01e2\u0007\u0003\u0000\u0000\u01e2\u01e3\u00036\u001b\u0005"+
		"\u01e3\u01e4\u0006\u001b\uffff\uffff\u0000\u01e4\u01f5\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e6\n\u0003\u0000\u0000\u01e6\u01e7\u0007\u0004\u0000\u0000"+
		"\u01e7\u01e8\u00036\u001b\u0004\u01e8\u01e9\u0006\u001b\uffff\uffff\u0000"+
		"\u01e9\u01f5\u0001\u0000\u0000\u0000\u01ea\u01eb\n\u0002\u0000\u0000\u01eb"+
		"\u01ec\u0005\u0017\u0000\u0000\u01ec\u01ed\u00036\u001b\u0003\u01ed\u01ee"+
		"\u0006\u001b\uffff\uffff\u0000\u01ee\u01f5\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f0\n\u0001\u0000\u0000\u01f0\u01f1\u0005\u0018\u0000\u0000\u01f1\u01f2"+
		"\u00036\u001b\u0002\u01f2\u01f3\u0006\u001b\uffff\uffff\u0000\u01f3\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f4\u01d6\u0001\u0000\u0000\u0000\u01f4\u01db"+
		"\u0001\u0000\u0000\u0000\u01f4\u01e0\u0001\u0000\u0000\u0000\u01f4\u01e5"+
		"\u0001\u0000\u0000\u0000\u01f4\u01ea\u0001\u0000\u0000\u0000\u01f4\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000\u0000\u0000\u01f6\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f77\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f9\u01fa\u0003"+
		"\u0014\n\u0000\u01fa\u01fb\u0006\u001c\uffff\uffff\u0000\u01fb\u0207\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fd\u0003,\u0016\u0000\u01fd\u01fe\u0005$\u0000"+
		"\u0000\u01fe\u01ff\u00036\u001b\u0000\u01ff\u0200\u0006\u001c\uffff\uffff"+
		"\u0000\u0200\u0207\u0001\u0000\u0000\u0000\u0201\u0202\u0003\u0014\n\u0000"+
		"\u0202\u0203\u0005$\u0000\u0000\u0203\u0204\u00036\u001b\u0000\u0204\u0205"+
		"\u0006\u001c\uffff\uffff\u0000\u0205\u0207\u0001\u0000\u0000\u0000\u0206"+
		"\u01f9\u0001\u0000\u0000\u0000\u0206\u01fc\u0001\u0000\u0000\u0000\u0206"+
		"\u0201\u0001\u0000\u0000\u0000\u02079\u0001\u0000\u0000\u0000#@KX[cq\u0086"+
		"\u008c\u009f\u00a2\u00a7\u00bb\u00c0\u00c8\u00d8\u00db\u00e7\u0116\u011c"+
		"\u0128\u0137\u013a\u0140\u014f\u0152\u016b\u0185\u0197\u01a0\u01ad\u01b0"+
		"\u01d4\u01f4\u01f6\u0206";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}